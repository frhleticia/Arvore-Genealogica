public class Pessoa {
        public String nome;
        public byte idade;
        public String pai;
        public String mae;

        public Pessoa(String nome, byte idade, String pai, String mae) {
            this.nome = nome;
            this.idade = idade;
            this.pai = pai;
            this.mae = mae;
        }

        public String getNome(){
            return this.nome;
        } public void setNome(String nome){
            this.nome = nome;}

        public byte getIdade(){
            return this.idade;
        } public void setIdade(byte idade){
            this.idade = idade;}

        public String getPai(){
            return this.pai;
        } public void setPai(String pai){
            this.pai = pai;}

        public String getMae(){
            return this.mae;
        } public void setMae(String mae){
            this.mae = mae;}

        public void status() {
            System.out.println("\nNome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Pai: " + this.pai);
            System.out.println("Mãe: " + this.mae);
        }
}
