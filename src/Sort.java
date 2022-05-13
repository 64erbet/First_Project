import java.util.Arrays;

public class Sort {
    private static int[] vhod = {1, 5, 8, 2, 3, 4, 10, 13, 17, 22};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(vhod)));
    }

    private static int[] sort(int[] in) {
        for (int i=0; i < in.length-1; i++) {
            for (int j = 0; j < in.length - 1; j++) {
                int buf = -1;
                if (in[j] > in[j + 1]) {
                    buf = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = buf;
                }
            }
        }
        return in;
    }
}
