package base;
//🌈封装数据类型
	/*
	Integer：对应封装了基本类型 int；
	Long：对应封装了基本类型 long；
	Float：对应封装了基本类型 float；
	Double：对应封装了基本类型 double；
	Boolean：对应封装了基本类型 boolean；
	String：对应封装了字符串类型 char[]。
	*/
public class PackingDataTypeDemo {
    public static void main(String[] args) {
        packageType();
        arrayType();
        objectType();
    };
    //1，包装类型
    public static void packageType() {
        Integer oa = new Integer(6);
        System.out.println(oa);
    };
    //2，数组
    // 元素存储在堆空间
    public static void arrayType() {
        char[] arr1 = { '1', '2', '3' };
        System.out.println(arr1);
//	   ⚠️ 数组️名称 输出的是对象的哈希值
        int[] arr2 = { 1, 2, 3 };
        System.out.println(arr2);

//		数组的遍历
        for (int i : arr2) {
            System.out.println(i);
        }
    }
    //3,对象
    public static void objectType() {
        Dog dog1 = new Dog(2, 10);// 通过 new 关键词创建了一个 Dog 对象 dog1
        int age = dog1.getAge();// 调用 dog1 的 getAge() 方法
        dog1.run();// 调用 dog1 的 run() 方法
    };

}
class Dog { // 定义了一个 Dog 类
    private int age; // 属性或者成员变量
    private int weight;

    public Dog(int age, int weight) { // 构造函数
        this.age = age;
        this.weight = weight;
    }

    public int getAge() { // 函数或者方法
        return age;
    }

    public int getWeigt() {
        return weight;
    }

    public void run() {
        System.out.println("年龄"+age +"重量"+ weight);
    }
};

class MiniDog extends Dog{
    public MiniDog(int age, int weight) {
        super(age, weight);
    }
    public void wangwang() {
        System.out.println("旺旺");
    }

}
