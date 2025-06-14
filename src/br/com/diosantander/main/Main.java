package br.com.diosantander.main;

import br.com.diosantander.classes.NavegandoNaInternet;


public class Main {
    public static void main(String[] args) {
        System.out.println("--Testando funcionalidades--");
        NavegandoNaInternet iphone = new NavegandoNaInternet();
        System.out.println("--Testando ligações--");
        iphone.ligar("123455");
        System.out.println("Ligando para o telefone informado -> 123455");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        System.out.println("--Teste de Navegação na Internet--");
        iphone.exibirPagina("www.pag.com.br");
        iphone.exibirPagina("Acessando a pagina informada -> www.pag.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        System.out.println("--Testando reprodutor musical--");
        iphone.selecionarMusica("Ne-yo - So Sick");
        System.out.println("Tocando a musica solicitada -> Ne-yo - So Sick");
        iphone.tocar();
        iphone.pausar();
    }
}
