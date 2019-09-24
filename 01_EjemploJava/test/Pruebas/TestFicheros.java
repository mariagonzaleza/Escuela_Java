/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ejemploJava.*; 
import Threads.HiloFichero; 
import ejemplojava.StringAuxV1;
import ejemplojava.StringAuxV2;
import ejemplojava.StringAuxV3;

 

/**
 *
 * @author alumno
 */
public class TestFicheros {

     @Test
     public void TestFicheros() {
   
    StringAuxV1 version1 = new StringAuxV1(); 
    StringAuxV2 version2 = new StringAuxV2();
    StringAuxV3 version3 = new StringAuxV3(); 
    String ruta= "C:\\Users\\alumno\\Desktop\\Escuela_JAVA\\Escuela_Java.git\\01_EjemploJava\\texto.txt";
    // HiloFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\Escuela_JAVA\\Escuela_Java.git\\01_EjemploJava\\texto.txt");
    // HiloFichero.leerFicheroEjem("C:\\Users\\alumno\\Desktop\\Escuela_JAVA\\Escuela_Java.git\\01_EjemploJava\\texto.txt");
    HiloFichero hiloFichero= new HiloFichero(ruta, version1); 
    hiloFichero.leerFicheroEjem();
     }
}
