package p001a0;

import p028d2.C0477j;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p087l2.C2432a;
import p087l2.C2437c0;
import p087l2.C2459w;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.g0 */
/* loaded from: classes.dex */
public final class C0026g0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ boolean f124f;

    /* renamed from: g */
    public final /* synthetic */ boolean f125g;

    /* renamed from: h */
    public final /* synthetic */ C0043k1 f126h;

    /* renamed from: i */
    public final /* synthetic */ C2459w f127i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026g0(boolean z7, boolean z8, C0043k1 c0043k1, C0477j c0477j, C2459w c2459w) {
        super(1);
        this.f124f = z7;
        this.f125g = z8;
        this.f126h = c0043k1;
        this.f127i = c2459w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C1587g c1587g = (C1587g) obj;
        if (!this.f124f && this.f125g) {
            C0043k1 c0043k1 = this.f126h;
            C2437c0 c2437c0 = c0043k1.f215e;
            C0006b0 c0006b0 = c0043k1.f230t;
            C1694m c1694m = null;
            if (c2437c0 != null) {
                C2459w m153s = c0043k1.f214d.m153s(AbstractC1806n.m3067O(new Object(), new C2432a(c1587g, 1)));
                c2437c0.m4011a(null, m153s);
                c0006b0.mo23f(m153s);
                c1694m = C1694m.f10482a;
            }
            if (c1694m == null) {
                C2459w c2459w = this.f127i;
                C1587g c1587g2 = c2459w.f13723a;
                long j6 = c2459w.f13724b;
                String str = c1587g2.f10239f;
                int i7 = C1602n0.f10303c;
                int i8 = (int) (j6 >> 32);
                int i9 = (int) (j6 & 4294967295L);
                AbstractC3367j.m5100e(str, "<this>");
                AbstractC3367j.m5100e(c1587g, "replacement");
                if (i9 >= i8) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i8);
                    sb.append((CharSequence) c1587g);
                    sb.append((CharSequence) str, i9, str.length());
                    String obj2 = sb.toString();
                    int length = c1587g.f10239f.length() + i8;
                    c0006b0.mo23f(new C2459w(obj2, AbstractC1586f0.m2558b(length, length), 4));
                } else {
                    throw new IndexOutOfBoundsException(AbstractC0094y0.m183j(i9, i8, "End index (", ") is less than start index (", ")."));
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
