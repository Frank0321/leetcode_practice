/**
 * @Description : 工時 Data
 * @ClassName : WorkingHourData.java
 * @Copyright : Copyright (c) 2022 
 * @ModifyHistory : 
 *  v1.00, 2022/12/29, Frank
 *   1) First Release.
 */

package com.example.leetcode_practice.other.workingHour;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WorkingHourData {

	public List<Person> initData(){
		
		List<Person> persionList = new ArrayList<Person>();
		
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-01T08:50:23"), LocalDateTime.parse("2022-12-01T18:00:00")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-02T08:51:43"), LocalDateTime.parse("2022-12-01T18:10:10")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-05T08:54:31"), LocalDateTime.parse("2022-12-01T18:15:20")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-06T09:01:21"), LocalDateTime.parse("2022-12-01T18:11:03")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-07T09:03:13"), LocalDateTime.parse("2022-12-01T18:31:20")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-08T09:15:43"), LocalDateTime.parse("2022-12-01T18:20:04")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-09T08:51:45"), LocalDateTime.parse("2022-12-01T20:10:50")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-12T08:50:23"), LocalDateTime.parse("2022-12-01T22:05:40")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-13T08:52:13"), LocalDateTime.parse("2022-12-01T18:00:04")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-14T08:50:29"), LocalDateTime.parse("2022-12-01T19:10:00")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-15T08:59:30"), LocalDateTime.parse("2022-12-01T18:03:07")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-16T09:00:23"), LocalDateTime.parse("2022-12-01T18:13:34")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-19T09:07:24"), LocalDateTime.parse("2022-12-01T18:20:06")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-20T09:04:31"), LocalDateTime.parse("2022-12-01T18:30:08")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-21T08:59:11"), LocalDateTime.parse("2022-12-01T18:04:10")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-22T09:06:22"), LocalDateTime.parse("2022-12-01T19:35:03")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-23T09:01:33"), LocalDateTime.parse("2022-12-01T18:07:05")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-26T08:52:43"), LocalDateTime.parse("2022-12-01T19:00:36")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-27T08:53:36"), LocalDateTime.parse("2022-12-01T18:08:29")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-28T08:59:28"), LocalDateTime.parse("2022-12-01T18:10:27")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-29T09:04:22"), LocalDateTime.parse("2022-12-01T18:28:19")));
		persionList.add(new Person(0002, "Peter", (long) 218, LocalDateTime.parse("2022-12-30T09:01:25"), LocalDateTime.parse("2022-12-01T18:08:15")));
		
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-01T08:50:23"), LocalDateTime.parse("2022-12-01T18:00:00")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-02T08:53:43"), LocalDateTime.parse("2022-12-01T20:11:10")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-05T08:44:31"), LocalDateTime.parse("2022-12-01T18:55:20")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-06T09:01:21"), LocalDateTime.parse("2022-12-01T18:31:03")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-07T09:03:13"), LocalDateTime.parse("2022-12-01T18:11:22")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-08T09:09:43"), LocalDateTime.parse("2022-12-01T18:12:04")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-09T08:51:45"), LocalDateTime.parse("2022-12-01T20:10:50")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-12T08:50:23"), LocalDateTime.parse("2022-12-01T22:05:40")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-13T08:52:13"), LocalDateTime.parse("2022-12-01T18:00:04")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-14T08:50:29"), LocalDateTime.parse("2022-12-01T19:10:00")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-15T08:59:30"), LocalDateTime.parse("2022-12-01T18:03:07")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-16T09:08:23"), LocalDateTime.parse("2022-12-01T20:13:34")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-19T09:07:24"), LocalDateTime.parse("2022-12-01T18:20:06")));
		persionList.add(new Person(0004, "Ken", (long) 218, LocalDateTime.parse("2022-12-20T09:04:31"), LocalDateTime.parse("2022-12-01T18:30:08")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-21T08:55:11"), LocalDateTime.parse("2022-12-01T18:14:10")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-22T09:06:22"), LocalDateTime.parse("2022-12-01T19:35:03")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-23T09:01:33"), LocalDateTime.parse("2022-12-01T18:07:05")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-26T08:52:43"), LocalDateTime.parse("2022-12-01T19:00:36")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-27T08:53:36"), LocalDateTime.parse("2022-12-01T18:08:29")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-28T06:59:28"), LocalDateTime.parse("2022-12-01T23:10:27")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-29T08:04:22"), LocalDateTime.parse("2022-12-01T18:28:19")));
		persionList.add(new Person(0004, "Ken", (long) 223, LocalDateTime.parse("2022-12-30T09:01:25"), LocalDateTime.parse("2022-12-01T18:08:15")));
		
		
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-01T08:50:23"), LocalDateTime.parse("2022-12-01T18:00:00")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-02T08:51:43"), LocalDateTime.parse("2022-12-01T18:15:10")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-05T08:54:31"), LocalDateTime.parse("2022-12-01T19:15:20")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-06T09:01:21"), LocalDateTime.parse("2022-12-01T18:11:03")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-07T09:03:13"), LocalDateTime.parse("2022-12-01T19:31:20")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-08T07:15:43"), LocalDateTime.parse("2022-12-01T18:20:04")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-09T07:51:45"), LocalDateTime.parse("2022-12-01T21:10:57")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-12T08:50:23"), LocalDateTime.parse("2022-12-01T22:05:40")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-13T08:52:13"), LocalDateTime.parse("2022-12-01T18:00:04")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-14T06:50:29"), LocalDateTime.parse("2022-12-01T23:10:00")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-15T08:59:30"), LocalDateTime.parse("2022-12-01T18:03:07")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-16T09:00:23"), LocalDateTime.parse("2022-12-01T18:13:34")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-19T07:07:24"), LocalDateTime.parse("2022-12-01T23:20:06")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-20T09:04:31"), LocalDateTime.parse("2022-12-01T18:39:08")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-21T08:59:11"), LocalDateTime.parse("2022-12-01T18:04:10")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-22T09:06:22"), LocalDateTime.parse("2022-12-01T19:35:03")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-23T07:01:33"), LocalDateTime.parse("2022-12-01T22:07:05")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-26T08:52:43"), LocalDateTime.parse("2022-12-01T19:00:36")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-27T07:53:36"), LocalDateTime.parse("2022-12-01T20:23:29")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-28T08:59:28"), LocalDateTime.parse("2022-12-01T18:10:27")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-29T08:04:22"), LocalDateTime.parse("2022-12-01T18:28:19")));
		persionList.add(new Person(9547, "Tina", (long) 250, LocalDateTime.parse("2022-12-30T08:01:25"), LocalDateTime.parse("2022-12-01T18:48:15")));
		
		return persionList;
	}
	
}
