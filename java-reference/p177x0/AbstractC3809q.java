package p177x0;

import p001a0.C0033i;
import p032d6.AbstractC0525d0;
import p032d6.C0526d1;
import p032d6.C0584x;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p069i6.C2090c;
import p107o.C2729c0;
import p139s1.AbstractC3088a;
import p139s1.AbstractC3089b;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.C3512j1;
import p162v1.InterfaceC3516l;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.q */
/* loaded from: classes.dex */
public abstract class AbstractC3809q implements InterfaceC3516l {

    /* renamed from: f */
    public C2090c f17993f;

    /* renamed from: g */
    public int f17994g;

    /* renamed from: i */
    public AbstractC3809q f17996i;

    /* renamed from: j */
    public AbstractC3809q f17997j;

    /* renamed from: k */
    public C3512j1 f17998k;

    /* renamed from: l */
    public AbstractC3497e1 f17999l;

    /* renamed from: m */
    public boolean f18000m;

    /* renamed from: n */
    public boolean f18001n;

    /* renamed from: o */
    public boolean f18002o;

    /* renamed from: p */
    public boolean f18003p;

    /* renamed from: q */
    public C0033i f18004q;

    /* renamed from: r */
    public boolean f18005r;

    /* renamed from: e */
    public AbstractC3809q f17992e = this;

    /* renamed from: h */
    public int f17995h = -1;

    /* renamed from: A0 */
    public void mo5476A0() {
        if (this.f18005r) {
            AbstractC3088a.m4750b("node attached multiple times");
        }
        if (this.f17999l == null) {
            AbstractC3088a.m4750b("attach invoked on a node without a coordinator");
        }
        this.f18005r = true;
        this.f18002o = true;
    }

    /* renamed from: B0 */
    public void mo5477B0() {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("Cannot detach a node that is not attached");
        }
        if (this.f18002o) {
            AbstractC3088a.m4750b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f18003p) {
            AbstractC3088a.m4750b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f18005r = false;
        C2090c c2090c = this.f17993f;
        if (c2090c != null) {
            AbstractC0525d0.m1127e(c2090c, new AbstractC3089b("The Modifier.Node was detached", 0));
            this.f17993f = null;
        }
    }

    /* renamed from: F0 */
    public void mo5478F0() {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("reset() called on an unattached node");
        }
        mo551E0();
    }

    /* renamed from: G0 */
    public void mo5479G0() {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f18002o) {
            AbstractC3088a.m4750b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f18002o = false;
        mo789C0();
        this.f18003p = true;
    }

    /* renamed from: H0 */
    public void mo5480H0() {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("node detached multiple times");
        }
        if (this.f17999l == null) {
            AbstractC3088a.m4750b("detach invoked on a node without a coordinator");
        }
        if (!this.f18003p) {
            AbstractC3088a.m4750b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f18003p = false;
        C0033i c0033i = this.f18004q;
        if (c0033i != null) {
            c0033i.mo52a();
        }
        mo198D0();
    }

    /* renamed from: I0 */
    public void mo5481I0(AbstractC3809q abstractC3809q) {
        this.f17992e = abstractC3809q;
    }

    /* renamed from: J0 */
    public void mo5482J0(AbstractC3497e1 abstractC3497e1) {
        this.f17999l = abstractC3497e1;
    }

    /* renamed from: y0 */
    public final InterfaceC0516a0 m5830y0() {
        C2090c c2090c = this.f17993f;
        if (c2090c == null) {
            C2090c m1123a = AbstractC0525d0.m1123a(((C3728t) AbstractC3498f.m5383w(this)).getCoroutineContext().mo855z(new C0526d1((InterfaceC0520b1) ((C3728t) AbstractC3498f.m5383w(this)).getCoroutineContext().mo853h(C0584x.f1939f))));
            this.f17993f = m1123a;
            return m1123a;
        }
        return c2090c;
    }

    /* renamed from: z0 */
    public boolean mo570z0() {
        return !(this instanceof C2729c0);
    }

    /* renamed from: C0 */
    public void mo789C0() {
    }

    /* renamed from: D0 */
    public void mo198D0() {
    }

    /* renamed from: E0 */
    public void mo551E0() {
    }
}
