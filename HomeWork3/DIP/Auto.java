package DIP;

public class Auto {

    public iEngine engine;
    
    public Auto(iEngine engine) {
        this.engine = engine;
    }

    public void start (){
        engine.start();
        System.out.println("Машина заведена");
    }    
    
}
