package com.example.leetcode_practice.Medium.m50_Pow;

public class Frank_1110 {

  public static void main(String[] args) {
    double x = 2.00000;
    int n = -2;
    System.out.println(myPow(x, n));
  }

  //Time Limit Exceeded
  private static double myPow(double x, int n) {
    if (x == 1){
      return 1;
    }
    double result = 1;
    while (n != 0){
      result = (n > 0) ? (result * x) : (result / x);
       n = n > 0 ? n -1 : n +1;
    }
    return result;
  }

}
