public class AssignmentNumber10 {
    private static class Node<E> {
        private E info = null;
        private Node<E> next = null;
        public Node() {}
        public Node(E value) {
            info = value;
        }
        public boolean hasNext() {
            return (next != null);
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> node) {
            next = node;
        }
        public E getInfo() {
            return info;
        }
    }
    public interface SListIterator<E> {
        boolean hasNext(); // Returns true if this list iterator has more elements when traversing the list in the forward direction.
        E next(); // Returns the next element in the list and advances the cursor position.
        void add(E ele); // Inserts the specified element into the list
        void remove(); // Removes from the list the last element that was returned by next() or previous()
    }
    public static class SList<E> {
        private Node<E> head = new Node<E>();
        public String toString() { // based on SListIterator
            SListIterator<E> ite = iterator();
            StringBuilder result = new StringBuilder("{");
            while (ite.hasNext()) {
                result.append(ite.next().toString());
                if (ite.hasNext()) {
                    result.append(",");
                }
            }
            result.append("}");
            return result.toString();
        }
        public SListIterator<E> iterator() {
            return new SListIterator<E>() {
                private Node<E> cursor = head; // last element return by next() method
                private Node<E> previous = null;// In one-way list remove(), the previous reference cannot be found.
                public boolean hasNext() {
                    return cursor.hasNext();
                }
                public E next() {
                    if (!hasNext()) {
                        throw new RuntimeException("Doesn't have next element!");
                    }
                    previous = cursor;
                    cursor = cursor.getNext();
                    return cursor.getInfo();
                }
                public void add(E ele) { // insert between cursor and the next element, and cursor move to the new new element
                    Node<E> nextNode = cursor.getNext();
                    Node<E> newNode = new Node<E>(ele);
                    cursor.setNext(newNode);
                    newNode.setNext(nextNode);
                    previous = cursor;
                    cursor = newNode;
                }
                public void remove() {
                    if (cursor == head) {
                        throw new RuntimeException("Cursor is at head!");
                    }
                    if (cursor == previous) {
                        throw new RuntimeException("can only be made once per call to next!");
                    }
                    previous.setNext(cursor.getNext());
                    cursor.setNext(null);
                    cursor = previous;
                }
            };
        }
        public int size() {
            SListIterator<E> ite = iterator();
            int size = 0;
            while (ite.hasNext()) {
                ite.next();
                size++;
            }
            return size;
        }
    }
    public static void main(String[] args) {
        SList<String> myList = new SList<String>();
        SListIterator<String> ite = myList.iterator();
        for (int i = 0; i < 10; i++) {
            ite.add(String.valueOf(i));
        }
        System.out.println(myList);
        int size = myList.size();
        System.out.println("The size of the list is: = " + size);
        ite = myList.iterator();
        for (int i = 0; i < size; i++) {
            ite.next();
            ite.remove();
            //ite.remove(); // ERROR: cannot remove twice for each call of next()
        }

        System.out.println("List after removing the elements: "+myList);
    }
}