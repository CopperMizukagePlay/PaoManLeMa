package p170w1;

import p027d1.C0465c;
import p028d2.C0482o;
import p050g2.C1598l0;
import p132r2.EnumC3036j;
import p149t4.AbstractC3269f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.c */
/* loaded from: classes.dex */
public final class C3660c extends AbstractC3269f {

    /* renamed from: e */
    public static C3660c f17493e;

    /* renamed from: f */
    public static final EnumC3036j f17494f = EnumC3036j.f15601f;

    /* renamed from: g */
    public static final EnumC3036j f17495g = EnumC3036j.f15600e;

    /* renamed from: c */
    public C1598l0 f17496c;

    /* renamed from: d */
    public C0482o f17497d;

    @Override // p149t4.AbstractC3269f
    /* renamed from: a */
    public final int[] mo4982a(int i7) {
        int i8;
        if (m4984c().length() <= 0 || i7 >= m4984c().length()) {
            return null;
        }
        try {
            C0482o c0482o = this.f17497d;
            if (c0482o != null) {
                C0465c m1045g = c0482o.m1045g();
                int round = Math.round(m1045g.f1628d - m1045g.f1626b);
                if (i7 <= 0) {
                    i7 = 0;
                }
                C1598l0 c1598l0 = this.f17496c;
                if (c1598l0 != null) {
                    int m2578e = c1598l0.m2578e(i7);
                    C1598l0 c1598l02 = this.f17496c;
                    if (c1598l02 != null) {
                        float m2601d = c1598l02.f10289b.m2601d(m2578e) + round;
                        C1598l0 c1598l03 = this.f17496c;
                        if (c1598l03 != null) {
                            if (c1598l03 != null) {
                                if (m2601d < c1598l03.f10289b.m2601d(r0.f10317f - 1)) {
                                    C1598l0 c1598l04 = this.f17496c;
                                    if (c1598l04 != null) {
                                        i8 = c1598l04.f10289b.m2600c(m2601d);
                                    } else {
                                        AbstractC3367j.m5105j("layoutResult");
                                        throw null;
                                    }
                                } else {
                                    C1598l0 c1598l05 = this.f17496c;
                                    if (c1598l05 != null) {
                                        i8 = c1598l05.f10289b.f10317f;
                                    } else {
                                        AbstractC3367j.m5105j("layoutResult");
                                        throw null;
                                    }
                                }
                                return m4983b(i7, m5661f(i8 - 1, f17495g) + 1);
                            }
                            AbstractC3367j.m5105j("layoutResult");
                            throw null;
                        }
                        AbstractC3367j.m5105j("layoutResult");
                        throw null;
                    }
                    AbstractC3367j.m5105j("layoutResult");
                    throw null;
                }
                AbstractC3367j.m5105j("layoutResult");
                throw null;
            }
            AbstractC3367j.m5105j("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p149t4.AbstractC3269f
    /* renamed from: e */
    public final int[] mo4985e(int i7) {
        int i8;
        if (m4984c().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            C0482o c0482o = this.f17497d;
            if (c0482o != null) {
                C0465c m1045g = c0482o.m1045g();
                int round = Math.round(m1045g.f1628d - m1045g.f1626b);
                int length = m4984c().length();
                if (length <= i7) {
                    i7 = length;
                }
                C1598l0 c1598l0 = this.f17496c;
                if (c1598l0 != null) {
                    int m2578e = c1598l0.m2578e(i7);
                    C1598l0 c1598l02 = this.f17496c;
                    if (c1598l02 != null) {
                        float m2601d = c1598l02.f10289b.m2601d(m2578e) - round;
                        if (m2601d > 0.0f) {
                            C1598l0 c1598l03 = this.f17496c;
                            if (c1598l03 != null) {
                                i8 = c1598l03.f10289b.m2600c(m2601d);
                            } else {
                                AbstractC3367j.m5105j("layoutResult");
                                throw null;
                            }
                        } else {
                            i8 = 0;
                        }
                        if (i7 == m4984c().length() && i8 < m2578e) {
                            i8++;
                        }
                        return m4983b(m5661f(i8, f17494f), i7);
                    }
                    AbstractC3367j.m5105j("layoutResult");
                    throw null;
                }
                AbstractC3367j.m5105j("layoutResult");
                throw null;
            }
            AbstractC3367j.m5105j("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final int m5661f(int i7, EnumC3036j enumC3036j) {
        C1598l0 c1598l0 = this.f17496c;
        if (c1598l0 != null) {
            int m2581h = c1598l0.m2581h(i7);
            C1598l0 c1598l02 = this.f17496c;
            if (c1598l02 != null) {
                if (enumC3036j != c1598l02.m2582i(m2581h)) {
                    C1598l0 c1598l03 = this.f17496c;
                    if (c1598l03 != null) {
                        return c1598l03.m2581h(i7);
                    }
                    AbstractC3367j.m5105j("layoutResult");
                    throw null;
                }
                if (this.f17496c != null) {
                    return r6.m2577d(i7, false) - 1;
                }
                AbstractC3367j.m5105j("layoutResult");
                throw null;
            }
            AbstractC3367j.m5105j("layoutResult");
            throw null;
        }
        AbstractC3367j.m5105j("layoutResult");
        throw null;
    }
}
