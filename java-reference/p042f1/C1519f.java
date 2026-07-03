package p042f1;

import p035e1.AbstractC0659i0;
import p035e1.C0677s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C1519f extends C1520g {

    /* renamed from: e */
    public final C1530q f10040e;

    /* renamed from: f */
    public final C1530q f10041f;

    /* renamed from: g */
    public final float[] f10042g;

    public C1519f(C1530q c1530q, C1530q c1530q2) {
        super(c1530q2, c1530q, c1530q2, null);
        float[] m2460g;
        this.f10040e = c1530q;
        this.f10041f = c1530q2;
        float[] fArr = C1514a.f10005b.f10006a;
        C1532s c1532s = c1530q.f10067d;
        float[] fArr2 = c1530q.f10072i;
        C1532s c1532s2 = c1530q2.f10067d;
        float[] fArr3 = c1530q2.f10073j;
        if (AbstractC1523j.m2457d(c1532s, c1532s2)) {
            m2460g = AbstractC1523j.m2460g(fArr3, fArr2);
        } else {
            float[] m2462a = c1532s.m2462a();
            float[] m2462a2 = c1532s2.m2462a();
            C1532s c1532s3 = AbstractC1523j.f10049b;
            m2460g = AbstractC1523j.m2460g(AbstractC1523j.m2457d(c1532s2, c1532s3) ? fArr3 : AbstractC1523j.m2459f(AbstractC1523j.m2460g(AbstractC1523j.m2456c(fArr, m2462a2, new float[]{0.964212f, 1.0f, 0.825188f}), c1530q2.f10072i)), AbstractC1523j.m2457d(c1532s, c1532s3) ? fArr2 : AbstractC1523j.m2460g(AbstractC1523j.m2456c(fArr, m2462a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f10042g = m2460g;
    }

    @Override // p042f1.C1520g
    /* renamed from: a */
    public final long mo2453a(long j6) {
        float m1459h = C0677s.m1459h(j6);
        float m1458g = C0677s.m1458g(j6);
        float m1456e = C0677s.m1456e(j6);
        float m1455d = C0677s.m1455d(j6);
        C1526m c1526m = this.f10040e.f10079p;
        float mo1297c = (float) c1526m.mo1297c(m1459h);
        float mo1297c2 = (float) c1526m.mo1297c(m1458g);
        float mo1297c3 = (float) c1526m.mo1297c(m1456e);
        float[] fArr = this.f10042g;
        float f7 = (fArr[6] * mo1297c3) + (fArr[3] * mo1297c2) + (fArr[0] * mo1297c);
        float f8 = (fArr[7] * mo1297c3) + (fArr[4] * mo1297c2) + (fArr[1] * mo1297c);
        float f9 = (fArr[8] * mo1297c3) + (fArr[5] * mo1297c2) + (fArr[2] * mo1297c);
        C1530q c1530q = this.f10041f;
        float mo1297c4 = (float) c1530q.f10076m.mo1297c(f7);
        C1526m c1526m2 = c1530q.f10076m;
        return AbstractC0659i0.m1402b(mo1297c4, (float) c1526m2.mo1297c(f8), (float) c1526m2.mo1297c(f9), m1455d, c1530q);
    }
}
