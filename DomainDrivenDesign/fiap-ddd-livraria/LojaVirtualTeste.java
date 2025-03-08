public class LojaVirtualTeste {
    public static void main(String[] args) {
        // Criando Objetos
        // 1- declare uma variavel para a referencia -> Livro primeiroLivro
        // 2-Crie um Objeto -> new Livro()
        // 3-Associa o objeto e a referência -> =
        Editora harperCollins = new Editora();
        harperCollins.nome = "HarperCollins";
        harperCollins.site = "www.harpercollins.com";

        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Hobbit"; // o ponto "." da acesso aos atributos e métodos do objeto
        primeiroLivro.autor = "J. R. Tolkien";
        primeiroLivro.preco = 33.67;
        primeiroLivro.tipoCapa = TipoCapaEnum.COMUM; // COMUM, DURA, PERSONALIZADA
        primeiroLivro.resumo = "O Hobbit é um romance de J.R.R. Tolkien que conta a história de Bilbo Bolseiro, um hobbit que se junta a anões para recuperar um tesouro";
        primeiroLivro.editora = harperCollins;
        primeiroLivro.paginas = 427;
        primeiroLivro.exibir();

        //Livro 2
        Editora novatec = new Editora();
        novatec.nome = "Novatec";
        novatec.site = "www.novatec.com";

        Livro segundoLivro = new Livro();
        segundoLivro.titulo = "UML 2 - Uma Abordagem prática";
        segundoLivro.autor = "Gilleanes T. A. Guedes";
        segundoLivro.preco = 95.20;
        segundoLivro.tipoCapa = TipoCapaEnum.DURA;
        segundoLivro.resumo = "A UML - Unified Modeling Language ou Linguagem de Modelagem Unificada";
        segundoLivro.editora = novatec;
        segundoLivro.paginas = 483;
        segundoLivro.exibir();

    }
}
