package p034e0;

import p042f1.C1517d;
import p042f1.InterfaceC1522i;
import p099m6.AbstractC2614o;
import p099m6.InterfaceC2613n;
import p100n.InterfaceC2697y;
import p128q6.C3006i;
import p144t.AbstractC3122c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0625q implements InterfaceC1522i, InterfaceC2697y, InterfaceC2613n {

    /* renamed from: a */
    public final /* synthetic */ int f2070a;

    public /* synthetic */ C0625q(int i7) {
        this.f2070a = i7;
    }

    @Override // p099m6.InterfaceC2613n
    /* renamed from: b */
    public AbstractC2614o mo1296b(C3006i c3006i) {
        return AbstractC2614o.f14134a;
    }

    @Override // p042f1.InterfaceC1522i
    /* renamed from: c */
    public double mo1297c(double d7) {
        double d8;
        double d9;
        double d10;
        double d11;
        switch (this.f2070a) {
            case 4:
                if (d7 < 0.0d) {
                    d8 = -d7;
                } else {
                    d8 = d7;
                }
                if (d8 >= 0.0031308049535603718d) {
                    d9 = (Math.pow(d8, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d9 = d8 / 0.07739938080495357d;
                }
                return Math.copySign(d9, d7);
            case AbstractC3122c.f15761f /* 5 */:
                if (d7 < 0.0d) {
                    d10 = -d7;
                } else {
                    d10 = d7;
                }
                if (d10 >= 0.04045d) {
                    d11 = Math.pow((0.9478672985781991d * d10) + 0.05213270142180095d, 2.4d);
                } else {
                    d11 = d10 * 0.07739938080495357d;
                }
                return Math.copySign(d11, d7);
            case AbstractC3122c.f15759d /* 6 */:
                float[] fArr = C1517d.f10015a;
                return C1517d.m2450b(C1517d.f10017c, d7);
            case 7:
                float[] fArr2 = C1517d.f10015a;
                return C1517d.m2449a(C1517d.f10017c, d7);
            case 8:
                float[] fArr3 = C1517d.f10015a;
                return C1517d.m2452d(C1517d.f10018d, d7);
            case AbstractC3122c.f15758c /* 9 */:
                float[] fArr4 = C1517d.f10015a;
                return C1517d.m2451c(C1517d.f10018d, d7);
            default:
                return d7;
        }
    }

    @Override // p100n.InterfaceC2697y
    /* renamed from: a */
    public float mo1295a(float f7) {
        return f7;
    }
}
