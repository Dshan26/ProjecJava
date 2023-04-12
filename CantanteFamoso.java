package cantantes;

public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;
    private int numeroDeVentas;

    public CantanteFamoso(String nombre, String discoConMasVentas, int numeroDeVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
        this.numeroDeVentas = numeroDeVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso [nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + ", numeroDeVentas="
                + numeroDeVentas + "]";
    }

}
