/**
 * 處理檔案
 */

package com.example.leetcode_practice.other.LinearRegression.loading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.leetcode_practice.other.LinearRegression.data.StudentData;

public class FileLoading {
	
	/**
	 * 讀取學生資料
	 * @param fileData
	 * @return
	 */
	public static List<StudentData> inputStudentsData(File fileData, String splitStr){
		
		List<StudentData> studentDatas = new ArrayList<StudentData>();
		
		//利用try-with-resource讀取檔案
		try(FileInputStream fis =new FileInputStream(fileData);
			InputStreamReader isr =new InputStreamReader(fis);
			BufferedReader br =new BufferedReader(isr)){
			String text = null;
			
			//設定列的編號
			int row = 0;
			while ((text = br.readLine())!= null){
				row++;
				if (row == 1){
					continue;
				}
				else{
					//讀取每行的資料，並轉換成List
					String[] Array = text.split(splitStr);
					List<String> ArrayString = new ArrayList<>(Arrays.asList(Array));
					
					//產生單一個學生資料的物件
					StudentData student = new StudentData();
					
					//把資料塞進去
					student.setSchoolYear(Integer.parseInt(ArrayString.get(0)));
					student.setYear(Integer.parseInt(ArrayString.get(1)));
					student.setTotal(Float.parseFloat(ArrayString.get(2)));
					student.setBoyTotal(Float.parseFloat(ArrayString.get(3)));
					student.setGirlTotal(Float.parseFloat(ArrayString.get(4)));
					studentDatas.add(student);

				}
				
			}
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
			System.out.println("找不到資料來源");
		}catch (IOException e){
			e.printStackTrace();
		}			
		
		return studentDatas;
		
	}

}
