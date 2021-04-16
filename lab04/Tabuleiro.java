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
                    tabuleiro[i][j] = null;
                }else if(i == 3 && j == 3){
                    tabuleiro[i][j] = new Peca('-', "d4");
                }else{
                    String s;
                    char c1, c2;
                    c1 = (char)(i + '1');
                    c2 = (char)(j + 'a');
                    s = "" + c1 + c2;
                    tabuleiro[i][j] = new Peca('P', s);
                }
            }
        }
    }

    void conversao(char []posicao, String posPosicao){//usar para mover a peça da posicao pra proxima
        //arrumar
        int y, x;
        y = posicao[1] - '1';
        x = posicao[0] - 'a';
        this.tabuleiro[y][x].mover(posPosicao);
    }
 
    void apresentar(){//talvez receber um vetor de peças

    }
}