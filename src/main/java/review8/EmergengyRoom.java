package review8;

import review8_1.Orthodontist;

public class EmergengyRoom {
    public static void main(String[] args) {
        Doctor [] doc={
                new Surgeon ( "John", "Doe", "Surgeon", 20,"Fairfax" ),
                new Surgeon ( "Michael", "Jordan", "Surgeon", 20,"Fairfax" ),
                new Orthodontist("Josh", "Smith", "Orthodontist", 15)
    };

        //doc[0].checkVitals();
       // doc[0].checkVitals("Jane");
        //doc[0].prescribeMedication("Aspirin");
        for (int i = 0; i < doc.length ; i++) {
            doc[i].checkVitals();
            doc[i].checkVitals("Jane");
            doc[i].prescribeMedication("aspirin ");
            System.out.println("-----------------");
        }
        System.out.println("----------Enchanced for loop--------------");
        for (Doctor doctor:doc){
            doctor.checkVitals();
            doctor.checkVitals("Jack");
            doctor.prescribeMedication("Pain killer ");



        }
}}
