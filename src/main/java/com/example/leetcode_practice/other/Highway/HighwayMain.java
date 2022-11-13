package com.example.leetcode_practice.other.Highway;

import java.util.Arrays;

public class HighwayMain {

	/**
	 * 題目 : 高速公路
	 * 1. 只有一線道
	 * 2. 每次前進該車的速度 (速度2 => 前進2格)
	 * 3. 前進時，不可以超過前面車輛
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota", "altis", 1);
		Car car2 = new Car("BMW", "M3", 2);
		Car car3 = new Car("Benz", "C300", 3);
		
		
//		Car[] highway = new Car[]{
//			car1, car2, car3, null, null, null, null, null, null, null, null, null
//		};
		
		
//		Car[] highway = new Car[]{
//			car3, car2, car1, null, null, null, null, null, null, null, null, null
//		};
		
		// { null, car3, car2, car1, null, null, null, null, null, null, null, null }
		
		Car[] highway = new Car[]{
			car1, car3, car2, null, null, null, null, null, null, null, null, null, null, null, null
		};		
		//{ null, car1, null, car3, car2, null, null, null, null, null, null, null }
		
		
		int endNo = 10;
		
		// 第1秒
		// 0:null
		// 1:"Benz-C300"
		// 2:"BMW-M3"
		// 3:Toyota-altis"
		// 4 ~ end : null
		
		printHighway(highway);
		
		for (int i = 0; i<endNo; i ++) {
			
			highway = resetHighway(highway);
			
			printHighway(highway);
		}
		
	}

	/**
	 * 重新排列新的 highway
	 * 
	 * @param highway
	 * @return
	 */
	private static Car[] resetHighway(Car[] highway) {
		
		int highwayLength = highway.length;
		
		Car[] newHighway = new Car[highwayLength];
		
		for (int position = highwayLength -1; position >= 0; position --) {
			
			//是 null 則跳過
			if (highway[position] == null) {
				continue;
			}
			
			// 不是 null，則往前移動
			
			// 該車的速度
			int speed = highway[position].getSpeed();
			
			// 該車新的位置，預設為當前位置
			int newPosition = position;
			
			// 從當前的位置往前算車速
			// 如果車速的位置，在新座標上沒有車子，則先佔用
			//                在新座標上  有車子，強制結束
			for (int i = 0; i <= speed; i ++) {
				int tempPosition = position + i;
				if((tempPosition < highwayLength) && (newHighway[tempPosition] == null)) {
					newPosition = tempPosition;
				} else {
					break;
				}
			}
			
			newHighway[newPosition] = highway[position];
		}
		
		return newHighway;
	}

	/**
	 * 列印高速公路的 method
	 * @param highway
	 * @return
	 */
	private static void printHighway(Car[] highway) {
		System.out.println(Arrays.toString(highway));
	}
	
}


class Car {
	
	private String brand;
	
	private String type;
	
	private int speed;

	public Car(String brand, String type, int speed) {
		this.brand = brand;
		this.type = type;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", type=" + type + ", speed=" + speed
				+ "]";
	}

	// 取出速度
	public int getSpeed() {
		return speed;
	}
	
	
}