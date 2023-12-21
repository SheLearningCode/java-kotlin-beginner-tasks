package org.example.Collections;
import java.util.*;

public class Collections {

    public static class Person{
        public String name;
        public int age;
        public int employeeNo;

        public Person(String name, int age, int employeeNo) {
            this.name = name;
            this.age = age;
            this.employeeNo = employeeNo;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", employeeNo=" + employeeNo +
                    '}';
        }
    }

    public static void main(String[] args) {
        //12.1
        /*ArrayList<String> people = new ArrayList<>();

        people.add("Pedro");
        people.add("Pablo");
        people.add("Mario");
        people.add("Pavel");
        people.add("Marta");

        Iterator itr = people.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<Person> persons = new ArrayList<>();

        Person obj;

        while (itr.hasNext()){

            obj = new Person((String) itr.next(), 23, 123213);
            persons.add(obj);
        }

        itr = persons.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }*/

        //12.2
        /*HashMap<Integer, String> bookDir = new HashMap<Integer, String>();

        bookDir.put(1,"It follows");
        bookDir.put(2,"HP and the philosophal stone");
        bookDir.put(3,"Run");
        bookDir.put(4,"MistBorn");
        bookDir.put(5,"Science for dummies");

        for(Map.Entry<Integer, String> book: bookDir.entrySet()){
            System.out.println(book.getKey() + "--> " + book.getValue());
        }*/

        //12.3
        TreeSet<String> set = new TreeSet<>();

        set.add("Welcome");
        set.add("to");
        set.add("The");
        set.add("Internet");
        set.add("Welcome");

        Iterator itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
