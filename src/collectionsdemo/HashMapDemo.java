package collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("name", "abc");
		mapObj.put("name1", "abc");
		mapObj.put(null, null);

		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();

		Map<String, String> map = listMap.get(0);
		map.get("name");

		System.out.println(mapObj);
	}

}
