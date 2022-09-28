import java.util.Random;

public class array {
    public static void main(String[] args) {
        int[] a = new int[8];
        float[] x = new float[19];
        double[][] ar = new double[8][19];
        int k = 19;
        for(int i = 0; i < 8; i++){
            a[i] = k;
            k = k - 2;
        }
        for(int i = 0; i < 19; i++){
            x[i] = new Random().nextFloat(-12,15);
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 19; j++){
                double xx = x[j];
                if(a[i] == 19){
                    ar[i][j] = (double)Math.pow(((double)Math.pow((double)Math.pow(Math.E, xx), (xx / 2d))), 2);
                }
                if(a[i] == 5 || a[i] == 9 || a[i] == 15 || a[i] == 17){
                    ar[i][j] = (double) Math.pow((Math.tan(Math.pow((2d * xx), 2d)) / 2d), Math.cos(Math.asin ((xx + 1.5d) / 27d)));
                }
                else{
                    //ar[i][j] = (double)(3d / ((((double)Math.pow(((1d -  (double) Math.pow(xx, (1d / 3d))) / 4d), ((xx / 8d) * (xx / 8d)))) - 1d) * 4d));
                    ar[i][j] = (double) Math.pow(Math.E, (Math.tan(Math.tan(xx))));
                    //ar[i][j] = (double) Math.pow(1, 1);
                }
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0;j < 19; j++){
                System.out.printf("%.4f\t", ar[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
