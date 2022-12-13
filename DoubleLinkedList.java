package common;

import java.util.Scanner;
class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
		left  = right  = null;
	}
}

public class DoubleLinkedList {
	Node root;
	
	void createList() {
		root = null;
	}
	
	void insertAtRight(int data) {
		Node n = new Node(data);
		
		if(root == null) {
			root = n;
		}
		else {
			Node t = root;
			
			while(t.right!=null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
	}
	
	void printTraverse() {
		if(root == null) {
			System.out.println("List Empty");
		}
		else {
			Node t = root;
			
			while(t!=null) {
				System.out.println("List has :"+t.data);
				t = t.right;
			}
		}
	}
	
	void splitList() {
	
		Node t = root;
		Node t2 = root;
		Node t3 = null;
		
		t = root;
	}
      		
		
/*		
		if(root == null) {
			System.out.println("List Empty");
		}
		else {
			Node t = root;
			
			while(t!=null) {
				if(t.data % 2 == 0) {
					c++;
					System.out.println("Node at"+c);
					t = t.right;
				}
				else {
					System.out.println("Node at"+c);
					t = t.right;
				}
					
			}
		}
*/
	
	public static void main(String[] args) {
		int data;
		int choice;
		
		DoubleLinkedList obj = new DoubleLinkedList();
		
		Scanner sc = new Scanner(System.in);
		obj.createList();
		
		do {
			System.out.println("1: InsertRight 2:PrintTraverse 3: SplitList 0: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter data:");
				data = sc.nextInt();
				obj.insertAtRight(data);
				System.out.println("Inserted");
				break;
				
			case 2:
				obj.printTraverse();
				break;
				
			case 3:
				obj.splitList();
				break;
				
			case 0:
				System.out.println("Exit");
				break;
				
				default:
					System.out.println("Wrong choice");
					break;
			}
			
		}while(choice!=0);
		sc.close();
	}
}
