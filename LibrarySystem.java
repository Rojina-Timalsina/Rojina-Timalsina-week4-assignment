//Class LibraryItem with fields: title, author, id.
//Method: getInfo() prints details.
//Subclasses: Book, Magazine, Newspaper override getInfo() to include type-specific info (e.g., publication frequency, issue number).
//Demonstrate a catalog using an array of LibraryItem objects.
//File: LibrarySystem.java.

class LibraryItem{
    public String title;
    public String author;
    public int id;

    public LibraryItem(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
    }
    public void getInfo(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Id: "+this.id);
    }
}
class Book extends LibraryItem{
    public String genre;
    Book(String title, String author, int id, String genre){
        super(title, author, id);
        this.genre = genre;
    }

    @Override
    public void getInfo(){
    super.getInfo();
    System.out.println("Genre: " + this.genre);
    }
}

class Magazine extends LibraryItem{
    public int issueNo;
    public Magazine(String title, String author, int id, int issueNo){
        super(title,author,id);
        this.issueNo = issueNo;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Issue Number: " + this.issueNo);
    }
}

class Newspaper extends LibraryItem{
    public String frequency;
    public Newspaper(String title, String author, int id, String frequency){
        super(title,author,id);
        this.frequency = frequency;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Frequency: " + this.frequency);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] catalog = new LibraryItem[3];

        catalog[0] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 190, "Non-fiction");
        catalog[1] = new Magazine("Time magazine", "Time editorial team", 107, 26);
        catalog[2] = new Newspaper("The Kathmandu post", "post media pvt.ltd.", 104, "Daily");

        for (LibraryItem item : catalog){
            item.getInfo();
            System.err.println();
        }
    }



}

