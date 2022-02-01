package lindedList;

public class List {
    Node head;
    void insert(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void delete(int n){
        if (head == null) {
            System.out.println("List is empty");
        }else{
            if (n == 1) {
                head = head.next;
            }else{
                Node temp = head;
                while (n != 2 && temp != null) {
                    temp = temp.next;
                    n--;
                }
                temp.next = temp.next.next;
            }
        }
    }
    void printlist(){
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
        }else{
            while (temp != null) {
                System.out.print(temp.data + "---->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
};
