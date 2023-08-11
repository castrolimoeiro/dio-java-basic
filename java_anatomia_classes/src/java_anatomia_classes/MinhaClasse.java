package java_anatomia_classes;

public class MinhaClasse {

	public static void main(String[] args) {
		System.out.println("Helloooooooo");
		
		int num$_1 = 1;		
		System.out.println(num$_1);
		
		
		String primeiroNome = "David";
		String segundoNome = "Castro";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	
		
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
