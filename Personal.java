/*
* Gustavo Alberto Vasquez Damaso
* POO
* Personal.java
*/

public class Personal {
    
    private String clave;
    private String nombre;
    private float sueldoQuincenal;


    //metodos set()
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoQuincenal(float sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }


    //metodos get()
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldoQuincenal() {
        return sueldoQuincenal;
    }
}
