package p029d3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import p041f.C1509a;
import p148t3.C3262k;
import p171w2.C3771u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d3.d */
/* loaded from: classes.dex */
public abstract class AbstractC0497d {
    /* renamed from: a */
    public static Object m1079a(String str, Bundle bundle) {
        return bundle.getParcelable(str, C1509a.class);
    }

    /* renamed from: b */
    public static String m1080b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: c */
    public static boolean m1081c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: d */
    public static final void m1082d(C3771u c3771u, C3262k c3262k) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (c3262k != null && (findOnBackInvokedDispatcher = c3771u.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c3262k);
        }
    }

    /* renamed from: e */
    public static final void m1083e(C3771u c3771u, C3262k c3262k) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (c3262k != null && (findOnBackInvokedDispatcher = c3771u.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c3262k);
        }
    }
}
