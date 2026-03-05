public class map {
    public String theme;


    public map(String theme) {
        this.theme = theme;
    }
}

 class Dungeon extends map {
    public Dungeon() {
        super("Dark and Mysterious");
    }
 }
