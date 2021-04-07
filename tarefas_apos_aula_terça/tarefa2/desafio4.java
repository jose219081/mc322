import java.util.Random;

public class Salarios{
    static int acima_media(int []funcionarios){
        int func;
        int salarios, media;
        func = 0;
        salarios = 0;
        media = 0;
        for(int i = 0; i < 50; i++){
            salarios += funcionarios[i];
        }
        media = salarios/50;
        for(int i = 0; i < 50; i++){
            if(funcionarios[i] > media){
                func += 1;
            }else{
                continue;
            }
        }
        return func;
    }
    
    public static void main(String args[]){
    	int funcionarios[];
	int acima;
	funcionarios = new int[50];
	Random rand = new Random();
	for(int i = 0; i < 50; i++){
	    int n = rand.nextInt((15000-2500)+1);
	    funcionarios[i] = n;
	}
	acima = Salarios.acima_media(funcionarios);
	System.out.printlnprintln(acima);
    }
}
