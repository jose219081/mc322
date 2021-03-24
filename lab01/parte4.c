#include <stdio.h>

typedef struct Emprestimo{
    float S;
    int N;
    int J;
    int atual;
    float p;
}Emprestimo;

Emprestimo criar_emprestimo(){
    Emprestimo emprestimo;
    emprestimo.atual = 1;
    emprestimo.S = 200;
    emprestimo.N = 5;
    emprestimo.J = 1;
    emprestimo.p = 0;
    return emprestimo;
}

float proximaParcela(Emprestimo emprestimo){
    float p;
    p = 0;
    if(emprestimo.atual == 1){
        p = 0;
    }else{
        p = emprestimo.S*emprestimo.J/100;
    }
    return p;
}

int main(){
    Emprestimo emprestimo;
    emprestimo = criar_emprestimo();
    for(int i = 0; i < emprestimo.N; i++){
        emprestimo.p = proximaParcela(emprestimo);
        emprestimo.S += emprestimo.p;
        printf("Emprestimo 1: parcela %d eh %.2f\n", emprestimo.atual, emprestimo.S);
        emprestimo.atual += 1;
    }
    return 0;
}