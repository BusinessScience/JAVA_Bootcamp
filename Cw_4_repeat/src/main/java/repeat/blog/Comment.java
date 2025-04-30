package repeat.blog;

import java.util.Date;
import java.util.Optional;

public class Comment extends Entry{

    public Comment(Date postedDate, User author, String content) {
        super(postedDate, author, content);
    }
}
