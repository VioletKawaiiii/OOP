package assignment_2;

// Muhammad Fikry Haikal
// 20220040180
// TI22I

public class Books {
    private String author;
    private String title;
    private double price;
    private int publisher_number;

    public Books(String author, String title, double price, int publisher_number){
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getPublisherNumber(){
        return publisher_number;
    }

    public static class BooksList{
        private Books[] books;

        public BooksList(){
            books = new Books[3];
            books[0] = new Books("Cindy Adams", "Bung Karno: Penyambung Lidah Rakyat Indonesia", 50000, 12456);
            books[1] = new Books("Robert Greene", "The 48 law of power", 100000, 11289);
            books[2] = new Books("Robert Cialdini", "Influence The Psychology", 150000, 98222);
        }

        public void displayBook(){
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("List Book: ");
            System.out.println("-------------------------------------------------------------------------");

            for(Books book: books){
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Price: Rp." + book.getPrice());
                System.out.println("Publisher Number: " + book.getPublisherNumber());
                System.out.println("-------------------------------------------------------------------------");
            }

        }
        
       public double calculatePriceToGetAllBooks(){
        double total = 0;
        for (Books book : books) {
            total += book.getPrice();
        }
        return total;
       }
        
    }


    public static void main(String[] args)  {
        BooksList booksList = new BooksList();
        booksList.displayBook();

        System.out.println("The total price of all book is: " + booksList.calculatePriceToGetAllBooks());
        System.out.println("-------------------------------------------------------------------------");
    }
}
