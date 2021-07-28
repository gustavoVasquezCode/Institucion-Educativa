/*
* Gustavo Alberto Vasquez Damaso
* POO
* Escuela.java
*/

import java.io.*;

public class Escuela {
    public static void main(String[] args) throws IOException{
        int tipo, suma = 0, noAlumnos;
        boolean ejecutar = true;
        int i = 0;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Docente docEspaniol = new Docente();

        System.out.print("Ingrese la clave: ");
        docEspaniol.setClave(reader.readLine());

        System.out.print("Ingrese el nombre: ");
        docEspaniol.setNombre(reader.readLine());

        while(ejecutar){
            System.out.println("\n*************** Nomina Docente ***************");
            System.out.println("Tipo: \n1.Por hora \n2.Por grupo \n3.ReciboPago \n4.Salir");
            System.out.println("\nOpcion: ");
            tipo = Integer.parseInt(reader.readLine());

            if(tipo == 1){
                System.out.println("\n>>Calcular por Hora<<");
                System.out.print("Ingrese el numero de horas trabajadas: ");
                docEspaniol.setNoHoras(Integer.parseInt(reader.readLine()));

                System.out.print("Ingrese el precio por hora: ");
                docEspaniol.setPrecioHora(Float.parseFloat(reader.readLine()));

                System.out.print("Ingrese la antiguedad en anios: ");
                docEspaniol.setAntiguedad(Integer.parseInt(reader.readLine()));

                docEspaniol.calculoSueldo();
            }
            else if(tipo == 2){
                System.out.println("\n>>Calcular por Grupo<<");
                System.out.print("Ingrese el numero de grupos: ");
                docEspaniol.setNoGrupos(Integer.parseInt(reader.readLine()));

                System.out.print("Ingrese el precio por grupo: ");
                docEspaniol.setPrecioGrupo(Float.parseFloat(reader.readLine()));

                System.out.print("Ingrese la antiguedad en anios: ");
                docEspaniol.setAntiguedad(Integer.parseInt(reader.readLine()));

                while(i < docEspaniol.getNoGrupos()){
                    System.out.print("Ingrese el numero de alumnos del grupo " + (i+1) + ": ");
                    noAlumnos = Integer.parseInt(reader.readLine());
                    suma += noAlumnos;
                    //docEspaniol.setTotalAlumnos(Integer.parseInt(reader.readLine()));
                    //suma += docEspaniol.getTotalAlumnos();
                    i++;
                }

                docEspaniol.calculoSueldo(suma);
            }
            else if(tipo == 3){
                System.out.println("\n>>>>>>>>>>>>RECIBO DE PAGO<<<<<<<<<<<<");
                System.out.println("Clave: " + docEspaniol.getClave());
                System.out.println("Nombre: " + docEspaniol.getNombre());
                System.out.println("Sueldo quincenal: " + docEspaniol.getSueldoQuincenal());
                ejecutar = false;
            }
            else if(tipo == 4){
                ejecutar = false;
            }
            else{
                System.out.println("\nError, la opcion no existe");
            }
        }
    }
}
