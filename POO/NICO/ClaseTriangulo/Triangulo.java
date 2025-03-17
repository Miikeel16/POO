package POO.NICO.ClaseTriangulo;


public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int plado1, int plado2, int plado3){
        this.lado1=plado1;
        this.lado2=plado2;
        this.lado3=plado3;
    }
    public Triangulo(){
        this.lado1=0;
        this.lado2=0;
        this.lado3=0;
    }

    public int getLado1() {
        return this.lado1;
    }

    public void setLado1(int plado1) {
        this.lado1 = plado1;
    }
    public int getLado2() {
        return this.lado2;
    }
    public void setLado2(int plado2){
        this.lado2=plado2;
    }
    public int getLado3() {
        return this.lado3;
    }
    public void setLado3(int plado3){
        this.lado3=plado3;
    }
    public void inicializar(){
        this.lado1=(int)(Math.random()*100+1);
        this.lado2=(int)(Math.random()*100+1);
        this.lado3=(int)(Math.random()*100+1);
    }
    public void inicializar(int plado1, int plado2, int plado3){
        this.lado1=plado1;
        this.lado2=plado2;
        this.lado3=plado3;
    }
    public void imprimirLadoMayor(){
        if (this.lado1>this.lado2 && this.lado1>this.lado3){
            System.out.println("Lado mayor: lado 1: "+this.lado1);
        }else if(this.lado2>this.lado1 && this.lado2>this.lado3){
            System.out.println("Lado mayor: lado 2: "+this.lado2);
        }else{
            System.out.println("Lado mayor: lado 3: "+this.lado3);
        }
    }
    public void imprimirLadoMenor(){
        if (this.lado1<this.lado2 && this.lado1<this.lado3){
            System.out.println("Lado menor: lado 1: "+this.lado1);
        }else if(this.lado2<this.lado1 && this.lado2<this.lado3){
            System.out.println("Lado menor: lado 2: "+this.lado2);
        }else{
            System.out.println("Lado menor: lado 3: "+this.lado3);
        }
    }
    public boolean EsEquilatero(){
        if (this.lado1==this.lado2 && this.lado1==this.lado3){
            return true;
        }else{
            return false;
        }
    }
    public int getPerimetro(){
        return this.lado1+this.lado2+this.lado3;
    }
    @Override
    public String toString(){
        return "Triangulo: "+" lado 1: "+this.lado1+", lado 2: "+this.lado2+", lado 3: "+this.lado3+" Perimetro: "+getPerimetro();
    }
    public boolean sonIguales(Triangulo pTriangulo){
        if (this.lado1 != pTriangulo.lado1){
            return false;
        }else if ( this.lado2 != pTriangulo.lado2){
            return false;
        }else if ( this.lado3 != pTriangulo.lado3){
            return false;
        }
        return true;
    }

    public int compareTo (Triangulo pTriangulo){
        if (this.getPerimetro() > pTriangulo.getPerimetro()){
            return 1;
        }else if (this.getPerimetro() < pTriangulo.getPerimetro()){
            return -1;
        }else{
            return 0;
        }
    }

    public void constructorCopia(Triangulo pTriangulo){
        this.lado1 = pTriangulo.lado1;
        this.lado2 = pTriangulo.lado2;
        this.lado3 = pTriangulo.lado3;
    }
}
