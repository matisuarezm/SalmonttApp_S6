package cl.salmontt.model;

public class PlantaProceso extends UnidadOperativa{

    private double capacidadProceso;

    public PlantaProceso(String id, String tipo, String nombre, String comuna, double capacidadProceso) {
        super(id, tipo, nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    public double getCapacidadProceso(){ return capacidadProceso;}

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Capacidad: " + getCapacidadProceso();
    }
}
