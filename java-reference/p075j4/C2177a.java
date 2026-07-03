package p075j4;

import p022c4.C0400j;
import p022c4.C0406p;
import p065i2.AbstractC2064e;
import p067i4.C2069b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C2177a {

    /* renamed from: a */
    public final C2069b f12600a;

    /* renamed from: b */
    public final int f12601b;

    /* renamed from: c */
    public final int f12602c;

    /* renamed from: d */
    public final int f12603d;

    /* renamed from: e */
    public final int f12604e;

    /* renamed from: f */
    public final int f12605f;

    /* renamed from: g */
    public final int f12606g;

    public C2177a(C2069b c2069b, int i7, int i8, int i9) {
        this.f12600a = c2069b;
        int i10 = c2069b.f12259f;
        this.f12601b = i10;
        int i11 = c2069b.f12258e;
        this.f12602c = i11;
        int i12 = i7 / 2;
        int i13 = i8 - i12;
        this.f12603d = i13;
        int i14 = i8 + i12;
        this.f12604e = i14;
        int i15 = i9 - i12;
        this.f12606g = i15;
        int i16 = i9 + i12;
        this.f12605f = i16;
        if (i15 < 0 || i13 < 0 || i16 >= i10 || i14 >= i11) {
            throw C0400j.m878a();
        }
    }

    /* renamed from: a */
    public final boolean m3542a(int i7, int i8, int i9, boolean z7) {
        C2069b c2069b = this.f12600a;
        if (z7) {
            while (i7 <= i8) {
                if (!c2069b.m3313b(i7, i9)) {
                    i7++;
                } else {
                    return true;
                }
            }
            return false;
        }
        while (i7 <= i8) {
            if (c2069b.m3313b(i9, i7)) {
                return true;
            }
            i7++;
        }
        return false;
    }

    /* renamed from: b */
    public final C0406p[] m3543b() {
        int i7;
        int i8;
        int i9 = this.f12603d;
        int i10 = this.f12604e;
        int i11 = this.f12606g;
        int i12 = this.f12605f;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        do {
            i7 = this.f12602c;
            if (!z12) {
                break;
            }
            boolean z13 = false;
            boolean z14 = true;
            while (true) {
                if ((z14 || !z8) && i10 < i7) {
                    z14 = m3542a(i11, i12, i10, false);
                    if (z14) {
                        i10++;
                        z8 = true;
                        z13 = true;
                    } else if (!z8) {
                        i10++;
                    }
                }
            }
            if (i10 >= i7) {
                break;
            }
            boolean z15 = true;
            while (true) {
                i8 = this.f12601b;
                if ((z15 || !z9) && i12 < i8) {
                    z15 = m3542a(i9, i10, i12, true);
                    if (z15) {
                        i12++;
                        z9 = true;
                        z13 = true;
                    } else if (!z9) {
                        i12++;
                    }
                }
            }
            if (i12 >= i8) {
                break;
            }
            boolean z16 = true;
            while (true) {
                if ((z16 || !z10) && i9 >= 0) {
                    z16 = m3542a(i11, i12, i9, false);
                    if (z16) {
                        i9--;
                        z10 = true;
                        z13 = true;
                    } else if (!z10) {
                        i9--;
                    }
                }
            }
            if (i9 < 0) {
                break;
            }
            z12 = z13;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 >= 0) {
                    z17 = m3542a(i9, i10, i11, true);
                    if (z17) {
                        i11--;
                        z12 = true;
                        z11 = true;
                    } else if (!z11) {
                        i11--;
                    }
                }
            }
        } while (i11 >= 0);
        z7 = true;
        if (!z7) {
            int i13 = i10 - i9;
            C0406p c0406p = null;
            C0406p c0406p2 = null;
            for (int i14 = 1; c0406p2 == null && i14 < i13; i14++) {
                c0406p2 = m3544c(i9, i12 - i14, i9 + i14, i12);
            }
            if (c0406p2 != null) {
                C0406p c0406p3 = null;
                for (int i15 = 1; c0406p3 == null && i15 < i13; i15++) {
                    c0406p3 = m3544c(i9, i11 + i15, i9 + i15, i11);
                }
                if (c0406p3 != null) {
                    C0406p c0406p4 = null;
                    for (int i16 = 1; c0406p4 == null && i16 < i13; i16++) {
                        c0406p4 = m3544c(i10, i11 + i16, i10 - i16, i11);
                    }
                    if (c0406p4 != null) {
                        for (int i17 = 1; c0406p == null && i17 < i13; i17++) {
                            c0406p = m3544c(i10, i12 - i17, i10 - i17, i12);
                        }
                        if (c0406p != null) {
                            float f7 = c0406p.f1390a;
                            float f8 = c0406p.f1391b;
                            float f9 = c0406p2.f1390a;
                            float f10 = c0406p2.f1391b;
                            float f11 = c0406p4.f1390a;
                            float f12 = c0406p4.f1391b;
                            float f13 = c0406p3.f1390a;
                            float f14 = c0406p3.f1391b;
                            if (f7 < i7 / 2.0f) {
                                return new C0406p[]{new C0406p(f13 - 1.0f, f14 + 1.0f), new C0406p(f9 + 1.0f, f10 + 1.0f), new C0406p(f11 - 1.0f, f12 - 1.0f), new C0406p(f7 + 1.0f, f8 - 1.0f)};
                            }
                            return new C0406p[]{new C0406p(f13 + 1.0f, f14 + 1.0f), new C0406p(f9 + 1.0f, f10 - 1.0f), new C0406p(f11 - 1.0f, f12 + 1.0f), new C0406p(f7 - 1.0f, f8 - 1.0f)};
                        }
                        throw C0400j.m878a();
                    }
                    throw C0400j.m878a();
                }
                throw C0400j.m878a();
            }
            throw C0400j.m878a();
        }
        throw C0400j.m878a();
    }

    /* renamed from: c */
    public final C0406p m3544c(float f7, float f8, float f9, float f10) {
        int m3224E = AbstractC2064e.m3224E(AbstractC2064e.m3245s(f7, f8, f9, f10));
        float f11 = m3224E;
        float f12 = (f9 - f7) / f11;
        float f13 = (f10 - f8) / f11;
        for (int i7 = 0; i7 < m3224E; i7++) {
            float f14 = i7;
            int m3224E2 = AbstractC2064e.m3224E((f14 * f12) + f7);
            int m3224E3 = AbstractC2064e.m3224E((f14 * f13) + f8);
            if (this.f12600a.m3313b(m3224E2, m3224E3)) {
                return new C0406p(m3224E2, m3224E3);
            }
        }
        return null;
    }

    public C2177a(C2069b c2069b) {
        this(c2069b, 10, c2069b.f12258e / 2, c2069b.f12259f / 2);
    }
}
