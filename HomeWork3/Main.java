import DIP.Auto;
import DIP.DieselEngine;
import DIP.PetrolEngine;
import DIP.iEngine;
import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class Main {
    public static void main(String[] args) {

        iEngine pEngine = new PetrolEngine();
        iEngine dEngine = new DieselEngine();

        Auto auto1 = new Auto(pEngine);
        auto1.start();
        
        Auto auto2 = new Auto(dEngine);
        auto2.start();



        // System.out.println("Hello world!");
    }

    // public static void mainOcp(){
    //     Vehicle car = new Car(123);
    //     car.calculateAllowedSpeed();
    //     Vehicle bus = new Bus(60);
    // }

}