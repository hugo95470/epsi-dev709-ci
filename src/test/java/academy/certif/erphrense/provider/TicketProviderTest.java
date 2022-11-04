package academy.certif.erphrense.provider;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import academy.certif.erphrense.domain.Ticket;

public class TicketProviderTest {

    @Test
    public void book_shoudDelete_ticket()
    {
        Ticket ticket = new Ticket("Annie Versaire", "01/01/2021 16:30", "Paris", "New-York", 0);
    
        TicketProvider ticketProvider = new TicketProvider();
        ticketProvider.data.add(ticket);
        ticketProvider.delete(0);
        assertEquals(ticketProvider.data.size() , 0);

    }
    
    @Test
    public void book_shoudNotDelete_ticket()
    {
        Ticket ticket = new Ticket("Annie Versaire", "01/01/2021 16:30", "Paris", "New-York", 0);
    
        TicketProvider ticketProvider = new TicketProvider();
        ticketProvider.data.add(ticket);
        ticketProvider.delete(8);
        assertEquals(ticketProvider.data.size() , 1);

    }
    
    @Test
    public void book_add_ticket()
    {
        Ticket ticket = new Ticket("Annie Versaire", "01/01/2021 16:30", "Paris", "New-York", 0);
        TicketProvider ticketProvider = new TicketProvider();
        ticketProvider.persist(ticket);
        assertEquals(ticketProvider.data.size() , 1);

    }
}
