package smcgovern2;

import java.util.ArrayList;

public class Startup {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person());
        people.add(new Person("John"));
        people.add(new Person("Jeff","Jones"));
        people.add(new Person("Johnson", 44));
        people.add(new Person("Larry", "Larson", 12));



        System.out.format("%-12s %-12s %4s \n", "First", "Last", "Age");
        System.out.format("%-12s %-12s %4s \n", "=====", "====","===");
        for (Person p : people){
            System.out.format("%-12s %-12s %4d \n", p.getFirstName(), p.getLastName(),p.getAge());
        }



    }

}
