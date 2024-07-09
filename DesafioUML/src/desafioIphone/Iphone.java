package desafioIphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Discando os numeros...");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo a ligacao...");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando um correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina web solicitada...");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Exibindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina atual...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica escolhida...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica em execucao...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica escolhida...");
    }
}
