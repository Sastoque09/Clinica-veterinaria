//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //OBJETOS PERRO
    Perro P1 = new Perro("Max",3,12,"Juan","Golden");
    Perro P2 = new Perro("Can",6,10,"David","Pastor aleman");

    //OBJETOS GATO
    Gato G1 = new Gato("Michelino",4,8,"Daniel","Interior");
    Gato G2 = new Gato("Miauricio",3,6,"Julian","Interior");

    //INFORMACION PERROS
    System.out.println("--> Informacion perro P1 <--");
    P1.MostrarInformacion();
    System.out.println();

    System.out.println("--> Informacion perro P2 <--");
    P2.MostrarInformacion();
    System.out.println();

    //INFORMACION GATOS
    System.out.println("--> Informacion perro Gato G1 <--");
    G1.MostrarInformacion();
    System.out.println();

    System.out.println("--> Informacion perro Gato G2 <--");
    G2.MostrarInformacion();
    System.out.println();
}
