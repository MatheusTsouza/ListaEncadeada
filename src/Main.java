public class Main {
    public static void main(String[] args) {
        DoubleLinkedList node = new DoubleLinkedList();


        node.add(10);
        node.add(5);
        node.add(2);
        System.out.println("Tamanho: " + node.getSize());
        node.add(9);
        node.add(7);
        node.removeUltimo();
        node.add(27);
        System.out.println("Tamanho: " + node.getSize());
        System.out.println(node.get(0));
        node.set(1, 99);
        System.out.println(node);
        node.remove(3);
        System.out.println(node);
    }
}