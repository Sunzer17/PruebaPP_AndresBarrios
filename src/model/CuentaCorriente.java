package model;

public class CuentaCorriente {
	
	private String apellidos;
	private String nombres;
	private String numCuenta;
	private Double valorSaldo;
		
	public CuentaCorriente(String apellidos, String nombres, String numCuenta, Double valorSaldo) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.numCuenta = numCuenta;
		this.valorSaldo = valorSaldo;
	}

	public CuentaCorriente(String numCuenta, Double valorSaldo) {
		this.numCuenta = numCuenta;
		this.valorSaldo = valorSaldo;
	}
	
	public void ingresarEnCuenta(Double valorIngreso) {
		this.valorSaldo += valorIngreso;
	}
	
	public void retirarEnCuenta(Double valorRetiro) {
		this.valorSaldo -= valorRetiro;
	}
	
	@Override
	public String toString() {
		return "El numero de cuenta es" + this.numCuenta + "\n El saldo actual es: " + this.valorSaldo; 
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public Double getValorSaldo() {
		return valorSaldo;
	}
	public void setValorSaldo(Double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	
}
