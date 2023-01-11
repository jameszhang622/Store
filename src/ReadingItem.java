public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public ReadingItem(String name, String location, int price, String description, int wordCount, String datePublished, String author) {
        super(name, location, price, description);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
