package cl.salmontt.model;

public class UnidadOperativa {

    private String id;
    private String tipo;
    private String nombre;
    private String comuna;

    public UnidadOperativa (String id,String tipo, String nombre, String comuna){
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + '\n' +
                "Tipo: " + getTipo() + '\n' +
                "Nombre: " + getNombre() + '\n' +
                "Comuna: " + getComuna();

    }
}
