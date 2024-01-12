package class23;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printInfo(){
        System.out.println(name+ " " + id);
    }
}
