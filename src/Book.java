public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[]printable){
        System.out.println(printable);

    }

    @Override
    public void print() {
        System.out.println("Book is printing");

    }
}
