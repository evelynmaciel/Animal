public class Animal {
    private String Nombre, tipoDeAlimentacion;
    private int edad;
    
    public Animal(String Nombre, String tipoDeAlimentacion, int edad) {
        this.Nombre = Nombre;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.edad = edad;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Animal [Nombre=" + Nombre + ", tipoDeAlimentacion=" + tipoDeAlimentacion + ", edad=" + edad + "]";
    }

}