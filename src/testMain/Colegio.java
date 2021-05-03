/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMain;

import alumno.Alumno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import materia.Materia;

/**
 *
 * @author Emiliano
 */
public class Colegio {
        private Set<Alumno> registroA = new HashSet<>();
        private Set<Materia> registroM = new HashSet<>();
        public Colegio(){};
        
        public boolean darAltaAlumno(Alumno alumno){
        return registroA.add(alumno);
        }
        public boolean darAltaMateria(Materia materia){
        return registroM.add(materia);
        }
        public Set<Alumno> getSetAlum(){
        return this.registroA;
        }
        public Set<Materia> getSetMat(){
        return this.registroM;
        }
        
        
        public int inscripcion(Alumno alumno,Materia materia){
        int aux = 0;
        Iterator i=registroA.iterator();
            if(registroA.contains(alumno)){
               while(i.hasNext()){
               if(i.next().equals(alumno)){
                   alumno.agregarMateria(materia);
               aux = 1;
               }
          }
          }
          return aux;
        
        }
        
 
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*En el método main de una clase de nombre Colegio:
a) Crear las materias:
i. Ingles I de primer año.
ii. Matemáticas de primer año.
iii. Laboratorio 1 de primer año
b) Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
c) Inscribir a López en las 3 materias.
d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
*/
     Materia m = new Materia(1,"Ingles",1);  
     Materia m1 = new Materia(2,"Matematicas",1);
     Materia m2 = new Materia(3,"Laboratorio",1);
     
     Alumno a = new Alumno(1001,"Lopez","Martin");
     Alumno a1 = new Alumno(1002,"Martinez","Brenda");
     
     
     a.agregarMateria(m);
     a.agregarMateria(m1);
     a.agregarMateria(m2);
     
     a1.agregarMateria(m);
     a1.agregarMateria(m1);
     a1.agregarMateria(m2);
     a1.agregarMateria(m2);
       
        System.out.println("Lopez esta inscripto en un total de "+a.cantidadMateria()+" materias");
        System.out.println("Martinez esta inscripta en un total de "+a1.cantidadMateria()+" materias");
       
       
    }
    
}
