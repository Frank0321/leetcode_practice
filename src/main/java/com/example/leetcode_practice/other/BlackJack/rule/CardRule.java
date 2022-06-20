/**
 * 庫克牌規則
 */
package com.example.leetcode_practice.other.BlackJack.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.leetcode_practice.other.BlackJack.card.Card;
import com.example.leetcode_practice.other.BlackJack.card.CardColor;

public class CardRule {

	//使用單例模式，使規則物件唯一性
	private static CardRule instance = new CardRule();
	
	private CardRule() {
		
	}
	
	public static CardRule getInstance() {
		return instance;
	}
	
	/**
	 * 初始化牌堆
	 * @return
	 */
	public List<Card> doInit(){
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i< 52; i ++) {
			
			//點數轉換
			int pointNumber = i%13 + 1; 
			String point = Integer.toString(pointNumber);
			switch (point) {
			case "1":
				point = "A";
				break;
			case "11":
				point = "J";
				break;
			case "12":
				point = "Q";
				break;
			case "13":
				point = "K";
				break;	
			default:
				break;
			}
			
			//決定卡片顏色，並建立在卡牌清單中
			CardColor color = null;
			switch (i/13) {
			case 0:
				color = CardColor.DIAMND;  //方塊
				break;
			case 1:
				color = CardColor.HEART;   //紅心
				break;
			case 2:
				color = CardColor.CLUB;    //梅花
				break;
			case 3:
				color = CardColor.DIAMND;  //黑桃
				break;
			default:
				break;
			}
			
			//建立卡片到卡牌中
			cards.add(new Card(color, point));
			
		}
		
		return cards;
	}
	
	/**
	 * 從剩餘的牌堆內隨機產生一張牌
	 * @param cards
	 * @return
	 */
	public Card getOne(List<Card> cards) {
		Random random = new Random();
		int nextInt = random.nextInt(cards.size());
		return cards.get(nextInt);
	}
	
	/**
	 * 從牌堆內移除特定一張牌
	 * @param cards
	 * @param card
	 * @return
	 */
	public List<Card> removeOne(List<Card> cards, Card card){
		cards.remove(card);
		return cards;
	}
	
	/**
	 * 計算目前的總共點數
	 * @param cards
	 * @return
	 */
	public int calMaxPoint(List<Card> cards) {
		int result = 0;
		//非 "A" 進行計算
		for (Card card : cards) {
			if (!card.getPoint().equals("A")) {
				result += card.getValue();
			}
		}
		
		//"A"進行計算
		//先計算其他數字後，再決定 A 代表幾點
		for (Card card : cards) {
			if (card.getPoint().equals("A")) {
				//目前點數如果大於11點，A則是用1點進行計算
				int value = result > 11 ? 1 : 11;
				result += value;
			}
		}
		
		return result;
	}
	
	/**
	 * 計算目前的總共點數(最小值)
	 * @param cards
	 * @return
	 */
	public int calMinPoint(List<Card> cards) {
		int result = 0;
		for(Card card : cards) {
			result += card.getValue();
		}
		
		return result;
	}
	
	/**
	 * 計算從剩餘的排堆抽一張牌，會爆炸的比例
	 * @param cards
	 * @param userCards
	 * @return
	 */
	public int over21rate(List<Card> cards, List<Card> userCards) {
		
		//目前得點數
		int nowPoint = calMinPoint(userCards);
		//會大於 21 的數量
		int count = (int) cards.stream().filter(it -> it.getValue() > (21 - nowPoint)).count();
		
		return (count * 100/cards.size());
		
	}
	
	/**
	 * 展示目前的手牌
	 * @param cards
	 */
	public void showCards(List<Card> cards, String ListName) {
		System.out.println(String.format("----- %s -----", ListName));
		System.out.println(String.format("總共點數 : %d", calMaxPoint(cards)));
		int i = 0;
		for (Card card : cards) {
			System.out.println(String.format("%d. %s",i+1, card.toString()));
			i++;
		}
	}
	
	/**
	 * 縣市目前手牌 (第一張不顯示)
	 * @param cards
	 */
	public void showMockCards(List<Card> cards, String ListName) {
		System.out.println(String.format("----- %s -----", ListName));
		int i = 0;
		for (Card card : cards) {
			if (i == 0) {
				System.out.println("1. 不顯示");
			}else {
				System.out.println(String.format("%d. %s",i+1, card.toString()));
			}
			
			i++;
		}
		
	}
}
