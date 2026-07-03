package p063i0;

import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.List;
import java.util.NoSuchElementException;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f3 */
/* loaded from: classes.dex */
public final class C1891f3 implements InterfaceC3217l0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3277a f11178a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3281e f11179b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11180c;

    public C1891f3(InterfaceC3277a interfaceC3277a, InterfaceC3281e interfaceC3281e, boolean z7) {
        this.f11178a = interfaceC3277a;
        this.f11179b = interfaceC3281e;
        this.f11180c = z7;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        boolean z7;
        boolean z8;
        Object obj;
        AbstractC3239v0 abstractC3239v0;
        AbstractC3239v0 abstractC3239v02;
        float f7;
        boolean z9;
        boolean z10;
        C1891f3 c1891f3 = this;
        float floatValue = ((Number) c1891f3.f11178a.mo52a()).floatValue();
        long m4753a = C3091a.m4753a(j6, 0, 0, 0, 0, 10);
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i7);
            if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k0), "icon")) {
                AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m4753a);
                char c7 = 2;
                float f8 = 2;
                int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC1926j3.f11380d * f8) + mo4918e.f16053e;
                int m5794D = AbstractC3784a.m5794D(mo4513Q * floatValue);
                int mo4513Q2 = interfaceC3223n0.mo4513Q(AbstractC1926j3.f11381e * f8) + mo4918e.f16054f;
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i8);
                    char c8 = c7;
                    float f9 = floatValue;
                    if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k02), "indicatorRipple")) {
                        if (mo4513Q >= 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (mo4513Q2 >= 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!(z7 & z8)) {
                            AbstractC3099i.m4781a("width and height must be >= 0");
                        }
                        AbstractC3239v0 mo4918e2 = interfaceC3214k02.mo4918e(AbstractC3092b.m4771h(mo4513Q, mo4513Q, mo4513Q2, mo4513Q2));
                        int size3 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size3) {
                                obj = list.get(i9);
                                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj), "indicator")) {
                                    break;
                                }
                                i9++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) obj;
                        if (interfaceC3214k03 != null) {
                            if (m5794D >= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (mo4513Q2 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(z9 & z10)) {
                                AbstractC3099i.m4781a("width and height must be >= 0");
                            }
                            abstractC3239v0 = interfaceC3214k03.mo4918e(AbstractC3092b.m4771h(m5794D, m5794D, mo4513Q2, mo4513Q2));
                        } else {
                            abstractC3239v0 = null;
                        }
                        InterfaceC3281e interfaceC3281e = c1891f3.f11179b;
                        if (interfaceC3281e != null) {
                            int size4 = list.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                InterfaceC3214k0 interfaceC3214k04 = (InterfaceC3214k0) list.get(i10);
                                if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k04), "label")) {
                                    abstractC3239v02 = interfaceC3214k04.mo4918e(m4753a);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        abstractC3239v02 = null;
                        C1814v c1814v = C1814v.f10861e;
                        if (interfaceC3281e == null) {
                            int m4760h = C3091a.m4760h(j6);
                            int m4769f = AbstractC3092b.m4769f(interfaceC3223n0.mo4513Q(AbstractC1926j3.f11377a), j6);
                            return interfaceC3223n0.mo4941K(m4760h, m4769f, c1814v, new C1909h3(abstractC3239v0, mo4918e, (m4760h - mo4918e.f16053e) / 2, (m4769f - mo4918e.f16054f) / 2, mo4918e2, (m4760h - mo4918e2.f16053e) / 2, (m4769f - mo4918e2.f16054f) / 2, m4760h, m4769f));
                        }
                        AbstractC3367j.m5097b(abstractC3239v02);
                        float f10 = mo4918e.f16054f;
                        float f11 = AbstractC1926j3.f11381e;
                        float mo4526y = interfaceC3223n0.mo4526y(f11) + f10;
                        float f12 = AbstractC1926j3.f11379c;
                        float mo4526y2 = interfaceC3223n0.mo4526y(f12) + mo4526y + abstractC3239v02.f16054f;
                        float m4761i = (C3091a.m4761i(j6) - mo4526y2) / f8;
                        float mo4526y3 = interfaceC3223n0.mo4526y(f11);
                        if (m4761i < mo4526y3) {
                            m4761i = mo4526y3;
                        }
                        float f13 = (m4761i * f8) + mo4526y2;
                        boolean z11 = c1891f3.f11180c;
                        if (z11) {
                            f7 = m4761i;
                        } else {
                            f7 = (f13 - mo4918e.f16054f) / f8;
                        }
                        float f14 = (1 - f9) * (f7 - m4761i);
                        float mo4526y4 = interfaceC3223n0.mo4526y(f12) + interfaceC3223n0.mo4526y(f11) + mo4918e.f16054f + m4761i;
                        int m4760h2 = C3091a.m4760h(j6);
                        return interfaceC3223n0.mo4941K(m4760h2, AbstractC3784a.m5794D(f13), c1814v, new C1918i3(abstractC3239v0, z11, f9, abstractC3239v02, (m4760h2 - abstractC3239v02.f16053e) / 2, mo4526y4, f14, mo4918e, (m4760h2 - mo4918e.f16053e) / 2, m4761i, mo4918e2, (m4760h2 - mo4918e2.f16053e) / 2, m4761i - interfaceC3223n0.mo4526y(f11), m4760h2, interfaceC3223n0));
                    }
                    i8++;
                    c1891f3 = this;
                    c7 = c8;
                    floatValue = f9;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i7++;
            c1891f3 = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
