package arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 5.3;
		notasAlunoA[2] = 7.7;
//		notasAlunoA[3] = 4.2; OUT OF RANGE
		
		double totalA = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA+=notasAlunoA[i];
		}
		
		System.out.println("A media do alunoA é " + totalA / notasAlunoA.length);
		
		double[] notasAlunoB = {3.2, 5.7, 2.3};
		double totalB = 0;
		for(double nota: notasAlunoB) {
			totalB += nota;
		}
		
		System.out.println("A media do alunoB é " + totalB / notasAlunoB.length);
		
		
	}
}
