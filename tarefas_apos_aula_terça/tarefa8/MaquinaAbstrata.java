public abstract class ListStr {
    String content[];
 
    public ListStr(String content[]) {
       this.content = content;
    }
     
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
    
    public ListSequence(String content[]){
        super(content);
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

String content[] = {"Hello", "world", "of", "programming."};
ListStr l = new ListSequence(content);
l.list();