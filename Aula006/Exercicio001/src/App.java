/**
 * 1.Para um programa de controle de funcionários, considere os 
 * conceitos de Funcionário e Programador, sendo este último um tipo 
 * mais especializado do primeiro. Crie o modelo e a implementação das 
 * classes indicadas. Além dos dados comuns de um funcionário, um 
 * programador deve ter o registro da linguagem de programação de sua 
 * preferência. Crie construtor(es) e método(s) para estas classes, e 
 * crie uma classe App que exemplifica o uso das estruturas definidas 
 * para fins de teste da estrutura proposta.
 * 2. Altere a sua solução do exercício 1 para que seja possível 
 * definir para cada programador no máximo 3 linguagens de programação, 
 * cada uma delas acompanhada de seu tempo de experiência em anos e 
 * ranking de preferência para o trabalho.
 * 3. Complemente a solução 2, para que seja possível comparar 
 * programadores em relação ao tempo de experiência em uma determinada 
 * linguagem. Isso deve ser modelado e implementado em uma nova classe.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Programador programador1 = new Programador("João", "Silva", 30, "12345", "Java");
        Programador programador2 = new Programador("Maria", "Santos", 28, "67890", "Python");

        Linguagem linguagem1 = new Linguagem("Java", 5, 1);
        Linguagem linguagem2 = new Linguagem("Python", 3, 2);
        Linguagem linguagem3 = new Linguagem("C++", 2, 3);

        programador1.adicionarLinguagem(linguagem1);
        programador1.adicionarLinguagem(linguagem2);
        programador1.adicionarLinguagem(linguagem3);

        programador2.adicionarLinguagem(linguagem2);
        programador2.adicionarLinguagem(linguagem3);

        System.out.println(programador1.getNomeCompleto() + " tem experiência em Java por " + linguagem1.getExperienciaAnos() + " anos.");
        System.out.println(programador2.getNomeCompleto() + " tem experiência em Python por " + linguagem2.getExperienciaAnos() + " anos.");

        System.out.println(programador1.getTempoLinguagem("C++"));
        System.out.println(programador1.getTempoLinguagem("C++"));
    }
}
