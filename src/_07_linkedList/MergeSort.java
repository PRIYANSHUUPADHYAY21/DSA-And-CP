package _07_linkedList;

import java.util.Scanner;

public class MergeSort {
	
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
	
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> mid = midPoint(head);
		Node<Integer> head1 = head, head2 = mid.next;
		mid.next = null;
		head1 = mergeSort(head1);
		head2 = mergeSort(head2);
		head = mergeTwoSorteds(head1, head2);
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
	
	public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        Node<Integer> newHead = null;
        Node<Integer> newTail = null;
        
        while(temp1!=null && temp2!=null) {
        	if(temp1.data<=temp2.data) {
        		Node<Integer> newNode = new Node<>(temp1.data);
        		if(newHead==null) {
        			newHead = newNode;
        			newTail = newNode;	
        		}else {
        			newTail.next = newNode;
        			newTail = newTail.next;
        		}
        		temp1 = temp1.next;
        	}else {
        		Node<Integer> newNode = new Node<>(temp2.data);
        		if(newHead==null) {
        			newHead = newNode;
        			newTail = newNode;	
        		}else {
        			newTail.next = newNode;
        			newTail = newTail.next;
        		}
        		temp2 = temp2.next;
        	}
        }
        if(temp1!=null) {
        	newTail.next = temp1;
        }
        if(temp2!=null) {
        	newTail.next = temp2;
        }
        return newHead;
    }

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = mergeSort(head);
		print(head);

	}

}
