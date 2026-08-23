void main (){

    Scanner sc = new Scanner(System.in);
    int N;

    System.out.println("Digite um numero: ");
    N = sc.nextInt();

    if (N % 2 == 0) {
        System.out.println("Par");

    }else {
        System.out.println("Ímpar");
        }

    sc.close();
}