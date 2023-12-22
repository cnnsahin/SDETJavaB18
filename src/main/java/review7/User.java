package review7;

public class User {
    protected String name;
    protected String mobileNumber;
    public User(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}
class UserInfo extends User{
    private String address;
    public UserInfo(String name, String mobileNumber, String address){
        super(name,mobileNumber);
        this.address=address;
    }
    public void userDetails(){
        System.out.println("Name: " + name);
        System.out.println("Mobile number: " +mobileNumber);
        System.out.println("Address: " +address);
    }
}