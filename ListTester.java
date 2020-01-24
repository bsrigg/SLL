public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.printValues();

        sll.removeAt(3);
        sll.removeAt(2);
        sll.printValues();
        sll.find(4);
        sll.remove();
        sll.printValues();
        sll.remove();
        sll.printValues();
        sll.find(4);
        sll.remove();
        sll.printValues();
        sll.remove();
        sll.find(4);
    }
}