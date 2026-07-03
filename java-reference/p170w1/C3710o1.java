package p170w1;

import android.os.Build;
import android.view.ViewParent;
import p027d1.C0464b;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.C0647c0;
import p035e1.C0675q0;
import p035e1.InterfaceC0682x;
import p049g1.C1568b;
import p057h1.C1752b;
import p057h1.InterfaceC1754d;
import p060h5.AbstractC1793a0;
import p067i4.AbstractC2072e;
import p068i5.AbstractC2080d;
import p140s2.C3100j;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p160v.C3423m0;
import p162v1.InterfaceC3521m1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.o1 */
/* loaded from: classes.dex */
public final class C3710o1 implements InterfaceC3521m1 {

    /* renamed from: e */
    public C1752b f17630e;

    /* renamed from: f */
    public final InterfaceC0682x f17631f;

    /* renamed from: g */
    public final C3728t f17632g;

    /* renamed from: h */
    public InterfaceC3281e f17633h;

    /* renamed from: i */
    public InterfaceC3277a f17634i;

    /* renamed from: j */
    public long f17635j;

    /* renamed from: k */
    public boolean f17636k;

    /* renamed from: m */
    public float[] f17638m;

    /* renamed from: n */
    public boolean f17639n;

    /* renamed from: r */
    public int f17643r;

    /* renamed from: t */
    public AbstractC0655g0 f17645t;

    /* renamed from: u */
    public boolean f17646u;

    /* renamed from: v */
    public boolean f17647v;

    /* renamed from: x */
    public boolean f17649x;

    /* renamed from: l */
    public final float[] f17637l = C0647c0.m1350a();

    /* renamed from: o */
    public InterfaceC3093c f17640o = AbstractC2080d.m3389b();

    /* renamed from: p */
    public EnumC3103m f17641p = EnumC3103m.f15703e;

    /* renamed from: q */
    public final C1568b f17642q = new C1568b();

    /* renamed from: s */
    public long f17644s = C0675q0.f2200b;

    /* renamed from: w */
    public boolean f17648w = true;

    /* renamed from: y */
    public final C3423m0 f17650y = new C3423m0(10, this);

