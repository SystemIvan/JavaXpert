public class Livro {
    String titulo, autor, resumo;
    private TipoCapaEnum tipoCapa;
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
        if ( editora != null){
            editora.exibir();
        }
        System.out.println("---------------------------------");
    }

    String formatarPreco() { // metódo com retorno
        String resultado = String.format("R$ %.2f", preco);
        return resultado;
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual);
    }

    void adicionarPrecoCapa(){
        if (tipoCapa == TipoCapaEnum.DURA){
            preco = preco + 10.0;
        }
        if (tipoCapa == TipoCapaEnum.PERSONALIZADA){
            preco = preco + 20.0;
        }
    }


}
