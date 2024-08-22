import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void testarMatricula() {
        int numero = 5;
        int esperado = 5;
        Aluno matricula = new Aluno();
       int resultado =  matricula.setMatricula(numero);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testarNome() {
        String nome = "Ela";

        Aluno matricula = new Aluno();
        matricula.setNome(nome);
       Assertions.assertEquals(nome, matricula.getNome());
    }

    @Test
    public void testarNota1() {
        double nota = -1;
        Aluno nota1 = new Aluno();
        nota1.setNota1(nota);
        Assertions.assertEquals(nota, nota1.getNota1());
    }

    @Test
    public void testarNota2() {
        double nota = -5;
        Aluno nota2 = new Aluno();
        nota2.setNota2(nota);
        Assertions.assertEquals(nota, nota2.getNota2());
    }


}
