
public class Main {

    public static void main(String[] args) {

        ProductoAlimenticio alimento = new ProductoAlimenticio(
                "A001", "Aceite de girasol", 1000, 5
        );

        Electrodomestico electrodomestico = new Electrodomestico(
                "E001", "Heladera", 100000, 24
        );

        System.out.println("=== REPORTE DE PRODUCTOS ===\n");

        alimento.mostrarInformacion();

        System.out.println();

        electrodomestico.mostrarInformacion();
    }
}
