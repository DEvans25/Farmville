public class VideoGame {

    public int edition;
    public int size;
    public boolean sport;
    public String name;

    public VideoGame(boolean pSport, int pSize, int pEdition, String pName) {
        edition = pEdition;
        sport = pSport;
        size = pSize;
        name = pName;
    }
    public void printInfo {
        System.out.println("This game is " + name + " " + edition);
        System.out.println("Size: " + size);
        System.out.println("It is " + sport + " that this is a sport game");


    }
}
