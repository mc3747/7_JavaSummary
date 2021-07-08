public class AbstractClass {
    public static void main(String[] args) {
        Student4_1 student1 = new Student4_1();
        student1.run();
        Student4_2 student2 = new Student4_2();
        student2.run();
    }
}

abstract class Person4 {
    public abstract void run();
}

class Student4_1 extends Person4 {
    @Override
    public void run() {
        System.out.println("Student4_1.run");
    }
}

class Student4_2 extends Person4 {
    @Override
    public void run() {
        System.out.println("Student4_2.run");
    }
}