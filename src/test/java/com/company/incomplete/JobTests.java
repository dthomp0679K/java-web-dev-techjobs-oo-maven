package com.company.incomplete;
import static org.junit.jupiter.api.Assertions.*;
import com.company.Job;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.company.CoreCompetency;
import com.company.Employer;
import com.company.PositionType;
import com.company.Main;
import com.company.Location;



public class JobTests {

    @Before
    public void createJobObjects(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
    }
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    Job testJob1 = new Job();
    Job testJob2 = new Job();

    @Test
    public void testSettingJobId() {
       assertFalse(testJob1.equals(testJob2));
       assertTrue(testJob2.getId() - 1 == testJob1.getId());

        //id values are not the same
        //id values differ by one

    }



    @Test
    public void testJobConstructorSetsAllFields() {
        // declared new job object
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

      //Use assert statements to test that the constructor correctly assigns the class and value of each field.
assertTrue(testJob instanceof Job);
//The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
assertTrue(testJob.getName() == "Product tester");

assertTrue(testJob.getEmployer() instanceof Employer);
assertTrue(testJob.getEmployer().getValue() ==  "ACME");

assertTrue(testJob.getLocation() instanceof Location);
assertTrue(testJob.getLocation().getValue() == "Desert");

assertTrue(testJob.getPositionType() instanceof PositionType);
assertTrue(testJob.getPositionType().getValue() == "Quality control");

assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
// test chekcing if these two object are false.
    assertFalse(Job1.equals(Job2));
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {

    }

    @Test
    public void testToStringHasLabelsForEachField() {

    }

    @Test
    public void testToStringDataNotAvailable() {

    }
}
