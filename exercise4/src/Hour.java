void main() {

    Scanner sc = new Scanner(System.in);

    IO.print("Insira as hora(s): ");
    int horaInicial = sc.nextInt();
    int horaFinal =  sc.nextInt();

    int duracao;
    if (horaInicial < horaFinal) {
        duracao = horaFinal - horaInicial;

    } else  {
        duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O jogo durou: " +duracao+ " hora(s)!");

    sc.close();
}