package es.studium.Refactorizacion;

public class EjercicioPrecio
{
	final int IVA = 21;
	
	public double calcularPrecio (int unidades, double precioUnitario) {
		
		double precioSinIva = unidades*precioUnitario;
		double precioConIva = precioSinIva*IVA;
		return precioConIva;
	}
}
