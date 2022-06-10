public class DoubleLinkedList <T>{
    Node<T> base;
    Node<T> top;
    int size;

    public boolean isEmpty() {
        if(size <= 0){
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
            top = node;
        }
        node.prev = top;
        top.next = node;
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
        T data = node.data;

        if(node.prev == null){
            base = node.next;
        } else {
            node.prev.next = node.next;
        }

        if(node.next == null) {
            top = node.prev;
        } else {
            node.next.prev = node.prev;
        }

        size--;

        return data;
    }

    public T remove(int pos){
        var temp = getNode(pos).data;
        remove(getNode(pos));
        return temp;
    }

    public Node<T> getNode(int pos) {
        Node<T> temp = null;
        if(pos < size){
            int meio = size/2;
            if(pos < meio){
                temp = base;
                for (int i = 0; i < pos; i++) {
                    temp = temp.next;
                    System.out.println(temp.data);
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

    public T get(int pos) {
        return getNode(pos).data;
    }

    public void set(int pos, T data) {
        getNode(pos).data = data;
    }

    @Override
    public String toString() {
        var text = "[ ";
        for (Node <T> node = base; node != null; node = node.next) text += node.data + " ";
        return text += "]";
    }
}

