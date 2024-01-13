package com.example.netscape;

public class Business {
    String rpName;
    String location;
    String range;
    String businessTitle;
    String phone;
    Integer experience;
    String businessStat;

    public Business(String rpName, String location, String range, String businessTitle, String phone, Integer experience, String businessStat) {
        this.rpName = rpName;
        this.location = location;
        this.range = range;
        this.businessTitle = businessTitle;
        this.phone = phone;
        this.experience = experience;
        this.businessStat = businessStat;
    }

    public String getRpName() {
        return rpName;
    }

    public void setRpName(String rpName) {
        this.rpName = rpName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getBusinessTitle() {
        return businessTitle;
    }

    public void setBusinessTitle(String businessTitle) {
        this.businessTitle = businessTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getBusinessStat() {
        return businessStat;
    }

    public void setBusinessStat(String businessStat) {
        this.businessStat = businessStat;
    }
}
