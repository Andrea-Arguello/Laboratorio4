/**
* MilitarMain.java
* Andrea Arguello 17801
* 13/10/2017
*/

public class MilitarMain{
	public static void main(String[] args) {
	Soldado soldadito= new Soldado();
	Coronel coronel= new Coronel();
	General general= new General();
	Teniente teniente=new Teniente();
	Militar militar= new Militar();
	System.out.println("Datos generales (militar)");
	System.out.println("Horas:" + militar.getHoras());
	System.out.println("Vacaciones:" + militar.getDiasVacaciones());
	System.out.println("Salario:" + militar.getSalario());
	System.out.println("Formulario: " + militar.getFormularioVacaciones());
	
	System.out.println("\nDatos del soldado");
	System.out.println("Horas:" + soldadito.getHoras());
	System.out.println("Vacaciones:" + soldadito.getDiasVacaciones());
	System.out.println("Salario:" + soldadito.getSalario());
	System.out.println("Formulario: " + soldadito.getFormularioVacaciones());
	System.out.println("Recibe orden:");
	soldadito.recibeOrden();
	
	System.out.println("\nDatos del coronel");
	System.out.println("Horas:" + coronel.getHoras());
	System.out.println("Vacaciones:" + coronel.getDiasVacaciones());
	System.out.println("Salario:" + coronel.getSalario());
	System.out.println("Formulario: " + coronel.getFormularioVacaciones());
	System.out.println("Ejecuta maniobra:");
	coronel.ejecutaOrdenManiobra();
	
	System.out.println("\nDatos del general");
	System.out.println("Horas:" + general.getHoras());
	System.out.println("Vacaciones:" + general.getDiasVacaciones());
	System.out.println("Salario:" + general.getSalario());
	System.out.println("Formulario: " + general.getFormularioVacaciones());
	System.out.println("Planifica estrategia:");
	general.planificaEstrategia();
	
	System.out.println("\nDatos del teniente");
	System.out.println("Horas:" + teniente.getHoras());
	System.out.println("Vacaciones:" + teniente.getDiasVacaciones());
	System.out.println("Salario:" + teniente.getSalario());
	System.out.println("Formulario: " + teniente.getFormularioVacaciones());
	System.out.println("Toma orden:");
	teniente.tomaOrdenCoronel("Presenten Armas!");
	}	
}