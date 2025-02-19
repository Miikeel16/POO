package POO.EJ2.EJ2JAVA;
import java.util.Random;
public class Persona{
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //////CONSTRUCTOR POR DEFECTO//////
    public Persona(char psexo){
        this.nombre="";
        this.edad=0;
        this.dni=generaDNI();
        this.sexo=comprobarSexo(psexo);
        this.peso=0.0;
        this.altura=0.0;
    }
    /////CONSTRUCTOR RAPIDO/////////////
    public Persona(String pnombre, char psexo, int pedad){
        this.nombre=pnombre;
        this.edad=pedad;
        this.dni=generaDNI();
        this.sexo=comprobarSexo(psexo);
        this.peso=0.0;
        this.altura=0.0;
    }
    /////CONSTRUCTOR CON TODOS LOS ATRIBUTOS//////
    public Persona(String pnombre, int pedad, char psexo, double ppeso, double paltura){
        this.nombre=pnombre;
        this.edad=pedad;
        this.dni=generaDNI();
        this.sexo=comprobarSexo(psexo);
        this.peso=ppeso;
        this.altura=paltura;
    }
    ///////////////////METODOS///////////////
    private String generaDNI(){
            Random random = new Random();
            int numero = random.nextInt(90000000);
            int letra=numero%23;
            if (letra==0) {
                System.out.println("T");
            }
            if (letra==1) {
                System.out.println("R");
            }
            if (letra==2) {
                System.out.println("W");
            }
            if (letra==3) {
                System.out.println("A");
            }
            if (letra==4) {
                System.out.println("G");
            }
            if (letra==5) {
                System.out.println("M");
            }
            if (letra==6) {
                System.out.println("Y");
            }
            if (letra==7) {
                System.out.println("F");
            }
            if (letra==8) {
                System.out.println("P");
            }
            if (letra==9) {
                System.out.println("D");
            }
            if (letra==10) {
                System.out.println("X");
            }
            if (letra==11) {
                System.out.println("B");
            }
            if (letra==12) {
                System.out.println("N");
            }
            if (letra==13) {
                System.out.println("J");
            }
            if (letra==14) {
                System.out.println("Z");
            }
            if (letra==15) {
                System.out.println("S");
            }
            if (letra==16) {
                System.out.println("Q");
            }
            if (letra==17) {
                System.out.println("V");
            }
            if (letra==18) {
                System.out.println("H");
            }
            if (letra==19) {
                System.out.println("L");
            }
            if (letra==20) {
                System.out.println("C");
            }
            if (letra==21) {
                System.out.println("K");
            }
            if (letra==22) {
                System.out.println("E");
            }
        String dni=numero+""+letra;
        return (dni);
    }
    private char comprobarSexo(char psexo){
        if (psexo == 'M' || psexo == 'H'){
            return psexo;
        }else{
            psexo='M';
            return psexo;
        }
    }
    public boolean esMayorDeEdad(int pedad){
        if (pedad>=18){
            return true;
        }else{
            return false;
        }
    }
    public int calcularIMC(double ppeso){
        int sobrepeso=1;
        int peso_ideal=0;
        int peso_bajo=-1;
        double imc = peso / (altura*altura);
        if(altura<=0){
            return sobrepeso;
        }else  if (imc < 18) {
            return peso_bajo;
        }else if (imc < 25 ) {
            return peso_ideal;
        }else{
            return sobrepeso;
        }
    }
    ////////////TOSTRING////////////////
    public String toString(){
        return "Nombre: "+nombre+" Edad: "+edad+" DNI: "+dni+" Sexo: "+sexo+" Peso: "+peso+" Altura: "+altura+" m";
    }
    /////////////////CLONE////////////////
    public Persona clone(){
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    /////////////////GETTERS Y SETTERS////////////
    public void setNombre(String pnombre){
        this.nombre=pnombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int pedad){
        this.edad=pedad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setSexo(char psexo){
        this.sexo=psexo;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setPeso(double ppeso){
        this.peso=ppeso;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setAltura(double paltura){
        this.altura=paltura;
    }
    public double getAltura(){
        return this.altura;
    }
    ////////////////EQUALS//////////////
    
}