package p001a0;

import p034e0.C0622o0;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p065i2.AbstractC2064e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p100n.C2643f1;
import p144t.AbstractC3122c;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p152u.C3321i;
import p158u5.AbstractC3368k;
import p160v.InterfaceC3413h0;
import p168w.C3635r;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.o */
/* loaded from: classes.dex */
public final class C0057o extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f278f;

    /* renamed from: g */
    public final /* synthetic */ int f279g;

    /* renamed from: h */
    public final /* synthetic */ Object f280h;

    /* renamed from: i */
    public final /* synthetic */ Object f281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0057o(int i7, int i8, Object obj, Object obj2) {
        super(2);
        this.f278f = i8;
        this.f280h = obj;
        this.f281i = obj2;
        this.f279g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f278f) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0027g1.m56b((C0622o0) this.f280h, (C3173d) this.f281i, (C2395p) obj, AbstractC2418w.m3957F(this.f279g | 1));
                return C1694m.f10482a;
            case 1:
                ((Number) obj2).intValue();
                AbstractC1850a7.m3107a((C1604o0) this.f280h, (InterfaceC3281e) this.f281i, (C2395p) obj, AbstractC2418w.m3957F(this.f279g | 1));
                return C1694m.f10482a;
            case 2:
                ((Number) obj2).intValue();
                C2643f1 c2643f1 = (C2643f1) this.f280h;
                int m3957F = AbstractC2418w.m3957F(this.f279g | 1);
                c2643f1.m4236a(this.f281i, (C2395p) obj, m3957F);
                return C1694m.f10482a;
            case 3:
                ((Number) obj2).intValue();
                C3321i c3321i = (C3321i) this.f280h;
                int m3957F2 = AbstractC2418w.m3957F(1);
                c3321i.mo5059e(this.f279g, this.f281i, (C2395p) obj, m3957F2);
                return C1694m.f10482a;
            case 4:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    ((InterfaceC3413h0) this.f280h).mo5059e(this.f279g, this.f281i, c2395p, 0);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                ((Number) obj2).intValue();
                C3635r c3635r = (C3635r) this.f280h;
                int m3957F3 = AbstractC2418w.m3957F(1);
                c3635r.mo5059e(this.f279g, this.f281i, (C2395p) obj, m3957F3);
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                AbstractC2064e.m3236f((InterfaceC3810r) this.f280h, (InterfaceC3281e) this.f281i, (C2395p) obj, AbstractC2418w.m3957F(this.f279g | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0057o(int i7, Object obj, InterfaceC3413h0 interfaceC3413h0) {
        super(2);
        this.f278f = 4;
        this.f280h = interfaceC3413h0;
        this.f279g = i7;
        this.f281i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0057o(InterfaceC3413h0 interfaceC3413h0, int i7, Object obj, int i8, int i9) {
        super(2);
        this.f278f = i9;
        this.f280h = interfaceC3413h0;
        this.f279g = i7;
        this.f281i = obj;
    }
}
