public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(1);
        aluno.setNome("Rodrigo Junior");
        aluno.setNota1(10);
        aluno.setNota2(8);
        System.out.println(aluno.getMatricula() + aluno.getNome() + aluno.getNota1() + aluno.getNota2());
    }
}
