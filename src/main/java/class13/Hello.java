package class13;

public class Hello {
    void differentLanguages(String country) {
        if(country.equalsIgnoreCase("Turkiye")){
            System.out.println("Merhaba");
        }else if(country.equalsIgnoreCase("Japan")){
            System.out.println("konnichiva");
        }else if (country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if( country.equalsIgnoreCase("Germany")){
            System.out.println("Guten tag");
        }else if(country.equalsIgnoreCase("Mexico")){
            System.out.println("Hola");
        }else{
            System.out.println("Hey man!!");
        }
    }}

