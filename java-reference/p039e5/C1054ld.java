package p039e5;

import android.view.ViewStructure;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p024c6.C0438e;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p144t.C3149p0;
import p145t0.C3173d;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ld */
/* loaded from: classes.dex */
public final class C1054ld extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ int f5480f;

    /* renamed from: g */
    public final /* synthetic */ Object f5481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1054ld(int i7, Object obj) {
        super(4);
        this.f5480f = i7;
        this.f5481g = obj;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        int i9 = this.f5480f;
        int i10 = 2;
        C1694m c1694m = C1694m.f10482a;
        Object obj5 = this.f5481g;
        switch (i9) {
            case 0:
                C3315c c3315c = (C3315c) obj;
                int intValue = ((Number) obj2).intValue();
                C2395p c2395p = (C2395p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (c2395p.m3870g(c3315c)) {
                        i10 = 4;
                    }
                    i7 = intValue2 | i10;
                } else {
                    i7 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (c2395p.m3866e(intValue)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & 147) == 146 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C1301tc c1301tc = (C1301tc) ((C0438e) obj5).get(intValue);
                    c2395p.m3857Z(-2073693036);
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, 3, 1);
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17973n, c2395p, 0);
                    int hashCode = Long.hashCode(c2395p.f13486T);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m339j);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                        AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    Locale locale = Locale.US;
                    double d7 = c1301tc.f7783b;
                    double d8 = c1301tc.f7785d;
                    double d9 = c1301tc.f7784c;
                    String format = String.format(locale, "%.0fs", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
                    C3149p0 c3149p0 = C3149p0.f15825a;
                    InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 0.8f, true);
                    C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                    AbstractC1850a7.m3108b(format, m4856a, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 0, 0, 65532);
                    Pattern pattern = C1270sc.f7550m;
                    String m2243V = AbstractC1249rm.m2243V(d9);
                    InterfaceC3810r m4856a2 = c3149p0.m4856a(c3807o, 1.2f, true);
                    C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11258o;
                    C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                    AbstractC1850a7.m3108b(m2243V, m4856a2, ((C2003t0) c2395p.m3878k(c2394o22)).f11816j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65528);
                    AbstractC1850a7.m3108b(AbstractC1249rm.m2243V(d8), c3149p0.m4856a(c3807o, 1.2f, true), ((C2003t0) c2395p.m3878k(c2394o22)).f11807a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 0, 0, 65528);
                    AbstractC1850a7.m3108b(AbstractC1249rm.m2243V(d9 + d8), c3149p0.m4856a(c3807o, 1.2f, true), 0L, 0L, C2300k.f13234i, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 196608, 0, 65500);
                    c2395p.m3888r(true);
                    c2395p.m3888r(false);
                }
                return c1694m;
            case 1:
                C3315c c3315c2 = (C3315c) obj;
                ((Number) obj2).intValue();
                C2395p c2395p2 = (C2395p) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (c2395p2.m3870g(c3315c2)) {
                        i10 = 4;
                    }
                    intValue3 |= i10;
                }
                if ((intValue3 & 131) == 130 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    ((C3173d) obj5).mo24c(c3315c2, c2395p2, Integer.valueOf(intValue3 & 14));
                }
                return c1694m;
            default:
                int intValue4 = ((Number) obj).intValue();
                int intValue5 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(intValue4, intValue5, 0, 0, ((Number) obj3).intValue() - intValue4, ((Number) obj4).intValue() - intValue5);
                return c1694m;
        }
    }
}
