package strings;

import java.util.HashMap;
import java.util.Map;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "life";
		String str3 = "wife";
		String str4 = "wifi";

		Map<String, Object> searchPayload = new HashMap<>();

		searchPayload.put("searchText", "abc");

		Map<String, String> feeObject = new HashMap<>();
		// feeObject.put()

		// searchPayload.put("fee", );

		str = str.concat(str3);// lifewife
		System.out.println(str + str3);// lifewifewife
		str.concat(str4);// lifewifewifi
		System.out.println(str + str3);// lifewifewife

//		String str4 = new String("life");
//		String str5 = new String("life");
//
//		if (str3.equals(str4)) {
//			System.out.println("Strings are equal:");
//		} else {
//			System.out.println("Strings are NOT equal");
//
//		}

//		str.charAt(0);
//		str.length();

	}

}
