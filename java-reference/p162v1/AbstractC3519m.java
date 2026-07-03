package p162v1;

import p077k.C2182b0;
import p139s1.AbstractC3088a;
import p158u5.AbstractC3367j;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.m */
/* loaded from: classes.dex */
public abstract class AbstractC3519m extends AbstractC3809q {

    /* renamed from: s */
    public final int f16961s = AbstractC3500f1.m5391e(this);

    /* renamed from: t */
    public AbstractC3809q f16962t;

    @Override // p177x0.AbstractC3809q
    /* renamed from: A0 */
    public final void mo5476A0() {
        super.mo5476A0();
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5482J0(this.f17999l);
            if (!abstractC3809q.f18005r) {
                abstractC3809q.mo5476A0();
            }
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: B0 */
    public final void mo5477B0() {
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5477B0();
        }
        super.mo5477B0();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: F0 */
    public final void mo5478F0() {
        super.mo5478F0();
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5478F0();
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: G0 */
    public final void mo5479G0() {
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5479G0();
        }
        super.mo5479G0();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: H0 */
    public final void mo5480H0() {
        super.mo5480H0();
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5480H0();
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: I0 */
    public final void mo5481I0(AbstractC3809q abstractC3809q) {
        this.f17992e = abstractC3809q;
        for (AbstractC3809q abstractC3809q2 = this.f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
            abstractC3809q2.mo5481I0(abstractC3809q);
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: J0 */
    public final void mo5482J0(AbstractC3497e1 abstractC3497e1) {
        this.f17999l = abstractC3497e1;
        for (AbstractC3809q abstractC3809q = this.f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5482J0(abstractC3497e1);
        }
    }

    /* renamed from: K0 */
    public final void m5483K0(InterfaceC3516l interfaceC3516l) {
        AbstractC3809q abstractC3809q;
        AbstractC3809q abstractC3809q2 = ((AbstractC3809q) interfaceC3516l).f17992e;
        AbstractC3809q abstractC3809q3 = null;
        if (abstractC3809q2 != interfaceC3516l) {
            if (interfaceC3516l instanceof AbstractC3809q) {
                abstractC3809q = (AbstractC3809q) interfaceC3516l;
            } else {
                abstractC3809q = null;
            }
            if (abstractC3809q != null) {
                abstractC3809q3 = abstractC3809q.f17996i;
            }
            if (abstractC3809q2 != this.f17992e || !AbstractC3367j.m5096a(abstractC3809q3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (abstractC3809q2.f18005r) {
            AbstractC3088a.m4750b("Cannot delegate to an already attached node");
        }
        abstractC3809q2.mo5481I0(this.f17992e);
        int i7 = this.f17994g;
        int m5392f = AbstractC3500f1.m5392f(abstractC3809q2);
        abstractC3809q2.f17994g = m5392f;
        int i8 = this.f17994g;
        int i9 = m5392f & 2;
        if (i9 != 0 && (i8 & 2) != 0 && !(this instanceof InterfaceC3549w)) {
            AbstractC3088a.m4750b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC3809q2);
        }
        abstractC3809q2.f17997j = this.f16962t;
        this.f16962t = abstractC3809q2;
        abstractC3809q2.f17996i = this;
        m5485M0(m5392f | this.f17994g, false);
        if (this.f18005r) {
            if (i9 != 0 && (i7 & 2) == 0) {
                C3490c1 c3490c1 = AbstractC3498f.m5382v(this).f16872I;
                this.f17992e.mo5482J0(null);
                c3490c1.m5311g();
            } else {
                mo5482J0(this.f17999l);
            }
            abstractC3809q2.mo5476A0();
            abstractC3809q2.mo5479G0();
            if (!abstractC3809q2.f18005r) {
                AbstractC3088a.m4750b("autoInvalidateInsertedNode called on unattached node");
            }
            AbstractC3500f1.m5387a(abstractC3809q2, -1, 1);
        }
    }

    /* renamed from: L0 */
    public final void m5484L0(InterfaceC3516l interfaceC3516l) {
        AbstractC3809q abstractC3809q = null;
        for (AbstractC3809q abstractC3809q2 = this.f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
            if (abstractC3809q2 == interfaceC3516l) {
                boolean z7 = abstractC3809q2.f18005r;
                if (z7) {
                    C2182b0 c2182b0 = AbstractC3500f1.f16858a;
                    if (!z7) {
                        AbstractC3088a.m4750b("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC3500f1.m5387a(abstractC3809q2, -1, 2);
                    abstractC3809q2.mo5480H0();
                    abstractC3809q2.mo5477B0();
                }
                abstractC3809q2.mo5481I0(abstractC3809q2);
                abstractC3809q2.f17995h = 0;
                if (abstractC3809q == null) {
                    this.f16962t = abstractC3809q2.f17997j;
                } else {
                    abstractC3809q.f17997j = abstractC3809q2.f17997j;
                }
                abstractC3809q2.f17997j = null;
                abstractC3809q2.f17996i = null;
                int i7 = this.f17994g;
                int m5392f = AbstractC3500f1.m5392f(this);
                m5485M0(m5392f, true);
                if (this.f18005r && (i7 & 2) != 0 && (m5392f & 2) == 0) {
                    C3490c1 c3490c1 = AbstractC3498f.m5382v(this).f16872I;
                    this.f17992e.mo5482J0(null);
                    c3490c1.m5311g();
                    return;
                }
                return;
            }
            abstractC3809q = abstractC3809q2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC3516l).toString());
    }

    /* renamed from: M0 */
    public final void m5485M0(int i7, boolean z7) {
        int i8;
        AbstractC3809q abstractC3809q;
        int i9 = this.f17994g;
        this.f17994g = i7;
        if (i9 != i7) {
            AbstractC3809q abstractC3809q2 = this.f17992e;
            if (abstractC3809q2 == this) {
                this.f17995h = i7;
            }
            if (this.f18005r) {
                AbstractC3809q abstractC3809q3 = this;
                while (abstractC3809q3 != null) {
                    i7 |= abstractC3809q3.f17994g;
                    abstractC3809q3.f17994g = i7;
                    if (abstractC3809q3 == abstractC3809q2) {
                        break;
                    } else {
                        abstractC3809q3 = abstractC3809q3.f17996i;
                    }
                }
                if (z7 && abstractC3809q3 == abstractC3809q2) {
                    i7 = AbstractC3500f1.m5392f(abstractC3809q2);
                    abstractC3809q2.f17994g = i7;
                }
                if (abstractC3809q3 != null && (abstractC3809q = abstractC3809q3.f17997j) != null) {
                    i8 = abstractC3809q.f17995h;
                } else {
                    i8 = 0;
                }
                int i10 = i7 | i8;
                while (abstractC3809q3 != null) {
                    i10 |= abstractC3809q3.f17994g;
                    abstractC3809q3.f17995h = i10;
                    abstractC3809q3 = abstractC3809q3.f17996i;
                }
            }
        }
    }
}
