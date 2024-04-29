package stream.filters.print30DaysWired.model;
public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;

    public Book(String title, String genre, String author){
        this.title = title; this.genre = genre; this.author = author;
    }
    

    //accessors for instance fields not shown here
    
    public String getTitle(){
            return title;
    }
        
    public String getGenre(){
        return genre;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public static class BookFilter {
        // original method 
       /* public boolean isFiction(Book b){
            return b.getGenre().equals("fiction");
        }*/
    
        public static boolean isFiction(Book b){ // add static 
            return b.getGenre().equals("fiction");
        }

    }
}
