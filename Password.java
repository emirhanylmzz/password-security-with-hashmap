/* @author emirhanylmzz
 * 27.12.2019
 * Kelimeleri hashmap de saklayýn, girilen passwordü split kullanarak önce kelimelere ayýrýn, sonra kelimeleri dictionaryde aratýn.
 * Kelimeleri dosyadan da okuyabilirsiniz. yada terminalden java program < input.txt seklinde alabilirsiniz.
 */
import java.util.*;

public class Password {
	public static boolean isWordsOnDic(String s1, Map<String, Integer> dic){
		Map<String, Integer> kelimeler = new HashMap<String, Integer>();
		String[] s2 = s1.split("[^a-zA-Z]+");
		for(String a : s2) {
			if(dic.containsKey(a)) {
				System.out.println(a);
				return true; 
			}
		}
		return false;
	}
	public static boolean sayiVarmi(String s1) {
		Map<String, Integer> kelimeler2 = new HashMap<String, Integer>();
		String[] s3 = s1.split("[^a-zA-Z0-9]+");
		for(int i = 0; i < s3.length; ++i) {
			if(s3[i].contains("0") || s3[i].contains("1") || s3[i].contains("2")|| s3[i].contains("3")||s3[i].contains("4")
				||s3[i].contains("5")||s3[i].contains("6") ||s3[i].contains("7")||s3[i].contains("8")||s3[i].contains("9")){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Map<String, Integer> dic = new HashMap<String, Integer>();
		dic.put("Hello", 0);
		dic.put("Hi", 0);
		dic.put("Whatsapp", 0);
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		if(s1.length() < 8 || isWordsOnDic(s1, dic) || sayiVarmi(s1)) {
			System.out.println("Not Safe Enough");
		}
		else {
			System.out.println("Safe Enough");
		}
		scan.close();
	}

}
