package p162v1;

import java.util.Arrays;
import p060h5.AbstractC1804l;
import p140s2.InterfaceC3093c;
import p146t1.C3222n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.l0 */
/* loaded from: classes.dex */
public final class C3517l0 implements InterfaceC3093c {

    /* renamed from: e */
    public boolean f16957e;

    /* renamed from: f */
    public long f16958f = 9223372034707292159L;

    /* renamed from: g */
    public long f16959g = 0;

    /* renamed from: h */
    public final /* synthetic */ AbstractC3526o0 f16960h;

    public C3517l0(AbstractC3526o0 abstractC3526o0) {
        this.f16960h = abstractC3526o0;
    }

    /* renamed from: a */
    public final void m5475a(C3222n c3222n, float f7) {
        AbstractC3526o0 abstractC3526o0 = this.f16960h;
        C3548v1 c3548v1 = abstractC3526o0.f16980q;
        if (c3548v1 == null) {
            c3548v1 = new C3548v1();
            abstractC3526o0.f16980q = c3548v1;
        }
        int m3028U = AbstractC1804l.m3028U(c3548v1.f17061b, c3222n);
        if (m3028U < 0) {
            int i7 = c3548v1.f17060a;
            C3222n[] c3222nArr = c3548v1.f17061b;
            if (i7 == c3222nArr.length) {
                int i8 = i7 * 2;
                Object[] copyOf = Arrays.copyOf(c3222nArr, i8);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                c3548v1.f17061b = (C3222n[]) copyOf;
                float[] copyOf2 = Arrays.copyOf(c3548v1.f17062c, i8);
                AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                c3548v1.f17062c = copyOf2;
                byte[] copyOf3 = Arrays.copyOf(c3548v1.f17063d, i8);
                AbstractC3367j.m5099d(copyOf3, "copyOf(...)");
                c3548v1.f17063d = copyOf3;
            }
            c3548v1.f17061b[i7] = c3222n;
            c3548v1.f17063d[i7] = 3;
            c3548v1.f17062c[i7] = f7;
            c3548v1.f17060a++;
            return;
        }
        float[] fArr = c3548v1.f17062c;
        if (fArr[m3028U] == f7) {
            byte[] bArr = c3548v1.f17063d;
            if (bArr[m3028U] == 2) {
                bArr[m3028U] = 0;
                return;
            }
            return;
        }
        fArr[m3028U] = f7;
        c3548v1.f17063d[m3028U] = 1;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16960h.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16960h.mo560l();
    }
}
