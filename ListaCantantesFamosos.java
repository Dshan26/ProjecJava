package cantantes;

import java.util.ArrayList;

public class ListaCantantesFamosos {
    private final ArrayList<CantanteFamoso> listaCantantesFamosos;

    public ListaCantantesFamosos() {
        this.listaCantantesFamosos = new ArrayList<CantanteFamoso>();
    }

    public void anadirCantanteFamoso(CantanteFamoso cantante) {
        this.listaCantantesFamosos.add(cantante);
    }

    public void mostrarCantantesFamosos() {
        for (CantanteFamoso cantante : this.listaCantantesFamosos) {
            System.out.println("Singer: " + cantante.getNombre() + ", best selling record: " + cantante.getDiscoConMasVentas());
        }
    }

    public void eliminarCantanteFamoso(String nombre) {
        this.listaCantantesFamosos.removeIf(cantante -> cantante.getNombre().equals(nombre));
    }

    public void modificarNombreCantante(String nombreAnterior, String nombreNuevo) {
        for (CantanteFamoso cantante : this.listaCantantesFamosos) {
            if (cantante.getNombre().equals(nombreAnterior)) {
                cantante.setNombre(nombreNuevo);
            }
        }
    }
    public void mostrarCantantesOrdenadosPorVentas() {
        this.listaCantantesFamosos.sort((cantante1, cantante2) -> cantante2.getNumeroDeVentas() - cantante1.getNumeroDeVentas());

        System.out.println("Singers ordered by number of albums sold:");
        for (CantanteFamoso cantante : this.listaCantantesFamosos) {
            System.out.println("Singer: " + cantante.getNombre() + ",Number of records sold : " + cantante.getNumeroDeVentas());
        }
    }


}
