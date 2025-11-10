package _07_linkedList;

import java.util.Scanner;

public class MIdPointLL {
	
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
	
	public static Node<Integer> midPoint(Node<Integer> head) {
        if(head==null || head.next==null) {
        	return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        return slow;
    }

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> mid = midPoint(head);
		System.out.println(mid.data);

	}

}
