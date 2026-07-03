package p152u;

import androidx.compose.foundation.lazy.layout.C0156a;
import java.util.List;
import p032d6.AbstractC0525d0;
import p057h1.C1752b;
import p065i2.AbstractC2064e;
import p140s2.C3100j;
import p140s2.EnumC3103m;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p160v.C3397a0;
import p160v.C3440v;
import p160v.C3444x;
import p177x0.InterfaceC3796d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.n */
/* loaded from: classes.dex */
public final class C3326n {

    /* renamed from: a */
    public final int f16329a;

    /* renamed from: b */
    public final List f16330b;

    /* renamed from: c */
    public final InterfaceC3796d f16331c;

    /* renamed from: d */
    public final EnumC3103m f16332d;

    /* renamed from: e */
    public final int f16333e;

    /* renamed from: f */
    public final int f16334f;

    /* renamed from: g */
    public final int f16335g;

    /* renamed from: h */
    public final long f16336h;

    /* renamed from: i */
    public final Object f16337i;

    /* renamed from: j */
    public final Object f16338j;

    /* renamed from: k */
    public final C0156a f16339k;

    /* renamed from: l */
    public final long f16340l;

    /* renamed from: m */
    public int f16341m;

    /* renamed from: n */
    public final int f16342n;

    /* renamed from: o */
    public final int f16343o;

    /* renamed from: p */
    public final int f16344p;

    /* renamed from: q */
    public boolean f16345q;

    /* renamed from: r */
    public int f16346r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f16347s;

    /* renamed from: t */
    public int f16348t;

    /* renamed from: u */
    public final int[] f16349u;

    public C3326n(int i7, List list, InterfaceC3796d interfaceC3796d, EnumC3103m enumC3103m, int i8, int i9, int i10, long j6, Object obj, Object obj2, C0156a c0156a, long j7) {
        this.f16329a = i7;
        this.f16330b = list;
        this.f16331c = interfaceC3796d;
        this.f16332d = enumC3103m;
        this.f16333e = i8;
        this.f16334f = i9;
        this.f16335g = i10;
        this.f16336h = j6;
        this.f16337i = obj;
        this.f16338j = obj2;
        this.f16339k = c0156a;
        this.f16340l = j7;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i13);
            i11 += abstractC3239v0.f16054f;
            i12 = Math.max(i12, abstractC3239v0.f16053e);
        }
        this.f16342n = i11;
        int i14 = i11 + this.f16335g;
        this.f16343o = i14 >= 0 ? i14 : 0;
        this.f16344p = i12;
        this.f16349u = new int[this.f16330b.size() * 2];
    }

    /* renamed from: a */
    public final long m5062a(int i7) {
        int i8 = i7 * 2;
        int[] iArr = this.f16349u;
        return AbstractC2064e.m3234d(iArr[i8], iArr[i8 + 1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m5063b(AbstractC3237u0 abstractC3237u0, boolean z7) {
        C3444x c3444x;
        if (this.f16346r != Integer.MIN_VALUE) {
            List list = this.f16330b;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i7);
                int i8 = this.f16347s - abstractC3239v0.f16054f;
                int i9 = this.f16348t;
                long m5062a = m5062a(i7);
                C3397a0 c3397a0 = (C3397a0) this.f16339k.f676a.m3592g(this.f16337i);
                C1752b c1752b = null;
                Object[] objArr = 0;
                if (c3397a0 != null) {
                    c3444x = c3397a0.f16497a[i7];
                } else {
                    c3444x = null;
                }
                if (c3444x != null) {
                    if (z7) {
                        c3444x.f16655r = m5062a;
                    } else {
                        if (!C3100j.m4783a(c3444x.f16655r, C3444x.f16636s)) {
                            m5062a = c3444x.f16655r;
                        }
                        long m4785c = C3100j.m4785c(m5062a, ((C3100j) c3444x.f16654q.getValue()).f15696a);
                        int i10 = (int) (m5062a & 4294967295L);
                        if (((i10 <= i8 && ((int) (m4785c & 4294967295L)) <= i8) || (i10 >= i9 && ((int) (m4785c & 4294967295L)) >= i9)) && ((Boolean) c3444x.f16645h.getValue()).booleanValue()) {
                            AbstractC0525d0.m1141s(c3444x.f16638a, null, new C3440v(c3444x, objArr == true ? 1 : 0, 1), 3);
                        }
                        m5062a = m4785c;
                    }
                    c1752b = c3444x.f16651n;
                }
                long m4785c2 = C3100j.m4785c(m5062a, this.f16336h);
                if (!z7 && c3444x != null) {
                    c3444x.f16650m = m4785c2;
                }
                if (c1752b != null) {
                    abstractC3237u0.getClass();
                    AbstractC3237u0.m4948a(abstractC3237u0, abstractC3239v0);
                    abstractC3239v0.mo4958m0(C3100j.m4785c(m4785c2, abstractC3239v0.f16057i), 0.0f, c1752b);
                } else {
                    AbstractC3237u0.m4954p(abstractC3237u0, abstractC3239v0, m4785c2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first");
    }

    /* renamed from: c */
    public final void m5064c(int i7, int i8, int i9) {
        this.f16341m = i7;
        this.f16346r = i9;
        List list = this.f16330b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i10);
            int i11 = i10 * 2;
            InterfaceC3796d interfaceC3796d = this.f16331c;
            if (interfaceC3796d != null) {
                int mo5824a = interfaceC3796d.mo5824a(abstractC3239v0.f16053e, i8, this.f16332d);
                int[] iArr = this.f16349u;
                iArr[i11] = mo5824a;
                iArr[i11 + 1] = i7;
                i7 += abstractC3239v0.f16054f;
            } else {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
        }
        this.f16347s = -this.f16333e;
        this.f16348t = this.f16346r + this.f16334f;
    }
}
