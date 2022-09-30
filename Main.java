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
      numeroWhile++;
    }

    int numeroDoWhile = 3;

    do{
      System.out.println("solo me ejecuto una vez");
      numeroDoWhile++;
    } while(numeroDoWhile < 3);
    
    for (int numeroFor = 0; numeroFor <=3; numeroFor++){
       System.out.println("numeroFor es: "+numeroFor);
    }
 
    String estacion = "DICIEMBRE";

    switch( estacion ){
      case "PRIMAVERA":
      case "VERANO":
      case "OTOÑO":
      case "INVIERNO":
        System.out.println("ES " + estacion);
        break;
      default:
         System.out.println(estacion + " no es una estación válida");
    };
  }
}