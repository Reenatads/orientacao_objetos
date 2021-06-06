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
		Float imc = peso / ((altura/100) * (altura/100));
		StringBuilder result = new StringBuilder("IMC = " + imc + new DecimalFormat("#.#").format(imc) + "           " );
		if (imc.isNaN())
			return "Warning !";
		
		if(imc < 17) {
			result.append("Muito abaixo do peso");
		}else if(imc >= 17 && imc <= 18.49) {
			result.append("Abaixo do peso");
		}else if (imc > 18.49 && imc <= 24.99) {
			result.append("Peso normal");
		}else if (imc > 24.99 && imc <= 29.99) {
			result.append("Acima do peso");
		}else if ( imc > 29.99 && imc <= 34.99) {
			result.append("Obesidade I");
		}else if ( imc > 34.99 && imc <= 39.99) {
			result.append("Obesidade II (Severa)");
		}else if ( imc > 39.99) {
			result.append("Obesidade III (Mórbida)");
		}
		
		return result.toString();
		
	}
	@Override
	public String toString() {
		return "imcBean [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
	}
	
	
}
