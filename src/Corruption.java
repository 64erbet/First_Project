import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Corruption {

    private static int kol_64etov = 0;
    private static int proc_otch = 0;

    public static void main(String[] args) {

        Scanner sam_scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        String para_s = sam_scanner.nextLine();
        System.out.println("Введите массив больших чисел");
        String chisla_s = sam_scanner.nextLine();
        sam_scanner.close();

        String[] para_s_mas = para_s.trim().split("\\s");
        String[] mas_chis_s = chisla_s.trim().split("\\s");

        int summa_mas_int[] = new int[mas_chis_s.length];
        for (int i = 0; i < mas_chis_s.length; i++) {
            summa_mas_int[i] = Integer.parseInt(mas_chis_s[i]);
        }

        kol_64etov = Integer.parseInt(para_s_mas[0]);
        proc_otch = Integer.parseInt(para_s_mas[1]);

        double shchet_firmy = 0;
//******************************************************************************************

        shchet_firmy = getShchet_firmy(summa_mas_int, shchet_firmy);

//******************************************************************************************
        System.out.println("shchet_firmy = " + shchet_firmy);
    }

    private static double getShchet_firmy(int[] summa_mas_int, double shchet_firmy) {
        if (kol_64etov % 2 == 0) {
            for (int i = 0; i < kol_64etov - 1; i += 2) {
                shchet_firmy += Corruption.reduce_para(summa_mas_int[i], summa_mas_int[i + 1]);
            }
        } else {
            for (int i = 0; i < kol_64etov - 2; i += 2) {

            }
        }
        System.out.println("kol_64etov = " + kol_64etov);
        return shchet_firmy;
    }

    private static double reduce_para(double sum_1, int sum_2) {
        double vihlop = 0;
        vihlop += (sum_1 + sum_2) * (100-proc_otch) / 100;
        return (vihlop);
    }
}