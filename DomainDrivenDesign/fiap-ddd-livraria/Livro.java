public class Livro {
    String titulo, autor, resumo;
    TipoCapaEnum tipoCapa;
    Editora editora;
    double preco;
    int paginas;

    void exibir(){     //metódo
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
        System.out.println("Capa: " + tipoCapa);
        System.out.println("Páginas: " + paginas);

    }
}
