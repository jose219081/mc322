public class Lista {
    protected int vlista[] = new int[100];
    protected int ultimo = -1;
    
    public void adicionar(int item) {
       if (ultimo+1 < vlista.length) {
          ultimo++;
          vlista[ultimo] = item;
       }
    }
    
    public String toString() {
       String str = "";
       for (int l = 0; l <= ultimo; l++)
          str += vlista[l] + ((l < ultimo) ? ", " : "");
       return str;
    }
}
////////////////////////////////////////////////////////////////

public class ListaUtil extends Lista {

    public void ordena() {
       int lastSwap = ultimo;
       while (lastSwap > 0) {
          int swap = 0;
          for (int v = 0; v < lastSwap; v++)
             if (vlista[v] > vlista[v+1]) {
                int aux = vlista[v];
                vlista[v] = vlista[v+1];
                vlista[v+1] = aux;
                swap = v;
             }
           lastSwap = swap;
       }
    }
 
}
///////////////////////////////////////////////////

public class ListaUtilNoDup extends ListaUtil {
   public void ordena() {
      super.ordena();
       
      int s = 0;
      for (int v = 0; v <= ultimo; v++)
         if (vlista[s] != vlista[v]) {
            s++;
            vlista[s] = vlista[v];
         }
      ultimo = s;
   }
}
//////////////////////////////////////////////////////

ListaUtil l = new ListaUtil();
ListaUtil lnd = new ListaUtilNoDup();
l.adicionar(10);
l.adicionar(5);
l.adicionar(20);
l.adicionar(5);
l.adicionar(35);
l.adicionar(35);
l.adicionar(15);
l.adicionar(10);
l.adicionar(35);
lnd.adicionar(10);
lnd.adicionar(5);
lnd.adicionar(20);
lnd.adicionar(5);
lnd.adicionar(35);
lnd.adicionar(35);
lnd.adicionar(15);
lnd.adicionar(10);
lnd.adicionar(35);
l.ordena();
lnd.ordena();
System.out.println("ListaUtil ordenada: " + l);
System.out.println("ListaUtilNoDup ordenada: " + lnd);