import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

class Word {
	private String sEng;
	private String sKor;
	
	Word(String sEng, String sKor) {
		this.sEng = sEng;
		this.sKor = sKor;
	}
	
	String eng() {
		return sEng;
	}
	
	String kor() {
		return sKor;
	}
}

public class BpgUnknown_1127_OC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random(); // 랜덤으로 문제 뽑기 위해서 Random Class 활용
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("snowman", "눈사람"));
		v.add(new Word("ocean", "바다"));
		v.add(new Word("love", "사랑"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("god", "신"));
		v.add(new Word("animal", "동물"));
	
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어있습니다.");
		int iSelect = 0;
		while (true) {
			random.setSeed(System.currentTimeMillis()); 
			Word[] wordArr = new Word[4];
			
			for (int i = 0; i < 4; i ++) {
				wordArr[i] = v.get(random.nextInt(v.size())); // 벡터에서 보기로 쓸 4개 랜덤으로 가져오기.
				for (int j = 0; j < i; j ++) {
					if (wordArr[i] == wordArr[j]) {
						--i;
						break;
					}
				}
			}
			
			String question = wordArr[random.nextInt(4)].eng(); // 랜덤으로 가져온 4개 중에 하나를 문제로 정하기. (WordArr[] 중 하나)
			System.out.println("Q." + question + "?");
			for (int i = 0; i < 4; i ++) {
				System.out.print("(" + (i + 1) + ")" + wordArr[i].kor() + " ");
			}
			System.out.print(">> ");
			iSelect = scan.nextInt();
			
			if (iSelect == -1) {
				break;
			}
			
			if (question.equals(wordArr[iSelect - 1].eng())) { // 문제 == 답으로 고른 번호의 WordArr의 영어
				System.out.println("Excellent!!");
			}
			else {
				System.out.println("NO!!");
			}
			System.out.println();
		}
		
		scan.close();
		
	}

}
