package _07_linkedList;

import java.util.Scanner;

public class EvenAfterOdd {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> evenHead = null;
		Node<Integer> oddHead = null;
		Node<Integer> evenTail = null;
		Node<Integer> oddTail = null;
		
		while(temp!=null) {
			if(temp.data%2==0) {
				if(evenHead==null) {
					evenHead = temp;
					evenTail = temp;
				}else {
					evenTail.next = temp;
					evenTail = temp;
				}
			}else {
				if(oddHead==null) {
					oddHead = temp;
					oddTail = temp;
				}else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}
			temp = temp.next;
		}
		
		if(oddHead==null) {
			return evenHead;
		}else {
			oddTail.next = evenHead;
			if(evenTail!=null) {
				evenTail.next = null;
			}
			return oddHead;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = evenAfterOdd(head);
		print(head);

	}

}
