package base;
//🌈文件导入的方式
import base.*;
import base.model_2.Cat;

public class FileImportDemo {
    public static void main(String[] args) {

//1,直接导入类:包名 + 文件名 + 类名
        base.model_2.Dog dog = new base.model_2.Dog();
        dog.age = 5;
        System.out.println(dog.age);

//2,顶部导入类:import + 包名 + 类名,可以引用所有
        Cat cat = new Cat();
        cat.age = 5;
        System.out.println(cat.age);

//3,

    };
}
