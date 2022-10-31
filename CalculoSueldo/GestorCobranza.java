public class GestorCobranza extends Empleado{
	private int dias;
	private float ventas;
	private float bono;
	private float porcentaje;
	private float sueldo;
	private float salario;

	public GestorCobranza(){
		dias=0;
		ventas=0;
		bono=0;
		porcentaje=0;
		sueldo=0;
		salario=0;
	}
	public void setDias(int dias){
		this.dias=dias;
	}
	public void setPorcentaje(float porcentaje){
		this.porcentaje=porcentaje;
	}
	public int getDias(){
		return dias;
	}
	public float getBono(){
		return bono;
	}
	public float getSalario(){
		return salario;
	}
	public float getVentas(){
		return ventas;
	}


	public void calculoSalario(){
	validaSueldo();
	bono=sueldo/100*10;
	salario=sueldo+bono;
	}
	private void validaSueldo(){
		if(dias<0)
		sueldo=0;
		else if(dias>0&dias<=10)
			sueldo=2000;
		else if(dias>10&dias<=20)
			sueldo=4000;
		else if(dias>20&dias<=30)
			sueldo=6000;
	}
	public void calculoSalario(float ventas){
		this.ventas=ventas;
		validaVentas();
		sueldo=porcentaje*ventas;
		//if(porcentaje=0.25f)
			//bono=500;
		salario=sueldo+bono;
	}
	private void validaVentas(){
		if(ventas>5000&ventas<=9000)
		porcentaje=.15f;
		else if(ventas>9000&ventas<=13000)
		porcentaje=.20f;
		else if(ventas>13000&ventas<=18000){
		porcentaje=.25f;
		bono=500;
	}
	else if(ventas>18000){
		porcentaje=.30f;
		bono=800;
	}
	}
}