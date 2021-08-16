package object;

/*
 * ✅方法✅
 *  // 1，可变参数，必须传同类型的
	// 2，可变参数，必须是最后一个参数，防止歧义
	// 3，基本类型：值传递；引用类型（数组和对象）：地址传递
	// 4，方法签名：方法名 + 参数类型，不包括返回值，必须唯一
	// 5，方法可重载，方法名相同，方法签名不同（参数个数，参数类型不同）
 *
 * */
public class Method {
    public static void main(String[] args) {
        int age = 5;
        String name = "a";
        String[] fullName = new String[]{"mm","nn"};
        Person ming = new Person();
        ming.setAge(age);
        ming.setName(name);
        ming.setFullName(fullName);
        System.out.println(ming.getAge() + ming.getName() + ming.getFullName());
        age = 6;
        name = "b";
        fullName[0] = "kk";
        System.out.println(ming.getAge() + ming.getName()+ ming.getFullName());
    }
}

class Person {
    private String name;
    private int age;
    private String[] fullName;
// 传递基本类型
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//  传递对象类型
    public String getFullName() {
        return this.fullName[0];
    }
    public  void  setFullName(String[] fullName){
        this.fullName = fullName;
    }
}