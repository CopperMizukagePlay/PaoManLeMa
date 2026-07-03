package p029d3;

import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d3.b */
/* loaded from: classes.dex */
public abstract class AbstractC0495b {
    /* renamed from: a */
    public static void m1071a(int i7) {
        SdkExtensions.getExtensionVersion(i7);
    }

    /* renamed from: b */
    public static CharSequence m1072b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static Insets m1073c(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* renamed from: d */
    public static void m1074d(Window window, boolean z7) {
        int i7;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z7) {
            i7 = systemUiVisibility & (-257);
        } else {
            i7 = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i7);
        window.setDecorFitsSystemWindows(z7);
    }

    /* renamed from: e */
    public static void m1075e(Window window, boolean z7) {
        window.setDecorFitsSystemWindows(z7);
    }

    /* renamed from: f */
    public static void m1076f(View view) {
        view.setImportantForContentCapture(1);
    }

    /* renamed from: g */
    public static void m1077g(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* renamed from: h */
    public static void m1078h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
