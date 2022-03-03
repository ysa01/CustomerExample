package gsm;

import java.util.HashMap;
import java.util.Map;

public class deneme {

	public static void main(String[] args) {
		  messageEncoding("ÖtüþürKuþlarÇeþmede");
    }
	public static void messageEncoding (String msg) {
		//char [] turkishCharacter = {'Ç','ç','Ð','ð','Ý','ý','Ö','ö','Þ','þ','Ü','ü'};
		//char [] unicCodeCaracter = {'\u00c7','\u00e7','\u011e','\u011f','\u0130','\u0131','\u00d6','\u00f6','\u015e','\u015f','\u00dc','\u00fc'};
		Map<String, String> map = new HashMap<>();
		map.put("\u00c7","09");
		map.put("\u00e7","00");
		map.put("\u011e","0B");
		map.put("\u011f","0C");
		map.put("\u0130","00");
		map.put("\u0131","07");
		map.put("\u00d6","5C");
		map.put("\u00f6","0C");
		map.put("\u015e","0C");
		map.put("\u015f","0D");
		map.put("\u00dc","5E");
		map.put("\u00fc","7E");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (msg.contains(entry.getKey())) {
				msg = msg.replaceAll(entry.getKey(), entry.getValue());
			}
		}
	
	
    System.out.println(msg);





}}