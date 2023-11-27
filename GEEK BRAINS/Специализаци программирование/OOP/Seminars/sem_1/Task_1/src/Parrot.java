import java.time.LocalDate;

public class Parrot extends Birds {

    Color color;
    public Parrot() {
    }

    public Parrot(String name, Illness illness, String ownerName, LocalDate birthday, int weight,Color color) {
        super(name, illness, ownerName, birthday, weight);
        this.color = color;
    }
}