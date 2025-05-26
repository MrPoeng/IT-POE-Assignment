/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andre
 */
public class unit_test {
    
      public unit_test() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Starting UserService Tests...");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Finished UserService Tests.");
    }

    @BeforeEach
    public void setUp() {
        // Runs before each test
    }

    @AfterEach
    public void tearDown() {
        // Runs after each test
    }

    // ------------------------
    // ✅ Test Password Validity
    // ------------------------
    @Test
    public void testValidPassword() {
        assertTrue(UserService.isValidPassword("Secure1@"));
        assertFalse(UserService.isValidPassword("noCaps1@"));
        assertFalse(UserService.isValidPassword("NOLOWERCASE1@"));
        assertFalse(UserService.isValidPassword("NoSymbol123"));
        assertFalse(UserService.isValidPassword("Short1@"));
    }

    // ------------------------
    // ✅ Test Phone Validity
    // ------------------------
    @Test
    public void testValidPhone() {
        assertTrue(UserService.isValidPhone("0723456789"));
        assertTrue(UserService.isValidPhone("0823456789"));
        assertFalse(UserService.isValidPhone("0523456789"));  // starts with 05
        assertFalse(UserService.isValidPhone("07234567"));    // too short
        assertFalse(UserService.isValidPhone("07234567890")); // too long
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
