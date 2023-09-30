package DIP;

public class PetrolEngine implements iEngine {

    @Override
    public void start() {
        System.out.println("Бензиновый двигатель включен");;
    }
    
}
