package repeat.blog;

public class Main {
    public static void main(String[] args) {

        Blog blog = new Blog();

        blog.getUsers().add(new User("jan", "Te", "janek007"));
        blog.getUsers().add(new User("Agnieszka", "Pe", "aga456"));

        blog.publishPost(1,"Jakies tam bzdury czyli zawartośc posta");
        blog.publishPost(2,"Jakies tam bzdury czyli zawartośc posta");

        blog.commentPost(1,2, "Dobry post");
    }
}
