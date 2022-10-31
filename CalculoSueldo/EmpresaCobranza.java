import java.io.*;
public class EmpresaCobranza{
	public static void main(String args[])throws IOException{
	InputStreamReader ent=new InputStreamReader(System.in);
	BufferedReader al=new BufferedReader(ent);
	GestorCobranza obj=new GestorCobranza();
	int op,centinela=0;
	boolean bandera=true;
	while(bandera){
		System.out.println("\n\nMenu de Opciones\n");
		System.out.println("1.-Ingresar Datos Trabajador");
		System.out.println("2.-Sueldo Por Dia");
		System.out.println("3.-Sueldo Por Ventas");
		System.out.println("4.-Imprimir");
		System.out.println("5.-Salir");
		System.out.println("Elige una opcion de l menu");
		op=Integer.parseInt(al.readLine());
	if(op==1){
	System.out.println("Ingrese el nombre del Trabajador");
	obj.setNombre(al.readLine());
	System.out.println("Ingrese la clave del Trabajador");
	obj.setClave(al.readLine());
	}
	else if(op==2){
	System.out.println("Ingrese el numero de dias Trabajados");
	obj.setDias(Integer.parseInt(al.readLine()));
	obj.calculoSalario();
	centinela=1;
	}
	else if(op==3){
	System.out.println("Ingrese el numero de Ventas Realizadas($)");
	obj.calculoSalario(Float.parseFloat(al.readLine()));
	centinela=2;
	}
	else if(op==4){
	System.out.println("Trabajador:"+obj.getNombre());
	System.out.println("Clave:"+obj.getClave());
	if(centinela==1){
	System.out.println("SUELDO POR DIAS TRABAJADOS");
	System.out.println("Dias Trabajados:"+obj.getDias());
	System.out.println("Bono:"+obj.getBono());
	System.out.println("Salario:"+obj.getSalario());
	}
	else if(centinela==2){
	System.out.println("SUELDO POR VENTAS");
	System.out.println("Ventas Realizadas($):"+obj.getVentas());
	System.out.println("Salario:"+obj.getSalario());
	System.out.println("Bono:"+obj.getBono());
	}
	}
	else if(op==5)
		bandera=false;
	else 
	System.out.println("ERROR:opcion Invalida, Intente de Nuevo");
	}
}
}