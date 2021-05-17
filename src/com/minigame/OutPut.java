package com.minigame;

import java.util.ArrayList;
import java.util.Scanner;

import com.minigamestock.*;
import com.minigamestory.*;

public class OutPut {

	AllStock stock_1 = new Stock_1("�Ｚ����", 73700, 0, "");
	AllStock stock_2 = new Stock_2("SFA�ݵ�ü", 8670, 0, "");
	AllStock stock_3 = new Stock_3("HMM", 38800, 0, "");
	AllStock stock_4 = new Stock_4("�ý���", 2585, 0, "");
	AllStock stock_5 = new Stock_5("��ȣ����ġƼ", 2850, 0, "");
	AllStock stock_6 = new Stock_6("����Ʈ", 1480, 0, "");
	AllStock stock_7 = new Stock_7("�Ｚ�߰���", 6220, 0, "");
	AllStock stock_8 = new Stock_8("���", 72300, 0, "");

	Information news = new Information();
	ArrayList<Report> newslist = news.getInfo();

	ArrayList<Integer> prices = new ArrayList<>(); // �ֽ����簡���� �� ��
	ArrayList<String> stocks = new ArrayList<>(); // �ֽ��̸����� �� ��
	ArrayList<Integer> shareHolding = new ArrayList<>(); // �ֽĺ����������� �� ��
	ArrayList<String> variance = new ArrayList<>(); //

	public void output() {
		int day = 0; // ��¥

		addName(); // ���� �ֽ� �̸��� stocks list�� ����
		addShareHolding(); // ���� �ֽĺ����������� shareHolding�� ����
		addPrice(); // ���� ���� price�� ����
		addV(); // ���ݺ����� %�� variance�� ����

		Scanner sc = new Scanner(System.in);

		while (true) {

			if (day == 7) { // 7���� ������ �ùķ��̼� ����
				System.out.println("�ùķ��̼� ����!!");
				System.out.println("�� ���� �ڻ��� " + (AllStock.seed + AllStock.stockValue) + "�� �Դϴ�.");
				System.out.println(
						String.format("%.2f", (((double) (AllStock.seed + AllStock.stockValue) / 1000000) * 100) - 100)
								+ "%�� ������ ������ϴ�.");
				sc.close();
				break;
			}
			day++;
			System.out.println(" ");
			System.out.println(day + "�����Դϴ�.\n");
			System.out.println("- ���� �ص���� ���� -");
			System.out.println("======================================================");

			System.out.println(newslist.get(day - 1).getNews());
			System.out.println(); // �����Ѹ���

			while (true) {

				System.out.println("======================================================");
				System.out.println();
				System.out.println("�ֹ����ɱݾ� : " + AllStock.seed + "��");
				System.out.println("���� �ֽ� �ڻ� : " + AllStock.stockValue + "��");
				System.out
						.println("���� ��� ����: "
								+ String.format("%.2f",
										(((double) (AllStock.seed + AllStock.stockValue) / 1000000) * 100) - 100)
								+ "%");
				System.out.println("�� ���� �ڻ� : " + (AllStock.seed + AllStock.stockValue) + "��\n");

				// ����� ���簡ġ�� ȭ�鿡 ���
				System.out.println("======================================================");
				for (int i = 0; i < 8; i++) {
					System.out.println(i + 1 + "." + stocks.get(i));
					System.out.println("   ���簡 : " + prices.get(i) + "��" + variance.get(i));
					System.out.println("   �������� : " + shareHolding.get(i) + "��");
					System.out.println("   �򰡱ݾ� : " + shareHolding.get(i) * prices.get(i) + "��");
					System.out.println("======================================================");

				}

				// variance.clear(); // ����� �ʱ�ȭ
				System.out.println("������ �����ϼ���.(0�� ������ �������� �Ѿ�ϴ�.)");
				System.out.print("���� >> ");

				int choice_1 = sc.nextInt(); // ������ ��ȣ�� �Է¹޾ƿ�. �迭�� ��ġ�� 1�� �۰���?
				if (choice_1 == 0) { // 0�� ������ ������ �̵�
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
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

						addPrice();// ���� ���� �Ѿ�鼭 ������ ���� ���Ͱ��� Ȱ��
						addV(); // ���� �� ���� % ���Ͱ��� Ȱ��
						addS(); // ���� �� �ֽİ�ġ ����
						break;
					}
					break;
				}
				System.out.println("======================");
				System.out.println(stocks.get(choice_1 - 1) + " ����."); // ������ �̸��� ȭ�鿡 �Ѹ�.

				System.out.println("1. �ż�  2. �ŵ�  3. �ڷΰ���");
				System.out.print("���� >> ");
				int choice_2 = sc.nextInt(); // �ż� �ŵ� �ڷΰ��� ����.

				if (choice_2 == 1) { // �ż�����
					if ((prices.get((choice_1 - 1)) > AllStock.seed)) { // ������ ������ ���簡���� �õ�ݾ� ������ �ݾ׺��� ���
						System.out.println("�ż��� �ݾ��� �����մϴ�.");
					} else {
						int canBuyAmount = AllStock.seed / prices.get((choice_1 - 1));
						System.out.println("======================");
						System.out.println("�ż����ɼ��� : " + canBuyAmount);
						System.out.println("�ż��� ������ �Է��ϼ���.");
						System.out.print("�Է� >> ");

						int buyNumber = sc.nextInt();

						int totalBuyNumber = shareHolding.get(choice_1 - 1) + buyNumber; // ������ ������ ���������� �ҷ�����, �ű�ٰ� �ż���
																							// �� �߰�

						if (buyNumber > canBuyAmount) { // �ֹ����ɼ������� �ֹ����� ������ �ݾ׺��� ���
							System.out.println("�ż��� �ݾ��� �����մϴ�.");

						} else { // ���� �ֽ� ���� �´� ��ġ�� �Էµ�.

							AllStock.stockValue += prices.get(choice_1 - 1) * buyNumber;
							AllStock.seed -= prices.get(choice_1 - 1) * buyNumber;
							shareHolding.add((choice_1 - 1), totalBuyNumber); // �� ���� ���Ӱ� �ٽ� �־��־� ���������� �����ϴ� �۾�
							shareHolding.remove(choice_1);
						}

					}

				} else if (choice_2 == 2) { // �ŵ�����
					if (shareHolding.get((choice_1 - 1)) == 0) { // �ش������� ���������� ���� ����
						System.out.println("�ŵ��� ������ �����ϴ�!");

					} else if (shareHolding.get(choice_1 - 1) > 0) {
						System.out.println("�ŵ����ɼ��� : " + shareHolding.get((choice_1 - 1)));
						System.out.println("�ŵ��� ������ �Է��ϼ���.");
						System.out.print("�Է� >> ");

						int sellNumber = sc.nextInt();

						int totalSellNumber = shareHolding.get(choice_1 - 1) - sellNumber;

						AllStock.seed += sellNumber * prices.get(choice_1 - 1);
						AllStock.stockValue -= prices.get(choice_1 - 1) * sellNumber;

						shareHolding.add((choice_1 - 1), totalSellNumber); // �ŵ��� ���� ������ �ִ�
						shareHolding.remove(choice_1); // �������� ������ �ٽ� �濡 ����.
					}
				} else if (choice_2 == 3) { // �ڷΰ��� ��ư, �ٽ� ������� �ҷ��´�.
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
