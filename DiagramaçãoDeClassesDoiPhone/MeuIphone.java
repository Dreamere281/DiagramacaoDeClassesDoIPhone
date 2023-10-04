package Git.DiagramacaoDeClassesDoIPhone.DiagramaçãoDeClassesDoiPhone;

import Git.Projetos.DiagramaçãoDeClassesDoiPhone.Iphone.Iphone;

public class MeuIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\nResolução Desafio POO");

        System.out.println("\nIniciando Serviço Chamada Telefônica");
        iphone.efetuarLigacao();
        iphone.atenderLigacao();
        iphone.iniciarCorreioDeVoz();

        System.out.println("\nIniciando Reprodutor Musical");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        System.out.println("\nAcessando Navegador de internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    
}
