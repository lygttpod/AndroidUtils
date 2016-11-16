package com.allen.utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Allen on 2016/7/22.
 *
 * 文件操作工具类
 */
public class FileUtils {

    // 方法：从asset中获取文件并读取数据
    public static String getFromAsset(Context context, String fileName) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();

        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            while((str = br.readLine())!=null){
                stringBuffer.append(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
