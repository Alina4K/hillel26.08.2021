package dto;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;

    public User(String email, String password) {
        validateEmail(email);
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String name, String lastName) {
        this(email, password);
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private static void validateEmail(String email) {
        char[] characters = email.toCharArray();

        for (char character : characters) {
            if (character == '@') {
                return;
            }
        }
        throw new IllegalArgumentException("Email is not valid: " + email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
