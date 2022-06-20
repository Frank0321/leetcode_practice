/**
 * 庫克牌資訊
 */

package com.example.leetcode_practice.other.BlackJack.card;

import java.util.Objects;

public class Card {

	/** 庫克牌的號碼 */
	private String point;
	
	/** 庫克牌的花色 */
	private CardColor color;
	
	/**
	 * 庫克牌的點數
	 * A : 1 點
	 * J、Q、K 表示 10 點
	 */
	private int value;
	
	
	public Card() {
		
	}
	
	//使用建構式，建立卡片的顏色與號碼
	public Card(CardColor color, String point) {
		this.color = color;
		this.point = point;
		this.value = this.getValue();
	}
	
	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public CardColor getColor() {
		return color;
	}

	public void setColor(CardColor color) {
		this.color = color;
	}

	/**
	 * 重新定義庫克牌點數
	 * A : 1 點
	 * J、Q、K : 10 點
	 * @return
	 */
	public int getValue() {
		this.value = 0;
		
		switch (this.point) {
		case "A":
			this.value = 1;
			break;
		case "J":
		case "Q":
		case "K":
			this.value = 10;
			break;
		default:
			this.value = Integer.parseInt(this.point);
			break;
		}
		
		return this.value;
	}
	
	//點數規則不能被修改
	@Deprecated
	public void setVlaue(int vlaue) {
		this.value = vlaue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, point, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return color == other.color && Objects.equals(point, other.point) && value == other.value;
	}

	@Override
	public String toString() {
		String colorName = null;
		switch (this.color) {
		case DIAMND:
			colorName = "⬛";  //方塊
			break;
		case HEART:
			colorName = "♥️";  //紅心
			break;
		case CLUB:
			colorName = "♣️";  //梅花
			break;
		case SPADE:
			colorName = "♠️";  //黑桃
			break;

		default:
			break;
		}
		return String.format("card info : %s%s", colorName, this.point);
	}
	
	
}
