public class MyLinkedList {

    private static int size = 0;

    public static int getSize() {
        return size;
    }

    public static Object getFirst() {
        return first;
    }

    public static void setFirst(Object first) {
        MyLinkedList.first = first;
    }

    public static Object getLast() {
        return last;
    }

    public static void setLast(Object last) {
        MyLinkedList.last = last;
    }

    private static Object first;
    private static Object last;

    public static void add(Object value) {
        if (getSize() == 0) {
            new Node(null, value, null);
        } else {
            new Node(Node.getPrevious(), value, null);
        }
        size++;
        System.out.println("Добавили елемент В КОНЕЦ");
    }

    public static remove(int index) {

    }

    public static clear() {

    }

    public static size() {

    }

    public static get(int index) {

    }
}
