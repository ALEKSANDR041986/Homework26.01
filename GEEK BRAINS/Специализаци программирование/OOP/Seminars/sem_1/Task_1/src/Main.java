
    import java.time.LocalDate;
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            Cat cat = new Cat(); //экземпляр класса
            cat.setName("barsic");
            System.out.println(cat.getName());
            Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                    LocalDate.of(3,12,21));
            System.out.println(dog.getName());
            System.out.println(dog.getIllness());
            dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
            ArrayList <Animal> animals = new ArrayList<>();
            animals.add(cat);
            animals.add(dog);
            cat.liveCycle();
            dog.breathe();
            System.out.println();
            /*
            домашнее задание
             */
            System.out.println("-----HOMEWORK------");
            dog.toGo();
            cat.swim();
// Утка
            Duck krya = new Duck("Krya", new Illness("fracture"), "Lida", LocalDate.of(
                    1986, 04,9),78 );
            System.out.println("Вес утки: " + krya.getWeight());
//  Попугай
            Color color = new Color("Yellow");
            Parrot kesha = new Parrot("Kesha", new Illness("flu"), "Sasha",
                    LocalDate.of(2013,2,4), 12, color);
            System.out.println("Color of Kesha - " + kesha.color );
//  Рыбка
            Illness infection = new Illness("Infection");
            Fish goldFish = new Fish("Goldy", infection, "Ivan",
                    LocalDate.of(2000, 1,31),23, color);
            System.out.println("Рыбка " + goldFish.getName() +  " болеет " + infection );
//
            System.out.println();
            goldFish.fly();
            kesha.fly();
            kesha.swim();
            krya.toGo();
            goldFish.toGo();

        }
    }
