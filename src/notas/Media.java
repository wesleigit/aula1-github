package notas;

public class Media {
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	
	public double calcularMedia() {
		double somaNotas = primeiraNota + segundaNota + terceiraNota;
		return somaNotas / 3;
	}
	
	public String situacaoDoAluno() {
		double media = calcularMedia();
		
		if (media < 60) {
			return "Grade final: " + String.format("%.2f", media) + ", Reprovado Faltou: " + String.format("%.2f",(60 - media));
		}
		else {
			return "Grade final: " + String.format("%.2f", media) + ", Aprovado";
		}			
	}

}
