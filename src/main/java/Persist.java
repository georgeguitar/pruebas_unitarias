/**
 * Juan D. Navarro Arias
 */

public class Persist {

    private static long producto(long num) {
        long prod = 1;
        while(num != 0){
            long unidades = num % 10;
            prod = prod * unidades;
            num = (num - unidades)/10;
        }
        return prod;
    }

    public static int persistence (long num) {
        int numRepeticiones = 0;
        while(num > 9){ //Un solo dígito
            while(num > 9){
                num = producto(num);
                numRepeticiones++;
            }
        }
        return numRepeticiones;
    }
}