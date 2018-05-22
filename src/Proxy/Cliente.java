package Proxy;

public class Cliente {

  public Cliente(Sujeto sujeto) {
       _sujeto = sujeto; 
  }
 
  public void ejecutar() {
        _sujeto.metodo1();
        _sujeto.metodo1();
        _sujeto.metodo2();
        _sujeto.metodo1();
  }
  
  private final Sujeto _sujeto;
      
 }