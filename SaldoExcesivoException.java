public class SaldoExcesivoException extends Exception{
  public SaldoExcesivoException(){
    super("No se pueden depositar cantidades superiores a 20,000");
  }
}