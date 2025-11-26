package POO;

public class PooArvoreGenealogica {
    public static void main(String[] args) {
        Pessoa raiz = new Pessoa("Deus", 44, null, null );
        Pessoa avoMaterno = new Pessoa("Adão", 40, raiz, raiz);
        Pessoa avoMaterna = new Pessoa("Eva", 40, raiz, raiz);
        Pessoa pai = new Pessoa("José", 48, avoMaterno, avoMaterna);
        Pessoa mae = new Pessoa("Maria", 40, raiz, raiz);

        Pessoa filho = new Pessoa("Jesus", 2024, pai, mae);
        filho.mostrarArvoreGenealogicaPessoa();
    }
}
