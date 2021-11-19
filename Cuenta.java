public class Cuenta{
  private double saldo;
  public int NumRetiros=0;
  public Cuenta(){
    saldo=0;
  }

  public void depositar(double monto)throws SaldoExcesivoException{
    if(monto>20000){
      throw new SaldoExcesivoException();
    }else{
    System.out.println("Depositando...");
    saldo+=monto;
    }
  }

  public void retirar(double monto) throws SaldoInsuficienteException,RetirosExcedidosException{
    if(saldo<monto){
      throw new SaldoInsuficienteException();
    }else{
    NumRetiros++;
    if(NumRetiros>3){
      throw new RetirosExcedidosException();
    }else{
      System.out.println("Retirando...");
      saldo-=monto;
      }
    }
  }

  public double consultaSaldo(){
    System.out.println("Tu Saldo es: "+ saldo);
    return saldo;
  } 
  @Override
   public String toString(){
     return "Cuenta{Saldo+"+saldo+" NumRetiros:"+ NumRetiros+"}";
   }
}