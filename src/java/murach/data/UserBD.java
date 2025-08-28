package murach.data;

import murach.business.User;

public class UserBD {

    public static int insert(User user) {
        // Giả lập insert DB bằng cách in ra console
        System.out.println("Inserting user into database:");
        System.out.println("Email: " + user.getEmail());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Date of Birth: " + user.getDayOfBirth());
        System.out.println("Source: " + user.getSource());
        System.out.println("Announce1: " + user.getAnnounce1());
        System.out.println("Announce2: " + user.getAnnounce2());
        System.out.println("Contact: " + user.getContact());

        // Trả về 1 giả định là thành công
        return 1;
    }
}
