package collection._1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("A", "A");
		map.put("B", "B");
		map.put("C", "C");
		map.put("D", "D");
		map.put("1", "D");
		
		map.forEach((k, v) ->
				System.out.println(k + " " + v));

		// ����map�еļ�
		for (String key : map.keySet()) {
			System.out.println("Key = " + key);
		}

		// ����map�е�ֵ
		for (Object value : map.values()) {
			System.out.println("Value = " + value);
		}
	}
}
