package p056h0;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.f */
/* loaded from: classes.dex */
public final class C1732f {

    /* renamed from: a */
    public final float f10591a;

    /* renamed from: b */
    public final float f10592b;

    /* renamed from: c */
    public final float f10593c;

    /* renamed from: d */
    public final float f10594d;

    public C1732f(float f7, float f8, float f9, float f10) {
        this.f10591a = f7;
        this.f10592b = f8;
        this.f10593c = f9;
        this.f10594d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1732f)) {
            return false;
        }
        C1732f c1732f = (C1732f) obj;
        if (this.f10591a == c1732f.f10591a && this.f10592b == c1732f.f10592b && this.f10593c == c1732f.f10593c && this.f10594d == c1732f.f10594d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10594d) + AbstractC2487d.m4038b(this.f10593c, AbstractC2487d.m4038b(this.f10592b, Float.hashCode(this.f10591a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f10591a);
        sb.append(", focusedAlpha=");
        sb.append(this.f10592b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f10593c);
        sb.append(", pressedAlpha=");
        return AbstractC0094y0.m186m(sb, this.f10594d, ')');
    }
}
