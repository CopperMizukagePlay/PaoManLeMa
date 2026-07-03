package p059h3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p001a0.C0019e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h3.i */
/* loaded from: classes.dex */
public class C1783i extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0019e1 f10829a;

    public C1783i(C0019e1 c0019e1) {
        this.f10829a = c0019e1;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        C1782h mo37h = this.f10829a.mo37h(i7);
        if (mo37h == null) {
            return null;
        }
        return mo37h.f10826a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f10829a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        C1782h mo41l = this.f10829a.mo41l(i7);
        if (mo41l == null) {
            return null;
        }
        return mo41l.f10826a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        return this.f10829a.mo47s(i7, i8, bundle);
    }
}
