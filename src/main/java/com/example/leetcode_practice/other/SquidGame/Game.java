package com.example.leetcode_practice.other.SquidGame;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * FileName : Game
 * CreatTime : 2021/11/13
 * Author : Frank.Chang
 * Description :
 */
public class Game {
    public static void main(String[] args) {
        String text = "○□△○□□△□△△○□○○";
        //將 array 以 名稱和數量 組成一個 map
        Map<String, Long> map = Arrays.stream(text.split(""))
                .collect(groupingBy(String::toString, counting()));
        System.out.println(map);
    }
}
