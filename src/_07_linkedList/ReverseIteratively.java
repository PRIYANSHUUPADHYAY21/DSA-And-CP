package _07_linkedList;

import java.util.Scanner;

public class ReverseIteratively {
	
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
	
	public static Node<Integer> reverse_I(Node<Integer> head){
        if(head==null || head.next==null) {
        	return head;
        }
        Node<Integer> prev = head, tail = head, curr = head.next;
        while(tail.next!=null) {
        	if(curr.next!=null) {
        		Node<Integer> temp = curr.next;
        		curr.next = prev;
        		prev = curr;
        		curr = temp;
        	}else {
        		curr.next = prev;
        		tail.next = null;
        	}
        }
        
        return curr;
	}
	
	public static Node<Integer> reverse_I2(Node<Integer> head){
        if(head==null || head.next==null) {
        	return head;
        }
        Node<Integer> prev = null;
        Node<Integer> curr = head;
        while(curr!=null) {
        	Node<Integer> temp = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = temp;
        }
        return prev;
	}
	
	public static Node<Integer> midpoint(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> slow = head, fast = head.next;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverse_I2(head);
		print(head);
		Node<Integer> midpoint = midpoint(head);
		System.out.println(midpoint.data);

	}

}
