package p163v2;

import android.view.View;
import android.view.ViewTreeObserver;
import p019c1.AbstractC0362f;
import p019c1.C0368l;
import p019c1.C0377u;
import p019c1.InterfaceC0366j;
import p019c1.InterfaceC0369m;
import p019c1.InterfaceC0372p;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3524n1;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.n */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC3574n extends AbstractC3809q implements InterfaceC0372p, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: s */
    public View f17176s;

    /* renamed from: t */
    public ViewTreeObserver f17177t;

    /* renamed from: u */
    public final C3573m f17178u = new C3573m(this, 0);

    /* renamed from: v */
    public final C3573m f17179v = new C3573m(this, 1);

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        ViewTreeObserver viewTreeObserver = AbstractC3498f.m5384x(this).getViewTreeObserver();
        this.f17177t = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        ViewTreeObserver viewTreeObserver = this.f17177t;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f17177t = null;
        AbstractC3498f.m5384x(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f17176s = null;
    }

    /* renamed from: K0 */
    public final C0377u m5545K0() {
        if (!this.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitLocalDescendants called on an unattached node");
        }
        AbstractC3809q abstractC3809q = this.f17992e;
        if ((abstractC3809q.f17995h & 1024) != 0) {
            boolean z7 = false;
            for (AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
                if ((abstractC3809q2.f17994g & 1024) != 0) {
                    AbstractC3809q abstractC3809q3 = abstractC3809q2;
                    C2705e c2705e = null;
                    while (abstractC3809q3 != null) {
                        if (abstractC3809q3 instanceof C0377u) {
                            C0377u c0377u = (C0377u) abstractC3809q3;
                            if (z7) {
                                return c0377u;
                            }
                            z7 = true;
                        } else if ((abstractC3809q3.f17994g & 1024) != 0 && (abstractC3809q3 instanceof AbstractC3519m)) {
                            int i7 = 0;
                            for (AbstractC3809q abstractC3809q4 = ((AbstractC3519m) abstractC3809q3).f16962t; abstractC3809q4 != null; abstractC3809q4 = abstractC3809q4.f17997j) {
                                if ((abstractC3809q4.f17994g & 1024) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        abstractC3809q3 = abstractC3809q4;
                                    } else {
                                        if (c2705e == null) {
                                            c2705e = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3809q3 != null) {
                                            c2705e.m4300b(abstractC3809q3);
                                            abstractC3809q3 = null;
                                        }
                                        c2705e.m4300b(abstractC3809q4);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC3809q3 = AbstractC3498f.m5366f(c2705e);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z7;
        boolean z8;
        if (AbstractC3498f.m5382v(this).f16896q != null) {
            View m5543c = AbstractC3570j.m5543c(this);
            InterfaceC0366j focusOwner = ((C3728t) AbstractC3498f.m5383w(this)).getFocusOwner();
            InterfaceC3524n1 m5383w = AbstractC3498f.m5383w(this);
            if (view != null && !view.equals(m5383w) && AbstractC3570j.m5541a(m5543c, view)) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (view2 != null && !view2.equals(m5383w) && AbstractC3570j.m5541a(m5543c, view2)) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7 && z8) {
                this.f17176s = view2;
                return;
            }
            if (z8) {
                this.f17176s = view2;
                C0377u m5545K0 = m5545K0();
                int ordinal = m5545K0.m847M0().ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        AbstractC0362f.m824v(m5545K0);
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            }
            if (z7) {
                this.f17176s = null;
                if (m5545K0().m847M0().m844a()) {
                    ((C0368l) focusOwner).m831b(8, false, false);
                    return;
                }
                return;
            }
            this.f17176s = null;
        }
    }

    @Override // p019c1.InterfaceC0372p
    /* renamed from: w0 */
    public final void mo842w0(InterfaceC0369m interfaceC0369m) {
        interfaceC0369m.mo841d(false);
        interfaceC0369m.mo838a(this.f17178u);
        interfaceC0369m.mo839b(this.f17179v);
    }
}
