package com.company;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Objects;
public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
//Constructors
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

    public int getId() {
        return id;
    }



    public String toString () {
        if (this.getName() == null && this.getEmployer() == null && this.getLocation() == null && this.getPositionType() == null && this.getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        }
        int jobValuesId = this.getId();
        String jobValuesName = this.getName();
        String jobValuesEmployer = this.getEmployer().toString();
        String jobValuesLocation = this.getLocation().toString();
        String jobValuesPositionType = this.getPositionType().toString();
        String jobValuesCoreCompetency = this.getCoreCompetency().toString();

        if (jobValuesName == null) {
            jobValuesName = "Data not available";
        } if (jobValuesEmployer == null) {
            jobValuesEmployer = "Data not available";
        } if (jobValuesLocation == null) {
            jobValuesLocation = "Data not available";
        } if (jobValuesPositionType == null) {
            jobValuesPositionType = "Data not available";
        } if (jobValuesCoreCompetency == null) {
            jobValuesCoreCompetency = "Data not available";
        }

        return ("\nID: " + jobValuesId + "\nName: " + jobValuesName + "\nEmployer: " + jobValuesEmployer + "\nLocation: " + jobValuesLocation + "\nPosition Type: " + jobValuesPositionType + "\nCore Competency: " + jobValuesCoreCompetency + "\n");
    }

    //Equals and hashCode Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }
}
