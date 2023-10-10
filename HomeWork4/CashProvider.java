public class CashProvider {
    
    private long cardNumber;
    private int amount;
    private boolean isAutorization;

    public CashProvider(long cardNumber, int amount, boolean isAutorization) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.isAutorization = isAutorization;
    }

    // public CashProvider(long cardNumber, int amount) {
    //     this.cardNumber = cardNumber;
    //     this.amount = amount;
    //     this.isAutorization = false;
    // }

    public CashProvider() {}

     public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean getIsAutorization() {
        return isAutorization;
    }
    public void setIsAutorization(boolean isAutorization) {
        this.isAutorization = isAutorization;
    }


    /**
     * Метод авторизации покупателя. Если покупатель не авторизован (IsAutorization = false), 
     * значение IsAutorization изменяется на true. В противном случае сообщается, что покупатель уже авторизован.
     * @param customer
     */
    public void Autorization (Customer customer){
        if (customer.cash.getIsAutorization() == false) customer.cash.setIsAutorization(true);
        else System.out.println("Пользователь уже авторизован");
    }

    
     /** 
      *  Метод, реализующий покупку. Если денег на карте покупателя достаточно, то с карты списываются средства.
      *  В противном случае сообщается, что денег не достаточно.
      @param
     */
    public void buy(int price){
        if (price <= amount) {
            amount = amount - price;
            System.out.println("Вы совершили покупку на сумму " + price);
        }
        else System.out.println("Недостаточно средств на карте");
    }

    @Override
    public String toString() {
        return "Карта с номером: " + cardNumber + ", сумма на карте: " + amount + ", покупатель авторизован: " + isAutorization;
    }
}
