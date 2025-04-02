package Modelo;

public class Mision {
    private int id;
    private String Descripcion;
    private String Rango;
    private int Recompesa;

    public Mision(int id, String descripcion, String rango, int recompesa) {
        this.id = id;
        Descripcion = descripcion;
        Rango = rango;
        Recompesa = recompesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String rango) {
        Rango = rango;
    }

    public int getRecompesa() {
        return Recompesa;
    }

    public void setRecompesa(int recompesa) {
        Recompesa = recompesa;
    }
}
