package test.updown;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	public static void gameStart() {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean isSuccess = false;//7번만에 맞추는지 확인하기 위한 변수
		int restart;		
		
		// 무한루프로 게임 진행
		while (true) {
			// 1~100 사이의 난수생성
			int computerNum = random.nextInt(10000) % 100 + 1;
			// 실제 게임시에는 주석처리 하세요. 확인용입니다.
			System.out.println("컴퓨터가 생성한 난수:"+ computerNum);
			// 게임은 7번 진행
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100까지 숫자를 입력하세요:");
				int userNum = scanner.nextInt();
					
				// 업 & 다운 판단후 출력
				if (userNum > computerNum) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if (userNum < computerNum) {
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					//숫자가 일치하면 성공
					System.out.println("일치합니다.");
					System.out.println(i+"번 안에 성공했습니다.");
					System.out.println("-----------------------");					
					//성공시 true로 변경 
					isSuccess = true;					
					//for문 탈출
					break;					 
				}
			}
			
			//7번만에 맞추지 못한 경우 실패를 출력
			if(isSuccess == false) {
				System.out.println("실패");
			}
			
			//한번의 게임이 끝난후 재시작 여부 확인
			while(true) {
				System.out.println("-----------------------");
				System.out.println("게임재시작(1), 종료(0) ");
				System.out.print("재시작여부를 입력하세요:");
				restart = scanner.nextInt();
				// 0,1 이 입력되었을때 탈출
				if (restart == 0) {
					return;
				} 
				else if (restart == 1) {
					System.out.println("게임 재시작!");
					break;
				} 
				else {
					System.out.println("잘못입력해씸..");						
				}
			}	 
		}// while end		
	}// gameStart end
	
	public static void main(String[] args) {
		//프로그램이 실행되면 즉시 메서드 호출
		gameStart();		
	}
}
