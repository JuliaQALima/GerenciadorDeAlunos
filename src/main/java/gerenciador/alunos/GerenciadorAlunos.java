package gerenciador.alunos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunos {
	private List<Aluno> alunos;

	public GerenciadorAlunos() {
		this.alunos = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}

	public double calcularMediaNotas() {
		if (alunos.isEmpty()) {
			return 0;
		}

		double soma = 0;
		for (Aluno aluno : alunos) {
			soma += aluno.getNota();
		}
		return soma / alunos.size();
	}

	public Aluno encontrarAlunoMaiorNota() {
		if (alunos.isEmpty()) {
			return null;
		}

		Aluno alunoMaiorNota = alunos.get(0);
		for (Aluno aluno : alunos) {
			if (aluno.getNota() > alunoMaiorNota.getNota()) {
				alunoMaiorNota = aluno;
			}
		}
		return alunoMaiorNota;
	}

}
