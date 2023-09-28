public abstract class ItemFabric {
    
    /**
     * Метод открытия сундука
     * @param no params 
     */
    public void openRewgard(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Метод создания продукта. Прописывается для каждого наследуемого от abstract class ItemFabric отдельно.
     * 
     * @return объект класса iGameItem
     */
    public abstract iGameItem createItem();
}
