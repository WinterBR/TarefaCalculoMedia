public class Notas {
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private double media;

    public Notas(int nota1, int nota2, int nota3, int nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void conta() {
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média das notas: " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é " + media);
    }

    public void passado() {
        if (media >= 6) {
            System.out.println("Você está passado!");
        } else {
            System.out.println("você está reprovado!");
        }
    }

}



