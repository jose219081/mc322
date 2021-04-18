package mc322.lab04;

public class Peca{
    char peca;
    boolean b;

    Peca(char pPeca, boolean pB){
        this.peca = pPeca;
        this.b = pB;
    }

    void pular(){        
        this.peca = 'P';
        this.b = true;
    }

    void comer(){
        this.peca = '-';
        this.b = false;
    }
}