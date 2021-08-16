package base;
//🌈打印变量
public class PrintDemo {
    public  static void main(String[] args) {
        String name = "Tom";
        int age = 20;
//	方式1：用+，不直观
        System.out.println("my name is" + name + ",age is" + age);
//	方式2：用printf，利用格式化，%n相当于回车
        System.out.printf("my name is %s,age is %d", name, age);
    }
}
