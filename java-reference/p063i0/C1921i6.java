package p063i0;

import p092m.AbstractC2487d;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i6 */
/* loaded from: classes.dex */
public final class C1921i6 {

    /* renamed from: a */
    public final float f11349a;

    /* renamed from: b */
    public final float f11350b;

    /* renamed from: c */
    public final float f11351c;

    public C1921i6(float f7, float f8, float f9) {
        this.f11349a = f7;
        this.f11350b = f8;
        this.f11351c = f9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1921i6) {
                C1921i6 c1921i6 = (C1921i6) obj;
                if (!C3096f.m4776a(this.f11349a, c1921i6.f11349a) || !C3096f.m4776a(this.f11350b, c1921i6.f11350b) || !C3096f.m4776a(this.f11351c, c1921i6.f11351c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11351c) + AbstractC2487d.m4038b(this.f11350b, Float.hashCode(this.f11349a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f7 = this.f11349a;
        sb.append((Object) C3096f.m4777b(f7));
        sb.append(", right=");
        float f8 = this.f11350b;
        sb.append((Object) C3096f.m4777b(f7 + f8));
        sb.append(", width=");
        sb.append((Object) C3096f.m4777b(f8));
        sb.append(", contentWidth=");
        sb.append((Object) C3096f.m4777b(this.f11351c));
        sb.append(')');
        return sb.toString();
    }
}
