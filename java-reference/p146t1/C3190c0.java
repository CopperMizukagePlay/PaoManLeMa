package p146t1;

import java.util.List;
import java.util.Map;
import p060h5.AbstractC1805m;
import p077k.C2194h0;
import p101n0.C2702b;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p162v1.C3502g0;
import p162v1.EnumC3489c0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.c0 */
/* loaded from: classes.dex */
public final class C3190c0 implements InterfaceC3203g1 {

    /* renamed from: e */
    public EnumC3103m f15930e = EnumC3103m.f15704f;

    /* renamed from: f */
    public float f15931f;

    /* renamed from: g */
    public float f15932g;

    /* renamed from: h */
    public final /* synthetic */ C3205h0 f15933h;

    public C3190c0(C3205h0 c3205h0) {
        this.f15933h = c3205h0;
    }

    @Override // p146t1.InterfaceC3223n0
    /* renamed from: I */
    public final InterfaceC3220m0 mo4887I(int i7, int i8, Map map, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            AbstractC3088a.m4750b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C3187b0(i7, i8, map, interfaceC3279c, this, this.f15933h, interfaceC3279c2);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f15931f;
    }

    @Override // p146t1.InterfaceC3203g1
    /* renamed from: g0 */
    public final List mo4888g0(Object obj, InterfaceC3281e interfaceC3281e) {
        C3205h0 c3205h0 = this.f15933h;
        c3205h0.m4907d();
        C3502g0 c3502g0 = c3205h0.f15958e;
        EnumC3489c0 enumC3489c0 = c3502g0.f16873J.f16941d;
        EnumC3489c0 enumC3489c02 = EnumC3489c0.f16793g;
        EnumC3489c0 enumC3489c03 = EnumC3489c0.f16791e;
        if (enumC3489c0 != enumC3489c03 && enumC3489c0 != enumC3489c02 && enumC3489c0 != EnumC3489c0.f16792f && enumC3489c0 != EnumC3489c0.f16794h) {
            AbstractC3088a.m4750b("subcompose can only be used inside the measure or layout blocks");
        }
        C2194h0 c2194h0 = c3205h0.f15964k;
        Object m3592g = c2194h0.m3592g(obj);
        if (m3592g == null) {
            m3592g = (C3502g0) c3205h0.f15967n.m3596k(obj);
            if (m3592g != null) {
                if (c3205h0.f15972s <= 0) {
                    AbstractC3088a.m4750b("Check failed.");
                }
                c3205h0.f15972s--;
            } else {
                m3592g = c3205h0.m4912i(obj);
                if (m3592g == null) {
                    int i7 = c3205h0.f15961h;
                    C3502g0 c3502g02 = new C3502g0(2);
                    c3502g0.f16899t = true;
                    c3502g0.m5400B(i7, c3502g02);
                    c3502g0.f16899t = false;
                    m3592g = c3502g02;
                }
            }
            c2194h0.m3598m(obj, m3592g);
        }
        C3502g0 c3502g03 = (C3502g0) m3592g;
        if (AbstractC1805m.m3048l0(c3205h0.f15961h, c3502g0.m5441o()) != c3502g03) {
            int m4307i = ((C2702b) c3502g0.m5441o()).f14511e.m4307i(c3502g03);
            if (m4307i < c3205h0.f15961h) {
                AbstractC3088a.m4749a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i8 = c3205h0.f15961h;
            if (i8 != m4307i) {
                c3502g0.f16899t = true;
                c3502g0.m5411M(m4307i, i8, 1);
                c3502g0.f16899t = false;
            }
        }
        c3205h0.f15961h++;
        c3205h0.m4911h(c3502g03, obj, interfaceC3281e);
        if (enumC3489c0 != enumC3489c03 && enumC3489c0 != enumC3489c02) {
            return c3502g03.m5438l();
        }
        return c3502g03.m5439m();
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f15930e;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f15932g;
    }

    @Override // p146t1.InterfaceC3228q
    /* renamed from: s */
    public final boolean mo4889s() {
        EnumC3489c0 enumC3489c0 = this.f15933h.f15958e.f16873J.f16941d;
        if (enumC3489c0 != EnumC3489c0.f16794h && enumC3489c0 != EnumC3489c0.f16792f) {
            return false;
        }
        return true;
    }
}
