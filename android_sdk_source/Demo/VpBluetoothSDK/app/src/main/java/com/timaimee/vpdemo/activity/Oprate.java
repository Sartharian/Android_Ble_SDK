package com.timaimee.vpdemo.activity;

/**
 * Created by Administrator on 2017/11/25.
 */

public interface Oprate {
    String PWD_COMFIRM = "1、设备密码-验证";
    String PERSONINFO_SYNC = "2、个人信息-设置";
    String SETTING_FIRST = "<--先操作1、2";
    String PWD_MODIFY = "设备密码-修改";
    String TEMPTURE_DETECT_START = "测量温度-开始";
    String TEMPTURE_DETECT_STOP = "测量温度-结束";
    String HEART_DETECT_START = "测量心率-开始";
    String HEART_DETECT_STOP = "测量心率-结束";
    String BP_DETECT_START = "测量血压-开始";
    String BP_DETECT_STOP = "测量血压-结束";
    String BP_DETECTMODEL_SETTING = "血压模式-设置";
    String BP_DETECTMODEL_SETTING_ADJUSTE = "血压模式[动态调整]-设置";
    String BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL = "血压模式[动态调整]-取消";
    String BP_DETECTMODEL_READ = "血压模式-读取";
    String SPORT_CURRENT_READ = "当前计步-读取";
    String CAMERA_START = "拍照模式-开始";
    String CAMERA_STOP = "拍照模式-停止";
    String ALARM_SETTING = "闹钟-设置";
    String ALARM_READ = "闹钟-读取";
    String ALARM_NEW_READ = "新闹钟-读取";
    String ALARM_NEW_ADD = "新闹钟-添加";
    String ALARM_NEW_MODIFY = "新闹钟-修改";
    String ALARM_NEW_DELETE = "新闹钟-删除";
    String ALARM_NEW_LISTENER = "新闹钟-监听状态改变";
    String LONGSEAT_SETTING_OPEN = "久坐-打开";
    String LONGSEAT_SETTING_CLOSE = "久坐-关闭";
    String LONGSEAT_READ = "久坐-读取";
    String LANGUAGE_CHINESE = "语言设置-中文";
    String LANGUAGE_ENGLISH = "语言设置-英文";
    String BATTERY = "电池状态-读取";
    String NIGHT_TURN_WRIST_OPEN = "夜间转腕-打开";
    String NIGHT_TURN_WRIST_CLOSE = "夜间转腕-关闭";
    String NIGHT_TURN_WRIST_READ = "夜间转腕-读取";
    String NIGHT_TURN_WRIST_CUSTOM_TIME = "夜间转腕-自定义时间";
    String NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL = "夜间转腕-自定义时间和等级";
    String FINDPHONE = "手机防丢";
    String CHECK_WEAR_SETING_OPEN = "佩戴检测-打开";
    String CHECK_WEAR_SETING_CLOSE = "佩戴检测-关闭";
    String FINDDEVICE_SETTING_OPEN = "设备防丢-打开";
    String FINDDEVICE_SETTING_CLOSE = "设备防丢-关闭";
    String FINDDEVICE_READ = "设备防丢-读取";
    String DEVICE_COUSTOM_READ = "个性化-读取";
    String DEVICE_COUSTOM_SETTING = "个性化-设置";
    String DEVICE_ECG_ALWAYS_OPEN = "ECG常开-开";
    String DEVICE_ECG_ALWAYS_CLOSE = "ECG常开-关";
    String SOCIAL_MSG_SETTING = "社交消息提醒1包-设置";
    String SOCIAL_MSG_SETTING2 = "社交消息提醒2包-设置";
    String SOCIAL_MSG_READ = "社交消息提醒-读取设置";
    String SOCIAL_MSG_SEND = "社交消息提醒-发送内容";
    String SOCIAL_PHONE_IDLE_OR_OFFHOOK = "社交消息提醒-接听了来电";
    String DEVICE_CONTROL_PHONE = "监听手环-挂断，静音";
    String HEARTWRING_READ = "心率报警-读取";
    String HEARTWRING_OPEN = "心率报警-打开";
    String HEARTWRING_CLOSE = "心率报警-关闭";
    String SPO2H_OPEN = "血氧-读取";
    String SPO2H_CLOSE = "血氧-结束";
    String SPO2H_AUTO_DETECT_READ = "血氧自动检测-读取";
    String SPO2H_AUTO_DETECT_OPEN = "血氧自动检测-打开";
    String SPO2H_AUTO_DETECT_CLOSE = "血氧自动检测-关闭";
    String FATIGUE_OPEN = "疲劳度-读取";
    String FATIGUE_CLOSE = "疲劳度-结束";
    String WOMEN_SETTING = "女性状态-设置";
    String WOMEN_READ = "女性状态-读取";
    String COUNT_DOWN_WATCH_CLOSE_UI = "倒计时-手表单独使用(关闭界面)";
    String COUNT_DOWN_WATCH_OPEN_UI = "倒计时-手表单独使用(打开界面)";
    String COUNT_DOWN_APP = "倒计时-App使用";
    String COUNT_DOWN_APP_READ = "倒计时-读取";
    String GPS_KAABA = "GPS时区&克尔白";
    String GPS_REPORT_START = "GPS上报";
    String READ_CHANTING = "读取诵经";
    String SCREEN_LIGHT_SETTING = "屏幕调节-设置";
    String SCREEN_LIGHT_READ = "屏幕调节-读取";
    String SCREEN_STYLE_READ = "屏幕样式-读取";
    String SCREEN_STYLE_SETTING = "屏幕样式-设置";
    String AIM_SPROT_CALC = "目标步数-计算";
    String INSTITUTION_TRANSLATION = "公英制转换";
    String READ_TEMPTURE_DATA = "读取温度数据";
    String READ_HEALTH_DRINK = "读取健康数据-饮酒";
    String READ_HEALTH_SLEEP = "读取健康数据-睡眠";
    String READ_HEALTH_SLEEP_FROM = "读取健康数据-睡眠-从哪天起";
    String READ_HEALTH_SLEEP_SINGLEDAY = "读取健康数据-睡眠-读这天";
    String READ_HEALTH_ORIGINAL = "读取健康数据-5分钟";
    String READ_HEALTH_ORIGINAL_FROM = "读取健康数据-从哪天起";
    String READ_HEALTH_ORIGINAL_SINGLEDAY = "读取健康数据-读这天";
    String READ_HEALTH = "读取健康数据-全部";
    String OAD = "固件升级";
    String SHOW_SP = "显示sp";
    String SPORT_MODE_ORIGIN_READ = "读取数据-运动模式";
    String SPORT_MODE_ORIGIN_READSTAUTS = "读取状态-运动模式";
    String SPORT_MODE_ORIGIN_START = "开启-运动模式";
    String SPORT_MODE_START_INDOOR = "开启-室内步行";
    String SPORT_MODE_ORIGIN_END = "结束-运动模式";
    String SPO2H_ORIGIN_READ = "读取数据-血氧数据";
    String HRV_ORIGIN_READ = "读取数据-HRV数据";
    String CLEAR_DEVICE_DATA = "清除数据";
    String DISCONNECT = "蓝牙连接-断开";
    String DETECT_PTT = "PTT";
    String DETECT_START_ECG = "开始测量ECG";
    String DETECT_STOP_ECG = "结束测量ECG";
    String LOW_POWER_READ = "低功耗-读取";
    String LOW_POWER_OPEN = "低功耗-开";
    String LOW_POWER_CLOSE = "低功耗-关";
    String S22_READ_DATA = "S22-数据读取";
    String S22_READ_STATE = "S22-状态读取";
    String S22_SETTING_STATE_OPEN = "S22-状态设置(开)";
    String S22_SETTING_STATE_CLOSE = "S22-状态设置(关)";
    String BP_FUNCTION_READ = "血压状态(读取)";
    String BP_FUNCTION_SETTING = "血压状态(设置)";
    String WEATHER_READ_STATUEINFO = "天气状态(读取)";
    String SET_WATCH_TIME = "设置时间";
    String WEATHER_SETTING_STATUEINFO = "天气状态(设置)";
    String WEATHER_SETTING_DATA = "天气数据(设置)";

