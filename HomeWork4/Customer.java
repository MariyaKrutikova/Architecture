import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    public int id;
    public CashProvider cash;
    // public List<Ticket> tickets;


    public Customer() {
        id = 0;
        cash = new CashProvider();   
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public CashProvider getCash() {
        return cash;
    }

    // public void setCustomerIdCash(int id,long cardNumber, int amount, boolean isAutorization) {
    //     cash.setAmount(amount);
    //     cash.setCardNumber(cardNumber);
    //     cash.setIsAutorization(isAutorization);
    //     this.id = id;
    // }

     public void setCustomerCash(long cardNumber, int amount, boolean isAutorization) {
        cash.setAmount(amount);
        cash.setCardNumber(cardNumber);
        cash.setIsAutorization(isAutorization);
        
    }

    // public List<Ticket> getTickets() {
    //     return tickets;
    // }

    // public void setTickets(List<Ticket> tickets) {
    //     this.tickets = tickets;
    // }
    
    /**
     * Метод покупки конкретного билета покупателем. Если указанный покупателем билет свободен (isValid = true) 
     * то значение isValid меняется на false, а с карты покупателя списываются деньги. Списание денег с карты 
     * происходит вызовом метода buy класса CashProvider.
     * @param: В качестве аргумента выступает объект класса Ticket 
    */
    public void buyTicket(Ticket ticket) {
        
        if (ticket.isValid == true) {
            cash.buy(ticket.getPrice());
            ticket.isValid = false;
        }
        else System.out.println("Билет уже куплен");
    }

    /** 
     * Метод поиска билетов по заданным дате и максимальной стоимости из имеющихся в продаже билетов. 
     * @return: Метод возвращает список найденных билетов. 
     * @param
     * 
    */
    public List<Ticket> seachTickets(String date, int maxPrice, List<Ticket> tickets) {
        List <Ticket> customerTickets = new ArrayList<>();
        for (int i = 0; i < tickets.size(); i++) {
            if (date.equals(tickets.get(i).getDate()) && (tickets.get(i).getPrice() <= maxPrice)) {
                customerTickets.add(tickets.get(i));
            }
        }
        System.out.println(customerTickets);
        return customerTickets;
    }

    @Override
    public String toString() {
        return "Покупатель id = " + id +". " + cash;
    }

}
