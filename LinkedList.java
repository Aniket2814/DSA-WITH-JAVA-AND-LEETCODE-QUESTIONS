import java.util.*;
class LinkedList
{
	Node head;
	class Node 
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	//Function to insert element at first position
     void insertAtb(int data)
	{
		Node newNode =new Node(data);
		if(newNode==null)  
		{
			System.out.println("Linked list is empty");
			return; 
		}
		newNode.next=this.head;
		this.head=newNode;
		
	}
	//Function to display Linked List
	 void display()   
	{
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println("................");
		System.out.println(">>>>>>>>>>>>>>>>>");
	}
	//Function add data at end in Linked 
	void insertAtE(int data)
	{
		if(this.head==null)
		{
			insertAtb(data);
			return;
		}
		Node temp=this.head;
		Node newNode=new Node(data);
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	//Function to add data at any Specific Position 
	void insertAtany(int data,int index)
	{
		if(index<0) return;
		if(index==0) 
		{insertAtb(data);
		}
		Node nn =new Node(data);
		Node temp=this.head;

		for(int i=0;i<index-1;i++)
		{
			temp =temp.next;
		}
	
	nn.next=temp.next;
		temp.next=nn;
	}
	
	//Function to delete fropm beigning 
 int deleteAtb()
	{
		if(this.head==null)
		{

			System.out.println("Linked list empty");
return -1;
		}
		int r =this.head.data;
		this.head=this.head.next;
	return r;
	}
	//Function to delete an element at end of Linked List 
	int deleteAtE()
	{
		if(this.head.next==null)
		{
			deleteAtb();
			// return -1;
			
		}
		Node temp=this.head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		int rv=temp.next.data;
		temp.next=null;
		return rv;
	}
	// Function  to delete  an element at any specific
	int deleteAtany(int index)
	{
		if(this.head==null) {
			System.out.println("Linked list empty ");
			return -1;
			
		}
		if(index==0)
		{
			return deleteAtb();
		}
	       Node temp=head;
          for(int i=0;i<index-1;i++)
		  {
			  temp=temp.next;
		  }			  
		  int rv= temp.next.data;
		  temp.next=temp.next.next;
		  return rv;
			
	}
	//Function  to reverse a linked list
	public Node reverseLL()
	{
		Node curr=this.head;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
		
	}
	public int search(int x)
	{
		Node n=this.head;
		while(n!=null)
		{
			if(n.data==x)
			{
				System.out.println("Data available =");
				return x;
				
			}
			n=n.next;
		}
		return -1;
	}
	
	//Function  to reverse a linked list recursive approach 
	public Node reverserec(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
			}
			Node  p= reverserec(head.next);
			head.next.next=head;
			head.next=null;
			this.head=p;
			return this.head;
	}

	public static void main(String ar[])
	{
		LinkedList l=new LinkedList();
	
   Scanner sc = new Scanner(System.in);
        int choice, data;

        while (true) {
            System.out.println("1. Insert At beginning");
            System.out.println("2. Instet At last");
            System.out.println("3. Display");
            System.out.println("4. Insert AT Specific position");
            System.out.println("5. Insert AT  After the Given Value");
            System.out.println("6. Deletion at beginning");
            System.out.println("7. Deletion at ending");
            System.out.println("8. Deletion At Specific position");
            System.out.println("9. Deletion of particular value");
            System.out.println("10. Search");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

    switch (choice) {
            case 1:
                System.out.print("Enter data to insert: ");
                data = sc.nextInt();
                l.insertAtb(data);
                break;
            case 2:
                System.out.print("Enter data to insert: ");
                data = sc.nextInt();
                l.insertAtE(data);
                break;
            case 3:
                l.display();
                break;
            case 4:
                System.out.print("Enter data to insert: ");
                data = sc.nextInt();
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                l.insertAtany(data, pos);
                break;
            case 5:
                System.out.print("Enter data to insert: ");
                data = sc.nextInt();
                System.out.print("Enter value to insert after: ");
                int value = sc.nextInt();
                l.insertAfterValue(data, value);
                break;
            case 6:
                System.out.println("Deleted element: " + l.deleteAtb());
                break;
            case 7:
                System.out.println("Deleted element: " + l.deleteAtE());
                break;
            case 8:
                System.out.print("Enter position: ");
                pos = sc.nextInt();
                System.out.println("Deleted element: " + l.deleteAtany(pos));
                break;
            case 9:
                System.out.print("Enter value to delete: ");
                value = sc.nextInt();
                l.deleteValue(value);
                break;
            case 10:
                System.out.print("Enter value to search: ");
                value = sc.nextInt();
                if (l.search(value) != -1) {
                    System.out.println("Value found");
                } else {
                    System.out.println("Value not found");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
	// l.insertAtb(10);
		// l.insertAtb(10);
		// l.insertAtb(20);
		// l.display();
		// System.out.println(l.search(20));
		// l.insertAtE(30);
		// l.display();
		// l.insertAtany(40,2);
		// l.display();
		// System.out.println(l.deleteAtb());
		// System.out.println(l.deleteAtE());
		// System.out.println(l.deleteAtany(2));
		
	// q	l.reverseLL();
		// l.display();
		// l.display();
		// l.reverserec(l.head);
		
		// l.display();
		}
}

// Function to insert a new node after a given value
void insertAfterValue(int data, int value) {
    Node newNode = new Node(data);
    Node temp = this.head;
    while (temp != null) {
        if (temp.data == value) {
            newNode.next = temp.next;
            temp.next = newNode;
            return;
        }
        temp = temp.next;
    }
    System.out.println("Value not found in the linked list");
}
// Function to delete a node with a particular value
void deleteValue(int value) {
    if (head == null) {
        System.out.println("Linked list is empty");
        return;
    }

    if (head.data == value) {
        head = head.next;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        if (temp.next.data == value) {
            temp.next = temp.next.next;
            return;
        }
        temp = temp.next;
    }
    System.out.println("Value not found in the linked list");
}


 }
 /**
 Here is an example of why Java implements a doubly linked list, with code:

Efficient Insertion and Deletion

In a doubly linked list, each node has references to both the previous and next nodes. This allows for efficient insertion and deletion of nodes at any position in the list, with an average time complexity of O(1).

java

Verify

Open In Editor
Edit
Copy code
public class DoublyLinkedList<E> {
    private Node<E> head; // head of the list
    private Node<E> tail; // tail of the list
    private int size; // number of elements in the list

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element, tail, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E remove(int index) {
        Node<E> node = getNode(index);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
        return node.element;
    }

    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
Fast Navigation

With references to both previous and next nodes, navigation in both forward and backward directions is possible, making it easier to implement methods like add(), remove(), and iterator().

java

Verify

Open In Editor
Edit
Copy code
public class DoublyLinkedList<E> {
    // ...

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
}
Simplified Implementation

A doubly linked list is easier to implement than a circularly linked list, as it doesn't require handling the special case of the last node pointing back to the first node.

java

Verify

Open In Editor
Edit
Copy code
public class DoublyLinkedList<E> {
    // ...

    public void add(E element) {
        Node<E> newNode = new Node<>(element, tail, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
}
Better Memory Management

In a doubly linked list, each node only needs to store references to the previous and next nodes, which reduces memory overhead compared to a singly linked list, where each node needs to store a reference to the next node and a flag to indicate whether it's the last node.

java

Verify

Open In Editor
Edit
Copy code
public class DoublyLinkedList<E> {
    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
These are just a few examples of why Java implements a doubly linked list. The benefits of a doubly linked list include efficient insertion and deletion, fast navigation, simplified implementation, better memory management, and thread-safety.
*/