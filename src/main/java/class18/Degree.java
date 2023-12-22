package class18;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree, you need a high school diploma.");
    }
}
class Bachelors extends Degree {

}
class Masters extends Degree {
    public void getPrerequisite() {
        System.out.println("To get a Master's degree, you usually need a Bachelor's degree.");
    }
}
