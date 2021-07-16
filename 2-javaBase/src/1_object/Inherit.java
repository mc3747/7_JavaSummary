/*
 *
 * ✅继承✅
 *
 */
public class Inherit {
    public static void main(String[] args) {
        Person2 person = new Student2("lk",12,15);
        System.out.println(person.age);
    }
}
class  Person2{
    protected  String name;
    protected  int age;
    public  Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Student2 extends Person2 {
    protected int score;
    public Student2(String name, int age, int score) {
        super(name, age); // 调用父类的构造方法Person(String, int)
        this.score = score;
    }
}