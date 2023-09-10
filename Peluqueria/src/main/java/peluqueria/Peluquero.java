package peluqueria;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael Naranjo y ESteban Rivera
 */
public class Peluquero extends Persona{
    final int corteCaballero=8000;
    final int corteDama=10500;
    final int tinturaCabello=40000;
    final int peinados=15000;
    
    private int cantCortesCaballero;
    private int cantCortesDama;
    private int cantTinturasCabello;
    private int cantPeinados;
    private int totalServicios;//numero de servicios realizados
    private int totalRecaudado;//dinero obtenido en el dia
    private int cantServicios;//sumamos lo que genera por cada servicio

    public Peluquero() {
    }

    public Peluquero(int cantCortesCaballero, int cantCortesDama, int cantTinturasCabello, int cantPeinados, int totalServicios, int totalRecaudado, int cantServicios, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.cantCortesCaballero = cantCortesCaballero;
        this.cantCortesDama = cantCortesDama;
        this.cantTinturasCabello = cantTinturasCabello;
        this.cantPeinados = cantPeinados;
        this.totalServicios = totalServicios;
        this.totalRecaudado = totalRecaudado;
        this.cantServicios = cantServicios;
    }

   

    public int getCantCortesCaballero() {
        return cantCortesCaballero;
    }

    public void setCantCortesCaballero(int cantCortesCaballero) {
        this.cantCortesCaballero = cantCortesCaballero;
    }

    public int getCantCortesDama() {
        return cantCortesDama;
    }

    public void setCantCortesDama(int cantCortesDama) {
        this.cantCortesDama = cantCortesDama;
    }

    public int getCantTinturasCabello() {
        return cantTinturasCabello;
    }

    public void setCantTinturasCabello(int cantTinturasCabello) {
        this.cantTinturasCabello = cantTinturasCabello;
    }

    public int getCantPeinados() {
        return cantPeinados;
    }

    public void setCantPeinados(int cantPeinados) {
        this.cantPeinados = cantPeinados;
    }

    public int getTotalServicios() {
        return totalServicios;
    }

    public void setTotalServicios(int totalServicios) {
        this.totalServicios = totalServicios;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(int totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public int getCantServicios() {
        return cantServicios;
    }

    public void setCantServicios(int cantServicios) {
        this.cantServicios = cantServicios;
    }
    
    
    public Peluquero iniciarDia(){
        Peluquero nuevoPeluquero= new Peluquero();
        
        nuevoPeluquero.setCantCortesCaballero(0);
        nuevoPeluquero.setCantCortesDama(0);
        nuevoPeluquero.setCantPeinados(0);
        nuevoPeluquero.setCantTinturasCabello(0);
        nuevoPeluquero.setCantServicios(0);
        return nuevoPeluquero;
    }
    public int calcularCorteCaballero(int cantCortesCaballero){
        Peluquero nuevoPeluquero= new Peluquero();
        nuevoPeluquero.setCantCortesCaballero(this.cantCortesCaballero+cantCortesCaballero);
        
        int totalCaballero=0;
        totalCaballero=cantCortesCaballero*corteCaballero;
        nuevoPeluquero.setTotalRecaudado(totalCaballero+cantServicios);///revisar que haga la suma correctamente
        return totalCaballero;
    }
    
    public int calcularCorteDama(int cantCortesDama){
    Peluquero nuevoPeluquero= new Peluquero();
    nuevoPeluquero.setCantCortesDama(this.cantCortesDama+cantCortesDama);
    int totalDama=0;
    totalDama=cantCortesDama*corteDama;
    nuevoPeluquero.setTotalRecaudado(totalDama+cantServicios);///revisar que haga la suma correctamente
    return totalDama;
    }
    
    public int calcularTinturaCabello(int cantTinturasCabello){
    Peluquero nuevoPeluquero= new Peluquero();
    nuevoPeluquero.setCantCortesCaballero(this.cantTinturasCabello+cantTinturasCabello);
    int totalTinturas=0;
    totalTinturas=cantTinturasCabello*tinturaCabello;
    nuevoPeluquero.setTotalRecaudado(totalTinturas+cantServicios);///revisar que haga la suma correctamente
    return totalTinturas;
    }
    
    public int calcularPeinados(int cantPeinados){
    Peluquero nuevoPeluquero= new Peluquero();
    nuevoPeluquero.setCantCortesCaballero(this.cantPeinados+cantPeinados);
    
    int totalPeinados=0;
    totalPeinados=cantPeinados*peinados;
    nuevoPeluquero.setCantServicios(totalPeinados+cantServicios);///revisar que haga la suma correctamente
    return totalPeinados;
    }
    
    public void calcularTotalServicios(){
    Peluquero nuevoPeluquero= new Peluquero();
    
    nuevoPeluquero.setCantServicios(nuevoPeluquero.getCantCortesCaballero()+nuevoPeluquero.getCantCortesDama()+
                nuevoPeluquero.getCantPeinados()+ nuevoPeluquero.getCantTinturasCabello());
    }
    
  /*  public void mostrarTotalDia(){
    Peluquero nuevoPeluquero= new Peluquero();
        JOptionPane.showMessageDialog(null, "total re");
    
    }*/
    
    
}
