package POO.EJ3F;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private int añosTrabajados;

    /////CONSTRUCTOR/////
    
    public Empleado(String pnombre, double psalarioBase, int pañosTrabajados){
        this.nombre=pnombre;
        this.salarioBase=psalarioBase;
        this.añosTrabajados=pañosTrabajados;
    }

    public double calcularBono(){
        if (this.salarioBase > 0){  
            double año=this.salarioBase*5/100;
            double salario=this.salarioBase;
            if (this.añosTrabajados>2) {
                for (int i = 0; i < this.añosTrabajados; i++) {
                    salario=salario+año;
                }
            }
            if (this.añosTrabajados>10){
                salario +=1000;
            }
            return salario;
        }else{
            return salarioBase;
        }
    }

    public int getAñosTrabajados() {
        return añosTrabajados;
    }

    public void setAñosTrabajados(int pañosTrabajados) {
        this.añosTrabajados = pañosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double psalarioBase) {
        this.salarioBase = psalarioBase;
    }
    
}
