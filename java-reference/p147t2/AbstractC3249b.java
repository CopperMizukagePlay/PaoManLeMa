package p147t2;

import p077k.C2216s0;
import p084l.AbstractC2334a;
import p140s2.AbstractC3099i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t2.b */
/* loaded from: classes.dex */
public abstract class AbstractC3249b {

    /* renamed from: a */
    public static final float[] f16070a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b */
    public static volatile C2216s0 f16071b = new C2216s0();

    /* renamed from: c */
    public static final Object[] f16072c;

    static {
        Object[] objArr = new Object[0];
        f16072c = objArr;
        synchronized (objArr) {
            f16071b.m3635c((int) 115.0f, new C3251d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f16071b.m3635c((int) 130.0f, new C3251d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f16071b.m3635c((int) 150.0f, new C3251d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f16071b.m3635c((int) 180.0f, new C3251d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f16071b.m3635c((int) 200.0f, new C3251d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f16071b.f12739e[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC3099i.m4782b("You should only apply non-linear scaling to font scales > 1");
    }

    /* renamed from: a */
    public static InterfaceC3248a m4961a(float f7) {
        float f8;
        InterfaceC3248a interfaceC3248a;
        float f9;
        float[] fArr = f16070a;
        if (f7 >= 1.03f) {
            int i7 = (int) (f7 * 100.0f);
            InterfaceC3248a interfaceC3248a2 = (InterfaceC3248a) f16071b.m3634b(i7);
            if (interfaceC3248a2 != null) {
                return interfaceC3248a2;
            }
            C2216s0 c2216s0 = f16071b;
            int m3710a = AbstractC2334a.m3710a(c2216s0.f12741g, i7, c2216s0.f12739e);
            if (m3710a >= 0) {
                return (InterfaceC3248a) f16071b.m3636d(m3710a);
            }
            int i8 = -(m3710a + 1);
            int i9 = i8 - 1;
            if (i8 >= f16071b.f12741g) {
                C3251d c3251d = new C3251d(new float[]{1.0f}, new float[]{f7});
                m4962b(f7, c3251d);
                return c3251d;
            }
            if (i9 < 0) {
                interfaceC3248a = new C3251d(fArr, fArr);
                f8 = 1.0f;
            } else {
                f8 = f16071b.f12739e[i9] / 100.0f;
                interfaceC3248a = (InterfaceC3248a) f16071b.m3636d(i9);
            }
            float f10 = f16071b.f12739e[i8] / 100.0f;
            if (f8 == f10) {
                f9 = 0.0f;
            } else {
                f9 = (f7 - f8) / (f10 - f8);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f9)) * 1.0f) + 0.0f;
            InterfaceC3248a interfaceC3248a3 = (InterfaceC3248a) f16071b.m3636d(i8);
            float[] fArr2 = new float[9];
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr[i10];
                float mo4793b = interfaceC3248a.mo4793b(f11);
                fArr2[i10] = ((interfaceC3248a3.mo4793b(f11) - mo4793b) * max) + mo4793b;
            }
            C3251d c3251d2 = new C3251d(fArr, fArr2);
            m4962b(f7, c3251d2);
            return c3251d2;
        }
        return null;
    }

    /* renamed from: b */
    public static void m4962b(float f7, C3251d c3251d) {
        synchronized (f16072c) {
            C2216s0 clone = f16071b.clone();
            clone.m3635c((int) (f7 * 100.0f), c3251d);
            f16071b = clone;
        }
    }
}
