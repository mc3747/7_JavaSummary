public class Interfaces{
    public static void main(String[]args){
        Student5 student = new Student5("ll");
        student.run();
    }
}
//
interface Hello {
    void hello();
}
interface Person5 extends Hello {
    void run();
    String getName();
}
class Student5 implements Person5 {
    private String name;
    public Student5(String name) {
        this.name = name;
    }
    @Override
    public void hello() {
        System.out.println("hello");
    }
    @Override
    public void run() {
        System.out.println(this.name + " run");
    }
    @Override
    public String getName() {
        return this.name;
    }
}