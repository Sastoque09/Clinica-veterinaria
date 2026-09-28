public class Animal {
    protected String Nombre;
    protected int Edad;
    protected double Peso;
    protected String Propietario;

    //CONSTRUCTOR VACIO
    public Animal() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public Animal(String nombre, int edad, double peso, String propietario) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Propietario = propietario;
    }

    //GETTER Y SETTER
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Animal{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Propietario='" + Propietario + '\'' +
                '}';
    }

}
