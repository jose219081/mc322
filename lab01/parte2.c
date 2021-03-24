#include <stdio.h>

float proximaParcela(int i, float V, float J, float p){
    if(i == 1){
        p = 0;
    }else{
        p = V*J/100;
    }
    return p;
}

int main(){
    float S = 200;
    int N = 5; 
    float J = 1;
    float V = S;
    float p = 0;
    for(int i = 1; i < N+1; i++){
        p = proximaParcela(i, V, J, p);
        V += p;
        printf("Emprestimo 1: parcela %d eh %.2f\n", i, V);
    }
    return 0;
}