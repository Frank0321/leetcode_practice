package com.example.leetcode_practice.other.SquidGame;

import java.util.Arrays;

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
        System.out.println(Arrays.stream(text.split(""))
                .collect(groupingBy(String::toString, counting())));
    }
}
