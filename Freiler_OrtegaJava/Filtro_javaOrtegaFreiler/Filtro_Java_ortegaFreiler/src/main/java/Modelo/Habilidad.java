package Modelo;

public class Habilidad {
    private int id_Ninja;
    private String Nombre;
    private String Descripcion;

    public Habilidad(int id_Ninja, String nombre, String descripcion) {
        this.id_Ninja = id_Ninja;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public int getId_Ninja() {
        return id_Ninja;
    }

    public void setId_Ninja(int id_Ninja) {
        this.id_Ninja = id_Ninja;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
