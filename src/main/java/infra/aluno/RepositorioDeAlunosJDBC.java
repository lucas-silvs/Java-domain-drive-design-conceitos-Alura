package infra.aluno;

import br.com.alura.escola.dominio.aluno.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RepositorioDeAlunosJDBC implements RepositorioDeAlunos {

    private  final Connection connection;

    public RepositorioDeAlunosJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
    try {
        String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,aluno.getCpf());
        ps.setString(2,aluno.getNome());
        ps.setString(3,aluno.getEmail());
        ps.execute();

        sql = "INSERT INT TELEFONE VALUES (?,?)";
        ps = connection.prepareStatement(sql);
        for(Telefone telefone : aluno.getTelefones()){
            ps.setString(1,telefone.getDdd());
            ps.setString(2,telefone.getNumero());
            ps.execute();

        }
;    }catch (SQLException e){
        e.printStackTrace();
    }
    }

    @Override
    public Aluno BuscaPorCPF(CPF cpf) {

        try {
            String sql = "SELECT * FROM ALUNO WHERE cpf=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getCpf());
            ResultSet rs = ps.executeQuery();
            Boolean encontrou = rs.next();
            if (!encontrou) {
                throw new AlunoNaoEncontrado(cpf);
            }

            String nome = rs.getString("nome");
            Email email = new Email(rs.getString("email"));
            Aluno alunoEncontrado = new Aluno(cpf, nome, email);

            Long id = rs.getLong("id");
            sql = "SELECT ddd, numero FROM TELEFONE WHERE aluno_id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                String numero = rs.getString("numero");
                String ddd = rs.getString("ddd");
                alunoEncontrado.adicionarTelefone(ddd, numero);
            }

            return alunoEncontrado;
        } catch (SQLException e) {
            e.printStackTrace();
            return  null;
        }
    }


    @Override
    public List<Aluno> ListaTodosAlunosMatriculados() {
    return null;
    }
}
