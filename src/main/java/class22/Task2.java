package class22;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coca Cola");
        drinks.add("Ayran");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add(" Votka");

            for (int i = 0; i <drinks.size() ; i++) {
                if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                    drinks.set(i,"water");
                }

            }
            System.out.println(drinks);
        }
        }





