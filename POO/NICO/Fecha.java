package POO.NICO;

public class Fecha{
    private int d,m,a;

///////////////CONSTRUCTORES
public Fecha(int pD, int pM, int pA){
    this.d=pD;
    this.m=pM;
    this.a=pA;
}
public Fecha(){
    this.d=01;
    this.m=01;
    this.a=2001;
}
public Fecha(int pA){
    this.d=01;
    this.m=01;
    this.a=pA;
}
public Fecha(int pM, int pA){
    this.d=01;
    this.m=pM;
    this.a=pA;
}
////////////////METODOS
public void setFecha(int pD, int pM, int pA){
   d=pD; 
   m=pM; 
   a=pA;
   }
   public void mostrarFecha(){
    IO.SOP("Hoy es: "+this.d+"-"+this.m+"-"+this.a);
   }
}