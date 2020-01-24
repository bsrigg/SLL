public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void printValues() {
        Node runner = head;
        if (head == null) {
            System.out.println("The SLL is empty.");
        } else {
            System.out.println("SLL Listing:");
            while (runner.next != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
        if (head != null) {
            Node runner = head;
            if(runner.next != null){
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        } else{
            head = null;
        }
        } else {
            System.out.println("The SLL is empty and does not contain any nodes besides the head so I cannot remove anything.");
        }
    }

    public void removeAt(int value) {
        int recordNumber = value;
        Boolean isFound = true;
        if (head != null) {
            Node runner = head;
            if (recordNumber != 0) {
                for (int i =1; i < recordNumber; i++) {
                    runner = runner.next;
                    if(runner.next == null){
                        isFound=false;
                        break;
                    }
                }
                if(isFound){
                    runner.next = runner.next.next;
                } else {
                    System.out.println("SLL does not contain enough Nodes to perform this task.");
                }
            } else {
                this.head = head.next;
            }
        } else {
            System.out.println(
                    "The SLL is empty so I cannot remove anything.");
        }
    }

    public void find(int value) {
        int v = value;
        Boolean isFound = false;
        if(head != null) {
            Node runner = head;
            while(runner != null) {
                if(runner.value == v){
                    System.out.println(v + " is at: " + runner);
                    isFound = true;
                    break;
                }
                runner = runner.next;
            }
            if(!isFound){System.out.println("The value: " + v + " was not found in this SLL");}
        } else {
            System.out.println("The SLL is empty and thus does not contain the value: " + v);
        }
    }
}