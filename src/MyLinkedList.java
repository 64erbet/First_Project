import java.util.List;

public class MyLinkedList implements List {

    private class Node {
        Object value;
        Object next;
        Object previous;

        Node(Object previous, Object value, Object next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public int kol_elementov = 0;


    @Override
    public int size() {
        return (kol_elementov);
    }

    @Override
    public boolean add(Object o) {
        boolean rez = false;

        if (kol_elementov == 0) {
            Node sam_node = new Node(null, o, null);

            kol_elementov ++;
            rez = true;
        } else
            if (kol_elementov == 1) {
            Node sam_node = new Node(this.get(0), o, null);

            kol_elementov ++;
            rez = true;
            } else
                if (kol_elementov > 1) {
                    Node sam_node = new Node(this.get(kol_elementov-2), o, null);

                    kol_elementov ++;
                    rez = true;
                }

        return rez;
    }

    @Override
    public boolean remove(int index) {
        boolean rez = false;

            Object sam_element = this.get(index)


            kol_elementov--;
            rez = true;

        return rez;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }
}
