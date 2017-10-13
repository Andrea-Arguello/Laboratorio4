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
		return 80;
	}
	
	/**
	@return: salario
	*/
	public double getSalario()
	{
		return 30000.0;
	}
	
	/**
	@return: vacaciones
	*/
	public int getVacaciones()
	{
		return 5;
	}
	
	/** Recibe orden
	*/
	public void recibeOrden()
	{
		System.out.println("Ordene mi General");
	}
}