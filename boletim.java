package Programa_Aluno;

public class boletim {

    public static void main(String[] args){
    aluno a1 = new aluno();
    a1.nome = "Pedro";
    a1.turma = 2-54;
    a1.n1 = 8f;
    a1.n2 = 4f;
    a1.n3 = 6.5f;
    a1.media = (a1.n1 + a1.n2 + a1.n3) /3;
    
    aluno a2 = new aluno();
    a2.nome = "João";
    a2.turma = 1-54;
    a2.n1 = 8f;
    a2.n2 = 9f;
    a2.n3 = 3.5f;
    a2.media = (a2.n1 + a2.n2 + a2.n3) /3;
     
    aluno a3 = new aluno();
    a3.nome = "Joãozinho";
    a3.turma = 3-54;
    a3.n1 = 2f;
    a3.n2 = 6f;
    a3.n3 = 4f;
    a3.media = (a3.n1 + a3.n2 + a3.n3) /3;

    disciplina d1 = new disciplina();
        d1.materia  = "Matematica";

        disciplina d2 = new disciplina();
        d2.materia = "Filosofia";

    
   System.out.println("A média do aluno " + a1.media);

}}