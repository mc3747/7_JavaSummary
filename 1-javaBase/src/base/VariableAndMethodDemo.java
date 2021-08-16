package base;
//🌈类中的变量和方法
public class VariableAndMethodDemo {
    //    1，成员变量
    public int age;
    //    2，静态变量
    public static  int height;
    //    普通方法
    public void sleep(){
//    3，局部变量
        String color;
        System.out.println("Passed Name is :" + age );
    };
    //    构造方法
    public VariableAndMethodDemo(String name){
        System.out.println("Passed Name is :" + name );
    };
}
