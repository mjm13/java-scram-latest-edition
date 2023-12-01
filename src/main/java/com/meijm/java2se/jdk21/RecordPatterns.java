package com.meijm.java2se.jdk21;

import java.util.HashMap;

/**
 * 类型支持扩展
 */
public class RecordPatterns {
    public static void main(String[] args) {
        Object obj = new Circle(new Point(0, 3), 10);
        if (obj instanceof Circle(Point(int x,int y), int r) ){
            System.out.println("x:"+x);
            System.out.println("y:"+y);
            System.out.println("r:"+r);
        }

//        Object obj2 = new Circle(new Point(1, 2), 3);
//        Object obj2 = null;
        Object obj2 = new HashMap<>();
        switch (obj2){
            case Circle(Point(int x,int y), int r) -> System.out.println("x:"+x+"y:"+y+"r:"+r);
            case null -> System.out.println("is null");
            default -> System.out.println("111");
        }
        
    }
}

record Point(int x, int y) {
}

record Circle(Point center, int radius) {
}
