package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> integers;
    ExecutorService ex;

    public MergeSort(List<Integer> integers, ExecutorService ex) {
        this.integers = integers;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(integers.size()<=1){
            return integers;
        }

        int mid = integers.size()/2;

        List<Integer>left = new ArrayList<>();
        List<Integer>right = new ArrayList<>();

        for(int i=0;i<mid;i++){
            left.add(integers.get(i));
        }
        for(int i=mid;i<integers.size();i++){
            right.add(integers.get(i));
        }

        MergeSort m1 = new MergeSort(left,ex);
        MergeSort m2 = new MergeSort(right,ex);

        Future<List<Integer>> f1= ex.submit(m1);
        Future<List<Integer>> f2= ex.submit(m2);

        left = f1.get();
        right = f2.get();


        List<Integer> ans = new ArrayList<>();

        int i=0,j=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<=right.get(j)){
                ans.add(left.get(i++));
            }
            else{
                ans.add(right.get(j++));
            }
        }

        while(i<left.size()){
            ans.add(left.get(i++));
        }
        while(j<right.size()){
            ans.add(right.get(j++));
        }

        return ans;

    }
}
