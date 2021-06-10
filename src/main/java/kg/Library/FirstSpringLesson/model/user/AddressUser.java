package kg.Library.FirstSpringLesson.model.user;

public class AddressUser {
    private long id;
    private String streetName;
    private int numHome;

    public AddressUser() {
    }

    public AddressUser(String streetName, int numHome) {
        this.streetName = streetName;
        this.numHome = numHome;
    }

    public long getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumHome() {
        return numHome;
    }

    public void setNumHome(int numHome) {
        this.numHome = numHome;
    }
}
