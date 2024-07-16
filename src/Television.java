public class Television extends Electrodomestico {

    private final static int RESOLUCIONDEF = 20;
    private final static boolean SINTONIZADORTDTDEF = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this(PRECIOBASEDEF, pesodefe, CONNENERDEF, COLORDEF, RESOLUCIONDEF, SINTONIZADORTDTDEF);
    }

    /**
     * Constructor con 2 parametros
     * 
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso) {
        this(precioBase, peso, CONNENERDEF, COLORDEF, RESOLUCIONDEF, false);
    }

    /**
     * Contructor con 6 parametros
     * 
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
            boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
