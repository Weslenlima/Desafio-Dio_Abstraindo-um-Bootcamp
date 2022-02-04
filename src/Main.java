import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Power BI");
        curso1.setDescricao("Descomplicando power BI");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Big Data");
        curso2.setDescricao("O que é Big Data");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Programação orientada a objetos");
        mentoria.setDescricao("Criando um banco digital");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Analista de Dados");
        bootcamp.setDescricao("Análise de dados para iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWeslen = new Dev();
        devWeslen.setNome("Weslen Lima");
        devWeslen.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Weslen \n" + devWeslen.getConteudosInscritos());
        devWeslen.progredir();
        System.out.println("Conteúdos Concluidos Weslen" + devWeslen.getConteudosInscritos());
        System.out.println("XP: " + devWeslen.calcularTotalXp());
        //System.out.println("Conteúdos Concluidos Weslen" + getData);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna Lima");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna \n" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        System.out.println("Conteúdos Concluidos Bruna " + devBruna.getConteudosInscritos());
        System.out.println("XP: " + devWeslen.calcularTotalXp());

    }



}
