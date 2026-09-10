public class Boletim {
    public static void main(String[] args) {
        System.out.println("Boletim Escolar");

        String nomeAluno = "Thiago Fabri";
        String disciplina = "Matemática";
        int[] notas = {8, 7, 9, 6};

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Disciplina: " + disciplina);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                System.out.println("Aluno: " + nomeAluno + "| aprovado com nota: " + notas[i]);
            } else {
                System.out.println("Aluno: " + nomeAluno + "| reprovado com nota: " + notas[i]);
            }
        }

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("Média: " + media);

    }
}