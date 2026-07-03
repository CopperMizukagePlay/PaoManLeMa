package p001a0;

import java.util.List;
import p019c1.C0368l;
import p019c1.InterfaceC0366j;
import p028d2.C0477j;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p085l0.C2405r1;
import p085l0.C2415v;
import p087l2.C2432a;
import p087l2.C2437c0;
import p087l2.C2446j;
import p087l2.C2459w;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3682h1;
import p170w1.InterfaceC3663c2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.b0 */
/* loaded from: classes.dex */
public final class C0006b0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f55f;

    /* renamed from: g */
    public final /* synthetic */ C0043k1 f56g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006b0(C0043k1 c0043k1, int i7) {
        super(1);
        this.f55f = i7;
        this.f56g = c0043k1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC3663c2 interfaceC3663c2;
        String str;
        int i7 = this.f55f;
        boolean z7 = false;
        C1694m c1694m = null;
        C1694m c1694m2 = C1694m.f10482a;
        C0043k1 c0043k1 = this.f56g;
        switch (i7) {
            case 0:
                InterfaceC3238v interfaceC3238v = (InterfaceC3238v) obj;
                C0064p2 m120d = c0043k1.m120d();
                if (m120d != null) {
                    m120d.f324c = interfaceC3238v;
                }
                return c1694m2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c0043k1.f227q.setValue(bool);
                return c1694m2;
            case 2:
                List list = (List) obj;
                if (c0043k1.m120d() != null) {
                    C0064p2 m120d2 = c0043k1.m120d();
                    AbstractC3367j.m5097b(m120d2);
                    list.add(m120d2.f322a);
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 3:
                C1587g c1587g = (C1587g) obj;
                C2437c0 c2437c0 = c0043k1.f215e;
                C0006b0 c0006b0 = c0043k1.f230t;
                if (c2437c0 != null) {
                    C2459w m153s = c0043k1.f214d.m153s(AbstractC1806n.m3067O(new Object(), new C2432a(c1587g, 1)));
                    c2437c0.m4011a(null, m153s);
                    c0006b0.mo23f(m153s);
                    c1694m = c1694m2;
                }
                if (c1694m == null) {
                    String str2 = c1587g.f10239f;
                    int length = str2.length();
                    c0006b0.mo23f(new C2459w(str2, AbstractC1586f0.m2558b(length, length), 4));
                }
                return Boolean.TRUE;
            case 4:
                int i8 = ((C2446j) obj).f13697a;
                C0031h1 c0031h1 = c0043k1.f228r;
                c0031h1.getClass();
                if (i8 == 7) {
                    c0031h1.m107v();
                } else if (i8 == 2) {
                    c0031h1.m107v();
                } else if (i8 == 6) {
                    c0031h1.m107v();
                } else if (i8 == 5) {
                    c0031h1.m107v();
                } else if (i8 == 3) {
                    c0031h1.m107v();
                } else if (i8 == 4) {
                    c0031h1.m107v();
                } else if (i8 != 1 && i8 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i8 == 6) {
                    InterfaceC0366j interfaceC0366j = (InterfaceC0366j) c0031h1.f154h;
                    if (interfaceC0366j != null) {
                        ((C0368l) interfaceC0366j).m835f(1);
                    } else {
                        AbstractC3367j.m5105j("focusManager");
                        throw null;
                    }
                } else if (i8 == 5) {
                    InterfaceC0366j interfaceC0366j2 = (InterfaceC0366j) c0031h1.f154h;
                    if (interfaceC0366j2 != null) {
                        ((C0368l) interfaceC0366j2).m835f(2);
                    } else {
                        AbstractC3367j.m5105j("focusManager");
                        throw null;
                    }
                } else if (i8 == 7 && (interfaceC3663c2 = (InterfaceC3663c2) c0031h1.f152f) != null) {
                    ((C3682h1) interfaceC3663c2).m5700a();
                }
                return c1694m2;
            default:
                C2459w c2459w = (C2459w) obj;
                String str3 = c2459w.f13723a.f10239f;
                C1587g c1587g2 = c0043k1.f220j;
                if (c1587g2 != null) {
                    str = c1587g2.f10239f;
                } else {
                    str = null;
                }
                if (!AbstractC3367j.m5096a(str3, str)) {
                    c0043k1.f221k.setValue(EnumC0091x0.f416e);
                }
                long j6 = C1602n0.f10302b;
                c0043k1.m122f(j6);
                c0043k1.m121e(j6);
                c0043k1.f229s.mo23f(c2459w);
                C2405r1 c2405r1 = c0043k1.f212b;
                C2415v c2415v = c2405r1.f13539a;
                if (c2415v != null) {
                    c2415v.m3944r(c2405r1, null);
                }
                return c1694m2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006b0(C0043k1 c0043k1, C0477j c0477j) {
        super(1);
        this.f55f = 3;
        this.f56g = c0043k1;
    }
}
