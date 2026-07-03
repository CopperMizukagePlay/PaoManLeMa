package p010b1;

import p001a0.C0019e1;
import p001a0.C0056n2;
import p027d1.C0467e;
import p035e1.C0666m;
import p049g1.C1568b;
import p060h5.C1814v;
import p072j1.AbstractC2163b;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3191c1;
import p146t1.AbstractC3239v0;
import p146t1.C3229q0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.AbstractC3526o0;
import p162v1.C3508i0;
import p162v1.InterfaceC3522n;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b1.h */
/* loaded from: classes.dex */
public final class C0270h extends AbstractC3809q implements InterfaceC3549w, InterfaceC3522n {

    /* renamed from: s */
    public AbstractC2163b f1006s;

    /* renamed from: t */
    public boolean f1007t;

    /* renamed from: u */
    public InterfaceC3797e f1008u;

    /* renamed from: v */
    public C3229q0 f1009v;

    /* renamed from: w */
    public float f1010w;

    /* renamed from: x */
    public C0666m f1011x;

    /* renamed from: L0 */
    public static boolean m562L0(long j6) {
        if (!C0467e.m1023a(j6, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    public static boolean m563M0(long j6) {
        if (!C0467e.m1023a(j6, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (m565K0()) {
            long m566N0 = m566N0(AbstractC3092b.m4765b(0, i7, 7));
            return Math.max(C3091a.m4762j(m566N0), interfaceC3214k0.mo4917c0(i7));
        }
        return interfaceC3214k0.mo4917c0(i7);
    }

    /* renamed from: K0 */
    public final boolean m565K0() {
        if (this.f1007t && this.f1006s.mo3504d() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public final long m566N0(long j6) {
        boolean z7;
        int m4762j;
        int m4761i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z8 = false;
        if (C3091a.m4756d(j6) && C3091a.m4755c(j6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (C3091a.m4758f(j6) && C3091a.m4757e(j6)) {
            z8 = true;
        }
        if ((!m565K0() && z7) || z8) {
            return C3091a.m4753a(j6, C3091a.m4760h(j6), 0, C3091a.m4759g(j6), 0, 10);
        }
        long mo3504d = this.f1006s.mo3504d();
        if (m563M0(mo3504d)) {
            m4762j = Math.round(Float.intBitsToFloat((int) (mo3504d >> 32)));
        } else {
            m4762j = C3091a.m4762j(j6);
        }
        if (m562L0(mo3504d)) {
            m4761i = Math.round(Float.intBitsToFloat((int) (mo3504d & 4294967295L)));
        } else {
            m4761i = C3091a.m4761i(j6);
        }
        int m4770g = AbstractC3092b.m4770g(m4762j, j6);
        float m4769f = AbstractC3092b.m4769f(m4761i, j6);
        long floatToRawIntBits = (Float.floatToRawIntBits(m4769f) & 4294967295L) | (Float.floatToRawIntBits(m4770g) << 32);
        if (m565K0()) {
            if (!m563M0(this.f1006s.mo3504d())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.f1006s.mo3504d() >> 32));
            }
            if (!m562L0(this.f1006s.mo3504d())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.f1006s.mo3504d() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = AbstractC3191c1.m4899j(floatToRawIntBits2, this.f1009v.m4947a(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return C3091a.m4753a(j6, AbstractC3092b.m4770g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j6), 0, AbstractC3092b.m4769f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j6), 0, 10);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (m565K0()) {
            long m566N0 = m566N0(AbstractC3092b.m4765b(0, i7, 7));
            return Math.max(C3091a.m4762j(m566N0), interfaceC3214k0.mo4916V(i7));
        }
        return interfaceC3214k0.mo4916V(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m566N0(j6));
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 1));
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (m565K0()) {
            long m566N0 = m566N0(AbstractC3092b.m4765b(i7, 0, 13));
            return Math.max(C3091a.m4761i(m566N0), interfaceC3214k0.mo4920f(i7));
        }
        return interfaceC3214k0.mo4920f(i7);
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j6;
        C1568b c1568b = c3508i0.f16933e;
        long mo3504d = this.f1006s.mo3504d();
        if (m563M0(mo3504d)) {
            intBitsToFloat = Float.intBitsToFloat((int) (mo3504d >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (c1568b.mo2546c() >> 32));
        }
        if (m562L0(mo3504d)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (mo3504d & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (c1568b.mo2546c() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (c1568b.mo2546c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1568b.mo2546c() & 4294967295L)) == 0.0f) {
            j6 = 0;
        } else {
            j6 = AbstractC3191c1.m4899j(floatToRawIntBits, this.f1009v.m4947a(floatToRawIntBits, c1568b.mo2546c()));
        }
        long mo5825a = this.f1008u.mo5825a((Math.round(Float.intBitsToFloat((int) (j6 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j6 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (c1568b.mo2546c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c1568b.mo2546c() & 4294967295L))) & 4294967295L), c3508i0.getLayoutDirection());
        float f7 = (int) (mo5825a >> 32);
        float f8 = (int) (mo5825a & 4294967295L);
        ((C0019e1) c1568b.f10182f.f152f).m50v(f7, f8);
        try {
            this.f1006s.m3506c(c3508i0, j6, this.f1010w, this.f1011x);
            ((C0019e1) c1568b.f10182f.f152f).m50v(-f7, -f8);
            c3508i0.m5460a();
        } catch (Throwable th) {
            ((C0019e1) c1568b.f10182f.f152f).m50v(-f7, -f8);
            throw th;
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (m565K0()) {
            long m566N0 = m566N0(AbstractC3092b.m4765b(i7, 0, 13));
            return Math.max(C3091a.m4761i(m566N0), interfaceC3214k0.mo4919e0(i7));
        }
        return interfaceC3214k0.mo4919e0(i7);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f1006s + ", sizeToIntrinsics=" + this.f1007t + ", alignment=" + this.f1008u + ", alpha=" + this.f1010w + ", colorFilter=" + this.f1011x + ')';
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
