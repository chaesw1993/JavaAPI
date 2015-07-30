package thread;

import java.util.Vector;
/*
 * @ Date : 2015.07.30
 * @ Author : Chae S W
 * @ Story : 쓰레드 ATM 예제
 */
public class Atm {
	// synchronized : 동기화 키워드(락 거는 키워드)(싱크로나이즈가 있으면 무조건 벡터를 넣어라)
	public synchronized void inchul(String name){
		System.out.println("인출 요청함");
		for (int i = 0; i < 100000000; i++) {
			if (i==1000) {
				System.out.println(name + "이 인출 중 ....");
			}
		}
		System.out.println(name + "이 인출해 나감");
	}
}
