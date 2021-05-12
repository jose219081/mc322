public interface IListStr {
    public String first();
    public String next();
    public void list();
}
////////////////////////////
public class ListStr implements IListStr {
    String content[];
    int I;
    
    public ListStr(String content[]) {
       this.content = content;
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
    
    public void list() {
       String element = first();
       
       while (element != null) {
          System.out.println(element);
          element = next();
       }
    }
}
////////////////////////////////////
String content1[] = {"Hello", "world", "of", "programming."};
String content2[] = {"Olá", "mundo", "da", "programação."};
IListStr l1 = new ListStr(content1);
IListStr l2 = new ListStr(content2);
l1.list();
l2.list();