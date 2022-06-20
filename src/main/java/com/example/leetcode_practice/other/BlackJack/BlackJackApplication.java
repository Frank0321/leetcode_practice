/**
 * 遊戲主畫面
 */

package com.example.leetcode_practice.other.BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.leetcode_practice.other.BlackJack.card.Card;
import com.example.leetcode_practice.other.BlackJack.rule.CardRule;

public class BlackJackApplication {
	
	//初始化遊戲規則
	private static CardRule cardRule = CardRule.getInstance();
	private static Scanner scanner = new Scanner(System.in);
	
	//初始化使用者與莊家的手牌
	static List<Card> userCards = new ArrayList<Card>();
	static List<Card> bookMakerCards = new ArrayList<Card>();
	

	public static void main(String[] args) {
	
		//啟動循環方式
		boolean result = true;
		while(result) {
			result = palyMenu();
			System.out.println("====================================");
			System.out.println("====================================");
			System.out.println("============= game over =============");
			System.out.println("====================================");
			System.out.println("====================================");

		}		
		
	}
	
	//遊戲選端
	public static boolean palyMenu() {
		boolean result = true;
		
		System.out.println("=======================================");
		System.out.println("=====         1.遊戲開始         =====");
		System.out.println("=====         2.結束遊戲         =====");
		System.out.println("=======================================");
		int choice;
		do {
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("遊戲開始瞜 !");
				play();
				break;
			case 2:
				System.out.println("歡迎下次再玩");
				return false;
			default:
				System.out.println("輸入錯誤");
				break;
			}
			
		}while (choice > 2 );
		
		
		return result;
	}

	/**
	 * 1. 初始化牌堆
	 * 2. 發給 user 莊家 各兩張牌
	 * 3. 顯示幕前的牌面 (莊家第一張不顯示)
	 * 4. 顯示 user 下一張會爆的機率多少
	 * 5. 詢問 user 是否要加牌
	 * 6. 加牌後，先確認是否爆掉，否則重複 3, 4, 5
	 * 7. 換莊家 (展示手牌)
	 * 8. 自動判斷機率是否有大於 50%，有則是繼續加牌，並判斷3, 4, 5 
	 * 9. 判斷結果
	 */
	private static void play() {

		List<Card> cards = cardRule.doInit();
		userCards = new ArrayList<Card>();
		bookMakerCards = new ArrayList<Card>();
		
		//第一回合先發給使用者與莊家各兩張牌
		userCards.add(getOneCard(cards));
		userCards.add(getOneCard(cards));		
		bookMakerCards.add(getOneCard(cards));
		bookMakerCards.add(getOneCard(cards));

		//顯示目前狀況
		cardRule.showCards(userCards, "玩家手牌");
		cardRule.showMockCards(bookMakerCards, "莊家手牌");
		
		//--------------------------------------------------
		//玩家回合
		System.out.println("----- 玩家回合 -----");
		boolean userRoundresult = roundConfirm(cards, userCards, false);
		while (userRoundresult) {
			cardRule.showCards(userCards, "玩家手牌");
			userRoundresult = roundConfirm(cards, userCards, false);
		}
		//確認是否有超過21點
		int userFinalPoint = cardRule.calMaxPoint(userCards);
		if (userFinalPoint > 21) {
			System.out.println("超過21點瞜 !");
			System.out.println("你 lose~~~~~");
			System.out.println("game over");
		}else {
			//--------------------------------------------------
			//莊家回合
			System.out.println("----- 莊家回合 -----");
			cardRule.showCards(bookMakerCards, "莊家目前手牌");
			boolean markRoundresult = roundConfirm(cards, bookMakerCards, true);
			while (markRoundresult) {
				cardRule.showCards(bookMakerCards, "莊家手牌");
				markRoundresult = roundConfirm(cards, bookMakerCards, true);
			}
			//確認是否有超過21點
			int markFinalPoint = cardRule.calMaxPoint(bookMakerCards);
			if (markFinalPoint > 21) {
				System.out.println("超過21點瞜 !");
				System.out.println("你 win~~~~~");
				System.out.println("game over");
			}else {
				//--------------------------------------------------
				//最後審判
				System.out.println("=====================================");
				System.out.println(String.format("玩家的點數: %d", userFinalPoint));
				System.out.println(String.format("莊家的點數: %d", markFinalPoint));
				
				if ((userFinalPoint - markFinalPoint) > 0) {
					System.out.println("你 win~~~~~");
				}else if ((userFinalPoint - markFinalPoint) < 0) {
					System.out.println("你 lose~~~~~");
				}else {
					System.out.println("可惜，平手呢~~~");
				}
			}
			
		}
		
		
	}

	/**
	 * 執行回合步驟
	 * @param cards (牌堆)
	 * @param 
	 * @return 結果 (是否超過21點)
	 */
	private static boolean roundConfirm(List<Card> cards, List<Card> personCards, boolean autoConfirm) {
		int point = cardRule.over21rate(cards, personCards);
		System.out.println(String.format("會超過21點的機率為 : %d 趴", point));
		
		//非自動判斷
		if (!autoConfirm) {
			System.out.println("--- 1.繼續發牌 ---");
			System.out.println("--- 2.回合結束 ---");
			int choice;
			do {
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					personCards.add(getOneCard(cards));
					return cardRule.calMaxPoint(personCards) <= 21;
				case 2:
					return false;
				default:
					System.out.println("輸入錯誤");
					break;
				}
				
			}while (choice > 2 );
			return false;			
		}
		//自動判斷
		else {
			if (point < 50) {
				personCards.add(getOneCard(cards));
				return cardRule.calMaxPoint(personCards) <= 21;
			}else {
				return false;
			}
		}
	}

	/**
	 * 從牌堆裡抽取一張牌出來
	 * @param cards
	 * @param cardRule
	 * @return
	 */
	private static Card getOneCard(List<Card> cards) {
		
		Card one = cardRule.getOne(cards);
		cards = cardRule.removeOne(cards, one);
		
		return one;
	}
	
	
	
}
