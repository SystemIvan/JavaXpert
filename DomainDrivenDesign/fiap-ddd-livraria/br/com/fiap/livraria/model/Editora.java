package br.com.fiap.livraria.model;

public class Editora {
    private String nome, site;

    public Editora() {  // Construtor
        System.out.println("Criando uma editora");
    }

    public Editora(String nome) {
        setNome(nome);
    }

   public void exibir() {
        System.out.println("Detalhes da br.com.fiap.livraria.model.Editora:");
        System.out.println("- Nome: " + nome);
        System.out.println("- Site: " + site);
    }
    public void setNome(String nome) {
        if (nome.length() <= 2){
            System.out.println("Nome é inválido");
        }else {
            this.nome = nome;
        }
    }

    public void setSite(String site) {
        this.site = site;
    }
}
