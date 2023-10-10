import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    /* 1. Создание билетов. Для проверки методов создаем ArrayList из 10 билетов*/

        Calendar date = new GregorianCalendar(2023, Calendar.AUGUST, 5);
        DateFormat df = new SimpleDateFormat("dd MMMMMM yyyy") ;
        List<Ticket> tickets = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        int rootNumber = 100;
        int place = 1;
        int price = 1000;  
        for (int i = 0; i < 10; i++) {
            Ticket ticket = new Ticket(rootNumber, place, price, df.format(date.getTime()), true);
            tickets.add(i, ticket);
            // System.out.println(tickets.get(i)); // Можно раскоммитить и вывести для просмотра созданные билеты.
            // System.out.println();            
            rootNumber = rootNumber + 1;
            place = place + 1;
            price = price + 10;
        }
        
    /* 2. Создание покупателей. Для тестирования методов, задаем трех покупателей */

        Customer customer1 = new Customer();
        customer1.setCustomerCash(111111111, 1030,false);
        customer1.setId(1);
        Customer customer2 = new Customer();
        customer2.setCustomerCash(222222222, 1000,false);
        customer2.setId(2);
        Customer customer3 = new Customer();
        customer3.setCustomerCash( 333333333, 1500,false);
        customer3.setId(3);
        
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        // for (int i = 0; i < customers.size(); i++) { // Можно распечатать полкупателей
        //     System.out.println(customers.get(i)); 
        //     System.out.println(); 
        // }
       
        // 05 августа 2023

    /* 3. Проверка работы метода поиска былета seachTickets для покупателя customer2 с id = 2 */
        System.out.println("Проверка работы метода поиска былета seachTickets для покупателя customer2 с id = 2");
        customers.get(1).seachTickets("05 августа 2023", 1010, tickets);
        System.out.println(" ");

    /* 4. Проверка метода покупки билета buyTicket покупателем customer1 с id = 1 */
        System.out.println("Проверка метода покупки билета buyTicket покупателем customer1 с id = 1 ");
        customer1.buyTicket(tickets.get(1));  
        System.out.println("Смотрим, какой билет купили: ");           
        System.out.println(tickets.get(1)); 
        System.out.println("Смотрим, сколько денег осталось у покупателя customer1 с id = 1 (было 1030): ");
        System.out.println(customer1.getCash()); 
        System.out.println("Повтороно пытаемся купить тотже билет: ");
        customer1.buyTicket(tickets.get(1)); 
        System.out.println("  "); 

    /* 5. Проверка работы метода Autorization авторизации покупателя customer3 с id = 2 */    
        System.out.println("Проверка работы метода Autorization авторизации покупателя: ");
        customer3.cash.Autorization(customer3);
        System.out.println(customer3);        
        System.out.println("Повторно пытаемся авторизировать покупателя: "); 
        customer3.cash.Autorization(customer3);      
        System.out.println("   ");
        
    /* 6. Проверка работы метода getTickets подбора билетов по номеру 
     * Сначала добавили еще один билет с номером 100, но другой датой
    */
        System.out.println("Проверка работы метода getTickets подбора билетов по номеру");
        Calendar newDate = new GregorianCalendar(2023, Calendar.AUGUST, 6);
        DateFormat dataf = new SimpleDateFormat("dd MMMMMM yyyy") ;
        Ticket newticket = new Ticket(100, place, price, dataf.format(newDate.getTime()), true);  
        tickets.add(newticket);
        
        // for (int i = 0; i < tickets.size(); i++) {
        //     System.out.println(tickets.get(i));
        // }
        List <Ticket> findTicket = new ArrayList<>();
        TicketProvider tp = new TicketProvider();
        findTicket = tp.getTickets(100, tickets);
        System.out.println("   ");

    /* 7. Проверка работы метода updateTicket изменения статуса билетов */
        System.out.println("Проверка работы метода updateTicket изменения статуса билетов");
        System.out.println("Смотрим какой-то билет и применяем к нему updateTicket:  ");
        System.out.println(tickets.get(4));
        tp.updateTicket(tickets.get(4));
         System.out.println("Смотрим этот билет снова: ");
        System.out.println(tickets.get(4));
    }
}
