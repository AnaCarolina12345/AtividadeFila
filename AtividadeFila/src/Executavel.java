import java.util.LinkedList;
import java.util.Queue;

public class Executavel {

    public static void main(String[] args){
    Candidato Luis = new Candidato( "Luis", "B" );
    Candidato Pedro = new Candidato( "Pedro", "A");
    Candidato Luisa = new Candidato("Luisa", "A" );
    Candidato Joao = new Candidato( "Joao", "X");
    Candidato Jose = new Candidato("Jose", "X");
    Candidato Miguel = new Candidato("Miguel", "B");


    Queue<Candidato> filaQ = new LinkedList<Candidato>();

    filaQ.add(Luis);
    filaQ.add(Pedro);
    filaQ.add(Luisa);
    filaQ.add(Joao);
    filaQ.add(Jose);
    filaQ.add(Miguel);

    for(Candidato item: filaQ){
        System.out.println(item.getNome() + " " + item.getInteresse());
    }

    Queue<Candidato> filaA = new LinkedList<Candidato>();
    Queue<Candidato> filaB = new LinkedList<Candidato>();



    }
}
