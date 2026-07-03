package p085l0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001a0.C0019e1;
import p082k5.InterfaceC2318h;
import p145t0.C3177h;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.n */
/* loaded from: classes.dex */
public final class C2387n extends AbstractC2406s {

    /* renamed from: a */
    public final long f13451a;

    /* renamed from: b */
    public final boolean f13452b;

    /* renamed from: c */
    public final boolean f13453c;

    /* renamed from: d */
    public HashSet f13454d;

    /* renamed from: e */
    public final LinkedHashSet f13455e = new LinkedHashSet();

    /* renamed from: f */
    public final C2361g1 f13456f = new C2361g1(C3177h.f15889h, C2413u0.f13573h);

    /* renamed from: g */
    public final /* synthetic */ C2395p f13457g;

    public C2387n(C2395p c2395p, long j6, boolean z7, boolean z8, C0019e1 c0019e1) {
        this.f13457g = c2395p;
        this.f13451a = j6;
        this.f13452b = z7;
        this.f13453c = z8;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: a */
    public final void mo3803a(C2415v c2415v, InterfaceC3281e interfaceC3281e) {
        this.f13457g.f13489b.mo3803a(c2415v, interfaceC3281e);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: b */
    public final void mo3804b() {
        C2395p c2395p = this.f13457g;
        c2395p.f13467A--;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: c */
    public final boolean mo3805c() {
        return this.f13457g.f13489b.mo3805c();
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: d */
    public final boolean mo3806d() {
        return this.f13452b;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: e */
    public final boolean mo3807e() {
        return this.f13453c;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: f */
    public final long mo3808f() {
        return this.f13451a;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: g */
    public final InterfaceC2403r mo3809g() {
        return this.f13457g.f13495h;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: h */
    public final InterfaceC2385m1 mo3810h() {
        return (InterfaceC2385m1) this.f13456f.getValue();
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: i */
    public final InterfaceC2318h mo3811i() {
        return this.f13457g.f13489b.mo3811i();
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: j */
    public final void mo3812j(C2415v c2415v) {
        C2395p c2395p = this.f13457g;
        c2395p.f13489b.mo3812j(c2395p.f13495h);
        c2395p.f13489b.mo3812j(c2415v);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: k */
    public final AbstractC2419w0 mo3813k(AbstractC2422x0 abstractC2422x0) {
        return this.f13457g.f13489b.mo3813k(abstractC2422x0);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: l */
    public final void mo3814l(Set set) {
        HashSet hashSet = this.f13454d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f13454d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: m */
    public final void mo3815m(C2395p c2395p) {
        this.f13455e.add(c2395p);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: n */
    public final void mo3816n(C2415v c2415v) {
        this.f13457g.f13489b.mo3816n(c2415v);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: o */
    public final void mo3817o() {
        this.f13457g.f13467A++;
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: p */
    public final void mo3818p(C2395p c2395p) {
        HashSet hashSet = this.f13454d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                AbstractC3367j.m5098c(c2395p, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c2395p.f13490c);
            }
        }
        LinkedHashSet linkedHashSet = this.f13455e;
        if ((linkedHashSet instanceof InterfaceC3594a) && !(linkedHashSet instanceof InterfaceC3595b)) {
            AbstractC3382y.m5113d(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(c2395p);
    }

    @Override // p085l0.AbstractC2406s
    /* renamed from: q */
    public final void mo3819q(C2415v c2415v) {
        this.f13457g.f13489b.mo3819q(c2415v);
    }

    /* renamed from: r */
    public final void m3820r() {
        LinkedHashSet<C2395p> linkedHashSet = this.f13455e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f13454d;
            if (hashSet != null) {
                for (C2395p c2395p : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c2395p.f13490c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
