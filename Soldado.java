/**
* Soldado.java
* Andrea Arguello 17801
* 13/10/2017
*/

/**Heredada de Militar
*/
public class Soldado extends Militar
{
/**
	@return: horas
	*/
	public int getHoras()
	{
		return super.getHoras()*2;
	}
	
	/**
	@return: salario
	*/
	public double getSalario()
	{
		return super.getSalario() - 10000.0;
	}
	
	/**
	@return: vacaciones
	*/
	public int getVacaciones()
	{
		return super.getVacaciones()/2;
	}
	
	/** Recibe orden
	*/
	public void recibeOrden()
	{
		System.out.println("Ordene mi General");
	}
}
