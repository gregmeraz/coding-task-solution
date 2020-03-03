package com.armory.solution.armorysolution;

import java.time.Instant;
import java.util.Comparator;

public class ActivitiesComparator implements Comparator<Activity> {

    @Override
    public int compare(Activity activity, Activity activity2) {
        return Instant.parse(activity.getDate()).compareTo(Instant.parse(activity2.getDate()));
    }

}
