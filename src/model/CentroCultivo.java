package model;

public class CentroCultivo extends UnidadOperativa{

    private double toneladasProduccion;

    public CentroCultivo(String id, String tipo, String nombre, String comuna, double toneladasProduccion) {
        super(id, tipo, nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public double getToneladasProduccion() {
        return toneladasProduccion;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Toneladas: " + getToneladasProduccion();
    }
}
