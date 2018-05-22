
package Proxy;
public class SujetoReal extends Sujeto {

  public SujetoReal(String nombre) { 
     super(nombre); 

  }

  @Override
  public void metodo1()  {
      System.out.println("Ejecutando metodo1 en " + this);
   }

  @Override
  public void metodo2() {
      System.out.println("Ejecutando metodo2 en " + this);
   }

}