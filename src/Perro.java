public class Perro extends Animal {
    protected String Raza;

    //CONSTRUCTOR VACIO
    public Perro() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public Perro(String nombre, int edad, double peso, String propietario, String raza) {
        super(nombre, edad, peso, propietario);
        Raza = raza;
    }

    //GETTER Y SETTER
    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    //TOSTRING


    @Override
    public String toString() {
        return "Perro{" +
                "Raza='" + Raza + '\'' +
                '}';
    }

    //METODOS PROPIOS
    public double CalcularDosis(){
        double Dosis;
        Dosis = Peso*2;
        return Dosis;
    }

    public void MostrarInformacion(){
        System.out.println("El nombre del perro es: "+Nombre);
        System.out.println("El edad del perro es: "+Edad);
        System.out.println("El peso del perro es: "+Peso);
        System.out.println("El propietario del perro es: "+Propietario);
        System.out.println("La raza del perro es: "+Raza);
        System.out.println("La Dosis recomendada es: "+CalcularDosis()+"ml");
    }
}
