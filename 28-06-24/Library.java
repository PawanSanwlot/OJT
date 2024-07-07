class Book{                         //Attributes
    String title;
    String author;
    double price;

    Book(String title, String author, double price){            //Constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayInfo(){               //Method
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Library {
    public static void main(String[] args) {  
        //New object
        Book book1 = new Book("Alchemist", "Paulo Cohelo", 220);
        book1.displayInfo();
    }
}
