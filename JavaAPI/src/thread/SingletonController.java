package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : Chae S W
 * @ Story : 싱글톤(new연산자 하나) 예제
 */
public class SingletonController {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		
		if (singleton == singleton2) {
			System.out.println("싱글톤 같다");
		} else {
			System.out.println("싱글톤 다르다");
		}
		if (sample == sample2) {
			System.out.println("샘플 객체 같다");
		} else {
			System.out.println("샘플 객체 다르다");
		}
	}
}
