package example_3;

public class User2 {
    private String name;
    private String surname;
    private int age;

    public User2() {

    }

    public User2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ",Surname: " + this.surname + ",Age: " + this.age;
    }
}
