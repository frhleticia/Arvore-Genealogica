package POO;

public class PooArvoreGenealogica {
    public static void main(String[] args) {
        Pessoa raiz = new Pessoa("Deus", 44, null, null );

        Pessoa bisoMaterno = new Pessoa("Adão", 48, raiz, raiz);
        Pessoa bisaMaterna = new Pessoa("Eva", 46, raiz, raiz);
        Pessoa avoPaterno = new Pessoa("Joao", 42, raiz, raiz);
        Pessoa avoPaterna = new Pessoa ("Isabel", 42, raiz, raiz);
        Pessoa avoMaterno = new Pessoa("Pedro", 40, raiz, raiz);
        Pessoa avoMaterna = new Pessoa("Lúcia", 40, bisoMaterno, bisaMaterna);
        Pessoa pai = new Pessoa("José", 48, avoPaterno, avoPaterna);
        Pessoa mae = new Pessoa("Maria", 40, avoMaterno, avoMaterna);

        Pessoa filho = new Pessoa("Jesus", 2024, pai, mae);
        filho.mostrarArvoreGenealogica();

        mae.mostrarArvoreGenealogica();
    }
}
