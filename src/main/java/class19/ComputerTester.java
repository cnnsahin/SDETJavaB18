package class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr = {new Computer.Apple(), new Computer.Apple.Lenova.HP(), new Computer.Apple.Lenova(), new Computer.Apple.Lenova.HP.Dell()};
        for (Computer computer : arr) {
            computer.playMusic();
            computer.start();
            computer.research();
            Computer.Apple a = (Computer.Apple) computer;
            a.protect();
        }
    }
}
