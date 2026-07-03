package p071j0;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.a0 */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: a */
    public final C2361g1 f12404a = AbstractC2418w.m3980x(Boolean.FALSE);

    public AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0(AccessibilityManagerAccessibilityStateChangeListenerC2119c0 accessibilityManagerAccessibilityStateChangeListenerC2119c0) {
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f12404a.setValue(Boolean.valueOf(AccessibilityManagerAccessibilityStateChangeListenerC2119c0.m3471a(accessibilityManager)));
    }
}
