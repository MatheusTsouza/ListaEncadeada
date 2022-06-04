public class DoubleLinkedList <T>{
    Node<T> base;
    Node<T> top;
    int size;

    public DoubleLinkedList(){}

    public boolean isEmpty() {
        if(size < 0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data);
        if(isEmpty()){
            base = node;
        }
        node.prev = top;
        top = node;
        top.next = null;
        size++;
    }

    // Remove ultimo
    public T removeUltimo() {
        T temp;
        top = top.prev;
        top.next = null;
        temp = (T) top;
        size--;
        return temp;
    }

    // Remove especifico
    public T remove(Node<T> node) {
        return null;
    }

    // Usa esse magrao aqui pra buscar node cima
    public Node<T> getNode(int pos) {
        Node<T> temp = null;
        if(pos < size){
            int meio = size/2;
            if(pos < meio){
                temp = base;
                for (int i = 0; i < pos; i++) {
                    temp = temp.next;
                    return temp;
                }
            } else {
                for (int i = size - 1; i > pos; i--) {
                    temp = top;
                    temp = temp.prev;
                    return temp;
                }
            }
        }
        return temp;
    }

    // Acessa o nó atraves do metodo getNode(pos) e retorna o dado
    public T get(int pos) {
        return ;
    }

    // Acessa o no atraves do metodo getNode(pos) e define o novo valor ao dado do nó
    public void set(int pos, T data) {

    }
}