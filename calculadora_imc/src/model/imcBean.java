package model;

import java.text.DecimalFormat;

public class imcBean {
	private float peso;
	private float altura;
	public imcBean() {
		
	}
	
	public imcBean(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}	public float getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")==false ? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(altura));
	}
	
	public String getResult() {
		Float imc = (peso / (altura * altura));
		StringBuilder result = new StringBuilder("IMC = " + imc + new DecimalFormat("#.#").format(imc) + "           " );
		if (imc.isNaN())
			return "Warning !";
		
		if(imc <= 18.5) {
			result.append("Abaixo do peso");
		}else if(imc > 18.5 && imc <= 24.4) {
			result.append("Peso Normal");
		}else if (imc > 24.4 && imc <= 29.9) {
			result.append("Sobrepeso");
		}else if (imc > 29.9 && imc <= 34.9) {
			result.append("Obesidade I");
		}else if ( imc > 34.9) {;
			result.append("Obesidade II");
		}
		
		return result.toString();
		
	}
	@Override
	public String toString() {
		return "imcBean [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}
	
	
}
