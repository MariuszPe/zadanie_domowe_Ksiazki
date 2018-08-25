public class Books {
    private String author;
    private String title;
    private String description;
    private int quantityOfPages;

    public Books() {}

    public Books(String author, String title, String description, int quantityOfPages) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.quantityOfPages = quantityOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author = '" + author + '\'' +
                ", title = '" + title + '\'' +
                ", description = '" + description + '\'' +
                ", quantityOfPages = " + quantityOfPages +
                '}';
    }
}
