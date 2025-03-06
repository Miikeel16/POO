package POO.NICO;

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
        this.a=2000;
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
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    public boolean esBisiesto(){return (this.a%4==0);}
    public int diaMaxMes(){
        int dev=31;
        if(this.m==4||this.m==6||this.m==9||this.m==11){
        dev=30;
        }else{
            if (this.m==2){
                dev=28;
                if(esBisiesto()){
                    dev=29;
                }
            }
        }
        return(dev);
        }
    public void next(){
        this.d = this.d + 1;
        if (this.d > 31){
            this.m = this.m + this.d / 31;
            this.d = this.d % 31;
        }
        if (this.m > 12){
            this.a = this.a + this.m / 12;
            this.m = this.m % 12;
        }
        if (this.d == 0){
            this.d = 1;
        }
        if (this.m == 0){
            this.m = 1;
        }
    }
    public int valueOf(){
        return this.a*10000+this.m*100+this.d;
    }
    @Override
    public String toString(){
        return "Fecha: " + this.d+ " - " +this.m+ " - " + this.a;
    }
    public void parseInt(int valor){
        int pd, pm, pa;
        pd=valor%100;
        pa=valor/10000;
        pm=(valor%10000)/100;
        this.d=pd;this.m=pm;this.a=pa;
    }
}