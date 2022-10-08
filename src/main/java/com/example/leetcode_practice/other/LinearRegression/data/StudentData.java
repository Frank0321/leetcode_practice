/**
 * 建立單筆學生資料物件
 */
package com.example.leetcode_practice.other.LinearRegression.data;

public class StudentData {
	
	/** 學年度 */
	private int schoolYear;
	
	/** 年齡 */
	private int year;
	
	/** 總計 */
	private float total;
	
	/** 男生統計 */
	private float boyTotal;
	
	/** 女生統計 */
	private float girlTotal;

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getBoyTotal() {
		return boyTotal;
	}

	public void setBoyTotal(float boyTotal) {
		this.boyTotal = boyTotal;
	}

	public float getGirlTotal() {
		return girlTotal;
	}

	public void setGirlTotal(float girlTotal) {
		this.girlTotal = girlTotal;
	}
	
}
