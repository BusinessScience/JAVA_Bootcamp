package repeat.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Blog {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public Blog(List<User> users, List<Post> posts) {
        this.users = users;
        this.posts = posts;
    }

    public void publishPost(int userId, String content) {
        Optional<User> optionalUser = findUser(userId);
        User user = null;

        if (optionalUser.isPresent()) {
            user = optionalUser.get();
            System.out.println(user.getName());
        } else {
            System.out.println("None");
        }
        posts.add(new Post(new Date(), user, content));
        //User user = findUser(userId).
        //      orElseThrow(()-> new RuntimeException("None"));
    }

    public void commentPost(int userId, int postId, String content) {
        Optional<User> optionalUser = findUser(userId);

        if (optionalUser.isEmpty()) {
            System.out.println("User doesn't exst");
            return;
        }
        User user = optionalUser.get();

        Post post = findPost(postId);
        if (post == null)
            return;

        post.getComments().add(new Comment(new Date(), user, content));
    }

    private Optional<User> findUser(int userId) {
        for (User user : this.users)
            if (user.getId() == userId)
                return Optional.of(user);
        return Optional.empty();
    }

    private Post findPost(int postId) {
        for (Post post : this.posts)
            if (post.getId() == postId)
                return post;
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
