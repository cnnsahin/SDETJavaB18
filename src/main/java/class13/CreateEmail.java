package class13;
 /* Create a method createEmail(). Based on values of users firstName, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com*/

public class CreateEmail {

        String CreateEmail(String firstName,String lastName, String eMailType){
            System.out.println(firstName+lastName+ "@" +eMailType +".com");
            return(firstName+lastName+ "@"+eMailType+ ".com");
        }
    }


