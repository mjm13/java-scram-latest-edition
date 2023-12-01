package com.meijm.java2se.jdk21;

import java.util.*;

/**
 * 针对有序集合增加便捷入口
 * 1.针对一个元素，查，加
 * 2.针对最后一个元素，查，加
 * 3.集合逆序
 */
public class SequencedCollectionDemo {
    public static void main(String[] args) {
// 创建一个 List
        List<Integer> list = List.of(1, 2, 3);
// 获取第一个和最后一个元素
        System.out.println("list.getFirst():"+list.getFirst());
        System.out.println("list.getLast():"+list.getLast());
// 获取反向视图
        List<Integer> reversed = list.reversed(); // [3, 2, 1]
        System.out.println("reversed.getFirst():"+reversed.getFirst());
        System.out.println("reversed.getLast():"+reversed.getLast());
        
// 创建一个 LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

// 获取第一个和最后一个元素
        System.out.println("set.getFirst():"+set.getFirst());
        System.out.println("set.getLast():"+set.getLast());

// 获取反向视图
        SequencedSet<String> reversedSet = set.reversed(); // ["c", "b", "a"]
        System.out.println("reversedSet.getFirst():"+reversedSet.getFirst());
        System.out.println("reversedSet.getLast():"+reversedSet.getLast());
        
// 创建一个 LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

// 获取第一个和最后一个条目
        System.out.println("map.firstEntry():"+map.firstEntry().toString());
        System.out.println("map.lastEntry():"+map.lastEntry().toString());

// 获取反向视图
        SequencedMap<String, Integer> reversedMap = map.reversed(); // ["c" -> 3, "b" -> 2, "a" -> 1]
        System.out.println("reversedMap.firstEntry():"+reversedMap.firstEntry().toString());
        System.out.println("reversedMap.lastEntry():"+reversedMap.lastEntry().toString());
    }
}
