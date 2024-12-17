/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoisii;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dudu
 */
public class Controlador {
    private Modelo.GestorDePacientes gestor;
    public Controlador(Modelo.GestorDePacientes gestor) {
        this.gestor = gestor;
    }
    public List<Modelo.Paciente> obtenerPacientesConEnfermedadesConDosis() {
        List<Modelo.Paciente> pacientesConMedicacion = new ArrayList<>();
        for (Modelo.Paciente paciente : gestor.obtenerTodosLosPacientes()) {  // Ahora puedes acceder sin problemas
            boolean tieneMedicacion = false;
            for (Modelo.Enfermedad enfermedad : paciente.getEnfermedades()) {
                if (enfermedad.tieneDosis()) {
                    tieneMedicacion = true;
                    break;
                }
            }
            if (tieneMedicacion) {
                pacientesConMedicacion.add(paciente);
            }
        }
        return pacientesConMedicacion;
    }
    
    
    
    public List<Modelo.Enfermedad> obtenerEnfermedadesPorNombre(String nombre){
        List<Modelo.Enfermedad> enfermedadesEncontradas = new ArrayList<>();
    for (Modelo.Enfermedad enfermedad : Modelo.GestorDeEnfermedades.obtenerTodasLasEnfermedades()) {
        if (enfermedad.getNombre().equalsIgnoreCase(nombre)) {
            enfermedadesEncontradas.add(enfermedad);
        }
    }
    return enfermedadesEncontradas;
    }
}
