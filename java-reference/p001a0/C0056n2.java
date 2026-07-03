package p001a0;

import p053g5.C1694m;
import p140s2.C3100j;
import p140s2.EnumC3103m;
import p144t.AbstractC3122c;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.n2 */
/* loaded from: classes.dex */
public final class C0056n2 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f276f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3239v0 f277g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0056n2(AbstractC3239v0 abstractC3239v0, int i7) {
        super(1);
        this.f276f = i7;
        this.f277g = abstractC3239v0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f276f) {
            case 0:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 1:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 2:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 3:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 4:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 7:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 8:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                EnumC3103m mo4914e = abstractC3237u0.mo4914e();
                EnumC3103m enumC3103m = EnumC3103m.f15703e;
                AbstractC3239v0 abstractC3239v0 = this.f277g;
                if (mo4914e != enumC3103m && abstractC3237u0.mo4915f() != 0) {
                    long mo4915f = ((abstractC3237u0.mo4915f() - abstractC3239v0.f16053e) - r1) << 32;
                    AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                    abstractC3239v0.mo4940o0(C3100j.m4785c((((int) 0) & 4294967295L) | mo4915f, abstractC3239v0.f16057i), 0.0f, null);
                } else {
                    AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                    abstractC3239v0.mo4940o0(C3100j.m4785c(0L, abstractC3239v0.f16057i), 0.0f, null);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 11:
                AbstractC3237u0.m4952n((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            case 12:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
            default:
                AbstractC3237u0.m4951j((AbstractC3237u0) obj, this.f277g, 0, 0);
                return C1694m.f10482a;
        }
    }
}
