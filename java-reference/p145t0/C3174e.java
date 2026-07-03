package p145t0;

import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.e */
/* loaded from: classes.dex */
public final class C3174e {

    /* renamed from: a */
    public int f15887a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f15887a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC2710c.m4333e(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC3367j.m5099d(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }
}
