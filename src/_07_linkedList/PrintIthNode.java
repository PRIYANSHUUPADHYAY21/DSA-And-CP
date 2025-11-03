package _07_linkedList;

import java.util.Scanner;

public class PrintIthNode {
	
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
	
	public static void printIthNode(Node<Integer> head, int i){
        if(head==null) {
        	return;
        }
        Node<Integer> temp = head;
        int index = 0;
        while(temp!=null) {
        	if(index==i) {
        		System.out.println(temp.data);
        		return;
        	}
        	index++;
        	temp = temp.next;
        }
    }
	
	public static void printIthNode2(Node<Integer> head, int index){
        Node<Integer> temp = head;
        for(int i = 0; i<index; i++) {
        	if(temp==null) {
        		break;
        	}
        	temp = temp.next;
        }
        if(temp!=null) {
        	System.out.println(temp.data);
        }
    }

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printIthNode2(head, 3);

	}

}
