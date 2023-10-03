package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
       id = nextId;
       nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return  getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public String toString() {
//        String result= System.lineSeparator() +
//                "ID: " + this.getId() + System.lineSeparator() +
//                "Name: " + this.getName() + System.lineSeparator() +
//                "Employer: " + (this.getEmployer() != null ? this.getEmployer().getValue(): "Data not available") + System.lineSeparator() +
//                "Location: " + (this.getLocation() != null ? this.getLocation().getValue(): "Data not available") + System.lineSeparator() +
//                "Position Type: " + (this.getPositionType()  != null ? this.getPositionType().getValue(): "Data not available") + System.lineSeparator() +
//                "Core Competency: " + (this.getCoreCompetency()  != null ? this.getCoreCompetency().getValue(): "Data not available")  + System.lineSeparator();
//
//        return result;
//    }

//    change so that the "Data not available" works follow
//    CJ video with append.

    @Override
    public String toString() {
        StringBuilder  sb = new StringBuilder();

                        sb.append("ID: ").append(job.getId()).append(System.lineSeparator());
                        sb.append("Name: ").append(name.isEmpty() ? "Data not available" : name).append(System.lineSeparator());
                        sb.append("Employer: ").append(employer.getValue().isEmpty() ? "Data not available" : employer).append(System.lineSeparator());
                        sb.append("Location: ").append(location.getValue().isEmpty() ? "Data not available" : location).append(System.lineSeparator());
                        sb.append("Position Type: ").append(positionType.getValue().isEmpty() ? "Data not available" : positionType).append(System.lineSeparator());
                        sb.append("Core Competency: ").append(coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency).append(System.lineSeparator());

              return sb.toString();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }
}
