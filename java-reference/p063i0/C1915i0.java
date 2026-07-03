package p063i0;

import p092m.AbstractC2487d;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i0 */
/* loaded from: classes.dex */
public final class C1915i0 {

    /* renamed from: a */
    public final float f11308a;

    /* renamed from: b */
    public final float f11309b;

    /* renamed from: c */
    public final float f11310c;

    /* renamed from: d */
    public final float f11311d;

    /* renamed from: e */
    public final float f11312e;

    public C1915i0(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f11308a = f7;
        this.f11309b = f8;
        this.f11310c = f9;
        this.f11311d = f10;
        this.f11312e = f12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1915i0)) {
                C1915i0 c1915i0 = (C1915i0) obj;
                if (C3096f.m4776a(this.f11308a, c1915i0.f11308a) && C3096f.m4776a(this.f11309b, c1915i0.f11309b) && C3096f.m4776a(this.f11310c, c1915i0.f11310c) && C3096f.m4776a(this.f11311d, c1915i0.f11311d) && C3096f.m4776a(this.f11312e, c1915i0.f11312e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11312e) + AbstractC2487d.m4038b(this.f11311d, AbstractC2487d.m4038b(this.f11310c, AbstractC2487d.m4038b(this.f11309b, Float.hashCode(this.f11308a) * 31, 31), 31), 31);
    }
}
