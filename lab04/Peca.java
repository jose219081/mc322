package mc322.lab04;

public class Peca{
    char peca;
    char posicao[] = new char[2];

    Peca(char pPeca, String pPosicao){
        this.peca = pPeca;
        this.posicao = pPosicao.toCharArray();
    }

    void mover(String Posicao){
        char posposicao[] = new char[2];
        posposicao = Posicao.toCharArray();
        

    }
}