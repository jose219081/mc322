float S;
int N, J;
S = 200;
N = 5;
J = 1;
for(int i = 1; i < N+1; i++){
    if(i == 1)
        S = S;
    else
        S += S*J/100;
    System.out.println("Emprestimo 1: parcela " +i + " eh " +S);
}
//checar casas decimais do S, soh pode ter 2