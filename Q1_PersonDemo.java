class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Q1_PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Vaibhavi", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();
    }
}