
package denuncias;

import java.util.Objects;


public class persona {
   public String cedula,nombre,apellido,sexo,denuncia;
   
   public int edad;
   
   public double peso;
   
   public persona(String cedula,String nombre,String apellido,String sexo,int edad,double peso, String denuncia){
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.sexo = sexo;
       this.peso = peso;
       this.denuncia = denuncia;
       
   }
   public persona(String cedula){
       this.cedula = cedula;
       
   }
     
   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(String denuncia) {
        this.denuncia = denuncia;
    }

    @Override
    public String toString() {
        return "persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", denuncia=" + denuncia + ", edad=" + edad + ", peso=" + peso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final persona other = (persona) obj;
        return true;
    }
    

   
   
    }


    
    

