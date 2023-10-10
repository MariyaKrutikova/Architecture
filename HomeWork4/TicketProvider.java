import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    
    /** 
      *  Метод, реализующий поиск билетов по номеру билета из заданного набора билетов. 
      @param
      @return список найденных билетов
     */
    public List<Ticket> getTickets(int rootNumber, List<Ticket> tickets) {
        List<Ticket> findTickets = new ArrayList<>();
        for (int i = 0; i < tickets.size(); i++) {            
            if (rootNumber == tickets.get(i).getRootNumber()) {
                findTickets.add(tickets.get(i));
            }   
        } 
        System.out.println(findTickets);           
        return findTickets;
    }

    /** 
      *  Метод, реализующий изменение статуса билета, т.е. изменения значения isValid. 
      @param     
     */
    public void updateTicket(Ticket ticket){
        // boolean valid;
        if (ticket.isValid == true) {
            ticket.setValid(false);
            System.out.println("Статус билета изменени на false");
        }
        else System.out.println("Статус билета false");
    }

}
