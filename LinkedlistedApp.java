import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }
    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    void deleteByKey(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

public class LinkedListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0. Terminate the Program");
            System.out.println("1. Insert an Element (Beginning)");
            System.out.println("2. Delete an Element (Beginning)");
            System.out.println("3. Display All Elements");
            System.out.println("4. Search an Element");
            System.out.println("5. Delete an Element");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Program Terminated.");
                    scanner.close();
                    return;
                case 1:
                    System.out.print("Enter value to insert: ");
                    list.insertAtBeginning(scanner.nextInt());
                    break;
                case 2:
                    list.deleteAtBeginning();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    System.out.println(list.search(scanner.nextInt()) ? "Element found" : "Element not found");
                    break;
                case 5:
                    System.out.print("Enter value to delete: ");
                    list.deleteByKey(scanner.nextInt());
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
