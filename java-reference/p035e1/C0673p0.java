package p035e1;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;
import p001a0.AbstractC0094y0;
import p027d1.C0464b;
import p060h5.AbstractC1793a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.p0 */
/* loaded from: classes.dex */
public final class C0673p0 extends AbstractC0663k0 {

    /* renamed from: c */
    public final List f2199c;

    public C0673p0(List list) {
        this.f2199c = list;
    }

    @Override // p035e1.AbstractC0663k0
    /* renamed from: b */
    public final Shader mo1348b(long j6) {
        long m2990r = AbstractC1793a0.m2990r(j6);
        List list = this.f2199c;
        AbstractC0659i0.m1399F(list);
        int m1411k = AbstractC0659i0.m1411k(list);
        return new SweepGradient(Float.intBitsToFloat((int) (m2990r >> 32)), Float.intBitsToFloat((int) (m2990r & 4294967295L)), AbstractC0659i0.m1417q(m1411k, list), AbstractC0659i0.m1418r(m1411k, list));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0673p0) {
                C0673p0 c0673p0 = (C0673p0) obj;
                if (!C0464b.m1006b(9205357640488583168L, 9205357640488583168L) || !this.f2199c.equals(c0673p0.f2199c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC0094y0.m176c(this.f2199c, Long.hashCode(9205357640488583168L) * 31, 31);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.f2199c + ", stops=null)";
    }
}
