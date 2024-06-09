package telefone;

public class Phone implements AparelhoTelefonico {

    public void fazerChamada() {
        System.out.println("REALIZANDO CHAMADA COM PHONE");
    }

    public void atenderChamada() {
        System.out.println("ATENDENDO LIGAÇÃO COM PHONE");
    }

    public void encerrarChamada() {
        System.out.println("ENCERRANDO LIGAÇÃO COM PHONE");
    }

}
