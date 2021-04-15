package mc322.lab03;

public class AquarioLombriga{
    int tamAq, tamLomb, pos;
    int sentido;//verifica pra qual lado esta virado

    AquarioLombriga(int pTamAq, int pTamLomb, int pPos){
        this.tamAq = pTamAq;
        this.tamLomb = pTamLomb;
        this.pos = pPos;
        this.sentido = 1;
        if(tamLomb > tamAq){
            this.tamAq = pTamLomb;
        }
        if(pos > tamAq){
            pos = 1;
        }
    }

    void crescer(){
        if(pos > 0 && tamLomb < tamAq){
            tamLomb += 1;
            pos -= 1;
        }
    }

    void virar(){
        if(sentido == 1){
            sentido = -1;
        }else{
            sentido = 1;
        }
        
    }

    void mover(){
        if((pos+tamLomb == tamAq+1 && sentido == 1) || (pos == 1 && sentido == -1)){
            virar();
        }else{
            if(sentido == 1){
                pos += 1;
            }else{
                pos -=1;
            }
        }
    }

    void apresenta(){
        for(int i = 1; i < tamAq+1; i++){
            if(i < pos || i > pos+tamLomb-1){
                System.out.print("#");
            }else{
                if(sentido == -1 && i == pos){
                    System.out.print("0");
                }else if(sentido == 1 && i == pos+tamLomb-1){
                    System.out.print("0");
                }else{
                    System.out.print("@");
                }
            }
        }
        System.out.println();
    }
}