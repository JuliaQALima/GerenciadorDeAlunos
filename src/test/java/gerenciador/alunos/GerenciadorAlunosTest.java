package gerenciador.alunos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GerenciadorAlunosTest {
	@Test
	public void testCalcularMediaNotas() {
		GerenciadorAlunos gerenciador = new GerenciadorAlunos();
		gerenciador.adicionarAluno(new Aluno("João", 7.5));
		gerenciador.adicionarAluno(new Aluno("Maria", 6.8));
		gerenciador.adicionarAluno(new Aluno("Pedro", 8.2));
		double media = gerenciador.calcularMediaNotas();
		System.out.println("Média das notas: " + media);
		assertEquals(7.5, media, 0.01);
	}

	@Test
	public void testEncontrarAlunoMaiorNota() {
		GerenciadorAlunos gerenciador = new GerenciadorAlunos();
		gerenciador.adicionarAluno(new Aluno("João", 7.5));
		gerenciador.adicionarAluno(new Aluno("Maria", 6.8));
		gerenciador.adicionarAluno(new Aluno("Pedro", 8.2));
		Aluno alunoMaiorNota = gerenciador.encontrarAlunoMaiorNota();
		System.out.println("Aluno com maior nota: " + alunoMaiorNota.getNome() + " - Nota: " + alunoMaiorNota.getNota());
		assertEquals("Pedro", alunoMaiorNota.getNome());
		assertEquals(8.2, alunoMaiorNota.getNota(), 0.01);
	}

}
