package cantantes;

import java.util.Scanner;

public class TestCantantesFamosos {
    public static void main(String[] args) {

        System.out.println("\n\t\t\tDISQUERA UMB LOS PEPINOS\n");
        ListaCantantesFamosos lista = new ListaCantantesFamosos();
        Scanner scint = new Scanner(System.in);
        Scanner sc2String = new Scanner(System.in);
        boolean seguirIntroduciendo = true;

        // Add default singers
        CantanteFamoso cantante1 = new CantanteFamoso("Bruno Mars", " It's Better If You Don't Understand", 110000000);
        CantanteFamoso cantante2 = new CantanteFamoso("Maroon 5", "We Like Digging", 25000000);
        lista.anadirCantanteFamoso(cantante1);
        lista.anadirCantanteFamoso(cantante2);

        while (seguirIntroduciendo){
            // options to show
            System.out.print("SELECT AN OPTION:");
            System.out.println("""

                    1. Add:
                    2. Deleted
                    3. Update
                    4. Show singers sorted by sales
                    5. go out""");
            System.out.print("Option:");
            int opcion = scint.nextInt();

            switch (opcion) {
                case 1 -> {
                    // data to the user
                    System.out.println("Enter the name of the singer:");
                    String nombre = sc2String.nextLine();
                    System.out.println("Enter the album with the most sales of the singer:");
                    String discoConMasVentas = sc2String.nextLine();
                    System.out.println("Enter the number of records sold:");
                    int numeroDeVentas = scint.nextInt();

                    // Create object
                    CantanteFamoso cantante = new CantanteFamoso(nombre, discoConMasVentas, numeroDeVentas);

                    // add to list
                    System.out.println("Printing the list with the singer: "+ nombre);
                    lista.anadirCantanteFamoso(cantante);

                    // show updated list
                    lista.mostrarCantantesFamosos();
                }
                case 2 -> {
                    // delete singer
                    System.out.println("Enter the name of the singer you want to remove:");
                    String nombreAEliminar = sc2String.nextLine();

                    // dele singer to list
                    lista.eliminarCantanteFamoso(nombreAEliminar);

                    // show updated list
                    lista.mostrarCantantesFamosos();
                }
                case 3 -> {
                    // update list
                    System.out.println("Enter the name of the singer you want to modify:");
                    String nombreAModificar = sc2String.nextLine();
                    System.out.println("Enter the new name:");
                    String nuevoNombre = sc2String.nextLine();

                    //update the name singer
                    lista.modificarNombreCantante(nombreAModificar, nuevoNombre);

                    // show updated list
                    lista.mostrarCantantesFamosos();
                }
                case 4 ->
                    // show  list sorted by sales
                        lista.mostrarCantantesOrdenadosPorVentas();
                case 5 ->
                    // Salir del programa
                        seguirIntroduciendo = false;
                default -> System.out.println("Invalid option.");

            }
            System.out.println();
        }

    }

}
