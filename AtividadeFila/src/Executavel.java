import java.util.LinkedList;
import java.util.Queue;

public class Executavel {

    public static void process(Queue<String> q, Queue<String> a, Queue<String> b) {

        while (!q.isEmpty()) {
            String nome = q.poll();
            String operacao = q.poll();

            switch (operacao) {
                case "A":
                    a.add(nome);
                    break;

                case "B":
                    b.add(nome);
                    break;

                case "X":
                    if (a.size() < b.size()) {
                        a.add(nome);
                    } else if (b.size() < a.size()) {
                        b.add(nome);
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        Queue<String> a = new LinkedList<>();
        Queue<String> b = new LinkedList<>();

        // Adiciona os candidatos à fila q
        q.add("Luis"); q.add("B");
        q.add("Pedro"); q.add("A");
        q.add("Luisa"); q.add("A");
        q.add("Joao"); q.add("X");
        q.add("Jose"); q.add("X");
        q.add("Miguel"); q.add("B");

        // Processando a fila q
        process(q, a, b);

        // Mostra as filas finais
        System.out.println("Fila A (Engenharia): " + a);
        System.out.println("Fila B (Marketing): " + b);
        System.out.println("Fila de Candidatos q: " + q);
    }

}
