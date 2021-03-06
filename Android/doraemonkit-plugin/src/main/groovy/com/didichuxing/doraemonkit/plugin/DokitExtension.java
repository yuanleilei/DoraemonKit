package com.didichuxing.doraemonkit.plugin;

import com.quinn.hunter.transform.RunVariant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jint on 07/10/2018.
 */
public class DokitExtension {

    public RunVariant runVariant = RunVariant.DEBUG;
    public boolean duplcatedClassSafeMode = false;
    /**
     * dokit 插件开关 字段权限必须为public 否则无法进行赋值
     */
    public boolean dokitPluginSwitch = true;
    /**
     * 慢函数开关
     */
    public boolean slowMethodSwitch = true;
    /**
     * 单位为ms 默认500ms
     */
    public int thresholdTime = 500;

    public List<String> packageNames = new ArrayList<>();


    @Override
    public String toString() {
        return "DokitExtension{" +
                "runVariant=" + runVariant +
                ", duplcatedClassSafeMode=" + duplcatedClassSafeMode +
                ", dokitPluginSwitch=" + dokitPluginSwitch +
                ", slowMethodSwitch=" + slowMethodSwitch +
                ", thresholdTime=" + thresholdTime +
                ", packageNames=" + packageNames +
                '}';
    }
}
