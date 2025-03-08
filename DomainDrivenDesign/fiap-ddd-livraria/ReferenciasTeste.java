public class ReferenciasTeste {
    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.titulo = "Teste";
        System.out.println("Título A: " + livroA.titulo);

        // Livro livroB = livroA;
        Livro livroB = new Livro();
        System.out.println("Título B: " + livroB.titulo);

        livroB.titulo = "Teste alterado";
        System.out.println("Título B: " + livroB.titulo);

        System.out.println("Título A: " + livroA.titulo);

        System.out.println(livroA);
        System.out.println(livroB);

    }
}
