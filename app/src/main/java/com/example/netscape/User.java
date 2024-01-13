package com.example.netscape;

public class User {

    String Name;
    String Location;
    String jobTitle;
    String range;
    String Purpose;
    String Status;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


    public User(String name, String location, String jobTitle, String range, String purpose, String status) {
        this.Name = name;
        this.Location = location;
        this.jobTitle = jobTitle;
        this.range = range;
        this.Purpose = purpose;
        this.Status = status;
    }


}
