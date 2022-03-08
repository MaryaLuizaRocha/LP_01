package Viagem;
import java.util.Scanner;
public class viagem {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int tempo = 0, velocidademedia = 0, distancia = 0;
		double valor = 0, litros = 5;
		
		System.out.println("Entre com o tempo gasto na viagem: ");
		tempo =  entrada.nextInt();
		System.out.println("Entre com a distância percorrida na viagem: ");
		distancia =  entrada.nextInt();
		System.out.println("Qual a quantidade de combustível gasta? ");
		litros =  entrada.nextDouble();
		
		velocidademedia = (distancia/tempo);
		valor = (distancia/litros);		
		
		System.out.println("Informações da viagem: ");
		System.out.println("O tempo gasto foi de: " + tempo + "h");
		System.out.println("Distância percorrida: " + distancia + "Km");
		System.out.println("A uma velocidade media de: " + velocidademedia + "Km/h");
		System.out.println("O valor final gasto foi de: " + valor);
	}
}

