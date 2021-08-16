
/*
 * 1，package包名
 * 2，文件名和类名要一致，都为Main
 * 3，先有类，再有方法
 * 4，入口函数为main（），而且public修饰
 * 5，没有public修饰，可与文件名不同
 * 6，main函数调用了java开发包JDK提供的打印函数System.out.print()
 * */
public class HelloWorld {
    //	程序入口
   public  static void main(String[] args) {
       System.out.println("hello world");
       int name = 9;
       System.out.println(name);
   }
}
