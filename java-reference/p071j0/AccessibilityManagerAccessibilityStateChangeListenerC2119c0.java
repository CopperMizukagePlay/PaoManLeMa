package p071j0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import p024c6.AbstractC0444k;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.c0 */
/* loaded from: classes.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC2119c0 implements AccessibilityManager.AccessibilityStateChangeListener, InterfaceC2390n2 {

    /* renamed from: e */
    public final C2361g1 f12410e = AbstractC2418w.m3980x(Boolean.FALSE);

    /* renamed from: f */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC2117b0 f12411f = new AccessibilityManagerTouchExplorationStateChangeListenerC2117b0();

    /* renamed from: g */
    public final AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 f12412g;

    public AccessibilityManagerAccessibilityStateChangeListenerC2119c0() {
        AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 = new AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0(this);
        } else {
            accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 = null;
        }
        this.f12412g = accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0;
    }

    /* renamed from: a */
    public static boolean m3471a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i7).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC0444k.m928R(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0 != false) goto L14;
     */
    @Override // p085l0.InterfaceC2390n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValue() {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (((Boolean) this.f12410e.getValue()).booleanValue()) {
            AccessibilityManagerTouchExplorationStateChangeListenerC2117b0 accessibilityManagerTouchExplorationStateChangeListenerC2117b0 = this.f12411f;
            if (accessibilityManagerTouchExplorationStateChangeListenerC2117b0 != null) {
                z7 = ((Boolean) accessibilityManagerTouchExplorationStateChangeListenerC2117b0.f12408a.getValue()).booleanValue();
            } else {
                z7 = false;
            }
            if (!z7) {
                AccessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 = this.f12412g;
                if (accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0 != null) {
                    z8 = ((Boolean) accessibilityManagerAccessibilityServicesStateChangeListenerC2115a0.f12404a.getValue()).booleanValue();
                } else {
                    z8 = false;
                }
            }
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z7) {
        this.f12410e.setValue(Boolean.valueOf(z7));
    }
}
