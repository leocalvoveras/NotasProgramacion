/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasprogramacion;

/**
 *
 * @author Leo
 */
public class Boletin {
    
    private String nombreAlumno;
    private String apellidosAlumno;
    private double poJava;
    private double tareasJava;
    private double aptitudJava;
    private double tareasC;
    private double poC;
    private double aptitudC;

    public Boletin(String nombreAlumno, String apellidosAlumno, double poJava, double tareasJava, double aptitudJava, double tareasC, double poC, double aptitudC) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.poJava = poJava;
        this.tareasJava = tareasJava;
        this.aptitudJava = aptitudJava;
        this.tareasC = tareasC;
        this.poC = poC;
        this.aptitudC = aptitudC;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public double getPoJava() {
        return poJava;
    }

    public void setPoJava(double poJava) {
        this.poJava = poJava;
    }

    public double getTareasJava() {
        return tareasJava;
    }

    public void setTareasJava(double tareasJava) {
        this.tareasJava = tareasJava;
    }

    public double getAptitudJava() {
        return aptitudJava;
    }

    public void setAptitudJava(double aptitudJava) {
        this.aptitudJava = aptitudJava;
    }

    public double getTareasC() {
        return tareasC;
    }

    public void setTareasC(double tareasC) {
        this.tareasC = tareasC;
    }

    public double getPoC() {
        return poC;
    }

    public void setPoC(double poC) {
        this.poC = poC;
    }

    public double getAptitudC() {
        return aptitudC;
    }

    public void setAptitudC(double aptitudC) {
        this.aptitudC = aptitudC;
    }
    
    /// métodos propios ///
    
    /**
     * 
     * @return 
     */
    
    public double notaJava (){
        double nJava;
        
        nJava = (this.tareasJava*0.60)+ 
                (this.poJava*0.20)+ 
                (aptitudJava*0.20);
        
        return nJava;
    }
    
    public double notaCesharp (){
        double nCsharp;
        
        nCsharp = (this.tareasC*0.60)+ 
                (this.poC*0.20)+ 
                (aptitudC*0.20);
        
        return nCsharp;
    }
    
    public double notaGlobal (){
        double notaG;
        
        notaG = (notaJava()+notaCesharp())/2;
        
        return notaG;
    }
    
    @Override
    public String toString() {
        return "\n--------BOLETIN--------"
               + "\nApellidos y Nombre:" +apellidosAlumno +", " + nombreAlumno
               + "\n\nJAVA"
               + "\nTareas: " + tareasJava
               + "\nPO: " + poJava
               + "\nAptitud: " + aptitudJava
               + "\nNOTA FINAL JAVA: " + notaJava()
                
               + "\n\nCESHARP +"
               + "\nTareas: " + tareasC
               + "\nPO: " + poC
               + "\nAptitud: " + aptitudC
               + "\nNOTA FINAL C#: " + notaCesharp()
               + "\n\nNOTA FINAL PROGRAMACION: " + notaGlobal()
               +"-------------------\n";
              
    }
    
}
