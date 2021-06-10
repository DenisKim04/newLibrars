package kg.Library.FirstSpringLesson.model.user;

public class Account {
    private long id;
    private String login;
    private String password;
    private User user;
    private AddressUser addressUser;
    private Ticket ticket;

    public Account() {
    }

    public Account(String login, String password, User user, AddressUser addressUser, Ticket ticket) {
        this.login = login;
        this.password = password;
        this.user = user;
        this.addressUser = addressUser;
        this.ticket = ticket;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AddressUser getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(AddressUser addressUser) {
        this.addressUser = addressUser;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}