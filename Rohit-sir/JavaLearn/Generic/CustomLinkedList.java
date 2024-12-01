
import java.util.Iterator;

class ListNode<T> {

    private T data;
    private ListNode<T> nextNode;

    public void setValue(T value) {
        this.data = value;
    }

    public T getValue() {
        return this.data;
    }

    public void setNextNode(ListNode<T> node) {
        nextNode = node;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }
}

public class CustomLinkedList<T> implements Iterable<T> {

    private ListNode<T> head = null;
    private ListNode<T> tail = null;
    private ListNode<T> current = null;

    public void addElement(T value) {
        ListNode<T> node = new ListNode<>();
        node.setValue(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.setNextNode(node);
        this.tail = node;
    }

    @Override
    public Iterator<T> iterator() {
        current = head;
        return new CustomLinkeListItr();
    }

    private class CustomLinkeListItr implements Iterator<T> {

        @Override
        public boolean hasNext() {

            return current != null;

        }

        @Override
        public T next() {

            T value = current.getValue();
            current = current.getNextNode();

            return value;
        }
    }

}
