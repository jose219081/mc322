package tarefas_apos_aula_terça.tarefa3;

public class Emprestimos{
    int juros, numero, corrente, id;
    double saldo, parcela;

    Emprestimos(int pJuros, int pNumero, double pSaldo, int pId){
        juros = pJuros;
        numero = pNumero;
        saldo = pSaldo;
        id = pId;
        corrente = 1;
        parcela = 0;
    }

    void proximaParcela(){
        if(corrente == 1){
            parcela = 0;
        }else{
            parcela = saldo*juros/100;
        }
        saldo += parcela;
    }
}

