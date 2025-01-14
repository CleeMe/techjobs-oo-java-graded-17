package org.launchcode.techjobs.oo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.Test;
import org.yaml.snakeyaml.tokens.Token;

import javax.naming.Name;
import javax.swing.text.Position;
import java.util.IdentityHashMap;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


//        make 5 assertEquals tests
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());


//        make 5 assertTrue tests
        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }


//    this should fail because I have zero lineSeparators in the code yet.
//    testing still confuses me and I have not grasped how to tell if it is
//    a well written test working correctly or a poorly written test not working
    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Employer employer = new Employer();
        Location location = new Location();
        PositionType positionType = new PositionType();
        CoreCompetency coreCompetency = new CoreCompetency();

        Job job = new Job("", employer, location, positionType, coreCompetency);
        String result = System.lineSeparator() + job.toString() + System.lineSeparator();

        assertTrue(result.startsWith(System.lineSeparator()));
        assertTrue(result.endsWith(System.lineSeparator()));
    }


//    whew today code is different for me.
@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job job = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

String expectedReturn =
        System.lineSeparator() +
        "ID: " + job.getId() + System.lineSeparator() +
        "Name: Product tester"  + System.lineSeparator() +
        "Employer: ACME" + System.lineSeparator() +
        "Location: Desert" + System.lineSeparator() +
        "Position Type: Quality control" + System.lineSeparator() +
        "Core Competency: Persistence"  + System.lineSeparator();
assertEquals(expectedReturn, job.toString());
}

//ok am going to copy and paste the object in the previous test and change it to be data not available for test due to no data
@Test
    public void testToStringHandlesEmptyField()  {
        Job job = new Job("", new Employer(""),
                new Location(""), new PositionType(""),
                new CoreCompetency(""));

        String expectedDna =

                System.lineSeparator() +
                        "ID: " + job.getId() + System.lineSeparator() +
                        "Name: " + job.getName() + System.lineSeparator() +
                        "Employer: Data not available" + System.lineSeparator() +
                        "Location: Data not available" + System.lineSeparator() +
                        "Position Type: Data not available" + System.lineSeparator() +
                        "Core Competency: Data not available"  + System.lineSeparator();

        assertEquals(expectedDna, job.toString());

}
}
