package collections.set;

import java.util.Set;
import java.util.TreeSet;

//public class Book {
//    int id;
//    String name,author,publisher;
//    int quantity;
//    public Book(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//
//
//    public static void main(String[] args) {
//        HashSet<Book> set = new HashSet<Book>();
//        //Creating Books
//        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
//        Book b2 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
//        Book b3 = new Book(101, "Operating System", "Galvin", "Wiley", 6);
//        //Adding Books to HashSet
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//        //Traversing HashSet
//        for (Book b : set) {
//            System.out.println(b.id +" " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//        }
//
//
//    }
//}
//class Book {
//    int id;
//    String name, author, publisher;
//    int quantity;
//
//    public Book(int id, String name, String author, String publisher, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.quantity = quantity;
//    }
//
//
//
//    public static void main(String[] args) {
//        // Using HashSet instead of TreeSet
//        Set<Book> set = new HashSet<>();
//
//        // Creating Books
//        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
//        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
//        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
//
//        // Adding Books to HashSet
//        set.add(b1);
//        set.add(b2);
//        set.add(b3);
//
//        // Traversing HashSet
//        for (Book b : set) {
//            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//        }
//    }
//}


import java.util.Set;
import java.util.TreeSet;

class BookOne implements Comparable<BookOne> {
    int id;
    String name, author, publisher;
    int quantity;

    public BookOne(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(BookOne b) {
        return Integer.compare(this.id, b.id);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        // Creating a TreeSet with default natural ordering
        Set<BookOne> set = new TreeSet<>();

        // Creating Books
        BookOne b1 = new BookOne(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookOne b2 = new BookOne(233, "Operating System", "Galvin", "Wiley", 6);
        BookOne b3 = new BookOne(300, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        // Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        // Traversing TreeSet
        for (BookOne b : set) {
            System.out.println(b);
        }
    }
}


