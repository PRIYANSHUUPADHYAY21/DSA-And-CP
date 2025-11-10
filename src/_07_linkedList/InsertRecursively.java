package _07_linkedList;

import java.util.Scanner;

public class InsertRecursively {
	
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
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insert(head.next, pos-1, data);
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insert(head, 2, 3);
		print(head);

	}

}
