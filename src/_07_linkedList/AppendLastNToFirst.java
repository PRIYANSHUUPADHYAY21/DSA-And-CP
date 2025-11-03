package _07_linkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
	
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
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head==null || head.next==null) {
			return head;
		}
		for(int i = 0; i<n; i++) {
			Node<Integer> temp = head;
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			temp.next.next = head;
			head = temp.next;
			temp.next = null;
		}
		return head;
	}
	
	public static Node<Integer> appendLastNToFirst2(Node<Integer> head, int n) {
		if(head==null || head.next==null || n<=0) {
			return head;
		}
		int size = 1;
		Node<Integer> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
			size++;
		}
		if(n>=size) {
			return head;
		}
		temp.next = head;
		temp = head;
		for(int i = 0; i<size-n-1; i++) {
			temp = temp.next;
		}
		Node<Integer> newHead = temp.next;
		temp.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		print(head);
		head = appendLastNToFirst2(head, 2);
		print(head);

	}

}
