public class SistemaCadrastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa();
		
		marcos.setEndereco("Rua das Ostras");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
