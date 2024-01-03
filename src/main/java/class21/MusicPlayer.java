package class21;
/*
Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer,
each with their unique implementations of the play() method (e.g., streaming from the internet, playing from a CD).
 */
public class MusicPlayer {
    private String currentTrack;
    private int volume;

   public MusicPlayer(String currentTrack) {
       this.currentTrack = currentTrack;
       this.volume = volume;
    }
    public void play() {

        //System.out.println("Playing my favorite song ");
    }
    public void pause() {
        //System.out.println("Paused when phone is ringing" );
    }

    public void stop() {
       // System.out.println("Stopped songs finish");
    }

    public int getVolume() {
        return volume;
    }
    public void displayInfo(){
        System.out.println(currentTrack + " " + volume);
    }
}
class MP3Player extends MusicPlayer {
    public MP3Player(String currentTrack, int volume) {
        super(currentTrack);
    }

    public void play() {
        System.out.println("Playing MP3  " );
    }
}
class CDPlayer extends MusicPlayer {
    public CDPlayer(String currentTrack, int volume) {
        super(currentTrack);
    }

    public void play() {
        System.out.println("Playing from CD: " );
    }
}
class StreamingPlayer extends MusicPlayer {
    private String streamUrl;

    public StreamingPlayer(String streamUrl, String currentTrack) {
        super(currentTrack);
        this.streamUrl = streamUrl;
    }

    public void play() {
        System.out.println("Streaming from " + streamUrl );
    }
}