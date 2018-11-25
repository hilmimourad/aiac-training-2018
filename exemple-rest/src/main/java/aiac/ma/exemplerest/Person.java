package aiac.ma.exemplerest;

public class Person {

    public Long id;
    
    public String name;


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
