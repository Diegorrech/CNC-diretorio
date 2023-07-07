
public class Diretorio_cnc {

	public static void main(String[] args) {

		Programa a1 = new Programa();
		a1.dataPrograma = "19/05/2001";
		a1.codigoPrograma = 9517;
		a1.codigoPeca = "bd/napa";

		Peca b1 = new Peca();
		b1.alturaCuboPeca = 70.50;
		b1.AlturaGeralPeca = 150.80;
		b1.alturaOffSetPeca = 59.6;
		b1.diametroPeca = 420.50;
		b1.diametroCalibracaoPeca = 105.282;

		Codigos_program c1 = new Codigos_program();
		c1.codFaceamento = "G1/G0/G2/G3";
		c1.codAvaco_tools = "F";
		c1.codRotacao = "S";
		c1.cod_Lub = "M8/M9";
		c1.cod_Parada = "G4";
		c1.cod_Invert_spindle = "M3/M4";
		
		Instrumentos_medicao m1 = new Instrumentos_medicao();
		m1.Paq_Conv = "paquimentro covencional  tol 0.02mm";
		m1.Calib = "calibrador 112 tol +0.002mm";
		m1.Paq_Prof = "paquimetro profundidade  tol 0.02mm";
		

		System.out.println(" definido a data de criacao do programa " + a1.dataPrograma);
		System.out.println(" definido o codigo deste programa " + a1.codigoPrograma);
		System.out.println(" definido o codigo da peca que vai ser usinada " + a1.codigoPeca);
		System.out.println();
		System.out.println(" medidas em relacao ao desenho tecnico das pecas ");
		System.out.println(" diametro toltal da peca " + b1.diametroPeca + "mm");
		System.out
				.println(" medida em relcao a calibracao do eixo central da peca " + b1.diametroCalibracaoPeca + "mm");
		System.out.println(" altura em relacao ao cubo da peca " + b1.alturaCuboPeca + "mm");
		System.out.println(" medida em relacao a altura geral da peca " + b1.AlturaGeralPeca + "mm");
		System.out
				.println(" medida de offset em relcao a pista de frenagem entre o cubo " + b1.alturaOffSetPeca + "mm");
		System.out.println();
		System.out.println();
		System.out.println(" Relacao de codigos necessarios para executar a usinagem deste peca ");
		System.out.println();
		System.out.println(" Para executar uma operacao de faceamento ==> " + c1.codFaceamento);
		System.out.println(" Para definir o avanco da ferramenta de corte ==> " + c1.codAvaco_tools);
		System.out.println(" Para definir a rotacao da prlaca de fixacao da peca ==>" + c1.codRotacao);
		System.out.println(" Para acionar o oleo de refrigeracao durante a operacao ==>" + c1.cod_Lub);
		System.out.println(" Para definir uma parada programada durante a usinagem ==>" + c1.cod_Parada);
		System.out.println(" Para inverter o sentido de rotacao da placa de fixacao ==>" + c1.cod_Invert_spindle);
		System.out.println();
		System.out.println(" intrumentos medicao necessario para inspecao deste produto ");
		System.out.println();
		System.out.println("*dispositivo para utilizar na medida "  +  b1.diametroCalibracaoPeca +"mm  " +  m1.Calib);
		System.out.println();
		System.out.println("*dispositivo para utilizar na medida "  +  b1.diametroPeca +"mm  " +  m1.Paq_Conv);
		System.out.println();
		System.out.println("*dispositivo para utilizar na medida "  +  b1.AlturaGeralPeca +"mm  " +  m1.Paq_Prof);
		

	}

}
