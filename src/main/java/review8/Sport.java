package review8;

public class Sport {
    /* Must   Must
    dataType name

     */
    //static variable we can say class variable
    static boolean fun;

    String type, teamName;
    int numberOfPlayers;
    String location;
    String coach;
    Sport (String type, String teamName ){
        this.type=type;
        this.teamName=teamName;
    }
    Sport(String type, String teamName, int numberOfPlayers, String location, String coach){
        //this.type=type;
       // this.teamName=teamName; or we can do it just call this( type,teamName);
        this(type, teamName);
        this.numberOfPlayers=numberOfPlayers;
        this.location=location;
        this.coach=coach;

    }

    /* Must       must
    returnType    name()
     */
    void play(){// no parameters
        System.out.println("We play " + type);
    }
    void watch(String stream){// have parameters String stream
        System.out.println("I am watching " + type+ " on" + stream);
    }










}
