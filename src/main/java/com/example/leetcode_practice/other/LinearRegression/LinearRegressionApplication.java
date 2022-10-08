/**
 * 主程式
 */

package com.example.leetcode_practice.other.LinearRegression;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.example.leetcode_practice.other.LinearRegression.Method.FTest;
import com.example.leetcode_practice.other.LinearRegression.Method.LinearRegression;
import com.example.leetcode_practice.other.LinearRegression.data.PreData;
import com.example.leetcode_practice.other.LinearRegression.data.StudentData;
import com.example.leetcode_practice.other.LinearRegression.loading.FileLoading;

public class LinearRegressionApplication {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("C:/Users/Frank/Desktop/學生身高平均值6歲-15歲.csv");
		List<StudentData> studentsDatas = FileLoading.inputStudentsData(file, "\t");
		List<Integer> yearList = Arrays.asList(7,8,9,10,11,12,13,14,15);
		
		
		System.out.println("=======================================");
		System.out.println("=====         輸入年齡         =====");
		System.out.println("=======================================");
		
		//強迫為有效年齡，否則就持續輸入
		int inputYear;
		do {
			inputYear = scanner.nextInt();
			//如果不包含則繼續判斷
			if (!yearList.contains(inputYear)) {
				System.out.println("請輸入有效年齡");
			}
		}while (inputYear > 15 || inputYear < 7);
		
		
		System.out.println("=======================================");
		System.out.println("=====    輸入性別 1:男    2:女     =====");
		System.out.println("=======================================");
		
		//強迫為有效輸入，否則就繼續輸入
		int inputSex;
		do {
			inputSex = scanner.nextInt();
			//如果不包含則繼續判斷
			if (inputSex > 2 || inputYear < 1) {
				System.out.println("請輸入有效性別");
			}
		}while (inputSex > 2 || inputYear < 1);
		
		List<PreData> preDatas = calPreData(studentsDatas, inputYear, inputSex);
		calMethod(preDatas);
		System.out.println("=======================================");
		System.out.println("==========    計算結束     ==========");
		System.out.println("=======================================");
	}

	/**
	 * 計算回規線
	 * @param preDatas
	 */
	private static void calMethod(List<PreData> preDatas) {
		
		//轉換成Array
		int size = preDatas.size();
		double[] xArr = new double[size]; 
		double[] yArr = new double[size];
		
		for (int i = 0; i < size; i++) {
			xArr[i] = preDatas.get(i).getSchoolYear();
			yArr[i] = preDatas.get(i).getHeight();
		}
		
		//使用回歸線的方法
		LinearRegression regression = new LinearRegression(xArr, yArr);
		System.out.println(String.format("截距 : %.04f", regression.intercept()));
		System.out.println(String.format("斜率 : %.04f", regression.slope()));
		System.out.println(String.format("r2 : %.04f", regression.R2()));
		System.out.println(String.format("預測(110) : %.04f", regression.predict(110)));
		
		//使用FTest
		FTest test = FTest.test(xArr, yArr);
		System.out.println(String.format("F Test : %.04f", test.f));
		System.out.println(String.format("p-value : %.04f", test.pvalue));
		

	}

	/**
	 * 整理為回歸線有效資料
	 * @param studentsDatas
	 * @param inputYear
	 * @param inputSex
	 * @return
	 */
	private static List<PreData> calPreData(List<StudentData> studentsDatas, int inputYear, int inputSex) {
		
		List<PreData> list = new ArrayList<PreData>();
		for(StudentData rawData : studentsDatas) {
			if (rawData.getYear() == inputYear) {
				PreData preData = new PreData();
				//塞入學年度
				preData.setSchoolYear(rawData.getSchoolYear());
				//判斷男女生，再決定身高
				float height = inputSex == 1 ? rawData.getBoyTotal():rawData.getGirlTotal();
				preData.setHeight(height);
				list.add(preData);
			}
		}
		return list;
	}
	
	
	

}
