package p057h1;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import p001a0.C0005b;
import p023c5.C0427s;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0467e;
import p035e1.AbstractC0655g0;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0660j;
import p049g1.AbstractC1569c;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p056h0.C1748v;
import p067i4.AbstractC2072e;
import p077k.AbstractC2212q0;
import p077k.C2196i0;
import p102n1.AbstractC2710c;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.b */
/* loaded from: classes.dex */
public final class C1752b {

    /* renamed from: a */
    public final InterfaceC1754d f10663a;

    /* renamed from: f */
    public Outline f10668f;

    /* renamed from: j */
    public float f10672j;

    /* renamed from: k */
    public AbstractC0655g0 f10673k;

    /* renamed from: l */
    public C0660j f10674l;

    /* renamed from: m */
    public C0660j f10675m;

    /* renamed from: n */
    public boolean f10676n;

    /* renamed from: o */
    public C1568b f10677o;

    /* renamed from: p */
    public C0427s f10678p;

    /* renamed from: q */
    public int f10679q;

    /* renamed from: s */
    public boolean f10681s;

    /* renamed from: t */
    public long f10682t;

    /* renamed from: u */
    public long f10683u;

    /* renamed from: v */
    public long f10684v;

    /* renamed from: w */
    public boolean f10685w;

    /* renamed from: x */
    public RectF f10686x;

    /* renamed from: b */
    public InterfaceC3093c f10664b = AbstractC1569c.f10185a;

    /* renamed from: c */
    public EnumC3103m f10665c = EnumC3103m.f15703e;

    /* renamed from: d */
    public AbstractC3368k f10666d = C1751a.f10660g;

    /* renamed from: e */
    public final C0005b f10667e = new C0005b(12, this);

    /* renamed from: g */
    public boolean f10669g = true;

    /* renamed from: h */
    public long f10670h = 0;

    /* renamed from: i */
    public long f10671i = 9205357640488583168L;

    /* renamed from: r */
    public final C1748v f10680r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [h0.v, java.lang.Object] */
    public C1752b(InterfaceC1754d interfaceC1754d) {
        this.f10663a = interfaceC1754d;
        interfaceC1754d.mo2845u(false);
        this.f10682t = 0L;
        this.f10683u = 0L;
        this.f10684v = 9205357640488583168L;
    }

