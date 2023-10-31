package Library;

public class Book {
    private String aughtor;
    private String title;

    public Book(String aughtor, String title) {
    this.aughtor = aughtor;
    this.title = title;
    }
    public String getAughtor() {
        return aughtor;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.aughtor + ", " + this.title;
    }
}
