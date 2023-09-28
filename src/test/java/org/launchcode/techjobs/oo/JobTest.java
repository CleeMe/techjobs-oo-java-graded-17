package org.launchcode.techjobs.oo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.Test;

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

        assertEquals("Product tester", job.getName());
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
        Job job = new Job();
        String result = job.toString();
        assertTrue(result.startsWith(System.lineSeparator()));
        assertTrue(result.endsWith(System.lineSeparator()));
    }


}
