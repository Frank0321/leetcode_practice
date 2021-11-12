package com.example.leetcode_practice.other.position;

import java.util.Arrays;

/**
 * FileName : twoArray
 * CreatTime : 2021/10/31
 * Author : Frank.Chang
 * Description :
 */
public class twoArray {
    public static void main(String[] args) {
        String direction = "↑←→↓";
        String[][] map = new String[][]{
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
        };
        int startRowNo = 1;
        int startColumnNo = 1;
        String [] mapLogs = new String[direction.length()];

        String[] strSplit = direction.split("");

        for (int i = 0; i < strSplit.length; i++) {
            switch (strSplit[i]){
                case "↑":
                    startColumnNo = method(startColumnNo, -1, map.length);
                    break;
                case "↓":
                    startColumnNo = method(startColumnNo, 1, map.length);
                    break;
                case "→":
                    startRowNo = method(startRowNo, 1, map[startColumnNo].length);
                    break;
                case "←":
                    startRowNo = method(startRowNo, -1, map[startColumnNo].length);
                    break;
                case "↖":
                    startColumnNo = method(startColumnNo, -1, map.length);
                    startRowNo = method(startRowNo, -1, map[startColumnNo].length);
                    break;
                case "↗":
                    startColumnNo = method(startColumnNo, -1, map.length);
                    startRowNo = method(startRowNo, 1, map[startColumnNo].length);
                    break;
                case "↙":
                    startColumnNo = method(startColumnNo, 1, map.length);
                    startRowNo = method(startRowNo, -1, map[startColumnNo].length);
                    break;
                case "↘":
                    startColumnNo = method(startColumnNo, 1, map.length);
                    startRowNo = method(startRowNo, 1, map[startColumnNo].length);
                    break;
                default:
                    break;
            }
            strSplit[i] = map[startColumnNo][startRowNo];
        }

        Arrays.stream(strSplit).forEach(System.out::println);
    }

    private static int method(int start, int i, int length) {
        start += i;
        if (start < 0){
            return 0;
        }else if (start > length){
            return length;
        }else {
            return start;
        }
    }
}
