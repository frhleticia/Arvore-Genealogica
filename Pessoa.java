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
        } public void setNome(String nome){
            this.nome = nome;}

        public int getIdade(){
            return this.idade;
        } public void setIdade(int idade){
            this.idade = idade;}

        public String getNomePai(){
            return this.pai.getNome();
        } public void setNomePai(String nomePai){
            this.pai = pai;}

        public String getNomeMae(){
            return this.mae.getNome();
        } public void setNomeMae(String nomeMae){
            this.mae = mae;}

        public void mostrarArvoreGenealogicaPessoa() {
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
