import java.time.LocalDate;

public class Fish extends Animal{
    private int speed;
    private Color color;
    public Fish(){
    }
    public Fish (String name, Illness illness, String ownerName, LocalDate birthday, int speed, Color color ){
        super(name, illness, ownerName, birthday);
        this.speed = speed;
        this.color = color;
    }

}
