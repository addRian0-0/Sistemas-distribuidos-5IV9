package Telefono;

public class Tecla {

    private int tecla;
    private String caracteres;
    
    public Tecla(){}

    public Tecla(int tecla, String caracteres) {
        this.tecla = tecla;
        this.caracteres = caracteres;
    }

    public int getTecla() {
        return tecla;
    }

    public void setTecla(int tecla) {
        this.tecla = tecla;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }
    
}
