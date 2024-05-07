public class Gato extends Animal{
    private String raza;
    public Gato(String Nombre, String tipoDeAlimentacion, int edad, String raza) {
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