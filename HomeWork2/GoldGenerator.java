public class GoldGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new GoldReward();
    }
}
