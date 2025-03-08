public class LojaVirtualTeste {

    public static void main(String[] args) {
        // Criando Objetos
        // 1- declare uma variavel para a referencia -> Livro primeiroLivro
        // 2-Crie um Objeto -> new Livro()
        // 3-Associa o objeto e a referência -> =
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Hobbit"; // o ponto "." da acesso aos atributos e métodos do objeto
        primeiroLivro.autor = "J. R. Tolkien";
        primeiroLivro.preco = 33.67;
        primeiroLivro.tipoCapa = "COMUM";
        primeiroLivro.resumo = "O Hobbit é um romance de J.R.R. Tolkien que conta a história de Bilbo Bolseiro, um hobbit que se junta a anões para recuperar um tesouro";
        primeiroLivro.editora = "HarperCollins";
        System.out.println("Título: "+ primeiroLivro.titulo);

        Livro segundoLivro = new Livro();
        segundoLivro.titulo = "UML 2 - Uma Abordagem prática";
        segundoLivro.autor = "Gilleanes T. A. Guedes";
        segundoLivro.preco = 95.20;
        segundoLivro.tipoCapa = "Capa Dura";
        segundoLivro.resumo = "A UML - Unified Modeling Language ou Linguagem de Modelagem Unificada";
        segundoLivro.editora = "Novatec";
        System.out.println("Título: "+ segundoLivro.titulo);

    }
}
