package p063i0;

import p027d1.C0464b;
import p035e1.C0677s;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p060h5.C1814v;
import p085l0.C2395p;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.y0 */
/* loaded from: classes.dex */
public final class C2043y0 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: g */
    public static final C2043y0 f12162g;

    /* renamed from: h */
    public static final C2043y0 f12163h;

    /* renamed from: i */
    public static final C2043y0 f12164i;

    /* renamed from: f */
    public final /* synthetic */ int f12165f;

    static {
        int i7 = 3;
        f12162g = new C2043y0(i7, 0);
        f12163h = new C2043y0(i7, 1);
        f12164i = new C2043y0(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2043y0(int i7, int i8) {
        super(i7);
        this.f12165f = i8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f12165f) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                }
                return C1694m.f10482a;
            case 1:
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) obj;
                long j6 = ((C3091a) obj3).f15687a;
                int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC1951m4.f11526a);
                int i7 = mo4513Q * 2;
                AbstractC3239v0 mo4918e = ((InterfaceC3214k0) obj2).mo4918e(AbstractC3092b.m4772i(0, i7, j6));
                int i8 = mo4918e.f16054f - i7;
                return interfaceC3223n0.mo4941K(mo4918e.f16053e, i8, C1814v.f10861e, new C1901g4(mo4513Q, 0, mo4918e));
            default:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                InterfaceC1570d.m2540R(interfaceC1570d, ((C0677s) obj3).f2211a, interfaceC1570d.mo4526y(C1936k5.f11434c) / 2.0f, ((C0464b) obj2).f1623a, null, 120);
                return C1694m.f10482a;
        }
    }
}
