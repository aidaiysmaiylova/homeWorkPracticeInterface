public class Main {
    public static void main(String[] args) {
        System.out.println("Books: ");
        Book book1=new Book("Поллиана");
        Book book2=new Book("Магия утра");
        Book book3=new Book("Маленький принц");
        Book[]books={book1,book2,book3};
        for(Book book:books){
            if(book instanceof Book){
                System.out.println(book.name);
            }
        }
        System.out.println();
        System.out.println("Magazines: ");
Magazine magazine1=new Magazine("The New-York Times");
Magazine magazine2=new Magazine("The Forbes");
Magazine[]magazines={magazine1,magazine2};
for(Magazine magazine:magazines){
    if(magazine instanceof Magazine){
        System.out.println(magazine.name);
    }
}
        }

    }
