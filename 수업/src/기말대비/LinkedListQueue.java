package 기말대비;

import java.util.*;

class MyQueue <T> { // 일반적인 이름 XX
	private LinkedList<T> v;
	private int front;
	
	public MyQueue() {
		v = new LinkedList<T>();
		front = -1;
	}
	
	public void enQueue(T data) {
		v.add(data);
		System.out.println("add");
	}
	
	public T deQueue() {
		T oRes;
		if (!v.isEmpty()) {
			oRes = v.remove(0);
		}
		else {
			oRes = null;
		}
		return oRes;
	}
}

class Point {
	public String toString() {
		return "Point";
	}
}

class Circle {
	public String toString() {
		return "Circle";
	}
}

public class LinkedListQueue {

	public static void main(String[] args) {
		MyQueue<Point> q = new MyQueue<Point>();
		q.enQueue(new Point());
		q.deQueue().toString();

	}

}
