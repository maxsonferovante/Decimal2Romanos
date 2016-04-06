package romanos;

import primitivas.Primitivas;

public class Romanos extends Primitivas{

	private static boolean RS(String[] V, int[] i, int[] o) {
        return (ddd(V, i, o) || dd(V, i, o) || d(V, i, o));
    }
	
    private static boolean d(String[] V, int[] i, int[] o) {
        return (tok("0", i, o) && attr(V, "")
                || tok("1", i, o) && attr(V, "I")
                || tok("2", i, o) && attr(V, "II")
                || tok("3", i, o) && attr(V, "III")
                || tok("4", i, o) && attr(V, "IV")
                || tok("5", i, o) && attr(V, "V")
                || tok("6", i, o) && attr(V, "VI")
                || tok("7", i, o) && attr(V, "VII")
                || tok("8", i, o) && attr(V, "VIII")
                || tok("9", i, o) && attr(V, "IX"));

    }
    private static boolean dd(String[] V, int[] i, int[] o) {
        int[] i1 = {0};
        String[] D = {""};
        return (   tok("0", i, i1) && d(D,i1, o) && attr(V, "" + D[0])
                || tok("1", i, i1) && d(D, i1, o) && attr(V, "X" + D[0])
                || tok("2", i, i1) && d(D, i1, o) && attr(V, "XX" + D[0])
                || tok("3", i, i1) && d(D, i1, o) && attr(V, "XXX" + D[0])
                || tok("4", i, i1) && d(D, i1, o) && attr(V, "XL" + D[0])
                || tok("5", i, i1) && d(D, i1, o) && attr(V, "L" + D[0])
                || tok("6", i, i1) && d(D, i1, o) && attr(V, "LX" + D[0])
                || tok("7", i, i1) && d(D, i1, o) && attr(V, "LXX" + D[0])
                || tok("8", i, i1) && d(D, i1, o) && attr(V, "LXXX" + D[0])
                || tok("9", i, i1) && d(D, i1, o) && attr(V, "XC" + D[0]));
    
    }
    private static boolean ddd(String[] V, int[] i, int[] o) {
        int[] i1 = {0}, i2 = {0};
        String[] D = {""};
        
    return ( tok("1", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "C")
                || tok("1", i, i1) && dd(D, i1, o) && attr(V, "C" + D[0])
                
                || tok("2", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "CC")
                || tok("2", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("3", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "CCC")
                || tok("3", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("4", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "CD")
                || tok("4", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("5", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "D")
                || tok("5", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("6", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "DC")
                || tok("6", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("7", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "DCC")
                || tok("7", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("8", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "DCCC")
                || tok("8", i, i1) && dd(D, i1, o) && attr(V, "CC" + D[0])
                
                || tok("9", i, i1) && tok("0", i1, i2) && tok("0", i2, o) && attr(V, "CM")
                || tok("9", i, i1) && dd(D, i1, o) && attr(V, "CM" + D[0])) ;
    }
    
    public static void main(String[] args) {
    	 int[] i = {0};
         int[] i1 = {0};
         int[] o1 = {0};
         String[] V = {""};
         le_fita();
         pe[0] = 0;
         if (RS(V, i, i1) && tok("@", i1, o1)) {
             System.out.println("Entrada: " + Primitivas.s);
             System.out.println("Ok até: " + o1[0] + "\nNumero Romano: " + V[0]);
         } else {
             System.out.println("Erro na posicao: " + (pe[0] + 1));
         }
	}
}
