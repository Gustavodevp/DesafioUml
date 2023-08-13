public class Main {
    public static void main(String[] args) {
    iPhone iphone = new iPhone();
    iphone.tocar();
    iphone.atender();
    iphone.ligar("34999968920");

    iphone.exibirPagina("https://www.dio.com");

        Musica musica = new Musica("Nome da Música");

        iphone.selecionarMusica(musica);

        iphone.atualizarPagina();

    }
}
