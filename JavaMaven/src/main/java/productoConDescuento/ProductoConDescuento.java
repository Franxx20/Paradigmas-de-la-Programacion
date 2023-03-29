package productoConDescuento;

import java.util.Objects;

import producto.Producto;

public class ProductoConDescuento extends Producto {

	private int descuento;

	public ProductoConDescuento(ProductoConDescuento otro) {
		super(otro);
		this.descuento = otro.descuento;

	}


	public ProductoConDescuento(String codigo, String descripcion, double d, int stock, int descuento) {
		super(codigo, descripcion, d, stock);
		this.descuento = descuento;
	}
	
	public double GetPrecioFinal() {
		return this.precio - (this.precio * (double) this.descuento) / 100;
	
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(descuento);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoConDescuento other = (ProductoConDescuento) obj;
		return descuento == other.descuento;
	}


	@Override
	public String toString() {
		return super.toString() + "ProductoConDescuento [descuento=" + descuento + "] [precio Final: " +this.GetPrecioFinal() + " ]";
	}

}
