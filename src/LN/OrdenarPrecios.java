package LN;

import java.util.Comparator;

public class OrdenarPrecios implements Comparator<clsProducto>
{

	@Override
	public int compare(clsProducto prd_1, clsProducto prd_2) 
	{
		int diferencia;
		diferencia= (int) (prd_1.getPrecio()-prd_2.getPrecio());
		System.out.println(diferencia);
		System.out.println(prd_1.toString());
		return diferencia;
	}

}
