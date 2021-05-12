public abstract class ListStr {

    public abstract void add();

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
////////////////////////////////////////
public abstract class ListFix extends ListStr {
    String content[];
    int I;

    public ListFix(){
        this.content = new String[4];
        for(int i = 0; i < 4; i++){
            content[i] = null;
        }
        this.I = 0;
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
////////////////////////////////////////////

public class ListSequence extends ListFix {

    public ListSequence(){
        super();
    }

    public void add(String str){
        int i = 0;
        while(content[i] != null){
            i++;
        }
        content[i] = str;
    }
}
/////////////////////////////////////////////////
public class ListOrdered extends ListFix {

    public ListOrdered(){
        super();
    }

    public void add(String str){
        
    }
}