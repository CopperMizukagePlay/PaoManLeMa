package p031d5;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.c */
/* loaded from: classes.dex */
public abstract class AbstractC0503c {

    /* renamed from: a */
    public static final /* synthetic */ int f1794a = 0;

    static {
        Pattern.compile(";");
    }

    /* renamed from: a */
    public static String m1087a(String str, List list, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: b */
    public static void m1088b(Camera.Parameters parameters, boolean z7) {
        String m1087a;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z7) {
            m1087a = m1087a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            m1087a = m1087a("flash mode", supportedFlashModes, "off");
        }
        if (m1087a != null) {
            if (m1087a.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(m1087a));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(m1087a));
                parameters.setFlashMode(m1087a);
            }
        }
    }
}
