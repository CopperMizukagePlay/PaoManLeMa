package p051g3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import p001a0.C0019e1;
import p059h3.C1782h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.b */
/* loaded from: classes.dex */
public abstract class AbstractC1621b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f10363c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f10364a = f10363c;

    /* renamed from: b */
    public final C1618a f10365b = new C1618a(this);

    /* renamed from: a */
    public C0019e1 mo2631a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f10364a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0019e1(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: b */
    public void mo2632b(View view, C1782h c1782h) {
        this.f10364a.onInitializeAccessibilityNodeInfo(view, c1782h.f10826a);
    }
}
