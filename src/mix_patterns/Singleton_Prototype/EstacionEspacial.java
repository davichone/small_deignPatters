package mix_patterns.Singleton_Prototype;

import java.util.Set;

public class EstacionEspacial {
   private String nombre;
   private int nivelEnergia;
   private Set<String> navesRegistradas;

   // instancia unica
   private static EstacionEspacial estacionEspacialUnica;

   // constructor privado
   private EstacionEspacial(String nombre, int nivelEnergia) {
      this.nombre = nombre;
      this.nivelEnergia = nivelEnergia;
   }

   // metodo static para obtener la unica estacion
   public static EstacionEspacial getInstanciaUnica() {
      if (estacionEspacialUnica == null) {
         estacionEspacialUnica = new EstacionEspacial("Nasa", 99);
         return estacionEspacialUnica;
      }

      return estacionEspacialUnica;
   }

   public void reportarMision(String nave) {
      System.out.println(nave + " reporta a " + nombre);
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNivelEnergia() {
      return nivelEnergia;
   }

   public void setNivelEnergia(int nivelEnergia) {
      this.nivelEnergia = nivelEnergia;
   }

   public Set<String> getNavesRegistradas() {
      return navesRegistradas;
   }

   public void setNavesRegistradas(Set<String> navesRegistradas) {
      this.navesRegistradas = navesRegistradas;
   }

   public static EstacionEspacial getEstacionEspacialUnica() {
      return estacionEspacialUnica;
   }

   public static void setEstacionEspacialUnica(EstacionEspacial estacionEspacialUnica) {
      EstacionEspacial.estacionEspacialUnica = estacionEspacialUnica;
   }

  /*  public Set<String> naves() {

   } */

  
}