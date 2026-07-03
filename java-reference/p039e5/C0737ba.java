package p039e5;

import java.util.LinkedHashSet;
import java.util.Set;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.C1815w;
import p085l0.C2347d;
import p085l0.C2351e;
import p145t0.C3170a;
import p150t5.InterfaceC3279c;
import p158u5.C3377t;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ba */
/* loaded from: classes.dex */
public final class C0737ba implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f2631e;

    /* renamed from: f */
    public final /* synthetic */ Object f2632f;

    /* renamed from: g */
    public final /* synthetic */ Object f2633g;

    /* renamed from: h */
    public final /* synthetic */ Object f2634h;

    public C0737ba(C0910go c0910go, C1467yn c1467yn, C3472s c3472s) {
        this.f2631e = 1;
        this.f2633g = c0910go;
        this.f2634h = c1467yn;
        this.f2632f = c3472s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        LinkedHashSet m2964D;
        LinkedHashSet m2966F;
        int i7;
        int i8;
        int i9 = this.f2631e;
        C1815w c1815w = C1815w.f10862e;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f2634h;
        Object obj3 = this.f2633g;
        Object obj4 = this.f2632f;
        switch (i9) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C3472s c3472s = (C3472s) obj4;
                String str = (String) obj3;
                ?? r02 = (Set) c3472s.get(str);
                if (r02 != 0) {
                    c1815w = r02;
                }
                String str2 = ((C0877fn) obj2).f4045a;
                if (booleanValue) {
                    m2964D = AbstractC1793a0.m2966F(c1815w, str2);
                } else {
                    m2964D = AbstractC1793a0.m2964D(c1815w, str2);
                }
                c3472s.put(str, m2964D);
                return c1694m;
            case 1:
                ((Boolean) obj).getClass();
                C3472s c3472s2 = (C3472s) obj4;
                String str3 = ((C0910go) obj3).f4322a;
                String str4 = ((C1467yn) obj2).f9464a;
                float f7 = AbstractC1092mk.f5952h;
                ?? r32 = (Set) c3472s2.get(str3);
                if (r32 != 0) {
                    c1815w = r32;
                }
                if (c1815w.contains(str4)) {
                    m2966F = AbstractC1793a0.m2964D(c1815w, str4);
                } else {
                    m2966F = AbstractC1793a0.m2966F(c1815w, str4);
                }
                c3472s2.put(str3, m2966F);
                return c1694m;
            default:
                C2347d c2347d = (C2347d) obj4;
                c2347d.f13350a = null;
                c2347d.f13351b = null;
                C3170a c3170a = ((C2351e) obj3).f13386h;
                int i10 = ((C3377t) obj2).f16449e;
                do {
                    i7 = c3170a.get();
                    if (((i7 >>> 27) & 15) == i10) {
                        i8 = i7 - 1;
                    } else {
                        i8 = i7;
                    }
                } while (!c3170a.compareAndSet(i7, i8));
                return c1694m;
        }
    }

    public /* synthetic */ C0737ba(Object obj, Object obj2, Object obj3, int i7) {
        this.f2631e = i7;
        this.f2632f = obj;
        this.f2633g = obj2;
        this.f2634h = obj3;
    }
}
