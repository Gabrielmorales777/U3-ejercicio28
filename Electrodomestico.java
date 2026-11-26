
public class Electrodomestico extends Producto {

    private int mesesGarantia;

    public Electrodomestico(String codigo, String descripcion,
                            double costoBase, int mesesGarantia) {

        super(codigo, descripcion, costoBase);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecioFinal() {
        double iva = costoBase * 21 / 100;
        double tasaAdicional = costoBase * 5 / 100;

        return costoBase + iva + tasaAdicional;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ELECTRODOMÉSTICO ===");
        super.mostrarInformacion();
        System.out.println("Garantía: " + mesesGarantia + " meses");
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}
