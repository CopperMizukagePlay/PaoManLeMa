package p163v2;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p060h5.C1814v;
import p140s2.C3091a;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3228q;
import p158u5.AbstractC3367j;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.e */
/* loaded from: classes.dex */
public final class C3565e implements InterfaceC3217l0 {

    /* renamed from: a */
    public final /* synthetic */ C3576p f17122a;

    /* renamed from: b */
    public final /* synthetic */ C3502g0 f17123b;

    public C3565e(C3576p c3576p, C3502g0 c3502g0) {
        this.f17122a = c3576p;
        this.f17123b = c3502g0;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        C3576p c3576p = this.f17122a;
        int childCount = c3576p.getChildCount();
        C1814v c1814v = C1814v.f10861e;
        if (childCount == 0) {
            return interfaceC3223n0.mo4941K(C3091a.m4762j(j6), C3091a.m4761i(j6), c1814v, C3563c.f17115h);
        }
        if (C3091a.m4762j(j6) != 0) {
            c3576p.getChildAt(0).setMinimumWidth(C3091a.m4762j(j6));
        }
        if (C3091a.m4761i(j6) != 0) {
            c3576p.getChildAt(0).setMinimumHeight(C3091a.m4761i(j6));
        }
        int m4762j = C3091a.m4762j(j6);
        int m4760h = C3091a.m4760h(j6);
        ViewGroup.LayoutParams layoutParams = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams);
        int m5538e = AbstractC3569i.m5538e(c3576p, m4762j, m4760h, layoutParams.width);
        int m4761i = C3091a.m4761i(j6);
        int m4759g = C3091a.m4759g(j6);
        ViewGroup.LayoutParams layoutParams2 = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams2);
        c3576p.measure(m5538e, AbstractC3569i.m5538e(c3576p, m4761i, m4759g, layoutParams2.height));
        return interfaceC3223n0.mo4941K(c3576p.getMeasuredWidth(), c3576p.getMeasuredHeight(), c1814v, new C3564d(c3576p, this.f17123b, 1));
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: b */
    public final int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        C3576p c3576p = this.f17122a;
        ViewGroup.LayoutParams layoutParams = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams);
        c3576p.measure(AbstractC3569i.m5538e(c3576p, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c3576p.getMeasuredHeight();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C3576p c3576p = this.f17122a;
        ViewGroup.LayoutParams layoutParams = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams);
        c3576p.measure(makeMeasureSpec, AbstractC3569i.m5538e(c3576p, 0, i7, layoutParams.height));
        return c3576p.getMeasuredWidth();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: g */
    public final int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C3576p c3576p = this.f17122a;
        ViewGroup.LayoutParams layoutParams = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams);
        c3576p.measure(makeMeasureSpec, AbstractC3569i.m5538e(c3576p, 0, i7, layoutParams.height));
        return c3576p.getMeasuredWidth();
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: h */
    public final int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        C3576p c3576p = this.f17122a;
        ViewGroup.LayoutParams layoutParams = c3576p.getLayoutParams();
        AbstractC3367j.m5097b(layoutParams);
        c3576p.measure(AbstractC3569i.m5538e(c3576p, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c3576p.getMeasuredHeight();
    }
}
