package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : Chae S W
 * @ Story : 싱글톤(new연산자 하나) 예제
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	// 생성자를 private로 선언했기때문에 컨트롤러에서 객체생성이 불가하다.
	// 그러므로 이 클래스의 메소드를 가져다 쓰려면 클래스에서 메소드를 불러와야하기때문에 static을 사용했다.
	
	private Singleton() {	// 싱글톤에서는 생성자를 private으로 은닉화 시킨다. new연산자 사용불가
		System.out.println("인스턴스 생성");
	}
	public static Singleton getInstance(){
		
		return singleton;
	}
}
