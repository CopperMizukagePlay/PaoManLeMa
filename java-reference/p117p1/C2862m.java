package p117p1;

import p002a1.C0102d;
import p109o1.C2803h;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3560z1;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3539s1;
import p170w1.AbstractC3674f1;
import p170w1.C3673f0;
import p170w1.C3716q;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.m */
/* loaded from: classes.dex */
public final class C2862m extends AbstractC3809q implements InterfaceC3487b2, InterfaceC3539s1, InterfaceC3513k {

    /* renamed from: s */
    public C2842a f14999s;

    /* renamed from: t */
    public boolean f15000t;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        if (enumC2860k == EnumC2860k.f14996f) {
            ?? r42 = c2859j.f14991a;
            int size = r42.size();
            for (int i7 = 0; i7 < size; i7++) {
                int i8 = ((C2868s) r42.get(i7)).f15014i;
                if (i8 != 3 && i8 != 4) {
                    int i9 = c2859j.f14994d;
                    if (i9 == 4) {
                        this.f15000t = true;
                        m4539M0();
                        return;
                    } else {
                        if (i9 == 5) {
                            m4540N0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        m4540N0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r1v0, types: [t5.c, u5.k] */
    /* renamed from: K0 */
    public final void m4537K0() {
        C2842a c2842a;
        ?? obj = new Object();
        AbstractC3498f.m5385y(this, new AbstractC3368k(1));
        C2862m c2862m = (C2862m) obj.f16451e;
        if (c2862m == null || (c2842a = c2862m.f14999s) == null) {
            c2842a = this.f14999s;
        }
        m4538L0(c2842a);
    }

    /* renamed from: L0 */
    public final void m4538L0(InterfaceC2864o interfaceC2864o) {
        InterfaceC2865p interfaceC2865p = (InterfaceC2865p) AbstractC3498f.m5369i(this, AbstractC3674f1.f17530u);
        if (interfaceC2865p != null) {
            C3716q c3716q = (C3716q) interfaceC2865p;
            if (interfaceC2864o == null) {
                InterfaceC2864o.f15002a.getClass();
                interfaceC2864o = AbstractC2866q.f15003a;
            }
            C3673f0.f17509a.m5666a(c3716q.f17662a, interfaceC2864o);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u5.q, java.lang.Object] */
    /* renamed from: M0 */
    public final void m4539M0() {
        ?? obj = new Object();
        obj.f16446e = true;
        AbstractC3498f.m5386z(this, new C0102d(obj));
        if (obj.f16446e) {
            m4537K0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u5.v] */
    /* renamed from: N0 */
    public final void m4540N0() {
        if (this.f15000t) {
            this.f15000t = false;
            if (this.f18005r) {
                ?? obj = new Object();
                AbstractC3498f.m5385y(this, new C2803h(obj, 1));
                C2862m c2862m = (C2862m) obj.f16451e;
                if (c2862m != null) {
                    c2862m.m4537K0();
                } else {
                    m4538L0(null);
                }
            }
        }
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        m4540N0();
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo204o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: q */
    public final long mo4541q() {
        int i7 = AbstractC3560z1.f17109b;
        return AbstractC3560z1.f17108a;
    }
}
