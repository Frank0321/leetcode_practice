package com.example.leetcode_practice.other.Highway;

import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class HighwayMain {

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
			int speed = highway[position].getSpeed();
			
			int newPosition = position;
			
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