package class21;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer [] musicPlayers= {
                new MP3Player( " Mixed Turkish Pop ", 70),
                new CDPlayer("Tarkan Yolla", 80),
                new StreamingPlayer("https://youtu.be/7LUm-E4GPU8?si=JHFsb9hVHZTrrsTV", " Vaya Con Dios")

        };
        for (int i = 0; i < musicPlayers.length; i++) {
            musicPlayers[i].displayInfo();
            musicPlayers[i].play();
            musicPlayers[i].pause();
            musicPlayers[i].stop();
            System.out.println(" ****************");

        }

    }
    }

