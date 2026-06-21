package hashcodeCode;

import java.util.Objects;

public class Person {

    Integer id;
    String name;

    public Person() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name);
    }

    @Override
    public boolean equals(Object obj) {

        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Person dummy = (Person) obj;

        if(dummy.id == this.id && Objects.equals(dummy.name,this.name)){
            return true;
        }

        return true;

    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
