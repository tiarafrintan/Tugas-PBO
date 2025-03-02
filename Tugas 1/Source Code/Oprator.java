public class Oprator {
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF ; int i,j, hsl ; 
        float x,y,res;
        /* algoritma */

        Bool1 = true; Bool2 = false;
        
        // Boolean operations with output
        TF = Bool1 && Bool2 ; /* Boolean AND */
        System.out.println("Bool1 && Bool2 = " + TF);
        
        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.println("Bool1 || Bool2 = " + TF);
        
        TF = ! Bool1 ; /* NOT */
        System.out.println("!Bool1 = " + TF);
        
        TF = Bool1 ^ Bool2; /* XOR */
        System.out.println("Bool1 ^ Bool2 = " + TF);
        
        /* operasi numerik */
        i = 5; j = 2;
        System.out.println("\nNilai i = " + i + ", j = " + j);
        
        hsl = i + j;
        System.out.println("i + j = " + hsl);
        
        hsl = i - j;
        System.out.println("i - j = " + hsl);
        
        hsl = i / j; /* pembagian bulat */
        System.out.println("i / j = " + hsl);
        
        hsl = i * j;
        System.out.println("i * j = " + hsl);
        
        hsl = i % j; /* sisa. modulo */
        System.out.println("i % j = " + hsl);
        
        System.out.println("\nNilai i = " + i);
        
        /* operasi numerik floating point */
        x = 5; y = 5;
        System.out.println("Nilai x = " + x + ", y = " + y);
        
        res = x + y;
        System.out.println("x + y = " + res);
        
        res = x - y;
        System.out.println("x - y = " + res);
        
        res = x / y;
        System.out.println("x / y = " + res);
        
        res = x * y;
        System.out.println("x * y = " + res);
        
        /* operasi relasional numerik integer */
        System.out.println("\nOperasi Relasional Integer:");
        TF = (i == j);
        System.out.println("i == j : " + TF);
        
        TF = (i != j);
        System.out.println("i != j : " + TF);
        
        TF = (i < j);
        System.out.println("i < j : " + TF);
        
        TF = (i > j);
        System.out.println("i > j : " + TF);
        
        TF = (i <= j);
        System.out.println("i <= j : " + TF);
        
        TF = (i >= j);
        System.out.println("i >= j : " + TF);
        
        /* operasi relasional numerik float */
        System.out.println("\nOperasi Relasional Float:");
        TF = (x != y);
        System.out.println("x != y : " + TF);
        
        TF = (x < y);
        System.out.println("x < y : " + TF);
        
        TF = (x > y);
        System.out.println("x > y : " + TF);
        
        TF = (x <= y);
        System.out.println("x <= y : " + TF);
        
        TF = (x >= y);
        System.out.println("x >= y : " + TF);
        
        System.out.println("\nNilai i = " + i);
    }
}