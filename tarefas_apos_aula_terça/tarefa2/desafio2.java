import java.util.Random;

public class Transformacao{
    static void numero_binario(int n, int []b){
        int r, i;
        int bi[];//sera utilizado para inverter o valor binario
        bi = new int[14];
        r = 0;
        i = 0;
        while(n > 0){
            r = n%2;
            bi[i] = r;
            n = n/2;
            i++;
        }
        i = 0;
        for(int j = bi.length-1; j >= 0; j--){
            b[i] = bi[j];
            i++;
        }
    }
    
    public static void main(String args[]){
    	int n;
	int b[];
	b = new int[14];
	Random rand = new Random();
	n = rand.nextInt(10000);
	System.out.println(n);
	Transformacao.numero_binario(n, b);
	for(int i = 0; i < b.length; i++){
	    System.out.print(b[i]);
	}
    }
}