    String LIANSUO_SOS = "联硕-监听SOS";
    String LIANSUO_SEND_ORDER = "联硕-发送命令";
    String LIANSUO_SEND_CONTENT = "联硕-发送内容";
    String UI_UPDATE_AGPS = "UI升级-AGPS";
    String UI_UPDATE_CUSTOM = "UI升级-自定义表盘";
    String UI_UPDATE_SERVER = "UI升级-服务器表盘";
    String SYNC_MUSIC_INFO = "同步音乐信息";
    String UI_UPDATE_G15IMG = "UI升级-G15图片传输";
    String TEXT_ALARM_ADD = "文字闹钟添加";
    String TEXT_ALARM_MODIFY = "文字闹钟修改";
    String TEXT_ALARM_READ = "文字闹钟读取";
    String TEXT_ALARM_DELETE = "文字闹钟删除";
    String TEXT_ALARM = "文字闹钟";
    String ORIGIN_LOG = "原始数据日志";
    String RR = "RR逐跳帧";
    String G15_QR_CODE = "G15二维码";
    String ECG_AUTO_REPORT_TEXT = "ECG常开数据监听";
    String START_BLOOD_GLUCOSE = "开始血糖监测";
    String STOP_BLOOD_GLUCOSE = "停止血糖监测";
    String BLOOD_GLUCOSE_P_READ = "血糖私人模式读取";
    String BLOOD_GLUCOSE_P_SETTING = "血糖私人模式设置";
    String FIND_DEVICE = "查找手机";
    String BLE_RENAME = "蓝牙4.0重命名";
    String BT_RENAME = "蓝牙3.0重命名";
    String BT_CONNECT = "连接BT";
    String BT_CLOSE = "关闭BT";
    String BT_READ = "读取BT";
    String HEALTH_REMIND = "健康提醒";
    String JL_DEVICE = "杰理手表相关";

