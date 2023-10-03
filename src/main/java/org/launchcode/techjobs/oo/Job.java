package org.launchcode.techjobs.oo;

import com.sun.source.tree.ReturnTree;
import java.lang.System;
import java.util.Objects;

import static java.lang.System.lineSeparator;

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
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("ID: ").append(getId()).append(System.lineSeparator());
//        sb.append("Name: ").append(name != null && !name.isEmpty() ? name : "Data not available").append(System.lineSeparator());
//        sb.append("Employer: ").append(employer != null && employer.getValue() != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available").append(System.lineSeparator());
//        sb.append("Location: ").append(location != null && location.getValue() != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available").append(System.lineSeparator());
//        sb.append("Position Type: ").append(positionType != null && positionType.getValue() != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available").append(System.lineSeparator());
//        sb.append("Core Competency: ").append(coreCompetency != null && coreCompetency.getValue() != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available").append(System.lineSeparator());
//
//        return sb.toString();
//    }
@Override
public String toString() {
    return
            System.lineSeparator() +  "ID: " + this.getId() +
            System.lineSeparator() +  "Name: " + this.getName() +
            System.lineSeparator() +  "Employer: " + (this.getEmployer().getValue() == "" ? "Data not available" : this.getEmployer()) +
            System.lineSeparator() +  "Location: " + (this.getLocation().getValue() == "" ? "Data not available" : this.getLocation()) +
            System.lineSeparator() +  "Position Type: " + (this.getPositionType().getValue() == "" ? "Data not available" : this.getPositionType()) +
            System.lineSeparator() +  "Core Competency: " + (this.getCoreCompetency().getValue() == ""? "Data not available" : this.getCoreCompetency())+
            System.lineSeparator();

//    return newLine + idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
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
