import java.time.LocalDate;

public class Birds extends Animal{

    private int weight;
    public Birds(){
    }

    public Birds(String name, Illness illness, String ownerName, LocalDate birthday, int weight){
            super(name, illness, ownerName, birthday);
            this.weight = weight;

    }
    public int getWeight(){
        return weight;
    }

}
