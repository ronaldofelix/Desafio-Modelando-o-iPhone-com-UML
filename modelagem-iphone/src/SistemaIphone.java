import reprodutor.Ipod;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;
import navegador.NavegadorInternet;

public class SistemaIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutor = iphone;
        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.pararMusica();

        AparelhoTelefonico aparelhotf = iphone;
        aparelhotf.fazerChamada();
        aparelhotf.atenderChamada();
        aparelhotf.encerrarChamada();

        NavegadorInternet navegador = iphone;
        navegador.navegar();
        navegador.abrirPagina();
        navegador.atualizarPagina();
    }

}
