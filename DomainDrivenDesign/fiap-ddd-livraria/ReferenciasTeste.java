public class ReferenciasTeste {
    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.setTitulo("Teste");
        System.out.println("Título A: " + livroA.getTitulo());

        // Livro livroB = livroA;
        Livro livroB = new Livro();
        System.out.println("Título B: " + livroB.getTitulo());

        livroB.setTitulo("Teste alterado");
        System.out.println("Título B: " + livroB.getTitulo());

        System.out.println("Título A: " + livroA.getTitulo());

        System.out.println(livroA);
        System.out.println(livroB);

    }
}
