package p147t2;

import java.util.Arrays;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t2.d */
/* loaded from: classes.dex */
public final class C3251d implements InterfaceC3248a {

    /* renamed from: a */
    public final float[] f16074a;

    /* renamed from: b */
    public final float[] f16075b;

    public C3251d(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.f16074a = fArr;
            this.f16075b = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }

    @Override // p147t2.InterfaceC3248a
    /* renamed from: a */
    public final float mo4792a(float f7) {
        return C3250c.m4964b(f7, this.f16075b, this.f16074a);
    }

    @Override // p147t2.InterfaceC3248a
    /* renamed from: b */
    public final float mo4793b(float f7) {
        return C3250c.m4964b(f7, this.f16074a, this.f16075b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3251d)) {
            return false;
        }
        C3251d c3251d = (C3251d) obj;
        if (Arrays.equals(this.f16074a, c3251d.f16074a) && Arrays.equals(this.f16075b, c3251d.f16075b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16075b) + (Arrays.hashCode(this.f16074a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f16074a);
        AbstractC3367j.m5099d(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f16075b);
        AbstractC3367j.m5099d(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
