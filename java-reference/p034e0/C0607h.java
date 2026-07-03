package p034e0;

import java.util.ArrayList;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p035e1.C0654g;
import p035e1.C0666m;
import p049g1.C1568b;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p146t1.AbstractC3237u0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3326n;
import p158u5.AbstractC3368k;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.h */
/* loaded from: classes.dex */
public final class C0607h extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f1999f = 1;

    /* renamed from: g */
    public final /* synthetic */ boolean f2000g;

    /* renamed from: h */
    public final /* synthetic */ Object f2001h;

    /* renamed from: i */
    public final /* synthetic */ Object f2002i;

    /* renamed from: j */
    public final /* synthetic */ Object f2003j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607h(ArrayList arrayList, C3326n c3326n, boolean z7, InterfaceC2425y0 interfaceC2425y0) {
        super(1);
        this.f2001h = arrayList;
        this.f2002i = c3326n;
        this.f2000g = z7;
        this.f2003j = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f1999f) {
            case 0:
                C0666m c0666m = (C0666m) this.f2003j;
                C0654g c0654g = (C0654g) this.f2002i;
                C3508i0 c3508i0 = (C3508i0) obj;
                c3508i0.m5460a();
                C1568b c1568b = c3508i0.f16933e;
                if (((Boolean) ((InterfaceC3277a) this.f2001h).mo52a()).booleanValue()) {
                    if (this.f2000g) {
                        long mo2545Y = c1568b.mo2545Y();
                        C0031h1 c0031h1 = c1568b.f10182f;
                        long m109x = c0031h1.m109x();
                        c0031h1.m106u().mo1341m();
                        try {
                            ((C0019e1) c0031h1.f152f).m48t(-1.0f, 1.0f, mo2545Y);
                            c1568b.m2528e(c0654g, c0666m);
                        } finally {
                            AbstractC2487d.m4052p(c0031h1, m109x);
                        }
                    } else {
                        c1568b.m2528e(c0654g, c0666m);
                    }
                }
                return C1694m.f10482a;
            default:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                ArrayList arrayList = (ArrayList) this.f2001h;
                C3326n c3326n = (C3326n) this.f2002i;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    boolean z7 = this.f2000g;
                    if (i7 < size) {
                        C3326n c3326n2 = (C3326n) arrayList.get(i7);
                        if (c3326n2 != c3326n) {
                            c3326n2.m5063b(abstractC3237u0, z7);
                        }
                        i7++;
                    } else {
                        if (c3326n != null) {
                            c3326n.m5063b(abstractC3237u0, z7);
                        }
                        ((InterfaceC2425y0) this.f2003j).getValue();
                        return C1694m.f10482a;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607h(InterfaceC3277a interfaceC3277a, boolean z7, C0654g c0654g, C0666m c0666m) {
        super(1);
        this.f2001h = interfaceC3277a;
        this.f2000g = z7;
        this.f2002i = c0654g;
        this.f2003j = c0666m;
    }
}
