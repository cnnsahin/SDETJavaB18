package class22;

import java.util.ArrayList;

public class EvenNumbersArrayList {
     /*   Create an arraylist of even numbers from 1 to 500 using a loop.
          then write another loop to remove any number that is divisible by 5 from that arrayList
 */
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumbersList.add(i);
        }
        System.out.println("Original ArrayList:");
        System.out.println(evenNumbersList);
        for (int j = 0; j < evenNumbersList.size(); j++) {
            if (evenNumbersList.get(j)%5==0){
                evenNumbersList.remove(j);
            }
        }
        System.out.println(evenNumbersList);


    }




}
