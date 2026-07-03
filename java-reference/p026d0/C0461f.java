package p026d0;

import java.util.List;
import p035e1.C0677s;
import p050g2.C1587g;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p050g2.C1604o0;
import p050g2.C1605p;
import p050g2.C1609r;
import p060h5.C1813u;
import p080k2.InterfaceC2293d;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d0.f */
/* loaded from: classes.dex */
public final class C0461f extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f1606f;

    /* renamed from: g */
    public final /* synthetic */ C0462g f1607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0461f(C0462g c0462g, int i7) {
        super(1);
        this.f1606f = i7;
        this.f1607g = c0462g;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        InterfaceC3093c interfaceC3093c;
        C1598l0 c1598l0;
        boolean z7;
        switch (this.f1606f) {
            case 0:
                List list = (List) obj;
                C0462g c0462g = this.f1607g;
                C0459d m1000K0 = c0462g.m1000K0();
                C1604o0 m2593e = C1604o0.m2593e(c0462g.f1612t, C0677s.f2209g, 0L, null, null, 0L, 0, 0L, 16777214);
                EnumC3103m enumC3103m = m1000K0.f1598o;
                boolean z8 = false;
                C1598l0 c1598l02 = null;
                if (enumC3103m != null && (interfaceC3093c = m1000K0.f1592i) != null) {
                    C1587g c1587g = new C1587g(m1000K0.f1584a, null, 6);
                    if (m1000K0.f1593j != null && m1000K0.f1597n != null) {
                        long m4753a = C3091a.m4753a(m1000K0.f1599p, 0, 0, 0, 0, 10);
                        int i7 = m1000K0.f1589f;
                        boolean z9 = m1000K0.f1588e;
                        int i8 = m1000K0.f1587d;
                        InterfaceC2293d interfaceC2293d = m1000K0.f1586c;
                        C1813u c1813u = C1813u.f10860e;
                        C1596k0 c1596k0 = new C1596k0(c1587g, m2593e, c1813u, i7, z9, i8, interfaceC3093c, enumC3103m, interfaceC2293d, m4753a);
                        C1609r c1609r = new C1609r(c1587g, m2593e, c1813u, interfaceC3093c, interfaceC2293d);
                        int i9 = m1000K0.f1589f;
                        if (m1000K0.f1587d == 2) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c1598l0 = new C1598l0(c1596k0, new C1605p(c1609r, m4753a, i9, z7), m1000K0.f1595l);
                        if (c1598l0 != null) {
                            list.add(c1598l0);
                            c1598l02 = c1598l0;
                        }
                        if (c1598l02 != null) {
                            z8 = true;
                        }
                        return Boolean.valueOf(z8);
                    }
                }
                c1598l0 = null;
                if (c1598l0 != null) {
                }
                if (c1598l02 != null) {
                }
                return Boolean.valueOf(z8);
            case 1:
                String str = ((C1587g) obj).f10239f;
                C0462g c0462g2 = this.f1607g;
                C0460e c0460e = c0462g2.f1610C;
                if (c0460e != null) {
                    if (!AbstractC3367j.m5096a(str, c0460e.f1603b)) {
                        c0460e.f1603b = str;
                        C0459d c0459d = c0460e.f1605d;
                        if (c0459d != null) {
                            C1604o0 c1604o0 = c0462g2.f1612t;
                            InterfaceC2293d interfaceC2293d2 = c0462g2.f1613u;
                            int i10 = c0462g2.f1614v;
                            boolean z10 = c0462g2.f1615w;
                            int i11 = c0462g2.f1616x;
                            int i12 = c0462g2.f1617y;
                            c0459d.f1584a = str;
                            c0459d.f1585b = c1604o0;
                            c0459d.f1586c = interfaceC2293d2;
                            c0459d.f1587d = i10;
                            c0459d.f1588e = z10;
                            c0459d.f1589f = i11;
                            c0459d.f1590g = i12;
                            c0459d.m997c();
                        }
                    }
                } else {
                    C0460e c0460e2 = new C0460e(c0462g2.f1611s, str);
                    C0459d c0459d2 = new C0459d(str, c0462g2.f1612t, c0462g2.f1613u, c0462g2.f1614v, c0462g2.f1615w, c0462g2.f1616x, c0462g2.f1617y);
                    c0459d2.m998d(c0462g2.m1000K0().f1592i);
                    c0460e2.f1605d = c0459d2;
                    c0462g2.f1610C = c0460e2;
                }
                AbstractC3498f.m5375o(c0462g2);
                AbstractC3498f.m5374n(c0462g2);
                AbstractC3498f.m5373m(c0462g2);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C0462g c0462g3 = this.f1607g;
                C0460e c0460e3 = c0462g3.f1610C;
                if (c0460e3 == null) {
                    return Boolean.FALSE;
                }
                c0460e3.f1604c = booleanValue;
                AbstractC3498f.m5375o(c0462g3);
                AbstractC3498f.m5374n(c0462g3);
                AbstractC3498f.m5373m(c0462g3);
                return Boolean.TRUE;
        }
    }
}
