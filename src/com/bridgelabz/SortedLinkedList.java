package com.bridgelabz;

public class SortedLinkedList {
    //Represent the head of the single and sorted linked list
    Node head = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            Node prev = head;
            if (data < head.data){
                Node temp = head;
                head = newNode;
                newNode.next = temp;
            }else{
                while(current != null && current.data < data){
                    prev = current;
                    current = current.next;
                }
                Node temp = prev.next;
                prev.next = newNode;
                newNode.next = temp;
            }

        }
    }

    public void displayLinkedList(){
        if (head == null)
            System.out.println("Empty linked list");
        else{
            Node current1 = head;
            while (current1 != null){
                System.out.print(current1.data+" --- ");
                current1 = current1.next;
            }
            System.out.println();
        }
    }

}