package p140s2;

import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p147t2.AbstractC3249b;
import p147t2.InterfaceC3248a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.c */
/* loaded from: classes.dex */
public interface InterfaceC3093c {
    /* renamed from: H */
    default int mo4511H(long j6) {
        return Math.round(mo4518f0(j6));
    }

    /* renamed from: L */
    default float mo4512L(long j6) {
        float m4796c;
        float mo560l;
        if (!C3106p.m4798a(C3105o.m4795b(j6), 4294967296L)) {
            AbstractC3099i.m4782b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC3249b.f16070a;
        if (mo560l() >= 1.03f) {
            InterfaceC3248a m4961a = AbstractC3249b.m4961a(mo560l());
            m4796c = C3105o.m4796c(j6);
            if (m4961a == null) {
                mo560l = mo560l();
            } else {
                return m4961a.mo4793b(m4796c);
            }
        } else {
            m4796c = C3105o.m4796c(j6);
            mo560l = mo560l();
        }
        return mo560l * m4796c;
    }

    /* renamed from: Q */
    default int mo4513Q(float f7) {
        float mo4526y = mo4526y(f7);
        if (Float.isInfinite(mo4526y)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo4526y);
    }

    /* renamed from: a0 */
    default long mo4515a0(long j6) {
        if (j6 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float mo4526y = mo4526y(C3098h.m4780b(j6));
        float mo4526y2 = mo4526y(C3098h.m4779a(j6));
        return (Float.floatToRawIntBits(mo4526y2) & 4294967295L) | (Float.floatToRawIntBits(mo4526y) << 32);
    }

    /* renamed from: b */
    float mo559b();

    /* renamed from: f0 */
    default float mo4518f0(long j6) {
        if (!C3106p.m4798a(C3105o.m4795b(j6), 4294967296L)) {
            AbstractC3099i.m4782b("Only Sp can convert to Px");
        }
        return mo4526y(mo4512L(j6));
    }

    /* renamed from: l */
    float mo560l();

    /* renamed from: n0 */
    default long mo4521n0(float f7) {
        return mo4523v(mo4524v0(f7));
    }

    /* renamed from: t0 */
    default float mo4522t0(int i7) {
        return i7 / mo559b();
    }

    /* renamed from: v */
    default long mo4523v(float f7) {
        float mo560l;
        float[] fArr = AbstractC3249b.f16070a;
        if (mo560l() >= 1.03f) {
            InterfaceC3248a m4961a = AbstractC3249b.m4961a(mo560l());
            if (m4961a != null) {
                mo560l = m4961a.mo4792a(f7);
            } else {
                mo560l = f7 / mo560l();
            }
            return AbstractC2080d.m3413z(mo560l, 4294967296L);
        }
        return AbstractC2080d.m3413z(f7 / mo560l(), 4294967296L);
    }

    /* renamed from: v0 */
    default float mo4524v0(float f7) {
        return f7 / mo559b();
    }

    /* renamed from: w */
    default long mo4525w(long j6) {
        if (j6 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return AbstractC2168e.m3516c(mo4524v0(Float.intBitsToFloat((int) (j6 >> 32))), mo4524v0(Float.intBitsToFloat((int) (j6 & 4294967295L))));
    }

    /* renamed from: y */
    default float mo4526y(float f7) {
        return mo559b() * f7;
    }
}
