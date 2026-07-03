package p092m;

import p001a0.C0037j;
import p035e1.AbstractC0670o;
import p049g1.AbstractC1571e;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p140s2.C3100j;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.r */
/* loaded from: classes.dex */
public final class C2502r extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13828f;

    /* renamed from: g */
    public final /* synthetic */ long f13829g;

    /* renamed from: h */
    public final /* synthetic */ long f13830h;

    /* renamed from: i */
    public final /* synthetic */ Object f13831i;

    /* renamed from: j */
    public final /* synthetic */ Object f13832j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2502r(Object obj, long j6, long j7, Object obj2, int i7) {
        super(1);
        this.f13828f = i7;
        this.f13831i = obj;
        this.f13829g = j6;
        this.f13830h = j7;
        this.f13832j = obj2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f13828f) {
            case 0:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) this.f13831i;
                long j6 = this.f13829g;
                long j7 = this.f13830h;
                C0037j c0037j = (C0037j) this.f13832j;
                abstractC3237u0.getClass();
                AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                abstractC3239v0.mo4940o0(C3100j.m4785c(((((int) (j6 >> 32)) + ((int) (j7 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) + ((int) (j7 & 4294967295L))) & 4294967295L), abstractC3239v0.f16057i), 0.0f, c0037j);
                return C1694m.f10482a;
            default:
                C3508i0 c3508i0 = (C3508i0) obj;
                c3508i0.m5460a();
                InterfaceC1570d.m2538J(c3508i0, (AbstractC0670o) this.f13831i, this.f13829g, this.f13830h, 0.0f, (AbstractC1571e) this.f13832j, 104);
                return C1694m.f10482a;
        }
    }
}
