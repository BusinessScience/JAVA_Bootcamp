package repeat.blog;

public class User {
    private String name;
    private String lastName;
    private String nickName;
    private int id;

    private static int USER_COUNTER =1;

    public User(String name, String lastName, String nickName) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
        this.id = USER_COUNTER++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", id=" + id +
                '}';
    }
}
