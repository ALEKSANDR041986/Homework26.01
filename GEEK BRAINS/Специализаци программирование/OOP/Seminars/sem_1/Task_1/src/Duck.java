import java.time.LocalDate;

public class Duck extends Birds{
    public Duck(){
        super();
    }
    public Duck(String name, Illness illness, String ownerName, LocalDate birthday, int weight){
        super(name, illness, ownerName, birthday, weight);
    }
}
