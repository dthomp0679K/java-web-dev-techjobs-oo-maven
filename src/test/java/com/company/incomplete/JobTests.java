package com.company.incomplete;
import static org.junit.jupiter.api.Assertions.*;
import com.company.Job;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.company.CoreCompetency;
import com.company.Employer;
import com.company.PositionType;

import com.company.Location;




public class JobTests {
static  Job testJob1, testJob2, testJob3, testJob4, testJob5, testJob6;
@BeforeAll
        static void createobject() {
     testJob1 = new Job();
     testJob2 = new Job();
     testJob3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
     testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
     testJob5 = new Job("Data not available", new Employer("Walgreen"), new Location("Data not available"), new PositionType("ASM"), new CoreCompetency("Data not available"));
     testJob6 = new Job();
    //Making sure different Id's are assigned:
}
    @Test
    public void testSettingJobId() {
        assertTrue(testJob1.getId() + 1 == testJob2.getId());
    }
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly



    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(3, testJob3.getId());
        assertEquals("Product Tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().toString());
        assertEquals("Desert", testJob3.getLocation().toString());
        assertEquals("Quality Control", testJob3.getPositionType().toString());
        assertEquals("Persistence", testJob3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));

    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {
        assertTrue(testJob3.toString().startsWith("\n"));
        assertTrue(testJob3.toString().endsWith("\n"));

    }

    @Test
    public void testToStringHasLabelsForEachField() {

        String expected = String.format("\nID: %d\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n", testJob3.getId(), testJob3.getName(), testJob3.getEmployer(), testJob3.getLocation(), testJob3.getPositionType(), testJob3.getCoreCompetency());
        String actual = testJob3.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringDataNotAvailable() {
        String expected = String.format("\nID: %d\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n", testJob5.getId(), testJob5.getName(), testJob5.getEmployer(), testJob5.getLocation(), testJob5.getPositionType(), testJob5.getCoreCompetency());
        String actual = testJob5.toString();
        assertEquals(expected, actual);
        }

  //  public void toStringDoesNotExist() {
      //  String toStringAllBlank = testJob5.toString();
      //  assertTrue(toStringAllBlank.("OOPS! This job does not seem to exist.");
  }

