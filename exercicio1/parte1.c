#include <stdio.h>

int main (){
    float S = 200;
    int N = 5;
    float J = 1;
    for(int i = 1; i < N+1; i++){
        if(i == 1){
            printf("Emprestimo 1: parcela %d eh %.2f\n", i, S);
        }else{
            S = S*(1 + J/100);
            printf("Emprestimo 1: parcela %d eh %.2f\n", i, S);
        }
    }
    return 0;
}