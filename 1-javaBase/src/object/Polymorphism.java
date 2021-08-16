/*
 *
 * ✅多态✅
 *
 */
public class Polymorphism{
    public static void main(String[]args){
        Person3 person3 = new Person3("mm");
        System.out.println(person3);
    }
}
/*
* 因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
toString()：把instance输出为String；
equals()：判断两个instance是否逻辑相等；
hashCode()：计算一个instance的哈希值。
*
* */
class Person3 {
    protected  String name;
    public  Person3(String name){
        this.name = name;
    }

    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }
    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        if (o instanceof Person3) {
            Person3 p = (Person3) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }
    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}