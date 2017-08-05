package _6._6;

import java.util.Arrays;

public class Simulate {
	public static void main(String[] args) {
		String[] strings = new String[3];
		strings[0] = "123";
		strings[1] = "12312321";
		strings[2] = "dfgsd";
		
		Arrays.sort(strings, new LengthComparator());
		
		for(String s : strings){
			System.out.println(s);
		}
	}
}
