import java.util.Scanner;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	int length = 0;
	Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}
	
	@Override
	String get(String key) {
		for (int i = 0; i < length; i ++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < length; i ++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		keyArray[length] = key;
		valueArray[length] = value;
		length++;
	}

	@Override
	String delete(String key) {
		for (int i = 0; i < length; i ++) {
			if (keyArray[i].equals(key)) {
				String temp = valueArray[i];
				for (int j = i; j < length - 1; j ++) {
					keyArray[i] = keyArray[i + 1];
					valueArray[i] = valueArray[i + 1];
				}
				keyArray[length - 1] = "";
				valueArray[length - 1] = "";
				length--;
				return temp;
				}
			}
		return null;
	}

	@Override
	int length() {
		return length;
	}
	
}

public class Bpg319_Q10 {

	public static void main(String[] args) {
		int iSize, iSelect = 0;
		String sKey, sValue;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력받을 key의 개수를 입력. >> ");
		iSize = scan.nextInt();
		Dictionary dic = new Dictionary(iSize);
		
		System.out.println("* Dictionary *");
		System.out.println("1. 입력");
		System.out.println("2. Value 검색");
		System.out.println("3. 출력 후 삭제");
		System.out.println("4. 전체 길이");
		System.out.println("5. 종료");
		
		while (iSelect != 5) {
			System.out.print("메뉴 입력 >> ");
			iSelect = scan.nextInt();
			switch(iSelect) {
			case 1:
				scan.nextLine();
				System.out.print("key 입력 >> ");
				sKey = scan.nextLine();
				System.out.print("value 입력 >> ");
				sValue = scan.nextLine();
				dic.put(sKey, sValue);
				System.out.println("입력 완료");
				break;
				
			case 2:
				scan.nextLine();
				System.out.print("key 입력 >> ");
				sKey = scan.nextLine();
				System.out.println(sKey + " : " + dic.get(sKey));
				break;
				
			case 3:
				scan.nextLine();
				System.out.print("key 입력 >> ");
				sKey = scan.next();
				System.out.println(sKey + " : " + dic.delete(sKey) + " 삭제 완료");
				break;
				
			case 4:
				System.out.println("현재 길이 : " + dic.length());
				break;
				
			case 5:
				System.out.println("프로그램 종료");
				break;
			
			default:
				System.out.println("잘못 된 메뉴 입력");
				break;
			}
		}
		scan.close();

	}

}
