package com.viollan.myvoicerecord;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
/**
 * Created by lordp on 03.05.2017.
 */

public class DeviceAdminDemo extends DeviceAdminReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onEnabled(Context context, Intent intent) {
    }

    public void onDisabled(Context context, Intent intent) {
    }
}
