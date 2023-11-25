// 컴퓨터공학전공 2020112736 안성현
import java.util.*;

class Menu {
	private String sName;
	private int iCnt;
	private int iPrice;
	
	
	public Menu(String sName, int iCnt, int iPrice) {
		this.sName = sName;
		this.iCnt = iCnt;
		this.iPrice = iPrice;
	}

	public void print() {
		System.out.println(sName + " " + iCnt + " " + iPrice);
	}
}

class Order {
	Scanner scan = new Scanner(System.in);
	
	private int iSelect, iCnt, iSum = 0;
	private Vector<Menu> v = new Vector<Menu>();
	private HashMap<String, Integer> hPair = new HashMap<String, Integer>();
	
	public Order() {
		hPair.put("에스프레소", 1500);
		hPair.put("아메리카노", 2000);
		hPair.put("라떼", 2500);
		hPair.put("아이스아메리카노", 3000);
	}
	
	public void menuUI() {
		System.out.println("======= MENU =======");
		System.out.println("0. 매출 출력");
		System.out.println("1. 에스프레소 : 1500원");
		System.out.println("2. 아메리카노 : 2000원");
		System.out.println("3. 라떼 : 2500원");
		System.out.println("4. 아이스아메리카노 : 3000원");
		System.out.println("====================");
		
		while(true) {
			System.out.print("메뉴를 입력하세요 : ");
			iSelect = scan.nextInt();
			if (iSelect == 0) {
				print();
				break;
			}
			else if (iSelect > 0 && iSelect < 5) {
				System.out.print("수량을 입력하세요 : ");
				iCnt = scan.nextInt();
				if (iCnt == 0) {
					System.out.println("올바른 수량을 입력하세요.");
					continue;
				}
				add(iSelect, iCnt);
			}
			else {
				System.out.println("올바른 메뉴를 입력하세요.");
			}
			
		}	
	}
	
	void add(int iSelect, int iCnt) {
		int iPrice;
		
		switch(iSelect) {
		case 1:
			iPrice = iCnt * hPair.get("에스프레소");
			v.add(new Menu("에스프레소", iCnt, iPrice));
			System.out.println("에스프레소 " + iCnt + "잔 주문");
			break;
			
		case 2:
			iPrice = iCnt * hPair.get("아메리카노");
			v.add(new Menu("아메리카노", iCnt, iPrice));
			System.out.println("아메리카노 " + iCnt + "잔 주문");
			break;
			
		case 3:
			iPrice = iCnt * hPair.get("라떼");
			v.add(new Menu("라떼", iCnt, iPrice));
			System.out.println("라떼 " + iCnt + "잔 주문");
			break;
			
		case 4:
			iPrice = iCnt * hPair.get("아이스아메리카노");
			v.add(new Menu("아이스아메리카노", iCnt, iPrice));
			System.out.println("아이스아메리카노 " + iCnt + "잔 주문");
			break;
			
		default:
			iPrice = 0;
			break;
		}
		iSum += iPrice;
	}
	
	void print() {
		Iterator<Menu> it = v.iterator();
		
		System.out.println("\n상품명   수량   금액");
		System.out.println("---------------------");
		while (it.hasNext()) {
			Menu n = it.next();
			n.print();
		}
		System.out.println("---------------------");
		System.out.println("총 금액 : " + iSum);
	}
}

public class Coffee {

	public static void main(String[] args) {
		Order obj = new Order();
		obj.menuUI();
	}
	
}
