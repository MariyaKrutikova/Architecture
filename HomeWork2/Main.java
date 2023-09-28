import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ItemFabric generator = new GoldGenerator();
        generator.openRewgard();
        generator = new GoldGenerator();
        generator.openRewgard();
        System.out.println("________________________");
        System.out.println();
    


    // ItemFabric generator = new GoldGenerator();
    // generator.openRewgard();
    // generator = new GemGenerator();
    // generator.openReward();
    // System.out.println("Hello, World!");

    Random rnd = ThreadLocalRandom.current();
    List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new ОbsidianGenerator());

        for(int i = 0; i < 20; i++){
            // int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            int index = rnd.nextInt(3);
            ItemFabric fabric = fabricList.get(index);
            fabric.openRewgard();
        }
    }
}
