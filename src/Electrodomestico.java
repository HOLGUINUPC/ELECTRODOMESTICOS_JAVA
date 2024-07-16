public class Electrodomestico {

    protected final static String COLORDEF = "Blanco";
    protected final static char CONNENERDEF = 'F';
    protected final static double PRECIOBASEDEF = 100;
    protected final static double pesodefe = 5;

    protected double precioBase;
    protected String color;
    protected char consumoEnergético;
    protected double peso;

    public Electrodomestico() {
        this(PRECIOBASEDEF, COLORDEF, CONNENERDEF, pesodefe);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, COLORDEF, CONNENERDEF, peso);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergético, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergético = consumoEnergético;
        this.peso = peso;

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergético() {
        return consumoEnergético;
    }

    public void setConsumoEnergético(char consumoEnergético) {
        this.consumoEnergético = consumoEnergético;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        switch (consumoEnergético) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                // No se hace nada, ya que el valor es válido
                break;
            default:
                // Si el valor no es válido, se asigna el valor por defecto
                consumoEnergético = CONNENERDEF;
                break;
        }
    }

    public void comprobarColor() {
        switch (color) {
            case "amarillo":
            case "azul":
                break;
            default:
                color = COLORDEF;
                break;

        }
    }

    public double precioFinal() {
        double plus = 0;
        switch (consumoEnergético) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }
        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }
}
