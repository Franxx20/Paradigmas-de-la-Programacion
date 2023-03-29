package producto;

import java.util.Objects;

public class Producto {
	protected String codigo;
	protected String descripcion;
	protected double precio;
	protected int stock;
	
	public Producto(String codigo, String descripcion, double precio, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public Producto(Producto otro) {
		this.codigo = otro.codigo;
		this.descripcion = otro.descripcion;
		this.precio = otro.precio;
		this.stock = otro.stock;	
	}
	public void actualizarStock(int stock) {
		this.stock+= stock;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, precio, stock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descripcion, other.descripcion)
				&& Float.floatToIntBits((float) precio) == Float.floatToIntBits((float) other.precio) && stock == other.stock;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
	


}
