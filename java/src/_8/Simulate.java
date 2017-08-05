package _8;

import java.util.ArrayList;
import java.util.List;

public class Simulate {
	public static void main(String[] args) {
		List<Son> listS = new ArrayList<Son>();
		List<? extends Parent> listP = listS;
		Son s = new Son();
		String a = "";
	}
}
