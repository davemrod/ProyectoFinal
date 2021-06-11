/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.io.Serializable;

/**
 *
 * @author David Emilio
 */
public class Constructores implements Serializable {
    
    private String huesped,  ciudad, habitacion, tipoHabitacion, diasHospedaje, diaLlegada, diaSalida2;
    private int piso, totalconCargos, totalsinCargos, totalPersonas;

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDiasHospedaje() {
        return diasHospedaje;
    }

    public void setDiasHospedaje(String diasHospedaje) {
        this.diasHospedaje = diasHospedaje;
    }

    public String getDiaLlegada() {
        return diaLlegada;
    }

    public void setDiaLlegada(String diaLlegada) {
        this.diaLlegada = diaLlegada;
    }

    public String getDiaSalida2() {
        return diaSalida2;
    }

    public void setDiaSalida2(String diaSalida2) {
        this.diaSalida2 = diaSalida2;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getTotalconCargos() {
        return totalconCargos;
    }

    public void setTotalconCargos(int totalconCargos) {
        this.totalconCargos = totalconCargos;
    }

    public int getTotalsinCargos() {
        return totalsinCargos;
    }

    public void setTotalsinCargos(int totalsinCargos) {
        this.totalsinCargos = totalsinCargos;
    }

    public int getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }

    public Constructores(String huesped, String ciudad, String habitacion, String tipoHabitacion, String diasHospedaje, String diaLlegada, String diaSalida2, int piso, int totalconCargos, int totalsinCargos, int totalPersonas) {
        this.huesped = huesped;
        this.ciudad = ciudad;
        this.habitacion = habitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.diasHospedaje = diasHospedaje;
        this.diaLlegada = diaLlegada;
        this.diaSalida2 = diaSalida2;
        this.piso = piso;
        this.totalconCargos = totalconCargos;
        this.totalsinCargos = totalsinCargos;
        this.totalPersonas = totalPersonas;
    }

    public Constructores() {
    }

    @Override
    public String toString() {
        return "Constructores{" + "huesped=" + huesped + ", ciudad=" + ciudad + ", habitacion=" + habitacion + ", tipoHabitacion=" + tipoHabitacion + ", diasHospedaje=" + diasHospedaje + ", diaLlegada=" + diaLlegada + ", diaSalida2=" + diaSalida2 + ", piso=" + piso + ", totalconCargos=" + totalconCargos + ", totalsinCargos=" + totalsinCargos + ", totalPersonas=" + totalPersonas + '}';
    }
}
