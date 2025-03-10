public class Livro {
    String titulo, autor, resumo;
    TipoCapaEnum tipoCapa;
    Editora editora;
    double preco;
    int paginas;

    public Livro() { // CONSTRUTOR
        tipoCapa = TipoCapaEnum.COMUM;
    }

    void exibir() {     //metódo sem retorno
        System.out.println("\nDetalhes do livro: " + titulo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + formatarPreco());
        System.out.println("Capa: " + tipoCapa);
        System.out.println("Páginas: " + paginas);
        editora.exibir();
        System.out.println("---------------------------------");
    }

    String formatarPreco() { // metódo com retorno
        String resultado = String.format("R$ %.2f", preco);
        return resultado;
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual);
    }


}
