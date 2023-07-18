package utilitarios;

public abstract class ConversorDeMoeda {

	public static double conversorDeReaisParaDolares(double valorDolar,
			double quantidadeAConverter){ return valorDolar * quantidadeAConverter +
			(valorDolar * quantidadeAConverter * 0.06); }
}
