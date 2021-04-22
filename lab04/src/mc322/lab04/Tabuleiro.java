package mc322.lab04;

public class Tabuleiro{
    Peca [][]tabuleiro = new Peca[7][7];//tabuleiro eh 7 por 7,
    /*
    manter inacessivel ou imodificaveis as posiçoes fora do tabuleiro:
    1a,1b,2a,2b,6a,6b,7a,7b,1g,1g,2f,2g,6f,6g,7f,7g
    obs: usei false para deixa-los inacesiveis
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
        boolean checandoPecas;
        posicao = Posicao.toCharArray();
        y1 = posicao[1] - '1';
        x1 = posicao[0] - 'a';
        y2 = posicao[4] - '1';
        x2 = posicao[3] - 'a';
        y1 = 6 - y1;//correçao para ordem do tabuleiro
        y2 = 6 - y2;//correçao para ordem do tabuleiro
        if(y1 > 6 || y2 > 6 || x1 > 6 || x2 > 6 || y1 < 0 || y2 < 0 || x1 < 0 || x2 < 0){
            return;
        }
        if(y1 != y2 && x1 == x2){
            if((y1 > y2 && y1 - y2 != 2) || (y2 > y1 && y2 - y1 != 2)){
                return;
            }
            xm = x2;
            ym = (y1+y2)/2;
        }else if(y1 == y2 && x1 != x2){
            if((x1 > x2 && x1 - x2 != 2) || (x2 > x1 && x2 - x1 != 2)){
                return;
            }
            ym = y2;
            xm = (x1+x2)/2;
        }else{
            return;
        }
        if((tabuleiro[y1][x1].peca == '-' && tabuleiro[y2][x2].peca == '-')
        ||(tabuleiro[y2][x2].peca == 'P')||(tabuleiro[ym][xm].peca == '-')){
            checandoPecas = false;
        }else{
            checandoPecas = true;
        }
        if(tabuleiro[y2][x2].b == true && tabuleiro[ym][xm].b == true && checandoPecas == true){
            this.tabuleiro[y2][x2].pular();
            this.tabuleiro[y1][x1].comer();
            this.tabuleiro[ym][xm].comer();
        }
    }
 
    void saidaGrafico(){//saida em grafico(fazer vetor de strings)
        String grafico[] = new String[8];
        int I;
        I = 0;
        for(int k = 0; k < 7; k++){
            grafico[k] = "" + (7-k);
        }
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                grafico[I] += " " + tabuleiro[i][j].peca;
            }
            I++;
        }
        grafico[7] = "  a b c d e f g";
        for(int i = 0; i < 8; i++){
            System.out.println(grafico[i]);
        }
    }

    String saidaVetor(){
        String saida;
        saida = "";
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                saida += " " + tabuleiro[i][j].peca;
            }
            saida += '\n';
        }
        return saida;
    }
}