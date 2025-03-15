package br.com.fiap.livraria.model;

import br.com.fiap.livraria.enums.TipoCapaEnum;

/**
 * Classe que representa um molde de luvros com titulo, autor, editora, preco, etc.
 *
 * @author Ivan
 */
public class Livro {
    private String titulo, autor, resumo;
    private TipoCapaEnum tipoCapa;
    private Editora editora;
    private double preco;
    private int paginas;

    public Livro() { // CONSTRUTOR
        tipoCapa = TipoCapaEnum.COMUM;
    }

    /**
     * Exibe os detalhes do livro, conforme sequência a seguir:
     * <ul>
     *     <li>Título</li>
     *     <li>Autor</li>
     *     <li>Preço</li>
     *     <li>Capa</li>
     *     <li>Páginas</li>
     * </ul>
     *
     */
    public void exibir() {     //metódo sem retorno
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

    public void aplicarDesconto(double percentual) {
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
    // set --> Alterar
    // get --> Recuperar
    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        adicionarPrecoCapa();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }
}
