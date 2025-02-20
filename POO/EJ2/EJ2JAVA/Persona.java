package POO.EJ2.EJ2JAVA;
import java.util.Random;
public class Persona{
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;
    private static final int sobrePeso=1;
    private static final int pesoIdeal=0;
    private static final int pesoBajo=-1;

    //////CONSTRUCTOR POR DEFECTO//////
    public Persona(){
        this.nombre="Mikel";
        this.edad=18;
        this.dni=generaDNI();
        this.sexo="H";
        this.peso=70;
        this.altura=181;
    }
    /////CONSTRUCTOR RAPIDO/////////////
    public Persona(String pnombre, String psexo, int pedad){
        this.nombre=pnombre;
        this.edad=pedad;
        this.dni=generaDNI();
        this.sexo=comprobarSexo(psexo);
        this.peso=0.0;
        this.altura=0.0;
    }
    /////CONSTRUCTOR CON TODOS LOS ATRIBUTOS//////
    public Persona(String pnombre, int pedad, String psexo, double ppeso, double paltura){
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
            char letraDni = 0;
            if (letra == 0) {
                letraDni = 'T';
            }
            if (letra == 1) {
                letraDni = 'R';
            }
            if (letra == 2) {
                letraDni = 'W';
            }
            if (letra == 3) {
                letraDni = 'A';
            }
            if (letra == 4) {
                letraDni = 'G';
            }
            if (letra == 5) {
                letraDni = 'M';
            }
            if (letra == 6) {
                letraDni = 'Y';
            }
            if (letra == 7) {
                letraDni = 'F';
            }
            if (letra == 8) {
                letraDni = 'P';
            }
            if (letra == 9) {
                letraDni = 'D';
            }
            if (letra == 10) {
                letraDni = 'X';
            }
            if (letra == 11) {
                letraDni = 'B';
            }
            if (letra == 12) {
                letraDni = 'N';
            }
            if (letra == 13) {
                letraDni = 'J';
            }
            if (letra == 14) {
                letraDni = 'Z';
            }
            if (letra == 15) {
                letraDni = 'S';
            }
            if (letra == 16) {
                letraDni = 'Q';
            }
            if (letra == 17) {
                letraDni = 'V';
            }
            if (letra == 18) {
                letraDni = 'H';
            }
            if (letra == 19) {
                letraDni = 'L';
            }
            if (letra == 20) {
                letraDni = 'C';
            }
            if (letra == 21) {
                letraDni = 'K';
            }
            if (letra == 22) {
                letraDni = 'E';
            }

        String pdni=numero+""+letraDni;
        return pdni;
    }
    private String comprobarSexo(String psexo){
        if (psexo == "M" || psexo == "H" || psexo == "NB" ){
            return psexo;
        }else{
            psexo="M";
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
    public int calcularIMC(double ppeso, double paltura){
        double imc = ppeso / (paltura*paltura);
        if(paltura<=0){
            return this.sobrePeso;
        }else  if (imc < 18) {
            return this.pesoBajo;
        }else if (imc < 25 ) {
            return this.pesoIdeal;
        }else{
            return this.sobrePeso;
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
    public void setSexo(String psexo){
        this.sexo=psexo;
    }
    public String getSexo(){
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
     public void setDni(String pdni){
        this.dni=pdni;
    }
    public String getDni(){
        return this.dni;
    }
    ////////////////EQUALS//////////////
    public boolean equals(Persona p){
        if (this.nombre != p.getNombre()){
            return false;
        }
        else if (this.edad != p.getEdad()){
            return false;
        }
        else if (this.sexo != p.getSexo()){
            return false;
        }
        else if (this.peso != p.getPeso()){
            return false;
        }
        else if (this.altura != p.getAltura()){
            return false;
        }
        else if (this.dni != p.getDni()){
            return false;
        }
        else{
            return true;
        }
    }   
}