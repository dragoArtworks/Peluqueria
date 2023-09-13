package peluqueria;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael Naranjo y ESteban Rivera
 */
public class Peluquero extends Persona {

    final int corteCaballero = 8000;
    final int corteDama = 10500;
    final int tinturaCabello = 40000;
    final int peinados = 15000;

    private int cantCortesCaballero;
    private int cantCortesDama;
    private int cantTinturasCabello;
    private int cantPeinados;
    private int totalCortesCaballero;
    private int totalCortesDama;
    private int totalTinturasCabello;
    private int totalPeinados;
    private int totalServicios;//numero de servicios realizados
    private int totalRecaudado;//dinero obtenido en el dia
    
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

    public int getTotalCortesCaballero() {
        return totalCortesCaballero;
    }

    public void setTotalCortesCaballero(int totalCortesCaballero) {
        this.totalCortesCaballero = totalCortesCaballero;
    }

    public int getTotalCortesDama() {
        return totalCortesDama;
    }

    public void setTotalCortesDama(int totalCortesDama) {
        this.totalCortesDama = totalCortesDama;
    }

    public int getTotalTinturasCabello() {
        return totalTinturasCabello;
    }

    public void setTotalTinturasCabello(int totalTinturasCabello) {
        this.totalTinturasCabello = totalTinturasCabello;
    }

    public int getTotalPeinados() {
        return totalPeinados;
    }

    public void setTotalPeinados(int totalPeinados) {
        this.totalPeinados = totalPeinados;
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

   

    public Peluquero iniciarDia() {
        Peluquero nuevoPeluquero = new Peluquero();

        nuevoPeluquero.setCantCortesCaballero(0);
        nuevoPeluquero.setCantCortesDama(0);
        nuevoPeluquero.setCantPeinados(0);
        nuevoPeluquero.setCantTinturasCabello(0);
        return nuevoPeluquero;
    }

    public int calcularCorteCaballero(int cantCortesCaballero) {

        return cantCortesCaballero * corteCaballero;
    }

    public int calcularCorteDama(int cantCortesDama) {

        return cantCortesDama * corteDama;
    }

    public int calcularTinturaCabello(int cantTinturasCabello) {

        return cantTinturasCabello * tinturaCabello;
    }

    public int calcularPeinados(int cantPeinados) {

        return cantPeinados * peinados;
    }

    public int calcularTotalServicios() {
        return cantCortesCaballero+cantCortesDama+cantPeinados+cantTinturasCabello;
    }
     public int calcularTotalRecaudado() {
        return totalCortesCaballero+totalCortesDama+totalPeinados+totalTinturasCabello;
    }

    //leerdatos enteros
    public int leerDatoTipoEntero(String mensaje) {
        int valor = 0;
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            return valor;
        } catch (Exception errorIngreso) {
            errorIngreso.printStackTrace();
            return 0;
        }

    }

    //rellenar los datos de los peluqueros
    public Peluquero ingresarDatosPeluquero(String nombre, String apellido,int edad) {
        Peluquero nuePeluquero = new Peluquero();

        int cortes = 0;
        int corteCab = 0;
        int corteDam = 0;
        int tintura = 0;
        int peinado = 0;
        int totalServicios = 0;
        int totalRecaudado = 0;
        nuePeluquero.setNombre(nombre);
        nuePeluquero.setApellido(apellido);
        nuePeluquero.setEdad(edad);

        cortes = leerDatoTipoEntero("ingrese el tipo de corte que se va a realizar:\n 1.corte caballero($8.000)\n 2.corte dama($10.500)\n3.tintura ($40.000)\n4.peinados ($15.000)\n");

        switch (cortes) {
            case 1:
                corteCab = nuePeluquero.leerDatoTipoEntero("cuantos cortes de caballero desea realizar: ");
                break;
            case 2:
                corteDam = nuePeluquero.leerDatoTipoEntero("cuantos cortes de dama desea realizar: ");
                break;
            case 3:
                 tintura = nuePeluquero.leerDatoTipoEntero("cuantos peinados desea realizar");
                break;
            case 4:
                peinado = nuePeluquero.leerDatoTipoEntero("cuantas tinturas desea realizar: ");
               
                break;
        }
        nuePeluquero.setCantCortesCaballero(cantCortesCaballero+corteCab);
        nuePeluquero.setCantCortesDama(cantCortesDama + corteDam);
        nuePeluquero.setCantTinturasCabello(cantTinturasCabello + tintura);
        nuePeluquero.setCantPeinados(cantPeinados + peinado);

        nuePeluquero.setTotalCortesCaballero(totalCortesCaballero+calcularCorteCaballero(corteCab) );
        nuePeluquero.setTotalCortesDama(totalCortesDama+calcularCorteDama(corteDam));
        nuePeluquero.setTotalPeinados(totalPeinados+calcularPeinados(peinado));
        nuePeluquero.setTotalTinturasCabello(totalTinturasCabello+calcularTinturaCabello(tintura));
        
      //  nuePeluquero.setTotalServicios(totalServicios+calcularTotalServicios());
      //  nuePeluquero.setTotalRecaudado(totalRecaudado+calcularTotalRecaudado());
        
        return nuePeluquero;

    }
}
