package com.example.leetcode_practice.other.Map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * FileName : MapInfo
 * CreatTime : 2022/1/9
 * Author : Frank.Chang
 * Description :
 */
public class MapInfo {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 1);
        treeMap.put("A", 3);
        treeMap.put("B", 2);
        System.out.println(treeMap);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("B", 2);
        hashMap.put("C", 1);
        hashMap.put("A", 3);
        System.out.println(hashMap);


    }
}
