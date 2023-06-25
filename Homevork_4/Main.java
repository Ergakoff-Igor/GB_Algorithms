public class Main {
    public static void main(String[] args) {
        LeftRedBlackTree<Integer> tree = new LeftRedBlackTree<>();
        tree.add(24);
        tree.add(5);
        tree.add(1);
        tree.add(15);
        tree.add(3);
        tree.add(8);
        tree.add(25);
        tree.add(20);        
        System.out.print("\033[H\033[J"); // Очистка консоли
        tree.printTree();

    }
}
