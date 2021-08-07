import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Aluno mAluno = new Aluno();
        String name;
        Double nota;

        System.out.println("Exercicio 3");

        do{

            try{
                System.out.println("Insira o nome do aluno:");

                Scanner inputScanner = new Scanner(System.in);

                name = inputScanner.nextLine();
                mAluno.setNome(name);
                System.out.printf("Insira a nota P1 do %s:\r\n",mAluno.getNome());
                nota = inputScanner.nextDouble();
                mAluno.setP1(nota);
    
                System.out.printf("Insira a nota P2 do %s:\r\n",mAluno.getNome());
                nota = inputScanner.nextDouble();
                mAluno.setP2(nota);
    
                System.out.printf("O aluno %s possui a média: %.2f e foi %s\r\n",mAluno.getNome(),mAluno.getMedia(),mAluno.getMedia() > 5 ? "APROVADO" : "REPROVADO" );
                break;
    
            }
            catch(InputMismatchException e)
            {
                //Limpa a tela no windows, no linux e no MacOS
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");

                System.out.printf("Dado de entrada inválido !\r\nTente novamente\r\n");
            }
            
        }
        while(true);
    }
}
