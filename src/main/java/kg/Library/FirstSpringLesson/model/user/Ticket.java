package kg.Library.FirstSpringLesson.model.user;

public class Ticket {
    private long id;
    private boolean active;
    private long numTicket;

    public long getId() {
        return id;
    }

    public Ticket(boolean active, long numTicket) {
        this.active = active;
        this.numTicket = numTicket;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(long numTicket) {
        this.numTicket = numTicket;
    }
}
