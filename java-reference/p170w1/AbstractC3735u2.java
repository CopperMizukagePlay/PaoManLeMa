package p170w1;

import android.view.View;
import android.view.ViewGroup;
import com.paoman.lema.R;
import p001a0.C0031h1;
import p032d6.AbstractC0525d0;
import p047f6.AbstractC1555j;
import p047f6.C1548c;
import p060h5.AbstractC1805m;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2406s;
import p085l0.C2415v;
import p145t0.C3173d;
import p158u5.AbstractC3367j;
import p160v.C3423m0;
import p161v0.AbstractC3465l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.u2 */
/* loaded from: classes.dex */
public abstract class AbstractC3735u2 {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f17794a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C3731t2 m5755a(AbstractC3652a abstractC3652a, AbstractC2406s abstractC2406s, C3173d c3173d) {
        C3728t c3728t;
        Object tag;
        C3731t2 c3731t2 = null;
        if (AbstractC3706n1.f17621a.compareAndSet(false, true)) {
            C1548c m2510a = AbstractC1555j.m2510a(1, 6, null);
            AbstractC0525d0.m1141s(AbstractC0525d0.m1123a((InterfaceC2318h) C3717q0.f17663q.getValue()), null, new C3702m1(m2510a, null), 3);
            C3423m0 c3423m0 = new C3423m0(9, m2510a);
            synchronized (AbstractC3465l.f16721c) {
                AbstractC3465l.f16727i = AbstractC1805m.m3059w0(AbstractC3465l.f16727i, c3423m0);
            }
            AbstractC3465l.m5234a();
        }
        if (abstractC3652a.getChildCount() > 0) {
            View childAt = abstractC3652a.getChildAt(0);
            if (childAt instanceof C3728t) {
                c3728t = (C3728t) childAt;
                if (c3728t == null) {
                    c3728t = new C3728t(abstractC3652a.getContext(), abstractC2406s.mo3811i());
                    abstractC3652a.addView(c3728t.getView(), f17794a);
                }
                tag = c3728t.getView().getTag(R.id.wrapped_composition_tag);
                if (tag instanceof C3731t2) {
                    c3731t2 = (C3731t2) tag;
                }
                if (c3731t2 == null) {
                    c3731t2 = new C3731t2(c3728t, new C2415v(abstractC2406s, new C0031h1(c3728t.getRoot())));
                    c3728t.getView().setTag(R.id.wrapped_composition_tag, c3731t2);
                }
                c3731t2.m5753e(c3173d);
                if (!AbstractC3367j.m5096a(c3728t.getCoroutineContext(), abstractC2406s.mo3811i())) {
                    c3728t.setCoroutineContext(abstractC2406s.mo3811i());
                }
                return c3731t2;
            }
        } else {
            abstractC3652a.removeAllViews();
        }
        c3728t = null;
        if (c3728t == null) {
        }
        tag = c3728t.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof C3731t2) {
        }
        if (c3731t2 == null) {
        }
        c3731t2.m5753e(c3173d);
        if (!AbstractC3367j.m5096a(c3728t.getCoroutineContext(), abstractC2406s.mo3811i())) {
        }
        return c3731t2;
    }
}
