/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.part_1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class PART_1Test {
    
    public PART_1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PART_1.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckUsernameComplexity() {
        System.out.println("checkUsernameComplexity");
        String userName = "";
        boolean expResult = false;
        boolean result = PART_1.checkUsernameComplexity(userName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String userPassword = "";
        boolean expResult = false;
        boolean result = PART_1.checkPasswordComplexity(userPassword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckCellPhoneNumberFormat() {
        System.out.println("checkCellPhoneNumberFormat");
        String cellNumber = "";
        boolean expResult = false;
        boolean result = PART_1.checkCellPhoneNumberFormat(cellNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayRole() {
        System.out.println("displayRole");
        PART_1 instance = new PART_1();
        instance.displayRole();
        fail("The test case is a prototype.");
    }
    
}
