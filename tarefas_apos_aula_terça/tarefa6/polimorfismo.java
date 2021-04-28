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
l.adicionar(15);
l.adicionar(18);
l.adicionar(17);
l.adicionar(16);
l.adicionar(18);
l.adicionar(17);
l.adicionar(15);
l.adicionar(11);
l.adicionar(29);
lnd.adicionar(18);
lnd.adicionar(17);
lnd.adicionar(19);
lnd.adicionar(18);
lnd.adicionar(18);
lnd.adicionar(17);
lnd.adicionar(15);
lnd.adicionar(11);
lnd.adicionar(19);
l.ordena();
lnd.ordena();
System.out.println("ListaUtil ordenada: " + l);
System.out.println("ListaUtilNoDup ordenada: " + lnd);