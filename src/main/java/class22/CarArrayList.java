package class22;

import java.util.ArrayList;

public class CarArrayList {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Audi");
        carList.add("Honda");
        carList.add("Ford");
        carList.add("BMW");
        System.out.println("Retrieving values using the first method (for-each loop):");
        for (String car : carList) {
            System.out.println(car);
        }
        System.out.println("*****************************");

        System.out.println("Retrieving values using the second method (for loop with index):");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
    }




    }


