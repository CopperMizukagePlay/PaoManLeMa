package p092m;

import p140s2.C3100j;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p177x0.C3802j;
import p177x0.InterfaceC3797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.s */
/* loaded from: classes.dex */
public final class C2503s extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13833f;

    /* renamed from: g */
    public final /* synthetic */ C2505u f13834g;

    /* renamed from: h */
    public final /* synthetic */ long f13835h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2503s(C2505u c2505u, long j6, int i7) {
        super(1);
        this.f13833f = i7;
        this.f13834g = c2505u;
        this.f13835h = j6;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r11v24, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r11v6, types: [t5.c, u5.k] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long j6;
        int ordinal;
        switch (this.f13833f) {
            case 0:
                int ordinal2 = ((EnumC2496l) obj).ordinal();
                C2505u c2505u = this.f13834g;
                long j7 = this.f13835h;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            C2495k c2495k = c2505u.f13844w.f13852a.f13788b;
                            if (c2495k != null) {
                                j7 = ((C3102l) c2495k.f13809b.mo23f(new C3102l(j7))).f15702a;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    C2495k c2495k2 = c2505u.f13843v.f13849a.f13788b;
                    if (c2495k2 != null) {
                        j7 = ((C3102l) c2495k2.f13809b.mo23f(new C3102l(j7))).f15702a;
                    }
                }
                return new C3102l(j7);
            default:
                EnumC2496l enumC2496l = (EnumC2496l) obj;
                C2505u c2505u2 = this.f13834g;
                if (c2505u2.f13838A != null && c2505u2.m4062K0() != null && !AbstractC3367j.m5096a(c2505u2.f13838A, c2505u2.m4062K0()) && (ordinal = enumC2496l.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        C2495k c2495k3 = c2505u2.f13844w.f13852a.f13788b;
                        if (c2495k3 != null) {
                            ?? r11 = c2495k3.f13809b;
                            long j8 = this.f13835h;
                            long j9 = ((C3102l) r11.mo23f(new C3102l(j8))).f15702a;
                            InterfaceC3797e m4062K0 = c2505u2.m4062K0();
                            AbstractC3367j.m5097b(m4062K0);
                            EnumC3103m enumC3103m = EnumC3103m.f15703e;
                            long mo5825a = ((C3802j) m4062K0).mo5825a(j8, j9, enumC3103m);
                            InterfaceC3797e interfaceC3797e = c2505u2.f13838A;
                            AbstractC3367j.m5097b(interfaceC3797e);
                            j6 = C3100j.m4784b(mo5825a, interfaceC3797e.mo5825a(j8, j9, enumC3103m));
                            return new C3100j(j6);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                j6 = 0;
                return new C3100j(j6);
        }
    }
}
