
public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "MARCOS");
		
		marcos.setEndereco("Rua das Ostras");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
