/**
 * @Description : 人員物件
 * @ClassName : Person.java
 * @Copyright : Copyright (c) 2022 
 * @ModifyHistory : 
 *  v1.00, 2022/12/29, Frank
 *   1) First Release.
 */

package com.example.leetcode_practice.other.workingHour;

import java.time.LocalDateTime;

public class Person {
	
	/** 員工編號 */
	private Integer mepId;
	
	/** 員工姓名 */
	private String name;
	
	/** 員工時薪 */
	private Long hourMoney;
	
	/** 員工上班間 */
	private LocalDateTime startTime;
	
	/** 員工下班時間 */
	private LocalDateTime endTime;

	/**
	 * @param mepId
	 * @param name
	 * @param hourMoney
	 * @param startTime
	 * @param endTime
	 */
	public Person(Integer mepId, String name, Long hourMoney, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.mepId = mepId;
		this.name = name;
		this.hourMoney = hourMoney;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Integer getMepId() {
		return mepId;
	}

	public void setMepId(Integer mepId) {
		this.mepId = mepId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHourMoney() {
		return hourMoney;
	}

	public void setHourMoney(Long hourMoney) {
		this.hourMoney = hourMoney;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	
}
