package music;

import java.io.File;

public class JavaIO {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new DirFilter(args[0]));
		}
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
