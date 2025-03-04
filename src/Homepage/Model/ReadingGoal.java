package Homepage.Model;

public class ReadingGoal {
    //Attributes
    int targetBooks;
    String timeframe;
    int booksRead;

    //CONSTRUCTOR
    public ReadingGoal(int targetBooks, String timeframe, int booksRead) {
        this.targetBooks = targetBooks;
        this.timeframe = timeframe;
        this.booksRead = booksRead;
    }

    //METHODS
    public int getTargetBooks() {
        return targetBooks;
    }
    public String getTimeframe() {
        return timeframe;
    }
    public int getBooksRead() {
        return booksRead;
    }

    public void setTargetBooks(int targetBooks) {
        this.targetBooks = targetBooks;
    }
    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }
    public void setBooksRead(int booksRead) {
        this.booksRead = booksRead;
    }
}
