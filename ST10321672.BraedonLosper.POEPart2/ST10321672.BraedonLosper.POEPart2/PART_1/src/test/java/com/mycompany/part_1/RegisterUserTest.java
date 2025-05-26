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
public class RegisterUserTest {
    
    public RegisterUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        RegisterUser instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        RegisterUser instance = null;
        instance.setUsername(username);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        RegisterUser instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RegisterUser instance = null;
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCellPhoneNumber() {
        System.out.println("getCellPhoneNumber");
        RegisterUser instance = null;
        String expResult = "";
        String result = instance.getCellPhoneNumber();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckUsernameComplexity() {
        System.out.println("checkUsernameComplexity");
        String username = "";
        RegisterUser instance = null;
        boolean expResult = false;
        boolean result = instance.checkUsernameComplexity(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        RegisterUser instance = null;
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckCellPhoneNumberFormat() {
        System.out.println("checkCellPhoneNumberFormat");
        String cellNumber = "";
        RegisterUser instance = null;
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumberFormat(cellNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayFullName() {
        System.out.println("displayFullName");
        RegisterUser instance = null;
        instance.displayFullName();
        fail("The test case is a prototype.");
    }
    
}
