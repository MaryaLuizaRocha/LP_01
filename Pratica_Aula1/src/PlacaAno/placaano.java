package PlacaAno;
import java.util.Scanner;
public class placaano {
	
	public static void main(String[] args){
		
			Scanner entrada = new Scanner(System.in);
			String placa1 ;
			String placasubs; 
			short ano = 0;
			
			System.out.println("Placa do carro: ");
			placa1 = entrada.nextLine();
			
			System.out.println("Ano de fabrica��o do carro: ");
			ano = entrada.nextShort();
			placasubs = placa1
				.replace("a", "*")
				.replace("e", "*")
				.replace("i", "*")
				.replace("o", "*")
				.replace("u", "*")
				.replace("A", "*")
				.replace("E", "*")
				.replace("I", "*")
				.replace("O", "*")
				.replace("U", "*");
			
			System.out.println("A placa do carro �: " + placasubs);
			if (ano <= 2010){
			System.out.println("Carro velho");}
			else if (ano <= 2021){
			System.out.println("Carro Semi Novo");}
			else if (ano <= 2022){
			System.out.println("Carro Novo");}
			else
			System.out.println("Digite um ano v�lido at� 2022");}

			private static void replace(String string, String string2) {
		}		
	}
