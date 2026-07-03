package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0154b;
import java.util.ArrayList;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.C2375k;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.p8 */
/* loaded from: classes.dex */
public final class C1173p8 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6838e = 0;

    /* renamed from: f */
    public final /* synthetic */ Context f6839f;

    /* renamed from: g */
    public final /* synthetic */ C0703a8 f6840g;

    /* renamed from: h */
    public final /* synthetic */ boolean f6841h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f6842i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f6843j;

    /* renamed from: k */
    public final /* synthetic */ Object f6844k;

    public C1173p8(Context context, C0877fn c0877fn, C0703a8 c0703a8, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f6839f = context;
        this.f6844k = c0877fn;
        this.f6840g = c0703a8;
        this.f6841h = z7;
        this.f6842i = interfaceC3279c;
        this.f6843j = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f6838e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                C0877fn c0877fn = (C0877fn) this.f6844k;
                if ((intValue & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C0703a8 c0703a8 = this.f6840g;
                    String str = (String) c0703a8.f2341h.get(c0877fn.f4045a);
                    boolean z7 = c0703a8.f2342i;
                    c2395p.m3857Z(-2032852132);
                    InterfaceC3279c interfaceC3279c = this.f6842i;
                    boolean m3870g = c2395p.m3870g(interfaceC3279c) | c2395p.m3870g(c0877fn);
                    Object m3847O = c2395p.m3847O();
                    Object obj3 = C2375k.f13421a;
                    if (m3870g || m3847O == obj3) {
                        m3847O = new C1142o8(interfaceC3279c, c0877fn, 0);
                        c2395p.m3877j0(m3847O);
                    }
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
                    c2395p.m3888r(false);
                    c2395p.m3857Z(-2032849827);
                    InterfaceC3279c interfaceC3279c2 = this.f6843j;
                    boolean m3870g2 = c2395p.m3870g(interfaceC3279c2) | c2395p.m3870g(c0877fn);
                    Object m3847O2 = c2395p.m3847O();
                    if (m3870g2 || m3847O2 == obj3) {
                        m3847O2 = new C1142o8(interfaceC3279c2, c0877fn, 1);
                        c2395p.m3877j0(m3847O2);
                    }
                    c2395p.m3888r(false);
                    AbstractC1328u8.m2356a(this.f6839f, c0877fn, str, z7, this.f6841h, interfaceC3277a, (InterfaceC3277a) m3847O2, c2395p, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                int intValue2 = ((Number) obj2).intValue();
                ArrayList arrayList = ((C1482z7) this.f6844k).f9833c;
                if ((intValue2 & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else if (arrayList.isEmpty()) {
                    c2395p2.m3857Z(-24261523);
                    AbstractC1850a7.m3108b("无解析结果", AbstractC0154b.m339j(C3807o.f17991a, 0.0f, 4, 1), ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 54, 0, 65528);
                    c2395p2.m3888r(false);
                } else {
                    c2395p2.m3857Z(-23901086);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = i7 + 1;
                        C0877fn c0877fn2 = (C0877fn) arrayList.get(i7);
                        C0703a8 c0703a82 = this.f6840g;
                        String str2 = (String) c0703a82.f2341h.get(c0877fn2.f4045a);
                        boolean z8 = c0703a82.f2342i;
                        c2395p2.m3857Z(-2032782788);
                        InterfaceC3279c interfaceC3279c3 = this.f6842i;
                        boolean m3870g3 = c2395p2.m3870g(interfaceC3279c3) | c2395p2.m3870g(c0877fn2);
                        Object m3847O3 = c2395p2.m3847O();
                        Object obj4 = C2375k.f13421a;
                        if (m3870g3 || m3847O3 == obj4) {
                            m3847O3 = new C1235r8(interfaceC3279c3, c0877fn2, 0);
                            c2395p2.m3877j0(m3847O3);
                        }
                        InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O3;
                        c2395p2.m3888r(false);
                        c2395p2.m3857Z(-2032780227);
                        InterfaceC3279c interfaceC3279c4 = this.f6843j;
                        boolean m3870g4 = c2395p2.m3870g(interfaceC3279c4) | c2395p2.m3870g(c0877fn2);
                        Object m3847O4 = c2395p2.m3847O();
                        if (m3870g4 || m3847O4 == obj4) {
                            m3847O4 = new C1235r8(interfaceC3279c4, c0877fn2, 1);
                            c2395p2.m3877j0(m3847O4);
                        }
                        c2395p2.m3888r(false);
                        AbstractC1328u8.m2356a(this.f6839f, c0877fn2, str2, z8, this.f6841h, interfaceC3277a2, (InterfaceC3277a) m3847O4, c2395p2, 0);
                        i7 = i8;
                    }
                    c2395p2.m3888r(false);
                }
                return C1694m.f10482a;
        }
    }

    public C1173p8(C1482z7 c1482z7, Context context, C0703a8 c0703a8, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f6844k = c1482z7;
        this.f6839f = context;
        this.f6840g = c0703a8;
        this.f6841h = z7;
        this.f6842i = interfaceC3279c;
        this.f6843j = interfaceC3279c2;
    }
}
