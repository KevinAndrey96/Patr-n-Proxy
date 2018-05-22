
package Proxy;

public class Proxy extends Sujeto {


  public Proxy (String nombre) {
     super(nombre);
    _sujetoReal = null;
   _accesosMetodo1 = 0;
   _accesosMetodo2 = 0;
  }


  private SujetoReal obtenerSujetoReal() {
    if (_sujetoReal == null)
      _sujetoReal = new SujetoReal(this + " (Real)");

    return _sujetoReal;
  }

  @Override
  public void metodo1() { 
    _accesosMetodo1++; 
    obtenerSujetoReal().metodo1(); 
  }

  @Override
  public void metodo2() { 
    _accesosMetodo2++;
    obtenerSujetoReal().metodo2(); 
  }


  @Override
  public String toString() {
    if (_sujetoReal != null)
      System.out.println("Accesos a " + _sujetoReal + 
                         ": metodo1=" + _accesosMetodo1 + 
                         ", metodo2=" + _accesosMetodo2);
    else 
      System.out.println("Sujeto Real (" + this + ") no creado.");

    return "";
  }

  private SujetoReal _sujetoReal; 
  private int  _accesosMetodo1, _accesosMetodo2;
}