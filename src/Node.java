public class Node {
    private static Object previous;
    private static Object sam;
    private static Object next;

    public Node(Object previous, Object sam, Object next) {
        this.previous = previous;
        this.sam = sam;
        this.next = next;
    }

    public static Object getSam() {
        return sam;
    }

    public static Object getNext() {
        return next;
    }

    public static Object getPrevious() {
        return previous;
    }

//    public static void setSam(Object sam) {
//        Node.sam = sam;
//    }

    public static void setNext(Object next) {
        Node.next = next;
    }

    public static void setPrevious(Object previous) {
        Node.previous = previous;
    }
}
