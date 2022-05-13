import java.util.Arrays;

public class Double {
    private static int[] vhod = {2, 56, 89, 56, 77, 90, 23, 78};

    public static void main(String[] organs) {
        System.out.println(find_double(vhod));
    }

    private static int find_double(int[] vhod) {
        int vihlop = -1;
        for (int i=0; i<vhod.length-1; i++) {
            for (int j=i+1; j<vhod.length; j++) {
                if (vhod[i] == vhod[j]) {
                    vihlop = vhod[i];
                }
            }
        }
        return (vihlop);
    }
}
