public class User {
    private String Login;
    private String Password;

    public User(String login, String password) {
        Login = login;
        Password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        User user = (User) object;
        return java.util.Objects.equals(Login, user.Login) && java.util.Objects.equals(Password, user.Password);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), Login, Password);
    }
}