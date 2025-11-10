package _07_linkedList;

import java.util.Scanner;

public class DeleteEveryNNode {
	
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
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if(head==null) {
			return head;
		}
		if(N==0) {
			return head;
		}
		if(M==0) {
			return null;
		}
		Node<Integer> temp = head;
		Node<Integer> delNode = null;
		while(temp!=null) {
			for(int i = 0; i<M-1 && temp!=null; i++) {
				temp = temp.next;
			}
			if(temp==null) {
				break;
			}
			delNode = temp.next;
			for(int i = 0; i<N && delNode!=null; i++) {
				delNode = delNode.next;
			}
			temp.next = delNode;
			temp = delNode;
			
		}
		return head;
		
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = skipMdeleteN(head, 2, 2);
		print(head);

	}

}
