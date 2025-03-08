public class Editora {
    String nome, site;

    public Editora() {  // Construtor
        System.out.println("Criando uma editora");
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    void exibir() {
        System.out.println("Detalhes da Editora:");
        System.out.println("- Nome: " + nome);
        System.out.println("- Site: " + site);
    }
}
