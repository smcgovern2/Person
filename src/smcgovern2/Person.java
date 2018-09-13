package smcgovern2;

public class Person implements Weighable {

    private String firstName;
    private String lastName;
    private int age;
    private double weight;

    private static boolean alive = true;



    public Person() {
        this.firstName = "Timmy";
        this.lastName = "Smith";
        this.age = 23;
        this.weight = 150.0;
    }

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "Smith";
        this.age = 23;
        this.weight = 120.0;
    }

    public Person(String lastName, int age) {
        this.firstName = "Timmy";
        this.lastName = lastName;
        this.age = age;
        this.weight = 120.0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 23;
        this.weight = 120.0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = 120.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isAlive() {
        return alive;
    }

    public static void setAlive(boolean alive) {
        Person.alive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void addWeight(double lbs) {
        this.weight = weight + lbs;
    }

    @Override
    public void loseWeight(double lbs) {
        this.weight = weight - lbs;

    }
}
