package archivo;

public class Atraccion {
    String nombre;

    public Atraccion(String nombre, int costo, double tiempoRequerido, int cupo, TipoAtraccion tipo) {
    }
    public String getNombre(){
        return this.nombre;
    }
    public Atraccion getAtraccion(){
        return this;
    }
}
