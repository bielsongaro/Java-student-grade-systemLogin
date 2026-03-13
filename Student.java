package dominio;

public class Student {
    private String name;
    private double grade1;
    private double grade2;

    static{
        System.out.println("PROGRAMA ALUNO APROVADO INSTITUCIONAL ACESSADO");
    }
    public void setNome(String name) {
        if (name.isEmpty()) {
            System.out.println("Nome invalido");
            return;
        }
        this.name = name;
        System.out.println("Nome cadastrado: " + name);
    }

    public void setGrade1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota invalida");
            return;
        }
        this.grade1 = grade1;
        System.out.println("Nota 1 adicionada: "+ grade1);
    }

    public void setGrade2(double grade2) {
        if (grade2 < 0 || grade2 > 10) {
            System.out.println("Nota invalida");
            return;
        }
        this.grade2 = grade2;
        System.out.println("Nota2 adicionada: "+ grade2);
    }

    public double calculateAverage() {
        double media = 0;
        media = (grade1 + grade2) / 2;
        return media;
    }

    public boolean checkApproval() {
        double media = calculateAverage();
        if(media < 6) {
            System.out.println("Aluno reprovado com média: "+ media);
            return true;
        }
        System.out.println("Aluno aprovado com média: "+ media);
        return false;
    }


    }

