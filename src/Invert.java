import java.util.Arrays;

class Invert {
    private static int[] mas = {1,2,3,4,5,8,10,15};

    public static void main(String[] organs) {
        System.out.println(Arrays.toString(invert(mas)));
    }

    private static int[] invert(int[] mas) {
        int [] vihlop = new int[mas.length];
        for (int i=0; i<mas.length; i++) {
            vihlop[mas.length - 1 - i] = mas[i];
        }
        return (vihlop);
    }
}