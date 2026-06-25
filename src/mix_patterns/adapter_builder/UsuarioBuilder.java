package mix_patterns.adapter_builder;





public class UsuarioBuilder {
 private String nombre;
 private String email;
 private int edad;
 private String telefono;
 private String direccion;
 private boolean esPremium;

 public UsuarioBuilder(){}
 

 public UsuarioBuilder(String nombre, String email, int edad, String telefono, String direccion, boolean esPremium) {
    this.nombre = nombre;
    this.email = email;
    this.edad = edad;
    this.telefono = telefono;
    this.direccion = direccion;
    this.esPremium = esPremium;
}


 public UsuarioBuilder conNombre(String nombre){
    this.nombre=nombre;
    return this;
 }

 public UsuarioBuilder conEmail(String email){
    this.email=email;
    return this;
 }

  public UsuarioBuilder conEdad(int edad){
    this.edad=edad;
    return this;
 }

   public UsuarioBuilder conTelefono(String telefono){
    this.telefono=telefono;
    return this;
 }

 
   public UsuarioBuilder conDireccion(String direccion){
    this.direccion=direccion;
    return this;
 }

    public UsuarioBuilder esPremium(boolean esPremium){
    this.esPremium=esPremium;
    return this;
 }

 public UsuarioBuilder builder(){
    return new UsuarioBuilder(this.nombre, this.email, this.edad, this.telefono, this.direccion, this.esPremium);
 }


 public String getNombre() {
   return nombre;
 }


 public void setNombre(String nombre) {
   this.nombre = nombre;
 }


 public String getEmail() {
   return email;
 }


 public void setEmail(String email) {
   this.email = email;
 }


 public int getEdad() {
   return edad;
 }


 public void setEdad(int edad) {
   this.edad = edad;
 }


 public String getTelefono() {
   return telefono;
 }


 public void setTelefono(String telefono) {
   this.telefono = telefono;
 }


 public String getDireccion() {
   return direccion;
 }


 public void setDireccion(String direccion) {
   this.direccion = direccion;
 }


 public boolean isEsPremium() {
   return esPremium;
 }


 public void setEsPremium(boolean esPremium) {
   this.esPremium = esPremium;
 }

 


 
 
 
}
