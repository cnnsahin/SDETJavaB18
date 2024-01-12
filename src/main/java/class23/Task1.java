package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("James");
        names.add("Jasmine");
        names.add("Jane");
        names.add("James");
        System.out.println(names);
        Set<String> aList= new LinkedHashSet<>(names);
        aList.clear();// clear all names everything gone fresh
        aList.addAll(names);// I have new data without duplicates
        System.out.println(aList);// freshly created that set without duplicates

    }
}
