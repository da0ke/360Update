package cn.da0ke.update;

import android.app.Activity;
import android.graphics.Color;

import com.qihoo.appstore.common.updatesdk.lib.UpdateHelper;

/**
 * Created by da0ke on 2017/11/29
 */

public class UpdateTool {
    private Activity activity;
    private String appName;

    public UpdateTool(Activity activity, String appName) {
        this.activity = activity;
    }

    public void doUpdate() {
        do360Update();
    }

    private void do360Update() {
        UpdateHelper.getInstance().init(activity.getApplicationContext(), Color.parseColor("#0A93DB"));
        UpdateHelper.getInstance().manualUpdate(activity.getPackageName());
    }
}
