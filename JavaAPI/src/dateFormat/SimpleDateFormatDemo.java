package dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @ Date : 2015.07.30
 * @ Author : Chae S W
 * @ Story : java.util.Date 예제
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}
}
