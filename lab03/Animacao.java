package mc322.lab03;
/*
entrada AALLPP$$$$$$$$$$(3 primeiros pares sao as dimensoes e os $ sao os comandos)
AA eh o tamanho do aquario. LL eh o tamanho da lombriga. PP eh a posiçao inicial da lombriga
comandos: M move lombriga, C cresce lombriga, V vira lombriga
*/
public class Animacao{
    String animacaoInicial;//ou char animacao[16]
    char animacao[];
    AquarioLombriga aqLomb;
    int p;//identaçao para verificar qual passo deve seguir

    Animacao(String pAnimacao){ 
        this.animacaoInicial = pAnimacao;
        int x = pAnimacao.length();
        int pPos, pTamAq, pTamLomb;
        animacao = new char[x];
        this.animacao = pAnimacao.toCharArray();
        pTamAq = (animacao[0] - '0')*10 + (animacao[1] - '0');
        pTamLomb = (animacao[2] - '0')*10 + (animacao[3] - '0');
        pPos = (animacao[4] - '0')*10 + (animacao[5] - '0');
        aqLomb = new AquarioLombriga(pTamAq, pTamLomb, pPos);
        this.p = 6;
    }

    void apresenta(){
        while(p < animacaoInicial.length()){
            if(p == 6){
                aqLomb.apresenta();
            }
            passo();
            aqLomb.apresenta();
            p += 1;
        }
    }

    void passo(){
        char movimento;
        movimento = animacao[p];
        switch(movimento){
            case 'M':
                aqLomb.mover();
                break;
            case 'C':
                aqLomb.crescer();
                break;
            case 'V':
                aqLomb.virar();
        }
    }
}