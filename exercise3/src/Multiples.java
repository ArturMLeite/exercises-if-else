void main () {

    Scanner sc = new Scanner (System.in);
    IO.println ("Insira dois números: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a % b == 0 || b % a == 0 ) {
        IO.println("São múltiplos");

    } else {
        IO.println("Não são múltiplos");
    }

    sc.close();
}