    public C3710o1(C1752b c1752b, InterfaceC0682x interfaceC0682x, C3728t c3728t, InterfaceC3281e interfaceC3281e, InterfaceC3277a interfaceC3277a) {
        this.f17630e = c1752b;
        this.f17631f = interfaceC0682x;
        this.f17632g = c3728t;
        this.f17633h = interfaceC3281e;
        this.f17634i = interfaceC3277a;
        long j6 = Integer.MAX_VALUE;
        this.f17635j = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: a */
    public final float[] m5708a() {
        float[] fArr = this.f17638m;
        if (fArr == null) {
            fArr = C0647c0.m1350a();
            this.f17638m = fArr;
        }
        if (!this.f17647v) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.f17647v = false;
            float[] m5709b = m5709b();
            if (this.f17648w) {
                return m5709b;
            }
            if (!AbstractC3681h0.m5694u(m5709b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    /* renamed from: b */
    public final float[] m5709b() {
        boolean z7 = this.f17646u;
        float[] fArr = this.f17637l;
        if (z7) {
            C1752b c1752b = this.f17630e;
            long j6 = c1752b.f10684v;
            InterfaceC1754d interfaceC1754d = c1752b.f10663a;
            if ((9223372034707292159L & j6) == 9205357640488583168L) {
                j6 = AbstractC1793a0.m2990r(AbstractC2072e.m3347y(this.f17635j));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
            float mo2844t = interfaceC1754d.mo2844t();
            float mo2831g = interfaceC1754d.mo2831g();
            float mo2847w = interfaceC1754d.mo2847w();
            float mo2816E = interfaceC1754d.mo2816E();
            float mo2821J = interfaceC1754d.mo2821J();
            float mo2828d = interfaceC1754d.mo2828d();
            float mo2820I = interfaceC1754d.mo2820I();
            double d7 = mo2847w * 0.017453292519943295d;
            float sin = (float) Math.sin(d7);
            float cos = (float) Math.cos(d7);
            float f7 = -sin;
            float f8 = (mo2831g * cos) - (1.0f * sin);
            float f9 = (1.0f * cos) + (mo2831g * sin);
            double d8 = mo2816E * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d8);
            float cos2 = (float) Math.cos(d8);
            float f10 = -sin2;
            float f11 = sin * sin2;
            float f12 = sin * cos2;
            float f13 = cos * sin2;
            float f14 = cos * cos2;
            float f15 = (f9 * sin2) + (mo2844t * cos2);
            float f16 = (f9 * cos2) + ((-mo2844t) * sin2);
            double d9 = mo2821J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d9);
            float cos3 = (float) Math.cos(d9);
            float f17 = -sin3;
            float f18 = (cos3 * f11) + (f17 * cos2);
            float f19 = ((f11 * sin3) + (cos2 * cos3)) * mo2828d;
            float f20 = sin3 * cos * mo2828d;
            float f21 = ((sin3 * f12) + (cos3 * f10)) * mo2828d;
            float f22 = f18 * mo2820I;
            float f23 = cos * cos3 * mo2820I;
            float f24 = ((cos3 * f12) + (f17 * f10)) * mo2820I;
            float f25 = f13 * 1.0f;
            float f26 = f7 * 1.0f;
            float f27 = f14 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f19;
                fArr[1] = f20;
                fArr[2] = f21;
                fArr[3] = 0.0f;
                fArr[4] = f22;
                fArr[5] = f23;
                fArr[6] = f24;
                fArr[7] = 0.0f;
                fArr[8] = f25;
                fArr[9] = f26;
                fArr[10] = f27;
                fArr[11] = 0.0f;
                float f28 = -intBitsToFloat;
                fArr[12] = ((f19 * f28) - (intBitsToFloat2 * f22)) + f15 + intBitsToFloat;
                fArr[13] = ((f20 * f28) - (intBitsToFloat2 * f23)) + f8 + intBitsToFloat2;
                fArr[14] = ((f28 * f21) - (intBitsToFloat2 * f24)) + f16;
                fArr[15] = 1.0f;
            }
            this.f17646u = false;
            this.f17648w = AbstractC0659i0.m1414n(fArr);
        }
        return fArr;
    }

    /* renamed from: c */
    public final long m5710c(long j6, boolean z7) {
        float[] m5709b;
        if (z7) {
            m5709b = m5708a();
            if (m5709b == null) {
                return 9187343241974906880L;
            }
        } else {
            m5709b = m5709b();
        }
        if (this.f17648w) {
            return j6;
        }
        return C0647c0.m1351b(j6, m5709b);
    }

    /* renamed from: d */
    public final void m5711d(long j6) {
        C3728t c3728t = this.f17632g;
        if (c3728t.f17749j) {
            c3728t.m5738M(-4.0f);
        }
        C1752b c1752b = this.f17630e;
        if (!C3100j.m4783a(c1752b.f10682t, j6)) {
            c1752b.f10682t = j6;
            c1752b.f10663a.mo2815D((int) (j6 >> 32), (int) (j6 & 4294967295L), c1752b.f10683u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = c3728t.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(c3728t, c3728t);
                return;
            }
            return;
        }
        c3728t.invalidate();
    }

    /* renamed from: e */
    public final void m5712e(long j6) {
        if (!C3102l.m4790a(j6, this.f17635j)) {
            C3728t c3728t = this.f17632g;
            if (c3728t.f17749j) {
                c3728t.m5738M(-4.0f);
            }
            this.f17635j = j6;
            if (!this.f17639n && !this.f17636k) {
                c3728t.invalidate();
                if (true != this.f17639n) {
                    this.f17639n = true;
                    c3728t.m5749x(this, true);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m5713f() {
        if (this.f17639n) {
            if (this.f17644s != C0675q0.f2200b && !C3102l.m4790a(this.f17630e.f10683u, this.f17635j)) {
                C1752b c1752b = this.f17630e;
                float m1449a = C0675q0.m1449a(this.f17644s) * ((int) (this.f17635j >> 32));
                float m1450b = C0675q0.m1450b(this.f17644s) * ((int) (this.f17635j & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(m1450b) & 4294967295L) | (Float.floatToRawIntBits(m1449a) << 32);
                if (!C0464b.m1006b(c1752b.f10684v, floatToRawIntBits)) {
                    c1752b.f10684v = floatToRawIntBits;
                    c1752b.f10663a.mo2823L(floatToRawIntBits);
                }
            }
            C1752b c1752b2 = this.f17630e;
            InterfaceC3093c interfaceC3093c = this.f17640o;
            EnumC3103m enumC3103m = this.f17641p;
            long j6 = this.f17635j;
            long j7 = c1752b2.f10683u;
            InterfaceC1754d interfaceC1754d = c1752b2.f10663a;
            if (!C3102l.m4790a(j7, j6)) {
                c1752b2.f10683u = j6;
                long j8 = c1752b2.f10682t;
                interfaceC1754d.mo2815D((int) (j8 >> 32), (int) (4294967295L & j8), j6);
                if (c1752b2.f10671i == 9205357640488583168L) {
                    c1752b2.f10669g = true;
                    c1752b2.m2805a();
                }
            }
            c1752b2.f10664b = interfaceC3093c;
            c1752b2.f10665c = enumC3103m;
            c1752b2.f10666d = this.f17650y;
            interfaceC1754d.mo2832h(interfaceC3093c, enumC3103m, c1752b2, c1752b2.f10667e);
            if (this.f17639n) {
                this.f17639n = false;
                this.f17632g.m5749x(this, false);
            }
        }
    }

    @Override // p162v1.InterfaceC3521m1
    public final void invalidate() {
        if (!this.f17639n && !this.f17636k) {
            C3728t c3728t = this.f17632g;
            c3728t.invalidate();
            if (true != this.f17639n) {
                this.f17639n = true;
                c3728t.m5749x(this, true);
            }
        }
    }
}
