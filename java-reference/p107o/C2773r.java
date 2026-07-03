package p107o;

import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p122q.C2940r0;
import p137s.C3081j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.r */
/* loaded from: classes.dex */
public final class C2773r extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public final /* synthetic */ int f14759i;

    /* renamed from: j */
    public int f14760j;

    /* renamed from: k */
    public /* synthetic */ C2940r0 f14761k;

    /* renamed from: l */
    public /* synthetic */ long f14762l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC2734e f14763m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2773r(AbstractC2734e abstractC2734e, InterfaceC2313c interfaceC2313c, int i7) {
        super(3, interfaceC2313c);
        this.f14759i = i7;
        this.f14763m = abstractC2734e;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2940r0 c2940r0 = (C2940r0) obj;
        C0464b c0464b = (C0464b) obj2;
        switch (this.f14759i) {
            case 0:
                long j6 = c0464b.f1623a;
                C2773r c2773r = new C2773r((C2775s) this.f14763m, (InterfaceC2313c) obj3, 0);
                c2773r.f14761k = c2940r0;
                c2773r.f14762l = j6;
                return c2773r.mo29m(C1694m.f10482a);
            default:
                long j7 = c0464b.f1623a;
                C2773r c2773r2 = new C2773r((C2785x) this.f14763m, (InterfaceC2313c) obj3, 1);
                c2773r2.f14761k = c2940r0;
                c2773r2.f14762l = j7;
                return c2773r2.mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f14759i) {
            case 0:
                int i7 = this.f14760j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2940r0 c2940r0 = this.f14761k;
                long j6 = this.f14762l;
                C2775s c2775s = (C2775s) this.f14763m;
                if (c2775s.f14642y) {
                    this.f14760j = 1;
                    C3081j c3081j = c2775s.f14638u;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (c3081j == null || (obj2 = AbstractC0525d0.m1130h(new C2725b(c2940r0, j6, c3081j, c2775s, null), this)) != enumC2465a) {
                        obj2 = c1694m;
                    }
                    if (obj2 == enumC2465a) {
                        return enumC2465a;
                    }
                    return c1694m;
                }
                return c1694m;
            default:
                int i8 = this.f14760j;
                C1694m c1694m2 = C1694m.f10482a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2940r0 c2940r02 = this.f14761k;
                long j7 = this.f14762l;
                C2785x c2785x = (C2785x) this.f14763m;
                if (c2785x.f14642y) {
                    this.f14760j = 1;
                    C3081j c3081j2 = c2785x.f14638u;
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (c3081j2 == null || (obj3 = AbstractC0525d0.m1130h(new C2725b(c2940r02, j7, c3081j2, c2785x, null), this)) != enumC2465a2) {
                        obj3 = c1694m2;
                    }
                    if (obj3 == enumC2465a2) {
                        return enumC2465a2;
                    }
                    return c1694m2;
                }
                return c1694m2;
        }
    }
}
