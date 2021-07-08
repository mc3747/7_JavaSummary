/*
 * ✅方法✅
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