package Git.DiagramacaoDeClassesDoIPhone.DiagramaçãoDeClassesDoiPhone.Iphone;

import Git.Projetos.DiagramaçãoDeClassesDoiPhone.Serviços.AparelhoTelefonico;
import Git.Projetos.DiagramaçãoDeClassesDoiPhone.Serviços.NavegadorDeInternet;
import Git.Projetos.DiagramaçãoDeClassesDoiPhone.Serviços.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Página!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página!");
    }

    @Override
    public void efetuarLigacao() {
        System.out.println("Efetuando Ligacao!");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo Ligacao!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }
    
}
