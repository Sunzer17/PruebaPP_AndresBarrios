package model;

public class CuentaAhorro extends CuentaCorriente {
	
	Double interes;
	
	public CuentaAhorro(String numCuenta, Double valorSaldo,Double interes) {
		super(numCuenta, valorSaldo);
		this.interes = interes;
	}
	
	public CuentaAhorro(String numCuenta, Double valorSaldo) {
		super(numCuenta, valorSaldo);
		this.interes = 15.3;
	}
	
	public void calcularInteres() {
		setValorSaldo(getValorSaldo() * 1.153);	
	}

	
	
	

}
