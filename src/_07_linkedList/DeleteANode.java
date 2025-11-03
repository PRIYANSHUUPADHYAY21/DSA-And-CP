package _07_linkedList;

import java.util.Scanner;

public class DeleteANode {
	
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
	
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		Node<Integer> temp = head;
		if(pos==0) {
			return head.next;
		}
		for(int i = 0; i<pos-1 && temp!=null; i++) {
			temp = temp.next;
		}
		if(temp==null || temp.next==null) {
			return head;
		}
		temp.next = temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		deleteNode(head, 3);
		print(head);

	}

}
