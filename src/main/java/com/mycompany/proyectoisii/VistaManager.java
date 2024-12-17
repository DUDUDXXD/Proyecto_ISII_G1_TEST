/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoisii;

import com.mycompany.proyectoisii.PantallaListadoBotiquin;

public class VistaManager {
    private Modelo.GestorDePacientes gestor;
    private Modelo.GestorDeEnfermedades gestorEnfermedades;
    private Controlador controlador;
    Modelo modelo = new Modelo();
    

    public VistaManager() {
        // Inicializar el modelo y el controlador
        gestor = new Modelo.GestorDePacientes();
        gestorEnfermedades = new Modelo.GestorDeEnfermedades();
        controlador = new Controlador(gestor);
        

        // Añadir datos de prueba al modelo
        gestorEnfermedades.precargarEnfermedades();
        Modelo.Paciente paciente1 = new Modelo.Paciente("Juan","Perez", 65, 13, "Nada");
        Modelo.Enfermedad enfermedad1 = new Modelo.Enfermedad("Diabetes", "Insulina", "5ml", "Diario", true);
        paciente1.anyadirEnfermedad(enfermedad1);
        gestor.anyadirPaciente(paciente1);
    }

    public void mostrarPantallaMedicamentoPaciente() {
        PantallaMedicamentoPaciente pantallaMedicamentoPaciente = new PantallaMedicamentoPaciente(controlador);
        pantallaMedicamentoPaciente.setVisible(true);
    }
    
    public void mostrarPantallaListaEnfermedades(){
        PantallaListaEnfermedades pantallaListaEnfermedades = new PantallaListaEnfermedades(controlador);
        pantallaListaEnfermedades.setVisible(true);
    }

    public void mostrarPantallaLogin(){
        PantallaLogin pantallaLogin = new PantallaLogin();
        pantallaLogin.setVisible(true);
    }
    
    public void mostrarPantallaEnfermeros(){
        PantallaEnfermeros pantallaEnfermeros = new PantallaEnfermeros();
        pantallaEnfermeros.setVisible(true);
    }

    public void mostrarPantallaMedicos(){
        PantallaMedicos pantallaMedicos = new PantallaMedicos();
        pantallaMedicos.setVisible(true);
    }

    public void mostrarPantallaBuscarMedicamentos(){
        PantallaBuscarMedicamentos pantallaBuscarMedicamentos = new PantallaBuscarMedicamentos();
        pantallaBuscarMedicamentos.setVisible(true);
    }

    public void mostrarPantallaListadoBotiquin(){
        PantallaListadoBotiquin pantallaListadoBotiquin = new PantallaListadoBotiquin();
        pantallaListadoBotiquin.setVisible(true);
    }

    public void mostrarPantallaListaMedicamentos(){
        PantallaListaMedicamentos pantallaListaMedicamentos = new PantallaListaMedicamentos();
        pantallaListaMedicamentos.setVisible(true);
    }

    public void mostrarPantallaListaPacientes(){
        PantallaListaPacientes pantallaListaPacientes = new PantallaListaPacientes(controlador);
        pantallaListaPacientes.setVisible(true);
    }

    public void mostrarPantallaHistorialPaciente(String nombrePaciente){
        PantallaHistorialPaciente pantallaHistorialPaciente = new PantallaHistorialPaciente(nombrePaciente);
        pantallaHistorialPaciente.setVisible(true);
    }
    // Añadir más métodos para manejar otras pantallas si es necesario
}


