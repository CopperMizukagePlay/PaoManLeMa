package p163v2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import p019c1.AbstractC0362f;
import p019c1.C0368l;
import p019c1.C0377u;
import p019c1.InterfaceC0366j;
import p027d1.C0465c;
import p147t2.C3250c;
import p162v1.AbstractC3498f;
import p162v1.C3502g0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.j */
/* loaded from: classes.dex */
public abstract class AbstractC3570j {

    /* renamed from: a */
    public static final C3250c f17159a = new C3250c(2);

    /* renamed from: a */
    public static final boolean m5541a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final Rect m5542b(InterfaceC0366j interfaceC0366j, View view, View view2) {
        C0465c c0465c;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C0377u m809g = AbstractC0362f.m809g(((C0368l) interfaceC0366j).f1240c);
        if (m809g != null) {
            c0465c = AbstractC0362f.m812j(m809g);
        } else {
            c0465c = null;
        }
        if (c0465c == null) {
            return null;
        }
        int i7 = (int) c0465c.f1625a;
        int i8 = iArr[0];
        int i9 = iArr2[0];
        int i10 = (int) c0465c.f1626b;
        int i11 = iArr[1];
        int i12 = iArr2[1];
        return new Rect((i7 + i8) - i9, (i10 + i11) - i12, (((int) c0465c.f1627c) + i8) - i9, (((int) c0465c.f1628d) + i11) - i12);
    }

    /* renamed from: c */
    public static final View m5543c(AbstractC3809q abstractC3809q) {
        View view;
        C3576p c3576p = AbstractC3498f.m5382v(abstractC3809q.f17992e).f16897r;
        if (c3576p != null) {
            view = c3576p.getInteropView();
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* renamed from: d */
    public static final void m5544d(C3576p c3576p, C3502g0 c3502g0) {
        long mo4927U = c3502g0.f16872I.f16799c.mo4927U(0L);
        int round = Math.round(Float.intBitsToFloat((int) (mo4927U >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (mo4927U & 4294967295L)));
        c3576p.layout(round, round2, c3576p.getMeasuredWidth() + round, c3576p.getMeasuredHeight() + round2);
    }
}
