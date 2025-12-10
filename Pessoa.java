package POO;

public class Pessoa {
        private String nome;
        private int idade;
        private Pessoa pai;
        private Pessoa mae;

        public Pessoa(String nome, int idade, Pessoa pai, Pessoa pessoaMae) {
            this.nome = nome;
            this.idade = idade;
            this.pai = pai;
            this.mae = pessoaMae;
        }

        public String getNome(){
            return this.nome;
        }

        public void mostrarArvoreGenealogica() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Nome do pai: " + this.pai.getNome());
            System.out.println("Nome da mãe: " + this.mae.getNome());
            System.out.println("Nome do avô paterno: " + pai.pai.getNome());
            System.out.println("Nome da avó paterna: " + pai.mae.getNome());
            System.out.println("Nome do avô materno: " + mae.pai.getNome());
            System.out.println("Nome da avó materna: " + mae.mae.getNome() + "\n");
        }
}
