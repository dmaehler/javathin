
public class Atendente {

	
	
	public static void main(String[] args) {
		ContaCorrente minhaCC = new ContaCorrente("XX14-4");
		minhaCC.depositar(50F);
		
		System.out.println( minhaCC.getSaldo() );
		
		ContaCorrente c1 = new ContaCorrente("A9032-9");
		
		ContaCorrente c2 = new ContaCorrente("9023-3");
		
		minhaCC.sacar(20F);

		System.out.println( minhaCC.getSaldo() );
		
		boolean saqueEfetuado = minhaCC.sacar(50F);

		if (saqueEfetuado) {
			System.out.println( minhaCC.getSaldo() );
		} else {
			System.out.println("Não foi possível sacar");
			System.out.println("Você só tem " + minhaCC.getSaldo() +
					" seu mané.");
		}
		
		System.out.println("José: " + c1.getSaldo());
		
	}	
	
}
