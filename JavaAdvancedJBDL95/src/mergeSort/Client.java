package mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer>integers = List.of(5,6,1,3,8,9,7,10);
        ExecutorService ex = Executors.newCachedThreadPool();

        MergeSort mergeSort = new MergeSort(integers,ex);
        Future<List<Integer>> f1 = ex.submit(mergeSort);

        System.out.println(f1.get());

    }
}
