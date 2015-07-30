package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : Chae S W
 * @ Story : 쓰레드 ATM 예제
 */
public class AtmController {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable kim = new AtmUser(atm, "김유신");
		Runnable lee = new AtmUser(atm, "이순신");
		Runnable kang = new AtmUser(atm, "강감찬");
		Runnable hong = new AtmUser(atm, "홍길동");
		// 디자인패턴 : 데코레이션 패턴
		// 케이크 + 초코 => 초코케이크
		Thread t1 = new Thread(kim);
		t1.start();		// 메소드 정의는 run()메소드에 정의를 했지만 run()메소드를 실행하려면 start() 메소드로 호출해야한다.
						// start()를 호출해야 콜백메소드인 run()을 호출한다.
						/*
							콜백 메소드
							메소드를 일정 실행순서로 미리 등록시켜 놓고
							등록된 순서에 따라 자동적으로 호출하는 메소드
						*/
		
		// t1이라는 쓰레드에 kim이라는 객체를 올려놓는다.
		Thread t2 = new Thread(lee);
		t2.start();
		Thread t3 = new Thread(kang);
		t3.start();
		Thread t4 = new Thread(hong);
		t4.start();
		
	}
}
