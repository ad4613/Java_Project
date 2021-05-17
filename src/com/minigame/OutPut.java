package com.minigame;

import java.util.ArrayList;
import java.util.Scanner;

import com.minigamestock.*;
import com.minigamestory.*;

public class OutPut {

	AllStock stock_1 = new Stock_1("삼성전자", 73700, 0, "");
	AllStock stock_2 = new Stock_2("SFA반도체", 8670, 0, "");
	AllStock stock_3 = new Stock_3("HMM", 38800, 0, "");
	AllStock stock_4 = new Stock_4("시스웍", 2585, 0, "");
	AllStock stock_5 = new Stock_5("금호에이치티", 2850, 0, "");
	AllStock stock_6 = new Stock_6("위지트", 1480, 0, "");
	AllStock stock_7 = new Stock_7("삼성중공업", 6220, 0, "");
	AllStock stock_8 = new Stock_8("기아", 72300, 0, "");

	Information news = new Information();
	ArrayList<Report> newslist = news.getInfo();

	ArrayList<Integer> prices = new ArrayList<>(); // 주식현재가들이 들어갈 방
	ArrayList<String> stocks = new ArrayList<>(); // 주식이름들이 들어갈 방
	ArrayList<Integer> shareHolding = new ArrayList<>(); // 주식보유수량들이 들어갈 방
	ArrayList<String> variance = new ArrayList<>(); //

