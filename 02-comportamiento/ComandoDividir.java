public class ComandoDividir extends ComandoCalculadora implements Comando {
  public ComandoDividir(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    if(valor == 0)
    {
        System.out.println("No se puede dividir con valor 0");
        return 0;
    }
    else{
        return acumulador / valor;
    }
    
    
  }
}