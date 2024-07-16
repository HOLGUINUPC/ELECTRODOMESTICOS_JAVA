public class Lavadora extends Electrodomestico {

    private final static int CARGADEF = 5;

    private int carga;

    public Lavadora() {
        this(PRECIOBASEDEF, COLORDEF, CONNENERDEF, pesodefe, CARGADEF);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, COLORDEF, CONNENERDEF, peso, CARGADEF);
    }

    public Lavadora(double precioBase, String color, char consumoEnergético, double peso, int carga) {
        super(precioBase, color, consumoEnergético, peso);

    }

    public int getCarga() {
        return carga;
    }

    public double precioFinal() {
        // Invocamos el método precioFinal del método padre
        double plus = super.precioFinal();

        // añadimos el código necesario
        if (carga > 30) {
            plus += 50;
        }

        return plus;
    }

}