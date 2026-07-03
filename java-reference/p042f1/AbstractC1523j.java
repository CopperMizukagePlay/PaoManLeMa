package p042f1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.j */
/* loaded from: classes.dex */
public abstract class AbstractC1523j {

    /* renamed from: a */
    public static final C1532s f10048a = new C1532s(0.31006f, 0.31616f);

    /* renamed from: b */
    public static final C1532s f10049b = new C1532s(0.34567f, 0.3585f);

    /* renamed from: c */
    public static final C1532s f10050c = new C1532s(0.32168f, 0.33767f);

    /* renamed from: d */
    public static final C1532s f10051d = new C1532s(0.31271f, 0.32902f);

    /* renamed from: e */
    public static final float[] f10052e = {0.964212f, 1.0f, 0.825188f};

    /* renamed from: a */
    public static AbstractC1516c m2454a(AbstractC1516c abstractC1516c) {
        if (AbstractC1515b.m2441a(abstractC1516c.f10013b, AbstractC1515b.f10007a)) {
            C1530q c1530q = (C1530q) abstractC1516c;
            C1532s c1532s = c1530q.f10067d;
            C1532s c1532s2 = f10049b;
            if (!m2457d(c1532s, c1532s2)) {
                return new C1530q(c1530q.f10012a, c1530q.f10071h, c1532s2, m2460g(m2456c(C1514a.f10005b.f10006a, c1532s.m2462a(), c1532s2.m2462a()), c1530q.f10072i), c1530q.f10074k, c1530q.f10077n, c1530q.f10068e, c1530q.f10069f, c1530q.f10070g, -1);
            }
        }
        return abstractC1516c;
    }

    /* renamed from: b */
    public static float m2455b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = (((((f9 * f12) + ((f8 * f11) + (f7 * f10))) - (f10 * f11)) - (f8 * f9)) - (f7 * f12)) * 0.5f;
        if (f13 < 0.0f) {
            return -f13;
        }
        return f13;
    }

    /* renamed from: c */
    public static final float[] m2456c(float[] fArr, float[] fArr2, float[] fArr3) {
        m2461h(fArr, fArr2);
        m2461h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] m2459f = m2459f(fArr);
        float f7 = fArr4[0];
        float f8 = fArr[0] * f7;
        float f9 = fArr4[1];
        float f10 = fArr[1] * f9;
        float f11 = fArr4[2];
        return m2460g(m2459f, new float[]{f8, f10, fArr[2] * f11, fArr[3] * f7, fArr[4] * f9, fArr[5] * f11, f7 * fArr[6], f9 * fArr[7], f11 * fArr[8]});
    }

    /* renamed from: d */
    public static final boolean m2457d(C1532s c1532s, C1532s c1532s2) {
        if (c1532s == c1532s2) {
            return true;
        }
        if (Math.abs(c1532s.f10088a - c1532s2.f10088a) < 0.001f && Math.abs(c1532s.f10089b - c1532s2.f10089b) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final C1520g m2458e(AbstractC1516c abstractC1516c, AbstractC1516c abstractC1516c2) {
        if (abstractC1516c == abstractC1516c2) {
            return new C1520g(abstractC1516c, abstractC1516c, 1);
        }
        long j6 = abstractC1516c.f10013b;
        long j7 = AbstractC1515b.f10007a;
        if (AbstractC1515b.m2441a(j6, j7) && AbstractC1515b.m2441a(abstractC1516c2.f10013b, j7)) {
            return new C1519f((C1530q) abstractC1516c, (C1530q) abstractC1516c2);
        }
        return new C1520g(abstractC1516c, abstractC1516c2, 0);
    }

    /* renamed from: f */
    public static final float[] m2459f(float[] fArr) {
        float f7 = fArr[0];
        float f8 = fArr[3];
        float f9 = fArr[6];
        float f10 = fArr[1];
        float f11 = fArr[4];
        float f12 = fArr[7];
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[8];
        float f16 = (f11 * f15) - (f12 * f14);
        float f17 = (f12 * f13) - (f10 * f15);
        float f18 = (f10 * f14) - (f11 * f13);
        float f19 = (f9 * f18) + (f8 * f17) + (f7 * f16);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f16 / f19;
        fArr2[1] = f17 / f19;
        fArr2[2] = f18 / f19;
        fArr2[3] = ((f9 * f14) - (f8 * f15)) / f19;
        fArr2[4] = ((f15 * f7) - (f9 * f13)) / f19;
        fArr2[5] = ((f13 * f8) - (f14 * f7)) / f19;
        fArr2[6] = ((f8 * f12) - (f9 * f11)) / f19;
        fArr2[7] = ((f9 * f10) - (f12 * f7)) / f19;
        fArr2[8] = ((f7 * f11) - (f8 * f10)) / f19;
        return fArr2;
    }

    /* renamed from: g */
    public static final float[] m2460g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f7 = fArr[0] * fArr2[0];
        float f8 = fArr[3];
        float f9 = fArr2[1];
        float f10 = fArr[6];
        float f11 = fArr2[2];
        fArr3[0] = (f10 * f11) + (f8 * f9) + f7;
        float f12 = fArr[1];
        float f13 = fArr2[0];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = f15 * f11;
        fArr3[1] = f16 + (f9 * f14) + (f12 * f13);
        float f17 = fArr[2] * f13;
        float f18 = fArr[5];
        float f19 = (fArr2[1] * f18) + f17;
        float f20 = fArr[8];
        fArr3[2] = (f11 * f20) + f19;
        float f21 = fArr[0];
        float f22 = fArr2[3] * f21;
        float f23 = fArr2[4];
        float f24 = (f8 * f23) + f22;
        float f25 = fArr2[5];
        fArr3[3] = (f10 * f25) + f24;
        float f26 = fArr[1];
        float f27 = fArr2[3];
        float f28 = f14 * f23;
        fArr3[4] = (f15 * f25) + f28 + (f26 * f27);
        float f29 = fArr[2];
        float f30 = f25 * f20;
        fArr3[5] = f30 + (f18 * fArr2[4]) + (f27 * f29);
        float f31 = f21 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = (f32 * f33) + f31;
        float f35 = fArr2[8];
        fArr3[6] = (f10 * f35) + f34;
        float f36 = fArr2[6];
        float f37 = f15 * f35;
        fArr3[7] = f37 + (fArr[4] * f33) + (f26 * f36);
        float f38 = f20 * f35;
        fArr3[8] = f38 + (fArr[5] * fArr2[7]) + (f29 * f36);
        return fArr3;
    }

    /* renamed from: h */
    public static final float[] m2461h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f7 = fArr2[0];
        float f8 = fArr2[1];
        float f9 = fArr2[2];
        fArr2[0] = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        fArr2[1] = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        fArr2[2] = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        return fArr2;
    }
}
