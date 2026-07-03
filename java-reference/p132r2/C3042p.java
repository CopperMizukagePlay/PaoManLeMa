package p132r2;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.p */
/* loaded from: classes.dex */
public final class C3042p {

    /* renamed from: c */
    public static final C3042p f15610c = new C3042p(1.0f, 0.0f);

    /* renamed from: a */
    public final float f15611a;

    /* renamed from: b */
    public final float f15612b;

    public C3042p(float f7, float f8) {
        this.f15611a = f7;
        this.f15612b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3042p)) {
            return false;
        }
        C3042p c3042p = (C3042p) obj;
        if (this.f15611a == c3042p.f15611a && this.f15612b == c3042p.f15612b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15612b) + (Float.hashCode(this.f15611a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f15611a);
        sb.append(", skewX=");
        return AbstractC0094y0.m186m(sb, this.f15612b, ')');
    }
}
