class Main {
  public static void main(String[] args) {

    int cuenta = -10;

    if (cuenta < 0){
      System.out.println("Estás quebrado");
    } else if (cuenta == 0) {
      System.out.println("tablas");
    } else {
      System.out.println("Cuentas en tu cuenta con: " + cuenta + ".00 ");
    };

    int numeroWhile = 0;

    while(numeroWhile < 3){
      System.out.println(numeroWhile);
      numeroWhile = numeroWhile + 1;
    }
    
  }
}