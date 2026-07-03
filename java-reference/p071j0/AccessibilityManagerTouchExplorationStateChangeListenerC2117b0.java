package p071j0;

import android.view.accessibility.AccessibilityManager;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.b0 */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC2117b0 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C2361g1 f12408a = AbstractC2418w.m3980x(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z7) {
        this.f12408a.setValue(Boolean.valueOf(z7));
    }
}
