package POO.NICO;

import java.lang.classfile.instruction.ThrowInstruction;
import java.util.Calendar;

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
Calendar cal = Calendar.getInstance();
public void setNow(){
        this.d = cal.get(Calendar.DAY_OF_MONTH);
        this.m = cal.get(Calendar.MONTH) +1;
        this.a = cal.get(Calendar.YEAR);
    }
public void next(){
    this.d=this.d+1;
    if (this.d>=30){
        this.m=this.d /30;
        this.d = this.d % 30;
    }
    if (this.m >= 12){
        this.a = this.a /12;
        this.m = this.m %12;
    }
}
}