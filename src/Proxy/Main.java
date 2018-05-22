package Proxy;
public class Main {

   public static void main(String argv[]) {

    Sujeto objetoA = new Proxy("objetoA");
    Cliente c = new Cliente(objetoA);
    objetoA.status(objetoA);
    c.ejecutar();
    objetoA.status(objetoA);

  
    Sujeto objetoB = new SujetoReal("objetoB");
    Cliente d = new Cliente(objetoB);
    
    d.ejecutar();
  }

}