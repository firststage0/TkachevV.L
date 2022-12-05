import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        double s1 = 0.26, s2 = 0.31, s3 = 0.24, s4 = 0.19, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        double pb1 = 0, pb2 = 0, pb3 = 0, pb4 = 0, HA, HB, HAb, HBa, C1, C2;

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        double[][] array1 = new double[4][4];
        double[][] array2 = new double[4][4];
        double[][] array3 = new double[4][4];

        array1[0][0] = 0.99;
        array1[0][1] = 0.01;
        array1[0][2] = 0;
        array1[0][3] = 0;
        array1[1][0] = 0.02;
        array1[1][1] = 0.94;
        array1[1][2] = 0.03;
        array1[1][3] = 0.01;
        array1[2][0] = 0;
        array1[2][1] = 0.2;
        array1[2][2] = 0.98;
        array1[2][3] = 0;
        array1[3][0] = 0;
        array1[3][1] = 0.01;
        array1[3][2] = 0.03;
        array1[3][3] = 0.96;

        array3[0][0] = 0.9764;
        array3[0][1] = 0.0076;
        array3[0][2] = 0;
        array3[0][3] = 0;
        array3[1][0] = 0.0235;
        array3[1][1] = 0.8473;
        array3[1][2] = 0.0372;
        array3[1][3] = 0.0167;
        array3[2][0] = 0;
        array3[2][1] = 0.1396;
        array3[2][2] = 0.9400;
        array3[2][3] = 0;
        array3[3][0] = 0;
        array3[3][1] = 0.0055;
        array3[3][2] = 0.0228;
        array3[3][3] = 0.9833;

        for (int i = 0; i < array2.length; i++) {
            array2[0][i] = s1 * array1[0][i];
            array2[1][i] = s2 * array1[1][i];
            array2[2][i] = s3 * array1[2][i];
            array2[3][i] = s4 * array1[3][i];
        }
        for (int i = 0; i < 4; i++) {
            pb1 += array2[i][0];
            pb2 += array2[i][1];
            pb3 += array2[i][2];
            pb4 += array2[i][3];
        }
        HA = (s1 * log2(s1) + s2 * log2(s2) + s3 * log2(s3) + s4 * log2(s4)) * -1;
        HB = (pb1 * log2(pb1) + pb2 * log2(pb2) + pb3 * log2(pb3) + pb4 * log2(pb4)) * -1;

        for (int i = 0; i < array3.length; i++){
            if (array3[0][i] != 0) {
                sum1 += array3[0][i] * log2(array3[0][i]);
            }
            if (array3[1][i] != 0){
                sum2 += array3[1][i] * log2(array3[1][i]);
            }
            if (array3[2][i] != 0){
                sum3 += array3[2][i] * log2(array3[2][i]);
            }
            if (array3[3][i] != 0){
                sum4 += array3[3][i] * log2(array3[3][i]);
            }
        }
        HAb = (sum1 * pb1 + sum2 * pb2 + sum3 * pb3 + sum4 * pb4) * -1;
        HBa = (sum1 * s1 + sum2 * s2 + sum3 * s3 + sum4 * s4) * -1;
        C1 = 100 * (HA - HAb);
        C2 = 100 * (HB - HBa);
        System.out.println();
        System.out.println("Bezuslovnaya entropiya istochnika H(A): " + HA + "\n");
        System.out.println("Bezuslovnaya entropiya istochnika H(B): " + HB + "\n");
        System.out.println("Uslovnaya entropiya H(A|B): " + HAb + "\n");
        System.out.println("Uslovnaya entropiya H(B|A): " + HBa + "\n");
        System.out.println("Propusknaya sposobnost' 1: " + C1 + "\n");
        System.out.println("Propusknaya sposobnost' 2: " + C2 + "\n");
    }
    public static double log2(double x){
        return Math.log(x)/Math.log(2);
    }
}

