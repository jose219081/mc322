package tarefas_apos_aula_terça.tarefa3;

public class AppEmprestimos{
    public static void main(String args[]){
        Emprestimos emp1 = new Emprestimos(1, 5, 200, 1);
        Emprestimos emp2 = new Emprestimos(2, 7, 500, 2);
        while(emp1.corrente < emp1.numero+1 || emp2.corrente < emp2.numero+1){
            if(emp1.corrente < emp1.numero+1){
                emp1.proximaParcela();
                System.out.println("Emprestimo "+emp1.id+": parcela "+emp1.corrente+" eh "+emp1.saldo);
                emp1.corrente += 1;
            }
            if(emp2.corrente < emp2.numero+1){
                emp2.proximaParcela();
                System.out.println("Emprestimo "+emp2.id+": parcela "+emp2.corrente+" eh "+emp2.saldo);
                emp2.corrente += 1;
            }
        }
    }
}
