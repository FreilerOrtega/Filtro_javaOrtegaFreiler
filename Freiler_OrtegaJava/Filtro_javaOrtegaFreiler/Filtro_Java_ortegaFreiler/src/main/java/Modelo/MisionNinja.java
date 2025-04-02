package Modelo;

public class MisionNinja {
    private int id_Ninja;
    private int id_Mision;
    private  String FechaInicio;
    private  String FechaFin;

    public MisionNinja(int id_Ninja, int id_Mision, String fechaInicio, String fechaFin) {
        this.id_Ninja = id_Ninja;
        this.id_Mision = id_Mision;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }

    public int getId_Ninja() {
        return id_Ninja;
    }

    public void setId_Ninja(int id_Ninja) {
        this.id_Ninja = id_Ninja;
    }

    public int getId_Mision() {
        return id_Mision;
    }

    public void setId_Mision(int id_Mision) {
        this.id_Mision = id_Mision;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }
}