    /* renamed from: a */
    public final void m2805a() {
        Outline outline;
        if (this.f10669g) {
            boolean z7 = this.f10685w;
            Outline outline2 = null;
            InterfaceC1754d interfaceC1754d = this.f10663a;
            if (!z7 && interfaceC1754d.mo2818G() <= 0.0f) {
                interfaceC1754d.mo2845u(false);
                interfaceC1754d.mo2838n(null, 0L);
            } else {
                C0660j c0660j = this.f10674l;
                if (c0660j != null) {
                    RectF rectF = this.f10686x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f10686x = rectF;
                    }
                    boolean z8 = c0660j instanceof C0660j;
                    if (z8) {
                        c0660j.f2151a.computeBounds(rectF, false);
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 <= 28 && !c0660j.f2151a.isConvex()) {
                            Outline outline3 = this.f10668f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.f10676n = true;
                            outline = null;
                        } else {
                            outline = this.f10668f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f10668f = outline;
                            }
                            if (i7 >= 30) {
                                if (z8) {
                                    outline.setPath(c0660j.f2151a);
                                } else {
                                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                                }
                            } else if (z8) {
                                outline.setConvexPath(c0660j.f2151a);
                            } else {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            this.f10676n = !outline.canClip();
                        }
                        this.f10674l = c0660j;
                        if (outline != null) {
                            outline.setAlpha(interfaceC1754d.mo2825a());
                            outline2 = outline;
                        }
                        interfaceC1754d.mo2838n(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                        if (this.f10676n && this.f10685w) {
                            interfaceC1754d.mo2845u(false);
                            interfaceC1754d.mo2843s();
                        } else {
                            interfaceC1754d.mo2845u(this.f10685w);
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    interfaceC1754d.mo2845u(this.f10685w);
                    Outline outline4 = this.f10668f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f10668f = outline4;
                    }
                    Outline outline5 = outline4;
                    long m3347y = AbstractC2072e.m3347y(this.f10683u);
                    long j6 = this.f10670h;
                    long j7 = this.f10671i;
                    if (j7 != 9205357640488583168L) {
                        m3347y = j7;
                    }
                    int i8 = (int) (j6 >> 32);
                    int i9 = (int) (j6 & 4294967295L);
                    int i10 = (int) (m3347y >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat((int) (m3347y & 4294967295L)) + Float.intBitsToFloat(i9)), this.f10672j);
                    outline5.setAlpha(interfaceC1754d.mo2825a());
                    interfaceC1754d.mo2838n(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i10)) << 32));
                }
            }
        }
        this.f10669g = false;
    }

    /* renamed from: b */
    public final void m2806b() {
        if (this.f10681s && this.f10679q == 0) {
            C1748v c1748v = this.f10680r;
            C1752b c1752b = (C1752b) c1748v.f10651b;
            if (c1752b != null) {
                c1752b.m2809e();
                c1748v.f10651b = null;
            }
            C2196i0 c2196i0 = (C2196i0) c1748v.f10653d;
            if (c2196i0 != null) {
                Object[] objArr = c2196i0.f12685b;
                long[] jArr = c2196i0.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j6 = jArr[i7];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j6) < 128) {
                                    ((C1752b) objArr[(i7 << 3) + i9]).m2809e();
                                }
                                j6 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                c2196i0.m3600b();
            }
            this.f10663a.mo2843s();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [t5.c, u5.k] */
    /* renamed from: c */
    public final void m2807c(InterfaceC1570d interfaceC1570d) {
        C1748v c1748v = this.f10680r;
        c1748v.f10652c = (C1752b) c1748v.f10651b;
        C2196i0 c2196i0 = (C2196i0) c1748v.f10653d;
        if (c2196i0 != null && c2196i0.m3606h()) {
            C2196i0 c2196i02 = (C2196i0) c1748v.f10654e;
            if (c2196i02 == null) {
                int i7 = AbstractC2212q0.f12726a;
                c2196i02 = new C2196i0();
                c1748v.f10654e = c2196i02;
            }
            c2196i02.m3608j(c2196i0);
            c2196i0.m3600b();
        }
        c1748v.f10650a = true;
        this.f10666d.mo23f(interfaceC1570d);
        c1748v.f10650a = false;
        C1752b c1752b = (C1752b) c1748v.f10652c;
        if (c1752b != null) {
            c1752b.m2809e();
        }
        C2196i0 c2196i03 = (C2196i0) c1748v.f10654e;
        if (c2196i03 != null && c2196i03.m3606h()) {
            Object[] objArr = c2196i03.f12685b;
            long[] jArr = c2196i03.f12684a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j6 = jArr[i8];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j6) < 128) {
                                ((C1752b) objArr[(i8 << 3) + i10]).m2809e();
                            }
                            j6 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            c2196i03.m3600b();
        }
    }

    /* renamed from: d */
    public final AbstractC0655g0 m2808d() {
        AbstractC0655g0 c0651e0;
        AbstractC0655g0 abstractC0655g0 = this.f10673k;
        C0660j c0660j = this.f10674l;
        if (abstractC0655g0 != null) {
            return abstractC0655g0;
        }
        if (c0660j != null) {
            C0649d0 c0649d0 = new C0649d0(c0660j);
            this.f10673k = c0649d0;
            return c0649d0;
        }
        long m3347y = AbstractC2072e.m3347y(this.f10683u);
        long j6 = this.f10670h;
        long j7 = this.f10671i;
        if (j7 != 9205357640488583168L) {
            m3347y = j7;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m3347y >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (m3347y & 4294967295L)) + intBitsToFloat2;
        if (this.f10672j > 0.0f) {
            c0651e0 = new C0653f0(AbstractC2710c.m4329a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            c0651e0 = new C0651e0(new C0465c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f10673k = c0651e0;
        return c0651e0;
    }

    /* renamed from: e */
    public final void m2809e() {
        this.f10679q--;
        m2806b();
    }

    /* renamed from: f */
    public final void m2810f(float f7) {
        InterfaceC1754d interfaceC1754d = this.f10663a;
        if (interfaceC1754d.mo2825a() == f7) {
            return;
        }
        interfaceC1754d.mo2827c(f7);
    }

    /* renamed from: g */
    public final void m2811g(long j6, long j7, float f7) {
        if (C0464b.m1006b(this.f10670h, j6) && C0467e.m1023a(this.f10671i, j7) && this.f10672j == f7 && this.f10674l == null) {
            return;
        }
        this.f10673k = null;
        this.f10674l = null;
        this.f10669g = true;
        this.f10676n = false;
        this.f10670h = j6;
        this.f10671i = j7;
        this.f10672j = f7;
        m2805a();
    }
}
