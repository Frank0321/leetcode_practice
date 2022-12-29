/**
 * @Description : 工時計算系統 main 
 * @ClassName : WorkHourMain.java
 * @Copyright : Copyright (c) 2022 
 * @ModifyHistory : 
 *  v1.00, 2022/12/29, Frank
 *   1) First Release.
 */

package com.example.leetcode_practice.other.workingHour;

import java.util.List;

public class WorkHourMain {
	
	public static void main(String[] args) {
		
		WorkingHourData workingHourData = new WorkingHourData();
		List<Person> initData = workingHourData.initData();
		
		/***
		 * 計算每個人這個月薪資
		 * 1. 每日上班時間 - 下班時間 -1 hr (午休) 為每日上班時數 (以整數進行計算)
		 * 2. 當日時數 * 時薪 = 當日薪資
		 * 3. 當月的當日薪資累積為當月薪資
		 * 
		 * ------進階------
		 * 1. 當日時數滿 8小時，不滿9小時為基本新增
		 * 2. 當日時數滿 9小時，不滿11小時，超過8小時以上，時薪為基本薪資的 1.3 倍
		 * 3. 滿11小時以上，8小時 - 11 小時，時薪為基本薪資的 1.3 倍，11小時以上時薪為基本薪資的2倍
		 * 
		 */

		
		/***
		 * method 1
		 * 任意方式撰寫
		 */
		
		/***
		 * method 2
		 * 使用 map 方式組合數據進行撰寫
		 * 並使用 foreach 的方式分析數據
		 */
		
		/***
		 * method 3
		 * 使用除上述兩種方法以外撰寫 (如 stream )
		 * 
		 */
	}

}