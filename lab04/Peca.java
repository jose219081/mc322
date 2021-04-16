package mc322.lab04;

public class Peca{
    char peca;
    char posicao[] = new char[2];

    Peca(char pPeca, String pPosicao){
        this.peca = pPeca;
        this.posicao = pPosicao.toCharArray();
    }

    void mover(String proxPosicao){
        char posPosicao[] = new char[2];
        posPosicao = proxPosicao.toCharArray();        
        this.posicao = posPosicao;
    }
}