	public void output() {
		int day = 0; // 날짜

		addName(); // 현재 주식 이름을 stocks list에 넣음
		addShareHolding(); // 현재 주식보유수량들을 shareHolding에 넣음
		addPrice(); // 현재 가를 price에 넣음
		addV(); // 가격변동성 %을 variance에 넣음

		Scanner sc = new Scanner(System.in);

		while (true) {

			if (day == 7) { // 7일이 지나면 시뮬레이션 종료
				System.out.println("시뮬레이션 종료!!");
				System.out.println("총 보유 자산은 " + (AllStock.seed + AllStock.stockValue) + "원 입니다.");
				System.out.println(
						String.format("%.2f", (((double) (AllStock.seed + AllStock.stockValue) / 1000000) * 100) - 100)
								+ "%의 수익이 생겼습니다.");
				sc.close();
				break;
			}
			day++;
			System.out.println(" ");
			System.out.println(day + "일차입니다.\n");
			System.out.println("- 금일 해드라인 뉴스 -");
			System.out.println("======================================================");

			System.out.println(newslist.get(day - 1).getNews());
			System.out.println(); // 뉴스뿌리기

			while (true) {

				System.out.println("======================================================");
				System.out.println();
				System.out.println("주문가능금액 : " + AllStock.seed + "원");
				System.out.println("보유 주식 자산 : " + AllStock.stockValue + "원");
				System.out
						.println("전날 대비 손익: "
								+ String.format("%.2f",
										(((double) (AllStock.seed + AllStock.stockValue) / 1000000) * 100) - 100)
								+ "%");
				System.out.println("총 보유 자산 : " + (AllStock.seed + AllStock.stockValue) + "원\n");

				// 종목과 현재가치를 화면에 출력
				System.out.println("======================================================");
				for (int i = 0; i < 8; i++) {
					System.out.println(i + 1 + "." + stocks.get(i));
					System.out.println("   현재가 : " + prices.get(i) + "원" + variance.get(i));
					System.out.println("   보유수량 : " + shareHolding.get(i) + "주");
					System.out.println("   평가금액 : " + shareHolding.get(i) * prices.get(i) + "원");
					System.out.println("======================================================");

				}

				// variance.clear(); // 등락폰 초기화
				System.out.println("종목을 선택하세요.(0을 누르면 다음날로 넘어갑니다.)");
				System.out.print("선택 >> ");

				int choice_1 = sc.nextInt(); // 종목의 번호를 입력받아옴. 배열의 위치는 1이 작겠죠?
				if (choice_1 == 0) { // 0을 누르면 다음날 이동
					prices.clear();
					variance.clear();
					switch (day + 1) {

					case 2:
						stock_1.setPrice(81400);
						stock_2.setPrice(9350);
						stock_3.setPrice(39500);
						stock_4.setPrice(2380);
						stock_5.setPrice(3275);
						stock_6.setPrice(1820);
						stock_7.setPrice(6610);
						stock_8.setPrice(75600);

						stock_1.setVariance(" (+10.4%)");
						stock_2.setVariance(" (+7.8%)");
						stock_3.setVariance(" (+1.8%)");
						stock_4.setVariance(" (-7.9%)");
						stock_5.setVariance(" (+14.9%)");
						stock_6.setVariance(" (+23.0%)");
						stock_7.setVariance(" (+6.3%)");
						stock_8.setVariance(" (+4.6%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;

					case 3:
						stock_1.setPrice(91600);
						stock_2.setPrice(8530);
						stock_3.setPrice(38200);
						stock_4.setPrice(2210);
						stock_5.setPrice(2960);
						stock_6.setPrice(1750);
						stock_7.setPrice(7720);
						stock_8.setPrice(83400);

						stock_1.setVariance(" (+12.5%)");
						stock_2.setVariance(" (-8.8%%)");
						stock_3.setVariance(" (-3.3%)");
						stock_4.setVariance(" (-7.1%)");
						stock_5.setVariance(" (-9.6%)");
						stock_6.setVariance(" (-3.8%)");
						stock_7.setVariance(" (+16.8%)");
						stock_8.setVariance(" (+10.3%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;

					case 4:
						stock_1.setPrice(88300);
						stock_2.setPrice(8860);
						stock_3.setPrice(42300);
						stock_4.setPrice(2160);
						stock_5.setPrice(2380);
						stock_6.setPrice(1720);
						stock_7.setPrice(7560);
						stock_8.setPrice(89700);

						stock_1.setVariance(" (-3.6%)");
						stock_2.setVariance(" (+3.9%)");
						stock_3.setVariance(" (+10.7%)");
						stock_4.setVariance(" (-2.3%)");
						stock_5.setVariance(" (-19.6%)");
						stock_6.setVariance(" (-1.7%)");
						stock_7.setVariance(" (-2.1%)");
						stock_8.setVariance(" (+7.6%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;

					case 5:
						stock_1.setPrice(85500);
						stock_2.setPrice(8540);
						stock_3.setPrice(32800);
						stock_4.setPrice(1930);
						stock_5.setPrice(2420);
						stock_6.setPrice(1865);
						stock_7.setPrice(7320);
						stock_8.setPrice(96500);

						stock_1.setVariance(" (-3.2%)");
						stock_2.setVariance(" (-3.6%)");
						stock_3.setVariance(" (-22.5%)");
						stock_4.setVariance(" (-10.6%)");
						stock_5.setVariance(" (+1.7%)");
						stock_6.setVariance(" (+8.4%)");
						stock_7.setVariance(" (-3.2%)");
						stock_8.setVariance(" (+7.6%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;

					case 6:
						stock_1.setPrice(83200);
						stock_2.setPrice(8120);
						stock_3.setPrice(38400);
						stock_4.setPrice(2190);
						stock_5.setPrice(2615);
						stock_6.setPrice(2100);
						stock_7.setPrice(6500);
						stock_8.setPrice(98800);

						stock_1.setVariance(" (-2.7%)");
						stock_2.setVariance(" (-4.9%)");
						stock_3.setVariance(" (+17.1%)");
						stock_4.setVariance(" (+13.5%)");
						stock_5.setVariance(" (+8.1%)");
						stock_6.setVariance(" (+12.6%)");
						stock_7.setVariance(" (-11.2%)");
						stock_8.setVariance(" (+2.4%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;

					case 7:
						stock_1.setPrice(81900);
						stock_2.setPrice(7700);
						stock_3.setPrice(42600);
						stock_4.setPrice(2630);
						stock_5.setPrice(3010);
						stock_6.setPrice(1665);
						stock_7.setPrice(6010);
						stock_8.setPrice(80700);

						stock_1.setVariance(" (-1.6%)");
						stock_2.setVariance(" (-5.2%)");
						stock_3.setVariance(" (+10.9%)");
						stock_4.setVariance(" (+20.1%)");
						stock_5.setVariance(" (+15.1%)");
						stock_6.setVariance(" (-20.7%)");
						stock_7.setVariance(" (-7.5%)");
						stock_8.setVariance(" (-18.3%)");

						addPrice();// 다음 날로 넘어가면서 가격의 변동 세터개터 활용
						addV(); // 다음 날 변동 % 세터개터 활용
						addS(); // 다음 날 주식가치 변동
						break;
					}
					break;
				}
				System.out.println("======================");
				System.out.println(stocks.get(choice_1 - 1) + " 선택."); // 종목의 이름을 화면에 뿌림.

				System.out.println("1. 매수  2. 매도  3. 뒤로가기");
				System.out.print("선택 >> ");
				int choice_2 = sc.nextInt(); // 매수 매도 뒤로가기 선택.

				if (choice_2 == 1) { // 매수선택
					if ((prices.get((choice_1 - 1)) > AllStock.seed)) { // 선택한 종목의 현재가보다 시드금액 작으면 금액부족 출력
						System.out.println("매수할 금액이 부족합니다.");
					} else {
						int canBuyAmount = AllStock.seed / prices.get((choice_1 - 1));
						System.out.println("======================");
						System.out.println("매수가능수량 : " + canBuyAmount);
						System.out.println("매수할 수량을 입력하세요.");
						System.out.print("입력 >> ");

						int buyNumber = sc.nextInt();

						int totalBuyNumber = shareHolding.get(choice_1 - 1) + buyNumber; // 선택한 종목의 보유수량을 불러오고, 거기다가 매수한
																							// 양 추가

						if (buyNumber > canBuyAmount) { // 주문가능수량보다 주문수가 많으면 금액부족 출력
							System.out.println("매수할 금액이 부족합니다.");

						} else { // 드디어 주식 수에 맞는 가치가 입력됨.

							AllStock.stockValue += prices.get(choice_1 - 1) * buyNumber;
							AllStock.seed -= prices.get(choice_1 - 1) * buyNumber;
							shareHolding.add((choice_1 - 1), totalBuyNumber); // 그 값을 새롭게 다시 넣어주어 보유수량을 변경하는 작업
							shareHolding.remove(choice_1);
						}

					}

				} else if (choice_2 == 2) { // 매도선택
					if (shareHolding.get((choice_1 - 1)) == 0) { // 해당종목의 보유수량이 없는 것임
						System.out.println("매도할 물량이 없습니다!");

					} else if (shareHolding.get(choice_1 - 1) > 0) {
						System.out.println("매도가능수량 : " + shareHolding.get((choice_1 - 1)));
						System.out.println("매도할 수량을 입력하세요.");
						System.out.print("입력 >> ");

						int sellNumber = sc.nextInt();

						int totalSellNumber = shareHolding.get(choice_1 - 1) - sellNumber;

						AllStock.seed += sellNumber * prices.get(choice_1 - 1);
						AllStock.stockValue -= prices.get(choice_1 - 1) * sellNumber;

						shareHolding.add((choice_1 - 1), totalSellNumber); // 매도한 양을 가지고 있던
						shareHolding.remove(choice_1); // 물량에서 뺀다음 다시 방에 넣음.
					}
				} else if (choice_2 == 3) { // 뒤로가기 버튼, 다시 종목들을 불러온다.
					continue;
				}
			}
		}
	}

	private void addPrice() {
		prices.add(stock_1.getPrice());
		prices.add(stock_2.getPrice());
		prices.add(stock_3.getPrice());
		prices.add(stock_4.getPrice());
		prices.add(stock_5.getPrice());
		prices.add(stock_6.getPrice());
		prices.add(stock_7.getPrice());
		prices.add(stock_8.getPrice());
	}

	private void addName() {

		stocks.add(stock_1.getName());
		stocks.add(stock_2.getName());
		stocks.add(stock_3.getName());
		stocks.add(stock_4.getName());
		stocks.add(stock_5.getName());
		stocks.add(stock_6.getName());
		stocks.add(stock_7.getName());
		stocks.add(stock_8.getName());
	}

	private void addV() {
		variance.add(stock_1.getVariance());
		variance.add(stock_2.getVariance());
		variance.add(stock_3.getVariance());
		variance.add(stock_4.getVariance());
		variance.add(stock_5.getVariance());
		variance.add(stock_6.getVariance());
		variance.add(stock_7.getVariance());
		variance.add(stock_8.getVariance());
	}

	private void addShareHolding() {

		shareHolding.add(stock_1.getShareHolding());
		shareHolding.add(stock_2.getShareHolding());
		shareHolding.add(stock_3.getShareHolding());
		shareHolding.add(stock_4.getShareHolding());
		shareHolding.add(stock_5.getShareHolding());
		shareHolding.add(stock_6.getShareHolding());
		shareHolding.add(stock_7.getShareHolding());
		shareHolding.add(stock_8.getShareHolding());
	}

	private void addS() {

		AllStock.stockValue = stock_1.getPrice() * shareHolding.get(0) + stock_2.getPrice() * shareHolding.get(1)
				+ stock_3.getPrice() * shareHolding.get(2) + stock_4.getPrice() * shareHolding.get(3)
				+ stock_5.getPrice() * shareHolding.get(4) + stock_6.getPrice() * shareHolding.get(5)
				+ stock_7.getPrice() * shareHolding.get(6) + stock_8.getPrice() * shareHolding.get(7);
	}
}
