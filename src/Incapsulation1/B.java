package Incapsulation1;
public class B {
    private int id;
    private String name;
    private String username;
    private String email;
    private Adress adress;
    private Company company;

    public B(int id, String name, String username, String email, Adress adress, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.company = company;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                ", company=" + company +
                '}';
    }
}