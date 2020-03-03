package com.armory.solution.armorysolution;

public class Activity {

    private String date;
    private String activity;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "date='" + date + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }

}

