package p063i0;

import p092m.AbstractC2487d;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.b2 */
/* loaded from: classes.dex */
public final class C1854b2 {

    /* renamed from: a */
    public final float f10944a;

    /* renamed from: b */
    public final float f10945b;

    /* renamed from: c */
    public final float f10946c;

    /* renamed from: d */
    public final float f10947d;

    public C1854b2(float f7, float f8, float f9, float f10) {
        this.f10944a = f7;
        this.f10945b = f8;
        this.f10946c = f9;
        this.f10947d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1854b2)) {
            C1854b2 c1854b2 = (C1854b2) obj;
            if (C3096f.m4776a(this.f10944a, c1854b2.f10944a) && C3096f.m4776a(this.f10945b, c1854b2.f10945b) && C3096f.m4776a(this.f10946c, c1854b2.f10946c)) {
                return C3096f.m4776a(this.f10947d, c1854b2.f10947d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10947d) + AbstractC2487d.m4038b(this.f10946c, AbstractC2487d.m4038b(this.f10945b, Float.hashCode(this.f10944a) * 31, 31), 31);
    }
}
