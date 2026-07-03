package p063i0;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.List;
import p053g5.C1694m;
import p060h5.C1814v;
import p085l0.C2375k;
import p085l0.C2395p;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p140s2.C3096f;
import p145t0.C3173d;
import p146t1.AbstractC3191c1;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.t6 */
/* loaded from: classes.dex */
public final class C2009t6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11870f;

    /* renamed from: g */
    public final /* synthetic */ C3173d f11871g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3281e f11872h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3282f f11873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2009t6(C3173d c3173d, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, int i7) {
        super(2);
        this.f11870f = i7;
        this.f11871g = c3173d;
        this.f11872h = interfaceC3281e;
        this.f11873i = interfaceC3282f;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [u5.t, java.lang.Object] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11870f) {
            case 0:
                InterfaceC3203g1 interfaceC3203g1 = (InterfaceC3203g1) obj;
                long j6 = ((C3091a) obj2).f15687a;
                int m4760h = C3091a.m4760h(j6);
                List mo4888g0 = interfaceC3203g1.mo4888g0(EnumC2025v6.f11985e, this.f11871g);
                int size = mo4888g0.size();
                ?? obj3 = new Object();
                if (size > 0) {
                    obj3.f16449e = m4760h / size;
                }
                Integer num = 0;
                int size2 = mo4888g0.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    num = Integer.valueOf(Math.max(((InterfaceC3214k0) mo4888g0.get(i7)).mo4920f(obj3.f16449e), num.intValue()));
                }
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList(mo4888g0.size());
                int size3 = mo4888g0.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) mo4888g0.get(i8);
                    int i9 = obj3.f16449e;
                    if (i9 < 0 || intValue < 0) {
                        AbstractC3099i.m4781a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
                    arrayList.add(interfaceC3214k0.mo4918e(AbstractC3092b.m4771h(i9, i9, intValue, intValue)));
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    C3096f c3096f = new C3096f(interfaceC3203g1.mo4522t0(Math.min(((InterfaceC3214k0) mo4888g0.get(i10)).mo4917c0(intValue), obj3.f16449e)) - (AbstractC1912h6.f11288b * 2));
                    C3096f c3096f2 = new C3096f(24);
                    if (c3096f.compareTo(c3096f2) < 0) {
                        c3096f = c3096f2;
                    }
                    arrayList2.add(new C1921i6(interfaceC3203g1.mo4522t0(obj3.f16449e) * i10, interfaceC3203g1.mo4522t0(obj3.f16449e), c3096f.f15693e));
                }
                return interfaceC3203g1.mo4941K(m4760h, intValue, C1814v.f10861e, new C2001s6(arrayList, interfaceC3203g1, this.f11872h, obj3, j6, intValue, this.f11873i, arrayList2, m4760h));
            default:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
                    C3173d c3173d = this.f11871g;
                    boolean m3870g = c2395p.m3870g(c3173d);
                    InterfaceC3281e interfaceC3281e = this.f11872h;
                    boolean m3870g2 = m3870g | c2395p.m3870g(interfaceC3281e);
                    InterfaceC3282f interfaceC3282f = this.f11873i;
                    boolean m3870g3 = m3870g2 | c2395p.m3870g(interfaceC3282f);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g3 || m3847O == C2375k.f13421a) {
                        m3847O = new C2009t6(c3173d, interfaceC3281e, interfaceC3282f, 0);
                        c2395p.m3877j0(m3847O);
                    }
                    AbstractC3191c1.m4891b(m346e, (InterfaceC3281e) m3847O, c2395p, 6, 0);
                }
                return C1694m.f10482a;
        }
    }
}
