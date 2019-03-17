package Homework6;

public class Book {
    private int ID;
    private String title;
    private String author;
    private String publishingOffice;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;

    public Book (int ID, String title, String author, String publishingOffice,
                 int yearOfPublishing, int numberOfPages, double price){

        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publishingOffice = publishingOffice;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        }

    public Book () {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;

    }

    public void view(){
        System.out.println(" ID " + ID + " Title " + title + " Author " + author + " Publishing office " + publishingOffice
                + " Year of publishing " + yearOfPublishing + " Number of pages " + numberOfPages + " Price " + price);

    }

}
