package repeat.blog;

import java.util.Date;

public abstract class Entry {
     private int id;
     private Date postedDate;
     private User author;
     private String content;
     private static int ENTRY_COUNTER = 1;

    public Entry(Date postedDate, User author, String content) {
        this.id = ENTRY_COUNTER++;
        this.postedDate = postedDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static int getEntryCounter() {
        return ENTRY_COUNTER;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", postedDate=" + postedDate +
                ", author=" + author +
                ", content='" + content + '\'' +
                '}';
    }
}
