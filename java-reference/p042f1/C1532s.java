package p042f1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.s */
/* loaded from: classes.dex */
public final class C1532s {

    /* renamed from: a */
    public final float f10088a;

    /* renamed from: b */
    public final float f10089b;

    public C1532s(float f7, float f8) {
        this.f10088a = f7;
        this.f10089b = f8;
    }

    /* renamed from: a */
    public final float[] m2462a() {
        float f7 = this.f10088a;
        float f8 = this.f10089b;
        return new float[]{f7 / f8, 1.0f, ((1.0f - f7) - f8) / f8};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1532s)) {
            return false;
        }
        C1532s c1532s = (C1532s) obj;
        if (Float.compare(this.f10088a, c1532s.f10088a) == 0 && Float.compare(this.f10089b, c1532s.f10089b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10089b) + (Float.hashCode(this.f10088a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f10088a);
        sb.append(", y=");
        return AbstractC0094y0.m186m(sb, this.f10089b, ')');
    }
}
