package com.minigamestory;

import java.util.*;

public class Information {
	
   private ArrayList<Report> info = new ArrayList<Report>();
	
  
   public Information() {  
      
	   Report r1 = new Report("1일차", "- '반도체 없어서 못팔아' 공장지으려면 최소 2년 걸려...\r\n"
	            + "- 차량용반도체 가격상승으로 관려사 영업이익 증대기대\r\n"
	            + "- 삼성중공업, 시추설비 계약해지 패소... 4632억 반환위기에 처해...");
	      Report r2 = new Report("2일차", "- 시스웍, 작년 매출액 31.7% 증가, 그러나 당기순손실 13억 발생\r\n"
	            + "- 금호에이치티, 애스맥과 합병소식에 상승시작\r\n"
	            + "- 비트코인 사상 최고가 갱신");
	      Report r3 = new Report("3일차", "- '애플카' 현대기아 협력 가능성... '양사 모두 시너지 효과 클 것'\r\n"
	            + "- 삼성전자, 기대보다 훨씬 높은 실적, '어닝서프라이즈'\r\n"
	            + "- 삼성중공업, 2조 8000억 계약 \"단일계약 세계 최대 규모\"");
	      Report r4 = new Report("4일차", "- '수에즈운하'에서 400m 초대형컨테이너선박 좌초.. 운하 재가동에 한달이상 소요우려..\r\n"
	            + "- 금호에이치티, 전환사채 발행\r\n"
	            + "- SFA반도체, 장초반 외인과 기관의 대량 매도세 이어져...");
	      Report r5 = new Report("5일차", "- 반도체품귀현상 장기화 우려...\r\n"
	            + "- '수에즈운하' 예상 빠른 시일에 복구성공\r\n"
	            + "- 시스웍, 200억 전환사채발행\r\n"
	            + "- 공매도 재개");
	      Report r6 = new Report("6일차", "- 금호에이치티, 애스맥과 합병보고서 제출\r\n"
	            + "- 일런머스크, 테슬라 비트코인으로 살 수 있어...\r\n"
	            + "- 삼성중공업, 어닝쇼크에 이어 1조원 규모의 무상감자, 유상증자 진행");
	      Report r7 = new Report("7일차", "- '인도' 선박건원들 다수 코로나양성 반응확인\r\n"
	            + "- '현대기아' 애플과 자율주행차량 개발 협의 진행하고 있지 않아...\r\n"
	            + "- 일런머스크, '비트코인, 이더리움 가격 높아 보인다...\"\r\n"
	            + "- 시스웍, 진단키트 생간 인허가 획득");

	      info.add(r1);
	      info.add(r2);
	      info.add(r3);
	      info.add(r4);
	      info.add(r5);
	      info.add(r6);
	      info.add(r7);
            
   }
   
   public ArrayList<Report> getInfo(){  
      return info;
   }
   
}




   
   



