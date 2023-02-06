/**
 * @Description : 時間轉換
 * @ClassName : StringToTimeTest.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/01/11, frankchang
 *   1) First Release.
 */

package com.example.leetcode_practice.other.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToTimeTest {

	public static void main(String[] args) throws ParseException {
		
		String dateString1 = "Jan 7, 2023 07:05:00 UTC";
		String dateString2 = "2023-01-07T07:05:00+00:00";
		String dateString3 = "Jan 10, 2023 at 09:31 GMT";
		
		Date date1 = new Date(dateString1);
		
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");		
		Date date2 = df2.parse(dateString2);
		
		SimpleDateFormat df3 = new SimpleDateFormat("MMM d, yyyy 'at' HH:mm z", Locale.US);
		Date date3 = df3.parse(dateString3);
	}
}
