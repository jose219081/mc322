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
}

//////////////////////////////////////////////////

//sao 50 funcionarios com salarios entre 2.500 e 15.000

import java.util.Random;

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