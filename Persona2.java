public class Persona2 {
    // Atributos demográficos
    private String nombre;
    private int edad;
    protected String comida; // Atributo declarado como PROTECTED
    private String altura;    // Atributo declarado como PRIVATE
    protected String genero;

    // Constructores (puedes tener varios según tus necesidades)
    public Persona2(String nombre, int edad, String comida, String altura, String genero) {
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

    protected String getComida() {  // Método get declarado como PROTECTED
        return comida;
    }

    protected void setComida(String comida) {  // Método set declarado como PROTECTED
        this.comida = comida;
    }

    public String getAltura() {
        return altura;
    }

    private void setAltura(String altura) {  // Método set declarado como PRIVATE
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    // Métodos comer, dormir, tomarBaño
    public void comer(String comida) {
        System.out.println("Comiendo: " + comida);
    }

    public void dormir(int horas) {
        System.out.println("Durmiendo por " + horas + " horas");
    }

    protected void tomarBaño(String tipo) {  // Método declarado como PROTECTED
        System.out.println("Tomando un baño de tipo: " + tipo);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Persona2
        Persona2 persona = new Persona2("Maria", 30, "Ensalada", "1.65m", "Femenino");

        // Invocar atributos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Comida favorita: " + persona.getComida());
        // No podemos acceder directamente a setAltura ya que es PRIVATE
      

        // Invocar métodos
        persona.comer("Sushi");
        persona.dormir(8);
        persona.tomarBaño("Caliente");  // Invocamos el método protegido
    }
}