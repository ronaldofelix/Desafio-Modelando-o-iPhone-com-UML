import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void navegar() {
        System.out.println("Navegando via Iphone");
    }

    public void abrirPagina() {
        System.out.println("Abrindo página via Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página via Iphone");
    }

    public void fazerChamada() {
        System.out.println("Fazendo chamada via Iphone");
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada via Iphone");
    }

    public void encerrarChamada() {
        System.out.println("Encerrando chamada via Iphone");
    }

    public void tocarMusica() {
        System.out.println("Tocando música via Iphone");
    }

    public void pausarMusica() {
        System.out.println("Pausando música via Iphone");
    }

    public void pararMusica() {
        System.out.println("Parando música via Iphone");
    }

}
