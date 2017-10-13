/** 
*AlarmaEmergencia.java
*Andrea Arguello 17801
*13/10/2017
*/


/**
*Clase heredada de Alarma, sobreescribe sus metodos
*/
public class AlarmaEmergencia extends Alarma
{
	/** Imprime emergencia 1
	*/
	public void m1()
	{
		System.out.println("emergencia 1");
	}
	
	/** Imprime metodos m1 y m2 de la clase madre
	*/
	public void m2()
	{
		super.m1();
		super.m2();
	}
	
	/** Imprime un String que usa los toStrings de la clase madre
	*/
	public String toString()
	{
		return "Emergencia " + super.toString();
	}
	
}