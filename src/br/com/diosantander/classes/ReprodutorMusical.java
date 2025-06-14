package br.com.diosantander.classes;

public class ReprodutorMusical extends AparelhoTelefonico{
    public void tocar() {
        System.out.println("Musica Tocando");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica Selecionada");
    }


}
