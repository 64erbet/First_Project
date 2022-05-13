import java.util.Arrays;

class Test {
    private static int[] mas = {1,2,3,4,5,8,10,15};

    public static void main(String[] organs) {
//        invert(mas);
        System.out.println(Arrays.toString(invert(mas)));
    }

    public static int[] invert(int[] mas) {

        int [] vihlop = new int[mas.length];

        for (int i=0; i<mas.length; i++) {
            vihlop[mas.length - 1 - i] = mas[i];
        }

        return (vihlop);
    }
}