package p122q;

import p032d6.AbstractC0590z;
import p032d6.C0548l;
import p039e5.C0827e5;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.i */
/* loaded from: classes.dex */
public final class C2912i {

    /* renamed from: a */
    public final C0827e5 f15174a;

    /* renamed from: b */
    public final C0548l f15175b;

    public C2912i(C0827e5 c0827e5, C0548l c0548l) {
        this.f15174a = c0827e5;
        this.f15175b = c0548l;
    }

    public final String toString() {
        C0548l c0548l = this.f15175b;
        if (c0548l.f1897i.mo853h(AbstractC0590z.f1942f) == null) {
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            AbstractC2710c.m4333e(16);
            String num = Integer.toString(hashCode, 16);
            AbstractC3367j.m5099d(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            sb.append("(currentBounds()=");
            sb.append(this.f15174a.mo52a());
            sb.append(", continuation=");
            sb.append(c0548l);
            sb.append(')');
            return sb.toString();
        }
        throw new ClassCastException();
    }
}
