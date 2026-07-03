package p101n0;

import java.util.NoSuchElementException;
import p060h5.AbstractC1804l;
import p077k.AbstractC2204m0;
import p077k.C2184c0;
import p077k.C2194h0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class C2701a {

    /* renamed from: a */
    public final C2194h0 f14510a;

    /* renamed from: a */
    public static final Object m4297a(C2194h0 c2194h0) {
        Object m3592g = c2194h0.m3592g(null);
        if (m3592g == null) {
            return null;
        }
        if (m3592g instanceof C2184c0) {
            C2184c0 c2184c0 = (C2184c0) m3592g;
            if (!c2184c0.m3562g()) {
                int i7 = c2184c0.f12629b - 1;
                Object m3560e = c2184c0.m3560e(i7);
                c2184c0.m3565j(i7);
                AbstractC3367j.m5098c(m3560e, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                if (c2184c0.m3562g()) {
                    c2194h0.m3596k(null);
                }
                if (c2184c0.f12629b == 1) {
                    c2194h0.m3598m(null, c2184c0.m3559d());
                }
                return m3560e;
            }
            throw new NoSuchElementException("List is empty.");
        }
        c2194h0.m3596k(null);
        return m3592g;
    }

    /* renamed from: b */
    public static final C2184c0 m4298b(C2194h0 c2194h0) {
        if (c2194h0.m3594i()) {
            C2184c0 c2184c0 = AbstractC2204m0.f12713b;
            AbstractC3367j.m5098c(c2184c0, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return c2184c0;
        }
        C2184c0 c2184c02 = new C2184c0();
        Object[] objArr = c2194h0.f12678c;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            Object obj = objArr[(i7 << 3) + i9];
                            if (obj instanceof C2184c0) {
                                C2184c0 c2184c03 = (C2184c0) obj;
                                if (!c2184c03.m3562g()) {
                                    int i10 = c2184c02.f12629b + c2184c03.f12629b;
                                    Object[] objArr2 = c2184c02.f12628a;
                                    if (objArr2.length < i10) {
                                        c2184c02.m3567l(i10, objArr2);
                                    }
                                    AbstractC1804l.m3017J(c2184c03.f12628a, c2184c02.f12628a, c2184c02.f12629b, 0, c2184c03.f12629b);
                                    c2184c02.f12629b += c2184c03.f12629b;
                                }
                            } else {
                                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                c2184c02.m3556a(obj);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return c2184c02;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2701a) {
            if (!AbstractC3367j.m5096a(this.f14510a, ((C2701a) obj).f14510a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14510a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f14510a + ')';
    }
}
