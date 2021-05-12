public abstract class ListStr {
     
    public abstract String first();
    
    public abstract String next();
    
    public void list() {
       String element = first();
       
       while (element != null) {
          System.out.println(element);
          element = next();
       }
    }
}
////////////////////////////////////////////////////////

public class ListSequence extends ListStr {
    int I;
    String content[];
    
    public ListSequence(String content[]){
        sthis.content = content;
    }
    
    public String first(){
        this.I = 0;
        return content[I];
    }
   
    public String next(){
        I++;
        if(I == content.length){
            return null;
        }
        return content[I];
    }
}
///////////////////////////////////////////////////////////

String content1[] = {"Hello", "world", "of", "programming."};
String content2[] = {"Olá", "mundo", "da", "programação."};
ListStr l1 = new ListSequence(content1);
ListStr l2 = new ListSequence(content2);
l1.list();
l2.list();