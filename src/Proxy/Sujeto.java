package Proxy;

   public abstract class Sujeto {

  /*
     * @param nombre
    */
     public Sujeto(String nombre) { 
         _nombre = nombre; 
    }

     @Override
     public String toString() { 
          return _nombre; 
    }



     public abstract void metodo1();
     public abstract void metodo2();



     public void status (Sujeto sujeto) {
         Proxy p;
         p = (Proxy) sujeto;
         p.toString();
     }   
                       


     private final String  _nombre;

}