public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[]printable){
        System.out.println(printable);

    }

    @Override
    public void print() {
        System.out.println("Magazine is printing");

    }
}
