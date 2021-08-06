package com.zebra.scannercontrol.app.helpers;

import android.util.Log;

/**
 * Created by mfv347 on 6/20/2014.
 * <p/>
 * Helper class
 */
public class Constants {
    public static final String PREFS_NAME = "BarcodeScannerPrefs";

    //For Debugging
    public static final boolean DEBUG = true;
    public static final int COLOR_BG_GRAY = 0XF0F0F0;


    public enum DEBUG_TYPE {
        TYPE_DEBUG, TYPE_ERROR
    }

    //For shared prefs
    public static final String PREF_OPMODE = "MOT_SETTING_OPMODE";
    public static final String PREF_SCANNER_DETECTION = "MOT_SETTING_SCANNER_DETECTION";
    public static final String PREF_SCANNER_DISCOVERY = "MOT_SETTING_SCANNER_DISCOVERY";

    public static final String PREF_EVENT_ACTIVE = "MOT_SETTING_EVENT_ACTIVE";
    public static final String PREF_EVENT_AVAILABLE = "MOT_SETTING_EVENT_AVAILABLE";
    public static final String PREF_EVENT_BARCODE = "MOT_SETTING_EVENT_BARCODE";
    public static final String PREF_EVENT_IMAGE = "MOT_SETTING_EVENT_IMAGE";
    public static final String PREF_EVENT_VIDEO = "MOT_SETTING_EVENT_VIDEO";
    public static final String PREF_EVENT_BINARY_DATA = "MOT_SETTING_EVENT_BINARY_DATA";

    public static final String PREF_DONT_SHOW_INSTRUCTIONS = "MOT_SETTING_DONT_SHOW_MSG";

    public static final String PREF_BT_ADDRESS = "MOT_SETTING_BT_ADDRESS";


    public static final String PREF_NOTIFY_ACTIVE = "MOT_SETTING_NOTIFICATION_ACTIVE";
    public static final String PREF_NOTIFY_AVAILABLE = "MOT_SETTING_NOTIFICATION_AVAILABLE";
    public static final String PREF_NOTIFY_BARCODE = "MOT_SETTING_NOTIFICATION_BARCODE";
    public static final String PREF_NOTIFY_IMAGE = "MOT_SETTING_NOTIFICATION_IMAGE";
    public static final String PREF_NOTIFY_VIDEO = "MOT_SETTING_NOTIFICATION_VIDEO";
    public static final String PREF_NOTIFY_BINARY_DATA = "MOT_SETTING_NOTIFICATION_BINARY_DATA";

    public static final String PREF_PAIRING_BARCODE_TYPE = "MOT_SETTING_PAIRING_BARCODE_TYPE";
    public static final String PREF_PAIRING_BARCODE_CONFIG = "MOT_SETTING_PAIRING_BARCODE_CONFIG";
    public static final String PREF_COMMUNICATION_PROTOCOL_TYPE = "MOT_SETTING_COMMUNICATION_PROTOCOL_TYPE";
    //Data related to notifications
    public static final String NOTIFICATIONS_TYPE = "notifications_type";
    public static final String NOTIFICATIONS_TEXT = "notifications_text";
    public static final String NOTIFICATIONS_ID = "notifications_id";

    //Action strings for various RFID Events
    public static final String ACTION_SCANNER_CONNECTED = "com.zebra.scannercontrol.connected";
    public static final String ACTION_SCANNER_DISCONNECTED = "com.zebra.scannercontrol.disconnected";
    public static final String ACTION_SCANNER_AVAILABLE = "com.zebra.scannercontrol.available";
    public static final String ACTION_SCANNER_CONN_FAILED = "com.zebra.scannercontrol.conn.failed";
    public static final String ACTION_SCANNER_BARCODE_RECEIVED = "com.zebra.scannercontrol.barcode.received";

    //Data regarding bluetooth
    public static final String DATA_BLUETOOTH_DEVICE = "com.zebra.scannercontrol.data.bluetooth.device";

    //Virtual tether
    public static final String PREF_VIRTUAL_TETHER_SCANNER_SETTINGS = "MOT_VIRTUAL_TETHER_SCANNER_SETTINGS";
    public static final String PREF_VIRTUAL_TETHER_HOST_FEEDBACK = "MOT_VIRTUAL_TETHER_HOST_FEEDBACK";
    public static final String PREF_VIRTUAL_TETHER_HOST_VIBRATION_ALARM = "MOT_VIRTUAL_TETHER_HOST_VIBRATION_ALARM";
    public static final String PREF_VIRTUAL_TETHER_HOST_AUDIO_ALARM = "MOT_VIRTUAL_TETHER_HOST_AUDIO_ALARM";
    public static final String PREF_VIRTUAL_TETHER_HOST_POPUP_MESSAGE = "MOT_VIRTUAL_TETHER_HOST_POPUP_MESSAGE";
    public static final String VIRTUAL_TETHER_HOST_BACKGROUND_MODE_NOTIFICATION = "Zebra Virtual Tether alarm activated";
    public static final String PREF_VIRTUAL_TETHER_HOST_SCREEN_FLASH = "MOT_VIRTUAL_TETHER_HOST_SCREEN_FLASH";
    public static final int VIRTUAL_TETHER_HOST_NOTIFICATION_CHANNEL_ID = 1111;

    public static final String LAUNCH_FROM_FCS = "launch_from_fcs";
    //Available Scanners Data
    public static final String SCANNER_NAME = "avail_scanner_name";
    public static final String SCANNER_TYPE = "avail_scanner_type";
    public static final String SCANNER_ADDRESS = "avail_scanner_address";
    public static final String SCANNER_ID = "active_scanner_id";
    public static final String AUTO_RECONNECTION = "auto_reconnection";
    public static final String PICKLIST_MODE = "picklist+mode";
    public static final String PAGER_MOTOR_STATUS = "pager_motor_status";
    public static final String CONNECTED = "connected";
    public static final String SHOW_BARCODE_VIEW = "barcode_view";
    public static final String BATTERY_STATUS = "battery_status";
    public static final String SYMBOLOGY_SSA = "symbology_ssa";

    public static final String BEEPER_VOLUME = "beeper_volume";
    public static final String SSA_STATUS = "ssa_status";
    public static final String SCALE_STATUS = "scale_status";
    public static final String UNPAIR_AND_REBOOT_STATUS = "unpair_and_reboot_status";


    //Error Messages
    public static final String INVALID_SCANNER_ID_MSG = "Invalid Scanner ID";

    //Type of data recieved

    public static final int BARCODE_RECEIVED = 30;
    public static final int SESSION_ESTABLISHED = 31;
    public static final int SESSION_TERMINATED = 32;
    public static final int SCANNER_APPEARED = 33;
    public static final int SCANNER_DISAPPEARED = 34;
    public static final int FW_UPDATE_EVENT = 35;
    public static final int AUX_SCANNER_CONNECTED = 36;
    public static final int IMAGE_RECEIVED = 37;
    public static final int VIDEO_RECEIVED = 38;


    //Scanner models
    public static final String SCANNER_MODEL_CS4070 = "CS4070";

    /**
     * Method to be used throughout the app for logging debug messages
     *
     * @param type    - One of TYPE_ERROR or TYPE_DEBUG
     * @param TAG     - Simple String indicating the origin of the message
     * @param message - Message to be logged
     */
    public static void logAsMessage(DEBUG_TYPE type, String TAG, String message) {
        if (DEBUG) {
            if (type == DEBUG_TYPE.TYPE_DEBUG)
                Log.d(TAG, message);
            else if (type == DEBUG_TYPE.TYPE_ERROR)
                Log.e(TAG, message);
        }
    }
}
