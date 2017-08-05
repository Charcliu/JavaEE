package _7;

import java.util.Scanner;

public class StackTraceTest {
	public static int factorial(int n){
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for(StackTraceElement f : frames){
			System.out.println(f);
		}
		int r;
		if(n <= 1){
			r = 1;
		}else{
			r = n * factorial(n - 1);
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
	}
}
