package classes;

import java.util.Scanner;

public class Livro {

    private String title;
    private String author;
    private int numbOfPages;
    static String LibraryName; // O método "static" basicamente compartilha o mesmo atributo;
    private Scanner ler = new Scanner(System.in);

    public Livro() {
        this.title = "";
        this.author = "";
        this.numbOfPages = 0;
    }
    
    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static String getLibraryName() {
        return LibraryName;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public static void setLibraryName(String LibraryName) {
        Livro.LibraryName = LibraryName;
    }
    
    public void printSummary(){
        System.out.println("Title: " + title
                + ". Author: " + author
                + ". Numb. of Pages: " + numbOfPages
                + ". Library: " + LibraryName);
    }
    
     public void fill(){
        System.out.println("fill the book informations: ");
        //title
        System.out.print("Title: ");
        this.title = ler.nextLine();
        
        //author
        System.out.print("Author: ");
        this.author = ler.nextLine();
        
        //number of pages
        System.out.print("Number of pages: ");
        this.numbOfPages = Integer.parseInt(ler.nextLine());
        
        System.out.println("Book registered successfully");
        
    }
}
