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
        if (this.precioBase>0) {
            double impuestos=this.precioBase*this.impuesto/100;
            double precioFinal=this.precioBase+impuestos;
            if (precioFinal <= 500){
                return precioFinal;
            }else{
                double descuento=precioFinal*5/100;
                return precioFinal-descuento;
            }
        }else{
            return this.precioBase;
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
