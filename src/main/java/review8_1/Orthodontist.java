package review8_1;

import review8.Doctor;

public class Orthodontist extends Doctor {
    public Orthodontist( String firstName, String lastName, String speciality, int yearsOfExperience){
        super( firstName, lastName, speciality, yearsOfExperience);
    }
    public void printSpeciality(){
        System.out.println("I am " + speciality);
    }
    public void prescribeMedication(String medication){// it s default method from parent class we need add public
        System.out.println(speciality+ " prescribed special medication" + medication );


    }



}
