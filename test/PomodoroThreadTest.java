/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entities.Ciclo.Ciclo;
import Entities.Ciclo.Pomodoro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class PomodoroThreadTest {
    
    public PomodoroThreadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void verificarProblemas() throws InterruptedException {
        assertTrue("Problema con el tiempo del método.", Pomodoro.reducirVidaCiclo(new Ciclo(1)));
    }
}
