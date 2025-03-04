package Homepage.Controller;

import Channels.Model.ReadingProgress;

public class BookProgressController {
    //Attributes
    ReadingProgress readingProgress;

    //CONSTRUCTOR
    public BookProgressController(ReadingProgress readingProgress) {
        this.readingProgress = readingProgress;
    }


    //METHODS
    public ReadingProgress getReadingProgress() {
        return readingProgress;
    }

    public void setReadingProgress(ReadingProgress readingProgress) {
        this.readingProgress = readingProgress;
    }
}
