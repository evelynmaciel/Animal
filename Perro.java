public class Perro extends Animal{
private String raza;
public Perro(String Nombre, String tipoDeAlimentacion, int edad, String raza) {
    super (Nombre, tipoDeAlimentacion, edad);
this.raza = raza ;

}
public String getRaza() {
    return raza;
}
public void setRaza(String raza) {
    this.raza = raza;
}
public void mostrar(){
    System.out.println(getNombre()+ "."+getTipoDeAlimentacion()+"."+getEdad()+"."+getRaza());
}
}