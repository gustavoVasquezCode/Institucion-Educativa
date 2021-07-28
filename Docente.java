/*
* Gustavo Alberto Vasquez Damaso
* POO
* Docente.java
*/

public class Docente extends Personal{
    
    private int noHoras;
    private float precioHora;
    private int noGrupos;
    private float precioGrupo;
    private float sueldoTemporal;
    private int totalAlumnos;

    //atributo adicional
    private int antiguedad;

    public Docente(){
        noHoras = 0;
        precioHora = 0;
        noGrupos = 0;
        precioGrupo = 0;
        sueldoTemporal = 0;
        totalAlumnos = 0;
        antiguedad = 0;
    }

    //calcular sueldo por hora
    public void calculoSueldo(){
        calculoBono();
        sueldoTemporal = noHoras * precioHora;
        setSueldoQuincenal(sueldoTemporal + calculoBono());
    }

    //calcular sueldo por grupo
    public void calculoSueldo(int totalAlumnos){
        calculoBono();
        if(totalAlumnos >= 150){
            sueldoTemporal = noGrupos * precioGrupo + 500;
            setSueldoQuincenal(sueldoTemporal + calculoBono());
        } else{
            sueldoTemporal = noGrupos * precioGrupo;
            setSueldoQuincenal(sueldoTemporal + calculoBono());
        }
    }

    //comprobar bono
    private float calculoBono(){
        float bono = 0;
        if(antiguedad > 10){
            bono = 1000;
        }
        else if(antiguedad <= 10){
            bono = 500;
        }
        return bono;
    }

    //metodos set()
    public void setNoHoras(int noHoras) {
        this.noHoras = noHoras;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public void setNoGrupos(int noGrupos) {
        this.noGrupos = noGrupos;
    }

    public void setPrecioGrupo(float precioGrupo) {
        this.precioGrupo = precioGrupo;
    }

    public void setSueldoTemporal(float sueldoTemporal) {
        this.sueldoTemporal = sueldoTemporal;
    }

    public void setTotalAlumnos(int totalAlumnos) {
        this.totalAlumnos = totalAlumnos;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //metodos get()
    public int getNoHoras() {
        return noHoras;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public int getNoGrupos() {
        return noGrupos;
    }

    public float getPrecioGrupo() {
        return precioGrupo;
    }

    public float getSueldoTemporal() {
        return sueldoTemporal;
    }

    public int getTotalAlumnos() {
        return totalAlumnos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}
