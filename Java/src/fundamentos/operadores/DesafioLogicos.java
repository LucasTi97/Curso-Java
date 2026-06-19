package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabahlho na quita (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operadr Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		System.out.println("Comprou Tv 32\"Sorvere? " + comprouSorvete);
		System.out.println("Mais saudável " + maisSaudavel);
	}
}
