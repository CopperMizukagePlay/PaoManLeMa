package p063i0;

import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.List;
import java.util.NoSuchElementException;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3189c;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.p5 */
/* loaded from: classes.dex */
public final class C1976p5 implements InterfaceC3217l0 {

    /* renamed from: a */
    public final /* synthetic */ int f11663a;

    /* renamed from: b */
    public final /* synthetic */ Object f11664b;

    public /* synthetic */ C1976p5(int i7, Object obj) {
        this.f11663a = i7;
        this.f11664b = obj;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        AbstractC3239v0 abstractC3239v0;
        int i7;
        int i8;
        Integer num;
        Integer num2;
        switch (this.f11663a) {
            case 0:
                C2016u5 c2016u5 = (C2016u5) this.f11664b;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i9);
                    if (AbstractC0172a.m391a(interfaceC3214k0) == EnumC1902g5.f11236e) {
                        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
                        int size2 = list.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i10);
                            if (AbstractC0172a.m391a(interfaceC3214k02) == EnumC1902g5.f11237f) {
                                AbstractC3239v0 mo4918e2 = interfaceC3214k02.mo4918e(C3091a.m4753a(AbstractC3092b.m4773j(j6, -mo4918e.f16053e, 0, 2), 0, 0, 0, 0, 11));
                                int i11 = mo4918e.f16053e + mo4918e2.f16053e;
                                int max = Math.max(mo4918e2.f16054f, mo4918e.f16054f);
                                c2016u5.f11928l.m3730h(mo4918e2.f16054f);
                                c2016u5.f11926j.m3742h(i11);
                                return interfaceC3223n0.mo4941K(i11, max, C1814v.f10861e, new C1968o5(mo4918e2, mo4918e.f16053e / 2, (max - mo4918e2.f16054f) / 2, mo4918e, AbstractC3784a.m5794D(c2016u5.m3186c() * mo4918e2.f16053e), (max - mo4918e.f16054f) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                if (((InterfaceC3281e) this.f11664b) != null) {
                    int size3 = list.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) list.get(i12);
                        if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k03), "text")) {
                            abstractC3239v0 = interfaceC3214k03.mo4918e(C3091a.m4753a(j6, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC3239v0 = null;
                if (abstractC3239v0 != null) {
                    i7 = abstractC3239v0.f16053e;
                } else {
                    i7 = 0;
                }
                int max2 = Math.max(i7, 0);
                int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC1912h6.f11287a);
                if (abstractC3239v0 != null) {
                    i8 = abstractC3239v0.f16054f;
                } else {
                    i8 = 0;
                }
                int max3 = Math.max(mo4513Q, interfaceC3223n0.mo4511H(AbstractC1912h6.f11291e) + 0 + i8);
                if (abstractC3239v0 != null) {
                    num = Integer.valueOf(abstractC3239v0.mo4939h0(AbstractC3189c.f15928a));
                } else {
                    num = null;
                }
                if (abstractC3239v0 != null) {
                    num2 = Integer.valueOf(abstractC3239v0.mo4939h0(AbstractC3189c.f15929b));
                } else {
                    num2 = null;
                }
                return interfaceC3223n0.mo4941K(max2, max3, C1814v.f10861e, new C1885e6(abstractC3239v0, null, interfaceC3223n0, max2, max3, num, num2));
        }
    }
}
