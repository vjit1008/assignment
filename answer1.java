package assignmentday1;

import java.util.Scanner;

public class answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ms= 7000234;
		int sec=ms/1000;
//		System.out.println(sec);
		int min=sec/60;
//		System.out.println(min);
		int actulemin=min%60;
		int otsec=ms/1000%60;
//		System.out.println(otsec);
//		System.out.println(actulemin);
		int hour=min/60;
//		System.out.println(hour);
		System.out.println("output :"+hour+":"+actulemin+":"+otsec);
	}

}
