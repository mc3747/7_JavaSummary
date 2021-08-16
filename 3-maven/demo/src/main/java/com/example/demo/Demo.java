package com.example.demo;

import org.apache.lucene.util.RamUsageEstimator;
import java.lang.reflect.Field;
public class Demo {

    private static class ObjectA{
        String string;
        int i1;
        byte b1;
        byte b2;
        int i2;
        ObjectB objectB;
        byte b3;
    }
    private static class ObjectB{

    }
    
    public static void main(String[] args) {

        int array[] = new int[] {11,22,33};
        //打印值
        System.out.println(array[2]);
        //打印地址
        System.out.println(array.toString());
        System.out.println(array);
        //打印array存储空间
        System.out.println(RamUsageEstimator.sizeOf(array));
        System.out.println(RamUsageEstimator.shallowSizeOf(array));
        //打印自定义ObjectA的内存
        Field[] fields = ObjectA.class.getDeclaredFields();
        for (Field field : fields) {
			System.out.println(RamUsageEstimator.sizeOf(String.valueOf(field)));
        };
    }
}
