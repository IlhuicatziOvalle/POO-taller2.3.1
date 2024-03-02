package Practica_290223;

class Persona{
    // Atributos demográficos
    private String nombre;
    protected int edad;
    private String comida; 
    private String altura;    
    private String genero;

    // Constructores (puedes tener varios según tus necesidades)
    public Persona(String nombre, int edad, String comida, String altura, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.altura = altura;
        this.genero = genero;
    }

    // Métodos set y get para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getComida() {  
        return comida;
    }

    public void setComida(String comida) {  
        this.comida = comida;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {  
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    // Métodos comer, dormir, tomarBaño
    public void comer(String comida) {
        System.out.println("Comiendo: " + comida);
    }

    public void dormir(int horas) {
        System.out.println("Durmiendo por " + horas + " horas");
    }

    public void tomarBaño(String tipo) {  
        System.out.println("Tomando un baño de tipo: " + tipo);
    }
}
public class Accesos {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Maria", 30, "Ensalada", "1.65m", "Femenino");
        persona1.setGenero("femenino");
        persona1.comer("Sushi");
        persona1.dormir(8);
        persona1.tomarBaño("Caliente");  // Invocamos el método protegido
    }
}
