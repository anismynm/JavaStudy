package 기말대비;
import java.util.*;

class MyStack<T> {
	private int iTop;
	Vector<T> v;
	
	MyStack() {
		iTop = -1;
		v = new Vector<T>();
	}
	
	void push(T item) {
		v.add(item);
		iTop++;
	}
	
	T pop() {
		v.remove(iTop);
		return v.get(iTop--);
	}
	
	void reverse() {
		
	}
	
	void print() {
		Iterator<T> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
};

public class GenericClass {

	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStack<Integer>();
		ms.push(10);
		ms.push(20);
		ms.pop();
		ms.print();
	}

}