public class LojaVirtualTeste {
    public static void main(String[] args) {
        // Criando Objetos
        // 1- declare uma variavel para a referencia -> Livro primeiroLivro
        // 2-Crie um Objeto -> new Livro()
        // 3-Associa o objeto e a referência -> =
        Editora harperCollins = new Editora("HarperCollins");
        harperCollins.setSite("www.harpercollins.com");

        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("O Hobbit");  // o ponto "." da acesso aos atributos e métodos do objeto
        primeiroLivro.setAutor("J. R. Tolkien");
        primeiroLivro.setPreco(100.00);
        primeiroLivro.setTipoCapa(TipoCapaEnum.DURA);  // COMUM, DURA, PERSONALIZADA
        primeiroLivro.setResumo("O Hobbit é um romance de J.R.R. Tolkien que conta a história de Bilbo Bolseiro, um hobbit que se junta a anões para recuperar um tesouro");
        primeiroLivro.setEditora(harperCollins);
        primeiroLivro.setPaginas(427);
        //primeiroLivro.aplicarDesconto(0.20);
        primeiroLivro.exibir();

        //Livro 2 (objeto)
        Editora novatec = new Editora();
        novatec.setNome("Novatec");
        novatec.setSite("www.novatec.com");

        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("UML 2 - Uma Abordagem prática");
        segundoLivro.setAutor("Gilleanes T. A. Guedes");
        segundoLivro.setPreco(95.20);
        segundoLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        segundoLivro.setResumo("A UML - Unified Modeling Language ou Linguagem de Modelagem Unificada");
        segundoLivro.setEditora(novatec);
        segundoLivro.setPaginas( 483);
        //segundoLivro.adicionarPrecoCapa();
        segundoLivro.exibir();

    }
}
