public class Seminar_2_1 {
    public static void main(String[] args) {
        Node root = new Node();
        root.value = 5;
        Node second = new Node();
        second.value = 13;
        Node third = new Node();
        third.value = 24;

        root.next = second;
        second.next = third;

        second.prev = root;
        third.prev = second;


        root.print();

        third.printReverse();

    }
    public static class Node {
        int value;
        Node next;
        Node prev;
        public Node jump(int index) {
            Node temp = this;
            for (int i = 0; i < index; i++)
                if (temp.next != null)
                    temp = temp.next;
            return temp;
        }

        public void print() {
            Node currentNode = this;
            while (currentNode != null)
            {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
        public void printReverse() {
            Node currentNode = this;
            while (currentNode != null)
            {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.prev;
            }
            System.out.println();
        }
    }
}
