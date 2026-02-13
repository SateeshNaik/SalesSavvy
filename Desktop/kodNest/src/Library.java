public class Library {
    public static void main(String[] args) {
        Book b=new Book("java fundamentals",300);
        b.display();
        Book b1=new Book(b);
        b1.display();

        b1.pages=350;
        System.out.println("After modifying the copied book");
        b1.display();
        b.display();

    }
}
