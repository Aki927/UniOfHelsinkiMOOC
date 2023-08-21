/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akirucorpuz
 */
public class Book {
    
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String tl, int pg, int py) {
        this.title = tl;
        this.pages = pg;
        this.publicationYear = py;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getPublicationYear() {
        return publicationYear; 
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    } 
    
    
    
}
