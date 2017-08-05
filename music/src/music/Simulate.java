package music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Simulate {
	public static void main(String[] args) {
		Box<String> str = new Box<String>("123");
		Box<Integer> inte = new Box<Integer>(123);

		getData(str);
		getDataxinazhi(inte);
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		list.get(0);
		
		System.out.println(list.getClass().getName());
		
		System.out.println(list);
		
		Iterator<String> l = list.iterator();
		
		while(l.hasNext()){
			System.out.println(l.next());
		}
	}

	public static void getData(Box<?> b) {
		System.out.println(b.getData());
	}

	public static void getDataxinazhi(Box<? extends Number> b) {
		System.out.println(b.getData());
	}
}
