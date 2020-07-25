package user;

public class User {
    private String name;
    private Integer age;
    private String username;

    public User(String name, Integer age, String username) {
        this.name = name;
        this.age = age;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User =>" +
                " name=" + name +
                " age=" + age +
                " username=" + username;
    }
}
