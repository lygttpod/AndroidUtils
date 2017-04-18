package com.allen.androidutils;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.allen.utils.ToastUtils;
import com.allen.utils.permission.BasePermissionActivity;
import com.allen.utils.permission.PermissionListener;

import java.util.List;

public class MainActivity extends BasePermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestRuntimePermission(new String[]{Manifest.permission.CALL_PHONE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.ACCESS_FINE_LOCATION},
                new PermissionListener() {
                    @Override
                    public void onGranted() {
                        ToastUtils.showShort(MainActivity.this, "应用已授权！");
                    }

                    @Override
                    public void onDenied(List<String> deniedPermission) {
                        for (String permission :
                                deniedPermission) {
                            Toast.makeText(MainActivity.this, "申请权限" + permission + "被拒绝！",Toast.LENGTH_SHORT).show();

                        }

                    }
                });
    }
}
