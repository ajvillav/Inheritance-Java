package domain;

public class Person {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
}
