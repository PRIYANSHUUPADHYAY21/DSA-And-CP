package _07_linkedList;

import java.util.Scanner;

public class EliminateDuplicates {
	
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
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> prev = head;
		Node<Integer> curr = head.next;
		while(curr!=null) {
			if(curr.data<=prev.data) {
				prev.next = curr.next;
				curr = curr.next;
			}else {
				curr = curr.next;
				prev = prev.next;
			}
		}
		
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = removeDuplicates(head);
		print(head);

	}

}
