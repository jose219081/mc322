package mc322.lab04;

public class Tabuleiro{
    Peca [][]tabuleiro = new Peca[7][7];//tabuleiro eh 7 por 7,
    /*
    manter inacessivel ou imodificaveis as posiçoes fora do tabuleiro:
    1a,1b,2a,2b,6a,6b,7a,7b,1g,1g,2f,2g,6f,6g,7f,7g
    */

    Tabuleiro(){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if((i == 0 || i == 1 || i == 5 ||i == 6)&&(j == 0 || j == 1 || j == 5 ||j == 6)){
                    tabuleiro[i][j] = new Peca(' ', false);
                }else if(i == 3 && j == 3){
                    tabuleiro[i][j] = new Peca('-', true);
                }else{
                    tabuleiro[i][j] = new Peca('P', true);
                }
            }
        }
    }

    void conversao(String Posicao){
        //usar para mover a peça da posicao pra proxima
        char posicao[] = new char[5]; 
        int y1, x1, y2, x2, ym, xm;//ym e xm sao as coordenadas da peça que será comida
        posicao = Posicao.toCharArray();
        y1 = posicao[1] - '1';
        x1 = posicao[0] - 'a';
        y2 = posicao[4] - '1';
        x2 = posicao[3] - 'a';
        if(y1 != y2 && x1 == x2){
            xm = x2;
            if(y1 > y2){
                ym = (y1+y2)*(y1-y2)/2;
            }else{
                ym = (y1+y2)*(y2-y1)/2;
            }
        }else{
            ym = y2;
            if(x1 > x2){
                xm = (x1+x2)*(x1-x2)/2;
            }else{
                xm = (x1+x2)*(x2-x1)/2;
            } 
        }
        if(tabuleiro[y2][x2].b == true && tabuleiro[ym][xm].b == true){
            this.tabuleiro[y2][x2].pular();
            this.tabuleiro[y1][x1].comer();
            this.tabuleiro[ym][xm].comer();
        }
    }
 
    void saidaGrafico(){//saida em grafico(fazer vetor de strings)
        
    }

    void saidaVetor(){
        char saida[] = new char[56];//eh 56 pq eh uma matriz 7 por 7 mais o \n no fim de cada linha
        int I;
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                saida[I] = tabuleiro[i][j].peca;
                I++;
            }
            saida[I] = '\n';
            I++;
        }
        //verificar o q eh pra faze com isso
    }
}