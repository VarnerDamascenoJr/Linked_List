package Lincked_List;

public class LinkedList {
    Node head;

    public void InsertNode(int data){
        Node node = new Node();
        node.data = data;

        if (head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next == null){
                n.next = head;
                n = n.next;
            }
            n.next = node;
        }
    }

    public void Show(){
        Node node = new Node();
        while(node.next !=null){
            System.out.println(""+node.data);
        }
        System.out.println(node.data);
    }


}

