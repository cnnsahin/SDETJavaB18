package review8;

public class Stadium {
    public static void main(String[] args) {
       Sport sport = new Sport("Soccer","Man City");
        System.out.println(sport.type + " and team name is " + sport.teamName);
        Sport sport1=new Sport("Basketball", "Chiago Bulls", 15, "Chiago", "Billy Joe");

        System.out.println(sport.numberOfPlayers);
    }
}
