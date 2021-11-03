package br.com.alura.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf , String  email){

        this.aluno = new Aluno(new CPF(cpf),nome, new Email(email));
        return this;
    }

    public FabricaDeAluno ComTelefone(String ddd, String numero){
        aluno.adicionarTelefone(ddd,numero);
        return this;
    }

    public  Aluno criar(){
        return this.aluno;
    }

    public static void main(String[] args) {
        FabricaDeAluno aluno = new FabricaDeAluno();
        aluno.comNomeCPFEmail("", "", "").ComTelefone("","")
                .ComTelefone("","")
                .criar();
    }
}
