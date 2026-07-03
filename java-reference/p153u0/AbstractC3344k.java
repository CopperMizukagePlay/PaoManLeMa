package p153u0;

import java.util.Arrays;
import p001a0.C0068q2;
import p024c6.C0453t;
import p039e5.C1334ue;
import p050g2.C1584e0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.k */
/* loaded from: classes.dex */
public abstract class AbstractC3344k {

    /* renamed from: a */
    public static final C0068q2 f16406a = new C0068q2(22, new C1584e0(10), new C3343j(0));

    /* renamed from: a */
    public static final String m5078a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* renamed from: b */
    public static final C0068q2 m5079b(InterfaceC3281e interfaceC3281e, InterfaceC3279c interfaceC3279c) {
        C0453t c0453t = new C0453t(interfaceC3281e);
        AbstractC3382y.m5111b(1, interfaceC3279c);
        return new C0068q2(22, c0453t, interfaceC3279c);
    }

    /* renamed from: c */
    public static final Object m5080c(Object[] objArr, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        return m5081d(Arrays.copyOf(objArr, objArr.length), f16406a, interfaceC3277a, c2395p, ((i7 << 6) & 7168) | 384, 0);
    }

    /* renamed from: d */
    public static final Object m5081d(Object[] objArr, InterfaceC3342i interfaceC3342i, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7, int i8) {
        Object[] objArr2;
        InterfaceC3342i interfaceC3342i2;
        boolean z7;
        Object obj;
        Object obj2;
        Object mo5076e;
        long j6 = c2395p.f13486T;
        AbstractC2710c.m4333e(36);
        String l7 = Long.toString(j6, 36);
        AbstractC3367j.m5099d(l7, "toString(...)");
        AbstractC3367j.m5098c(interfaceC3342i, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC3338e interfaceC3338e = (InterfaceC3338e) c2395p.m3878k(AbstractC3340g.f16400a);
        Object m3847O = c2395p.m3847O();
        Object obj3 = null;
        Object obj4 = C2375k.f13421a;
        if (m3847O == obj4) {
            if (interfaceC3338e != null && (mo5076e = interfaceC3338e.mo5076e(l7)) != null) {
                obj2 = interfaceC3342i.mo148l(mo5076e);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = interfaceC3277a.mo52a();
            }
            objArr2 = objArr;
            interfaceC3342i2 = interfaceC3342i;
            Object c3334a = new C3334a(interfaceC3342i2, interfaceC3338e, l7, obj2, objArr2);
            c2395p.m3877j0(c3334a);
            m3847O = c3334a;
        } else {
            objArr2 = objArr;
            interfaceC3342i2 = interfaceC3342i;
        }
        C3334a c3334a2 = (C3334a) m3847O;
        if (Arrays.equals(objArr2, c3334a2.f16389i)) {
            obj3 = c3334a2.f16388h;
        }
        if (obj3 == null) {
            obj3 = interfaceC3277a.mo52a();
        }
        boolean m3874i = c2395p.m3874i(c3334a2);
        if ((((i7 & 112) ^ 48) > 32 && c2395p.m3874i(interfaceC3342i2)) || (i7 & 48) == 32) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean m3874i2 = m3874i | z7 | c2395p.m3874i(interfaceC3338e) | c2395p.m3870g(l7) | c2395p.m3874i(obj3) | c2395p.m3874i(objArr2);
        Object m3847O2 = c2395p.m3847O();
        if (!m3874i2 && m3847O2 != obj4) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object c1334ue = new C1334ue(c3334a2, interfaceC3342i2, interfaceC3338e, l7, obj, objArr3);
            c2395p.m3877j0(c1334ue);
            m3847O2 = c1334ue;
        }
        AbstractC2418w.m3967i((InterfaceC3277a) m3847O2, c2395p);
        return obj;
    }
}
