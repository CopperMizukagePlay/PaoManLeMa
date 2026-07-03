package p001a0;

import p027d1.C0465c;
import p050g2.C1602n0;
import p073j2.AbstractC2168e;
import p085l0.C2345c1;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p122q.EnumC2931o0;
import p153u0.AbstractC3344k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.l2 */
/* loaded from: classes.dex */
public final class C0048l2 {

    /* renamed from: f */
    public static final C0068q2 f245f = AbstractC3344k.m5079b(C0044k2.f236f, C0029h.f144q);

    /* renamed from: a */
    public final C2345c1 f246a;

    /* renamed from: b */
    public final C2345c1 f247b = new C2345c1(0.0f);

    /* renamed from: c */
    public C0465c f248c = C0465c.f1624e;

    /* renamed from: d */
    public long f249d = C1602n0.f10302b;

    /* renamed from: e */
    public final C2361g1 f250e;

    public C0048l2(EnumC2931o0 enumC2931o0, float f7) {
        this.f246a = new C2345c1(f7);
        this.f250e = new C2361g1(enumC2931o0, C2413u0.f13575j);
    }

    /* renamed from: a */
    public final void m124a(EnumC2931o0 enumC2931o0, C0465c c0465c, int i7, int i8) {
        boolean z7;
        float f7;
        float f8;
        float f9 = i8 - i7;
        this.f247b.m3730h(f9);
        float f10 = c0465c.f1625a;
        float f11 = c0465c.f1626b;
        C0465c c0465c2 = this.f248c;
        float f12 = c0465c2.f1625a;
        C2345c1 c2345c1 = this.f246a;
        if (f10 != f12 || f11 != c0465c2.f1626b) {
            if (enumC2931o0 == EnumC2931o0.f15240e) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                f10 = f11;
            }
            if (z7) {
                f7 = c0465c.f1628d;
            } else {
                f7 = c0465c.f1627c;
            }
            float m3729g = c2345c1.m3729g();
            float f13 = i7;
            float f14 = m3729g + f13;
            if (f7 > f14 || (f10 < m3729g && f7 - f10 > f13)) {
                f8 = f7 - f14;
            } else if (f10 < m3729g && f7 - f10 <= f13) {
                f8 = f10 - m3729g;
            } else {
                f8 = 0.0f;
            }
            c2345c1.m3730h(c2345c1.m3729g() + f8);
            this.f248c = c0465c;
        }
        c2345c1.m3730h(AbstractC2168e.m3529p(c2345c1.m3729g(), 0.0f, f9));
    }
}
