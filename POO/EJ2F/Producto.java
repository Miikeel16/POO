package POO.EJ2F;

public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    //////////CONTRUCTORES///
    
    public Producto(String pnombre, double pprecioBase, double pimpuesto){
        this.nombre=pnombre;
        this.precioBase=pprecioBase;
        this.impuesto=pimpuesto;
    }
    public double calcularPrecioFinal(){
        double impuestos=this.precioBase*this.impuesto/100;
        double precioFinal=this.precioBase+this.impuesto;
        double descuento=precioFinal*5/100;
        if (precioFinal < 500){
            return precioFinal;
        }else{
            return precioFinal-descuento;
        }

    }

    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double pimpuesto){
        this.impuesto=pimpuesto;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String pnombre){
        this.nombre=pnombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double pprecioBase){
        this.precioBase=pprecioBase;
    }
}
