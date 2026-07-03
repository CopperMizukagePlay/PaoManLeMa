package p042f1;

import p035e1.C0677s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.g */
/* loaded from: classes.dex */
public class C1520g {

    /* renamed from: a */
    public final AbstractC1516c f10043a;

    /* renamed from: b */
    public final AbstractC1516c f10044b;

    /* renamed from: c */
    public final AbstractC1516c f10045c;

    /* renamed from: d */
    public final float[] f10046d;

    public C1520g(AbstractC1516c abstractC1516c, AbstractC1516c abstractC1516c2, AbstractC1516c abstractC1516c3, float[] fArr) {
        this.f10043a = abstractC1516c;
        this.f10044b = abstractC1516c2;
        this.f10045c = abstractC1516c3;
        this.f10046d = fArr;
    }

    /* renamed from: a */
    public long mo2453a(long j6) {
        float m1459h = C0677s.m1459h(j6);
        float m1458g = C0677s.m1458g(j6);
        float m1456e = C0677s.m1456e(j6);
        float m1455d = C0677s.m1455d(j6);
        AbstractC1516c abstractC1516c = this.f10044b;
        long mo2446d = abstractC1516c.mo2446d(m1459h, m1458g, m1456e);
        float intBitsToFloat = Float.intBitsToFloat((int) (mo2446d >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo2446d & 4294967295L));
        float mo2447e = abstractC1516c.mo2447e(m1459h, m1458g, m1456e);
        float[] fArr = this.f10046d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            mo2447e *= fArr[2];
        }
        float f7 = intBitsToFloat;
        float f8 = intBitsToFloat2;
        return this.f10045c.mo2448f(f7, f8, mo2447e, m1455d, this.f10043a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1520g(AbstractC1516c abstractC1516c, AbstractC1516c abstractC1516c2, int i7) {
        this(abstractC1516c2, r0, r1, r3);
        float[] fArr;
        long j6 = abstractC1516c.f10013b;
        long j7 = AbstractC1515b.f10007a;
        AbstractC1516c m2454a = AbstractC1515b.m2441a(j6, j7) ? AbstractC1523j.m2454a(abstractC1516c) : abstractC1516c;
        AbstractC1516c m2454a2 = AbstractC1515b.m2441a(abstractC1516c2.f10013b, j7) ? AbstractC1523j.m2454a(abstractC1516c2) : abstractC1516c2;
        if (i7 == 3) {
            boolean m2441a = AbstractC1515b.m2441a(abstractC1516c.f10013b, j7);
            boolean m2441a2 = AbstractC1515b.m2441a(abstractC1516c2.f10013b, j7);
            if ((!m2441a || !m2441a2) && (m2441a || m2441a2)) {
                C1532s c1532s = ((C1530q) (m2441a ? abstractC1516c : abstractC1516c2)).f10067d;
                float[] fArr2 = AbstractC1523j.f10052e;
                float[] m2462a = m2441a ? c1532s.m2462a() : fArr2;
                fArr2 = m2441a2 ? c1532s.m2462a() : fArr2;
                fArr = new float[]{m2462a[0] / fArr2[0], m2462a[1] / fArr2[1], m2462a[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
