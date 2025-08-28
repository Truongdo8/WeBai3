package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dayOfBirth;
    private String source;
    private String announce1;
    private String announce2;
    private String contact;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dayOfBirth = "";
        this.source = "";
        this.announce1 = "";
        this.announce2 = "";
        this.contact = "";
    }

    public User(String firstName, String lastName, String email, String dayOfBirth,
                String source, String announce1, String announce2, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
        this.source = source;
        this.announce1 = announce1;
        this.announce2 = announce2;
        this.contact = contact;
    }

    // getter và setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDayOfBirth() { return dayOfBirth; }
    public void setDayOfBirth(String dayOfBirth) { this.dayOfBirth = dayOfBirth; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getAnnounce1() { return announce1; }
    public void setAnnounce1(String announce1) { this.announce1 = announce1; }

    public String getAnnounce2() { return announce2; }
    public void setAnnounce2(String announce2) { this.announce2 = announce2; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