    String CONTACT = "联系人";
    String NONE = "NONE";
    String[] oprateStr = new String[]{
            PWD_COMFIRM, PERSONINFO_SYNC, SETTING_FIRST, DISCONNECT, PWD_MODIFY,
            GPS_KAABA, GPS_REPORT_START, READ_CHANTING, HEART_DETECT_START, HEART_DETECT_STOP, TEMPTURE_DETECT_START, TEMPTURE_DETECT_STOP, READ_TEMPTURE_DATA, BP_DETECT_START, BP_DETECT_STOP, BP_DETECTMODEL_SETTING, BP_DETECTMODEL_READ,
            BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL, BP_DETECTMODEL_SETTING_ADJUSTE,
            SPORT_CURRENT_READ, CAMERA_START, CAMERA_STOP, ALARM_SETTING, ALARM_READ, ALARM_NEW_READ, ALARM_NEW_ADD, ALARM_NEW_MODIFY, ALARM_NEW_DELETE, ALARM_NEW_LISTENER,
            LONGSEAT_SETTING_OPEN, LONGSEAT_SETTING_CLOSE, LONGSEAT_READ, LANGUAGE_CHINESE, LANGUAGE_ENGLISH,
            BATTERY, NIGHT_TURN_WRIST_OPEN, NIGHT_TURN_WRIST_CLOSE, NIGHT_TURN_WRIST_READ, NIGHT_TURN_WRIST_CUSTOM_TIME, NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL,
            DEVICE_COUSTOM_READ, DEVICE_COUSTOM_SETTING, DEVICE_ECG_ALWAYS_OPEN, DEVICE_ECG_ALWAYS_CLOSE, FINDPHONE,
            CHECK_WEAR_SETING_OPEN, CHECK_WEAR_SETING_CLOSE,
            FINDDEVICE_SETTING_OPEN, FINDDEVICE_SETTING_CLOSE, FINDDEVICE_READ,
            SOCIAL_MSG_SETTING, SOCIAL_MSG_SETTING2, SOCIAL_MSG_READ, SOCIAL_MSG_SEND, DEVICE_CONTROL_PHONE, SOCIAL_PHONE_IDLE_OR_OFFHOOK, HEARTWRING_READ, HEARTWRING_OPEN, HEARTWRING_CLOSE,
            SPO2H_OPEN, SPO2H_CLOSE, SPO2H_AUTO_DETECT_READ, SPO2H_AUTO_DETECT_OPEN, SPO2H_AUTO_DETECT_CLOSE, FATIGUE_OPEN, FATIGUE_CLOSE, WOMEN_SETTING, WOMEN_READ, COUNT_DOWN_WATCH_CLOSE_UI, COUNT_DOWN_WATCH_OPEN_UI, COUNT_DOWN_APP_READ, SCREEN_LIGHT_SETTING, SCREEN_LIGHT_READ, SCREEN_STYLE_READ, SCREEN_STYLE_SETTING, AIM_SPROT_CALC, INSTITUTION_TRANSLATION,
            READ_HEALTH_SLEEP, READ_HEALTH_SLEEP_FROM, READ_HEALTH_SLEEP_SINGLEDAY, READ_HEALTH_DRINK, READ_HEALTH_ORIGINAL,
            READ_HEALTH_ORIGINAL_FROM, READ_HEALTH_ORIGINAL_SINGLEDAY, READ_HEALTH, SET_WATCH_TIME,
            OAD, SHOW_SP, SPORT_MODE_ORIGIN_READ, SPORT_MODE_ORIGIN_READSTAUTS, SPORT_MODE_START_INDOOR, SPORT_MODE_ORIGIN_START, SPORT_MODE_ORIGIN_END, SPO2H_ORIGIN_READ, HRV_ORIGIN_READ, CLEAR_DEVICE_DATA, DISCONNECT
            , DETECT_START_ECG, DETECT_STOP_ECG, NONE, LOW_POWER_READ, LOW_POWER_OPEN, LOW_POWER_CLOSE, S22_READ_DATA, S22_READ_STATE, S22_SETTING_STATE_OPEN, S22_SETTING_STATE_CLOSE, DETECT_PTT, BP_FUNCTION_READ, BP_FUNCTION_SETTING
            , WEATHER_READ_STATUEINFO, WEATHER_SETTING_STATUEINFO, WEATHER_SETTING_DATA, LIANSUO_SOS, LIANSUO_SEND_ORDER, LIANSUO_SEND_CONTENT, UI_UPDATE_AGPS, UI_UPDATE_CUSTOM, UI_UPDATE_SERVER
            , UI_UPDATE_G15IMG, SYNC_MUSIC_INFO,/*TEXT_ALARM_READ,TEXT_ALARM_ADD,TEXT_ALARM_MODIFY,TEXT_ALARM_DELETE,*/TEXT_ALARM, ORIGIN_LOG, RR, G15_QR_CODE, ECG_AUTO_REPORT_TEXT
            , START_BLOOD_GLUCOSE, START_BLOOD_GLUCOSE, BLOOD_GLUCOSE_P_READ, BLOOD_GLUCOSE_P_SETTING, FIND_DEVICE, BLE_RENAME, BT_RENAME, BT_CONNECT, BT_CLOSE, HEALTH_REMIND, JL_DEVICE, CONTACT
    };
}