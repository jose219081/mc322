#include <stdio.h>

float S = 200;
int N = 5; 
float J = 1;
float p = 0;

float proximaParcela(){
    float parc = p;
    parc = S*J/100;
    return parc;
}

int main(){
    for(int i = 1; i < N+1; i++){
        if(i != 1){
            p = proximaParcela();
            S += p; 
        }
        printf("Emprestimo 1: parcela %d eh %.2f\n", i, S);
    }
    return 0;
}