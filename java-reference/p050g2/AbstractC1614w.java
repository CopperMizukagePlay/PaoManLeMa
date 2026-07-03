package p050g2;

import p132r2.C3035i;
import p132r2.C3043q;
import p132r2.C3045s;
import p140s2.C3105o;
import p140s2.C3106p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.w */
/* loaded from: classes.dex */
public abstract class AbstractC1614w {

    /* renamed from: a */
    public static final long f10348a;

    /* renamed from: b */
    public static final /* synthetic */ int f10349b = 0;

    static {
        C3106p[] c3106pArr = C3105o.f15707b;
        f10348a = C3105o.f15708c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.f10339a) goto L7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1613v m2622a(C1613v c1613v, int i7, int i8, long j6, C3043q c3043q, C1615x c1615x, C3035i c3035i, int i9, int i10, C3045s c3045s) {
        long j7;
        int i11 = i7;
        int i12 = i8;
        long j8 = j6;
        C3043q c3043q2 = c3043q;
        C1615x c1615x2 = c1615x;
        C3035i c3035i2 = c3035i;
        int i13 = i9;
        int i14 = i10;
        C3045s c3045s2 = c3045s;
        if (i11 == Integer.MIN_VALUE) {
            j7 = 0;
        } else {
            j7 = 0;
        }
        C3106p[] c3106pArr = C3105o.f15707b;
        if (((j8 & 1095216660480L) == j7 || C3105o.m4794a(j8, c1613v.f10341c)) && ((c3043q2 == null || c3043q2.equals(c1613v.f10342d)) && ((i12 == Integer.MIN_VALUE || i12 == c1613v.f10340b) && ((c1615x2 == null || c1615x2.equals(c1613v.f10343e)) && ((c3035i2 == null || c3035i2.equals(c1613v.f10344f)) && ((i13 == 0 || i13 == c1613v.f10345g) && ((i14 == Integer.MIN_VALUE || i14 == c1613v.f10346h) && (c3045s2 == null || c3045s2.equals(c1613v.f10347i))))))))) {
            return c1613v;
        }
        C3106p[] c3106pArr2 = C3105o.f15707b;
        if ((j8 & 1095216660480L) == j7) {
            j8 = c1613v.f10341c;
        }
        if (c3043q2 == null) {
            c3043q2 = c1613v.f10342d;
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = c1613v.f10339a;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = c1613v.f10340b;
        }
        C1615x c1615x3 = c1613v.f10343e;
        if (c1615x3 != null && c1615x2 == null) {
            c1615x2 = c1615x3;
        }
        if (c3035i2 == null) {
            c3035i2 = c1613v.f10344f;
        }
        if (i13 == 0) {
            i13 = c1613v.f10345g;
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = c1613v.f10346h;
        }
        if (c3045s2 == null) {
            c3045s2 = c1613v.f10347i;
        }
        return new C1613v(i11, i12, j8, c3043q2, c1615x2, c3035i2, i13, i14, c3045s2);
    }
}
