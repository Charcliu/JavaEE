package _7._1;

public class Fanxing {
	public static void main(String[] args) {
		String middle = ArrayAlg.<String>getMiddle("John", "Q.", "Public");
		System.out.println(middle);
		ArrayAlg.getMiddle("Hello", 0, null);
		ArrayAlg a = new ArrayAlg();
		if(a instanceof ArrayAlg){}
	}
	
}

class ArrayAlg{
	public static <T> T getMiddle(T... a){
		return a[a.length/2];
	}
}