package p149t4;

import p001a0.C0031h1;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.e */
/* loaded from: classes.dex */
public abstract class AbstractC3268e extends AbstractC3267d {
    /* renamed from: h */
    public abstract void mo4977h(StringBuilder sb, int i7);

    /* renamed from: i */
    public abstract int mo4978i(int i7);

    /* renamed from: j */
    public final void m4981j(StringBuilder sb, int i7, int i8) {
        int m76s = C0031h1.m76s(i7, i8, (C2068a) ((C0031h1) this.f16116b).f152f);
        mo4977h(sb, m76s);
        int mo4978i = mo4978i(m76s);
        int i9 = 100000;
        for (int i10 = 0; i10 < 5; i10++) {
            if (mo4978i / i9 == 0) {
                sb.append('0');
            }
            i9 /= 10;
        }
        sb.append(mo4978i);
    }
}
