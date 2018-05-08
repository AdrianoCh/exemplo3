package pucrs.s2b.exemplo03;

public class Medias {

	public static String calcular(double p1, double p2) {
		// TODO Auto-generated method stub
		double nota = (p1+p2)/2.0;
		if (nota >= 7) {
			return "Aprovado";
		} else if (nota >= 4.0) {
			return "Em exame";
		}
		else {
			return "Reprovado";
		}
	}

}
