package p039e5;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1805m;
import p068i5.AbstractC2080d;
import p077k.C2182b0;
import p077k.C2194h0;
import p085l0.C2352e0;
import p085l0.C2405r1;
import p085l0.C2415v;
import p085l0.InterfaceC2403r;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C1381w implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f8280e;

    /* renamed from: f */
    public final /* synthetic */ int f8281f;

    /* renamed from: g */
    public final /* synthetic */ Object f8282g;

    /* renamed from: h */
    public final /* synthetic */ Object f8283h;

    public /* synthetic */ C1381w(int i7, int i8, Object obj, Object obj2) {
        this.f8280e = i8;
        this.f8282g = obj;
        this.f8281f = i7;
        this.f8283h = obj2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC2403r interfaceC2403r;
        C1694m c1694m;
        InterfaceC2403r interfaceC2403r2;
        C1694m c1694m2;
        int i7;
        boolean z7;
        int i8 = this.f8280e;
        C1694m c1694m3 = C1694m.f10482a;
        Object obj2 = this.f8283h;
        int i9 = this.f8281f;
        Object obj3 = this.f8282g;
        switch (i8) {
            case 0:
                return C0831e9.m1519a((C0831e9) obj, 0L, 0L, 0L, 0L, C1196q0.m2103j((C0800d9) obj3, i9 + ((C3377t) obj2).f16449e), "下载中", 31);
            case 1:
                C3469p c3469p = (C3469p) obj3;
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "value");
                c3469p.set(i9, str);
                AbstractC1328u8.m2362g((Context) obj2, c3469p);
                return c1694m3;
            case 2:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj3;
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "text");
                C3137j0 c3137j0 = AbstractC1302td.f7786a;
                if (((Boolean) ((InterfaceC2425y0) obj2).getValue()).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    int length = str2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        char charAt = str2.charAt(i10);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    interfaceC3279c.mo23f(AbstractC0444k.m955s0(sb.toString(), i9));
                }
                return c1694m3;
            case 3:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                concurrentHashMap.put(Integer.valueOf(i9), (C1132nt) obj);
                C1701c0 c1701c0 = ((C1473yt) obj2).f9795d;
                C1504zt c1504zt = (C1504zt) c1701c0.getValue();
                Collection values = concurrentHashMap.values();
                AbstractC3367j.m5099d(values, "<get-values>(...)");
                c1701c0.m2752j(null, C1504zt.m2438a(c1504zt, null, 0, C1473yt.m2433d(AbstractC1805m.m3035C0(values)), null, null, 1983));
                return c1694m3;
            default:
                C2405r1 c2405r1 = (C2405r1) obj3;
                C2182b0 c2182b0 = (C2182b0) obj2;
                InterfaceC2403r interfaceC2403r3 = (InterfaceC2403r) obj;
                if (c2405r1.f13543e == i9 && AbstractC3367j.m5096a(c2182b0, c2405r1.f13544f) && (interfaceC2403r3 instanceof C2415v)) {
                    long[] jArr = c2182b0.f12621a;
                    int length2 = jArr.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr[i11];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((255 & j6) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        Object obj4 = c2182b0.f12622b[i15];
                                        i7 = i12;
                                        if (c2182b0.f12623c[i15] != i9) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            C2415v c2415v = (C2415v) interfaceC2403r3;
                                            interfaceC2403r2 = interfaceC2403r3;
                                            C2194h0 c2194h0 = c2415v.f13608k;
                                            AbstractC2080d.m3377E(c2194h0, obj4, c2405r1);
                                            c1694m2 = c1694m3;
                                            if (obj4 instanceof C2352e0) {
                                                C2352e0 c2352e0 = (C2352e0) obj4;
                                                if (!c2194h0.m3588c(c2352e0)) {
                                                    AbstractC2080d.m3378F(c2415v.f13611n, c2352e0);
                                                }
                                                C2194h0 c2194h02 = c2405r1.f13545g;
                                                if (c2194h02 != null) {
                                                    c2194h02.m3596k(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC2403r2 = interfaceC2403r3;
                                            c1694m2 = c1694m3;
                                        }
                                        if (z7) {
                                            c2182b0.m3554g(i15);
                                        }
                                    } else {
                                        interfaceC2403r2 = interfaceC2403r3;
                                        c1694m2 = c1694m3;
                                        i7 = i12;
                                    }
                                    j6 >>= i7;
                                    i14++;
                                    i12 = i7;
                                    interfaceC2403r3 = interfaceC2403r2;
                                    c1694m3 = c1694m2;
                                }
                                interfaceC2403r = interfaceC2403r3;
                                c1694m = c1694m3;
                                if (i13 != i12) {
                                    return c1694m;
                                }
                            } else {
                                interfaceC2403r = interfaceC2403r3;
                                c1694m = c1694m3;
                            }
                            if (i11 != length2) {
                                i11++;
                                interfaceC2403r3 = interfaceC2403r;
                                c1694m3 = c1694m;
                            } else {
                                return c1694m;
                            }
                        }
                    }
                }
                return c1694m3;
        }
    }

    public /* synthetic */ C1381w(C1196q0 c1196q0, C0800d9 c0800d9, int i7, C3377t c3377t) {
        this.f8280e = 0;
        this.f8282g = c0800d9;
        this.f8281f = i7;
        this.f8283h = c3377t;
    }
}
