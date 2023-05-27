package BookList;

public class Book {

    private String book;
    private int page;
    private String author;
    private int releaseDate;

    public Book(String book,int page, String author, int releaseDate) {
        this.book = book;
        this.page=page;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBook() {
        return book;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
