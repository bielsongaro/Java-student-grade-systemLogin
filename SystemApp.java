package Objeto;

import dominio.Student;
import dominio.LoginAuthentication;
import dominio.CreateLogin;
import java.util.Scanner;


public class SystemApp {
    public static void main(String[] args) {
        CreateLogin criarlogin = new CreateLogin();
        LoginAuthentication loginAuthentication = new LoginAuthentication();

        Scanner scanner = new Scanner(System.in);

        System.out.println("--SISTEMA DE NOTA ESCOLAR--");
        System.out.print("Digite seu novo nome de usuario: ");
        String user = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();

        criarlogin.setCreateUser(user, password);



        System.out.print("Digite seu usuario: ");
        String userOFC = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String passwordOFC = scanner.nextLine();

        loginAuthentication.getVerificandoLogin(criarlogin, userOFC, passwordOFC);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        String studentName = scanner.nextLine();
        student.setNome (studentName);

        System.out.println("Digite nota 1: ");
        double gradeStudent1 = scanner.nextDouble();
        student.setGrade1(gradeStudent1);

        System.out.println("Digite nota 2: ");
        double gradeStudent2 = scanner.nextDouble();
        student.setGrade2(gradeStudent2);

        student.calculateAverage();
        student.checkApproval();





      //  aluno.setNome("Gabriel");
      //  aluno.setNota1(9);
      //  aluno.setNota2(8);
       // aluno.verificarAprovacao();

    }
}
