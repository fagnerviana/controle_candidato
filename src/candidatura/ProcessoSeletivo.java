package candidatura;
import java.util.concurrent.*;

public class ProcessoSeletivo {

	public static void main(String[] args) {

				selecaoCandidatos();

	}
	
	static void selecaoCandidatos() {
		
		String[] candidatos = {"Joel","Maria","Teresa","Robert","Camila", "Diego","Joel","Flavio","Fabio"};
		int candidatosSelecionados=0;
		int candidatoAtual=0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados <5 && candidatoAtual < candidatos.length) {
			
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido=valorPretendido();
			
			System.out.println("O candidato "+candidato + " Solicitou este valor de salário "+salarioPretendido);
			if(salarioBase >=salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2300);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPretendido) {
			System.out.println("Liga para o candidato");
		} else if (salarioBase > salarioPretendido) {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}

	}

}
