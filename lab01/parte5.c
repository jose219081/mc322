#include <stdio.h>

typedef struct Emprestimo{
    float S;
    int N;
    int J;
    int atual;
    float p;
    int id;//servira como identificador de qual emprestimo estamos tratando
}Emprestimo;

Emprestimo criar_emprestimo(float S, int N, int J, int id){
    Emprestimo emprestimo;
    emprestimo.id = id;
    emprestimo.atual = 1;
    emprestimo.S = S;
    emprestimo.N = N;
    emprestimo.J = J;
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
    Emprestimo emprestimo1, emprestimo2;
    emprestimo1 = criar_emprestimo(200, 5, 1, 1);
    emprestimo2 = criar_emprestimo(500, 7, 2, 2);
    while(emprestimo1.atual < emprestimo1.N+1 || emprestimo2.atual < emprestimo2.N+1){
        if(emprestimo1.atual < emprestimo1.N+1){
            emprestimo1.p = proximaParcela(emprestimo1);
            emprestimo1.S += emprestimo1.p;
            printf("Emprestimo %d: parcela %d eh %.2f\n", emprestimo1.id, emprestimo1.atual, emprestimo1.S);
            emprestimo1.atual += 1;
        }
        if(emprestimo2.atual < emprestimo2.N+1){
            emprestimo2.p = proximaParcela(emprestimo2);
            emprestimo2.S += emprestimo2.p;
            printf("Emprestimo %d: parcela %d eh %.2f\n", emprestimo2.id, emprestimo2.atual, emprestimo2.S);
            emprestimo2.atual += 1;
        }
    }
    return 0;
}