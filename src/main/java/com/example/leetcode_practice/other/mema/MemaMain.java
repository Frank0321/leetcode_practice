/**
 * @Description : 密碼相關的功能介紹
 * @ClassName : MemaMain.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/02/06, frankchang
 *   1) First Release.
 */

package com.example.leetcode_practice.other.mema;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MemaMain {
	
	public static void main(String[] args) {
		
		// URI
		String url = "https://hackmd.io/@KaiChen/Bys0x2A6_";
		
		try {
			String encode = URLEncoder.encode(url, "UTF-8");
			System.out.println(encode);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	}

}
