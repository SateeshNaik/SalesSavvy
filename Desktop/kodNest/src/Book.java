public class Book {
    String title;
    int pages;
    public Book(String title,int pages) {
        this.title=title;
        this.pages=pages;
    }
    public Book(Book another) {
        this.title= another.title;
        this.pages=another.pages;
    }
    public void display(){
        System.out.println("Book title=" + title + " Book pages=" + pages );

    }
}
