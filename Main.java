class Main {
  public static void main(String[] args) {
    System.out.println("*** Exception ***");
    try{
      String mensajes[]={"uno","dos","tres"};
      for(int i=0;i<=3;i++)//Error
        System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e){//Sol
      System.out.println("Error: "+e);//Muestra el error
      System.out.println("Error: "+e.getMessage());//Solo muestra el emnsaje
    }
    System.out.println("Esta linea esta cool");
    //Con esto compila el programa aun fallando

    System.out.println("*** Exception Anidada***");
    try{
      Integer denominador = null;
      float x=5/denominador;
      System.out.println(x);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }catch(Exception e){//Exception generaliza
      System.out.println("Error: "+e.getMessage());
    }

    System.out.println("*** Propagacion Exception ***");
    try{
      imprimirArreglo();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error-> "+e.getMessage());
    }finally{//Se usa cuando se usan programas criticos
      System.out.println("Cualquier cosa que suceda entra en el finally");
    }

    System.out.println("*** Creacion de Exception ***");
    Cuenta cuenta = new Cuenta();
    try{
      cuenta.depositar(2000);
      cuenta.consultaSaldo();
      cuenta.retirar(800);
      cuenta.consultaSaldo();
      cuenta.retirar(1100);
      cuenta.consultaSaldo();
      cuenta.retirar(500);
      cuenta.consultaSaldo();
      cuenta.depositar(30000);
      cuenta.consultaSaldo();
      cuenta.retirar(100);
      cuenta.consultaSaldo();
      cuenta.retirar(100);
      cuenta.consultaSaldo();
    }catch(SaldoInsuficienteException e){
      System.out.println("Error: "+e.getMessage());
      ofrecerTarjetaCredito();
    }catch(SaldoExcesivoException e){
      System.out.println("Error: "+e.getMessage());
    }catch(RetirosExcedidosException e){
      System.out.println("Error: "+e.getMessage());
    }
  }

  public static void ofrecerTarjetaCredito(){
    System.out.println("Te interesa una TDC?");
  }

  public static void imprimirArreglo() throws ArrayIndexOutOfBoundsException{
    String mensajes[]={"uno","dos","tres"};
      for(int i=0;i<=3;i++)
        System.out.println(mensajes[i]);
  }
}