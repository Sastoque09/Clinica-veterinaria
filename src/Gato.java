public class Gato extends Animal {
    protected String Tipo;

    //CONSTRUCTOR VACIO
    public Gato() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public Gato(String nombre, int edad, double peso, String propietario, String tipo) {
        super(nombre, edad, peso, propietario);
        Tipo = tipo;
    }

    //GETTER Y SETTER
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Gato{" +
                "Tipo='" + Tipo + '\'' +
                '}';
    }

    //METODOS PROPIOS
    public double CalcularAlimento(){
        double Alimento;
        Alimento = Peso*15;
        return Alimento;
    }

    public void MostrarInformacion(){
        System.out.println("El nombre del gato es: "+Nombre);
        System.out.println("El edad del gato es: "+Edad);
        System.out.println("El peso del gato es: "+Peso);
        System.out.println("El propietario del gato es: "+Propietario);
        System.out.println("El tipo del gato es: "+Tipo);
        System.out.println("El alimento recomendado es: "+CalcularAlimento()+" gramos");
    }
}
