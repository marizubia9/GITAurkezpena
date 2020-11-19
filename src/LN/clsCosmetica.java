package LN;

public class clsCosmetica extends clsProducto
{
	private String tipo; 
	private int stock;
	
	
	public clsCosmetica( String nombre,double precio, String descripcion, String marca, 
			long codigo, String tienda, int stock,  
			String tipo, boolean sexo, String img)
	{
		super( nombre, precio,  descripcion,  marca,  codigo,  tienda, sexo, img);
		this.stock=stock;
		this.tipo=tipo;
	}
	public void prueba()
	{
		
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void fetch()
	{
		
	}

	@Override
	public String toString() {
		return "clsCosmetica [tipo=" + tipo + ", stock=" + stock + "]";
	}

	
}
