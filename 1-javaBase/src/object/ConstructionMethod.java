/*
* ✅构造方法✅
*
* */
public class ConstructionMethod {
    public static void main(String[] args) {
        Person1 ming1 = new Person1();
        Person1 ming2 = new Person1("kk");
        Person1 ming3 = new Person1("pp", 12);
        System.out.println(ming1);
        System.out.println(ming2);
        System.out.println(ming3);
    }
}
class Person1 {
    private String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person1(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }
    public Person1() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }
//    重写打印的方法
    @Override
    public String toString() {
        return "Person1(age:" + age + ",name:" + name + ")";
    }

}