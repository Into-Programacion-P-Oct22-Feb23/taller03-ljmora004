
package ejercicio07;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        double var1 = (Math.sqrt(81) + 9)/3;
        int var2 = 9;
        int var3 = 10; 
        int var4 = 1;
        double var5 = 100/25;
        double var6 = Math.sqrt(100);
        boolean resultado = (var1 == var2) || (var3 > var4) && (var5 > var6);
        
        System.out.println(resultado);
    }
    
}
