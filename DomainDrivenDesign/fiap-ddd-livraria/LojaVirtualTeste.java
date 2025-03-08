public class LojaVirtualTeste {

    public static String informacoes(Livro livro){
        String info;
        info = "\nTítulo: " + livro.titulo +
                "\nAutor: " + livro.autor +
                "\nPreço: " + livro.preco +
                "\nCapa: " + livro.tipoCapa +
                "\nPáginas: " + livro.paginas;
        return info;
    }

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
        System.out.println("\nTítulo: " + primeiroLivro.titulo);
        System.out.println("Autor: " + primeiroLivro.autor);
        System.out.println("Preço: " + primeiroLivro.preco);
        System.out.println("Capa: " + primeiroLivro.tipoCapa);
        System.out.println("Páginas: " + primeiroLivro.paginas);

        System.out.println(informacoes(primeiroLivro));

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
        System.out.println("\nTítulo: " + segundoLivro.titulo);
        System.out.println("Autor: " + segundoLivro.autor);
        System.out.println("Preço: " + segundoLivro.preco);
        System.out.println("Capa: " + segundoLivro.tipoCapa);
        System.out.println("Páginas: " + segundoLivro.paginas);

    }
}
