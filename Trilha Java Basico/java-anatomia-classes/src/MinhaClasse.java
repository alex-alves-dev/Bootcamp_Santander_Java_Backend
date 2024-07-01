public class MinhaClasse {

public static void main(String[] args) {
    
    String primeiroNome = "Alex";
    String segundoNome = "Alves";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
 
    System.err.println(nomeCompleto);
}    

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    
}

}
