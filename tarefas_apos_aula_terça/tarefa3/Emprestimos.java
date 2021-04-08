public class Emprestimos{
    int juros, numero, corrente, id;
    double saldo, parcela;

    Emprestimo(int pJuros, int pNumero, double pSaldo, int pId){
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
        corrente += 1;
    }
}

//////////////////////////////////////////////

public class AppEmprestimos{
    public static void main(String args[]){
        Emprestimos emp1 = new Emprestimos(1, 5, 200, 1);
        Emprestimos emp2 = new Emprestimos(2, 7, 500, 2);
        while(emp1.corrente < emp1.numero+1 || emp2.corrente < emp2.numero+1){
            if(emp1.corrente < emp1.numero){
                emp1.proximaParcela();
                System.out.println("Emprestimo "+emp1.id+": parcela "+emp1.corrente+" eh "+emp1.saldo);
            }
            if(emp2.corrente < emp2.numero){
                emp2.proximaParcela();
                System.out.println("Emprestimo "+emp2.id+": parcela "+emp2.corrente+" eh "+emp2.saldo);
            }
        }
    }
}
