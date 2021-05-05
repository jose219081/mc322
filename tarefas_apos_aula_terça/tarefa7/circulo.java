public class Circulo{
    private int centroX, centroY, raio;
    
    public void define(int pCentroX, int pCentroY, int pRaio){
        this.centroX = pCentroX;
        this.centroY = pCentroY;
        this.raio = pRaio;
    }
    
    public void define(String dimensoes){//supondo que a string seja de forma "xx yy rr" sem ter valores negativos
        this.define(Integer.parseInt(dimensoes.substring(0,2)),
                  Integer.parseInt(dimensoes.substring(3,5)),
                  Integer.parseInt(dimensoes.substring(6)));
    }
    
    public double area(){
        return raio*raio*pi;
    }
}
//////
Circulo c1 = new Circulo(),
        c2 = new Circulo();
c1.define(0, 0, 5);
c2.define("00 00 05");
System.out.println("Circulo 1: " + c1);
System.out.println("Circulo 2: " + c2);

//////////////////////////////////////////////////////////////////
//versao com construtor

public class Circulo{
    private int centroX, centroY, raio;
    
    public Circulo(int pCentroX, int pCentroY, int pRaio){
        this.centroX = pCentroX;
        this.centroY = pCentroY;
        this.raio = pRaio;
    }
    
    public Circulo(String dimensoes){//supondo que a string seja de forma "xx yy rr" sem ter valores negativos
        this(Integer.parseInt(dimensoes.substring(0,2)),
                  Integer.parseInt(dimensoes.substring(3,5)),
                  Integer.parseInt(dimensoes.substring(6)));
    }
    
    public double area(){
        return raio*raio*pi;
    }
}
/////
Circulo c1 = new Circulo(0, 0, 5),
        c2 = new Circulo("00 00 05");
System.out.println("Circulo 1: " + c1);
System.out.println("Circulo 2: " + c2);