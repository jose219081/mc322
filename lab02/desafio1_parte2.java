public class Parcela{
    static float parcela(float S, int J, int A, float p){
        if(A == 1)
            p = 0;
        else
            p = S*J/100;
        return p;
    }
}

////////////////////////////////////////////////

float S, p;
int N, J, A;
S = 200;
N = 5;
J = 1;
A = 1;
p = 0;
for(int i = 0; i < N; i++){
    p = Parcela.parcela(S, J, A, p);
    S += p;
    System.out.println("Emprestimo 1: parcela " +A + " eh " +S);
    A++;
}