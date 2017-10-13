/**
* Alarma.java
* Andrea Arguello 17801
* 13/10/2017
*/


/**
* Heredada de Timbre, sobreescribe los metodos
*/
public class Alarma extends Timbre {
	/** Imprime alarma 1
	*/
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	 /** Imprime metodo m1 de la clase madre
	 */
	public void m2() {
		super.m1();
	}
	 
	 /** Imprime un String que usa los toStrings de la clase madre
	 */
	public String toString() {
		return super.toString() + "..." + super.toString();
	}
}
