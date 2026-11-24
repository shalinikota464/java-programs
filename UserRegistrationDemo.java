
class UserRegistration {

    // First method: Name first, ID second
    void register(String name, int userId) {
        System.out.println("Registered user: " + name +
                " with ID: " + userId);
    }

    // Second method: ID first, Name second
    void register(int userId, String name) {
        System.out.println("Registered ID: " + userId +
                " for user: " + name);
    }
}

public class UserRegistrationDemo {

    public static void main(String[] args) {

        UserRegistration obj = new UserRegistration();

        obj.register("Jathin", 101);

        obj.register(102, "Rahul");
    }
}
