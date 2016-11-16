package com.allen.library;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by allen on 2016/11/14.
 * Activity控制工具类
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
