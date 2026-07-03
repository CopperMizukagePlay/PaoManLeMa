package p170w1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p051g3.AbstractC1621b;
import p059h3.C1782h;
import p162v1.C3502g0;
import p163v2.AbstractC3569i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.m */
/* loaded from: classes.dex */
public final class C3700m extends AbstractC1621b {

    /* renamed from: d */
    public final /* synthetic */ C3728t f17599d;

    /* renamed from: e */
    public final /* synthetic */ C3502g0 f17600e;

    /* renamed from: f */
    public final /* synthetic */ C3728t f17601f;

    public C3700m(C3728t c3728t, C3502g0 c3502g0, C3728t c3728t2) {
        this.f17599d = c3728t;
        this.f17600e = c3502g0;
        this.f17601f = c3728t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().m1055a().f1697g) goto L19;
     */
    @Override // p051g3.AbstractC1621b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2632b(View view, C1782h c1782h) {
        Integer num;
        AccessibilityNodeInfo accessibilityNodeInfo = c1782h.f10826a;
        this.f10364a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C3728t c3728t = this.f17599d;
        C3653a0 c3653a0 = c3728t.f17775w;
        if (c3653a0.m5648o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C3502g0 c3502g0 = this.f17600e;
        C3502g0 m5447u = c3502g0.m5447u();
        while (true) {
            num = null;
            if (m5447u != null) {
                if (m5447u.f16872I.m5308d(8)) {
                    break;
                } else {
                    m5447u = m5447u.m5447u();
                }
            } else {
                m5447u = null;
                break;
            }
        }
        if (m5447u != null) {
            num = Integer.valueOf(m5447u.f16885f);
        }
        if (num != null) {
        }
        num = -1;
        int intValue = num.intValue();
        c1782h.f10827b = intValue;
        C3728t c3728t2 = this.f17601f;
        accessibilityNodeInfo.setParent(c3728t2, intValue);
        int i7 = c3502g0.f16885f;
        int m3640d = c3653a0.f17442E.m3640d(i7);
        if (m3640d != -1) {
            AbstractC3569i m5698y = AbstractC3681h0.m5698y(c3728t.getAndroidViewsHandler$ui_release(), m3640d);
            if (m5698y != null) {
                accessibilityNodeInfo.setTraversalBefore(m5698y);
            } else {
                accessibilityNodeInfo.setTraversalBefore(c3728t2, m3640d);
            }
            C3728t.m5717a(c3728t, i7, accessibilityNodeInfo, c3653a0.f17444G);
        }
        int m3640d2 = c3653a0.f17443F.m3640d(i7);
        if (m3640d2 != -1) {
            AbstractC3569i m5698y2 = AbstractC3681h0.m5698y(c3728t.getAndroidViewsHandler$ui_release(), m3640d2);
            if (m5698y2 != null) {
                accessibilityNodeInfo.setTraversalAfter(m5698y2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c3728t2, m3640d2);
            }
            C3728t.m5717a(c3728t, i7, accessibilityNodeInfo, c3653a0.f17445H);
        }
    }
}
