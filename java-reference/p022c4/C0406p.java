package p022c4;

import p001a0.AbstractC0094y0;
import p065i2.AbstractC2064e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c4.p */
/* loaded from: classes.dex */
public class C0406p {

    /* renamed from: a */
    public final float f1390a;

    /* renamed from: b */
    public final float f1391b;

    public C0406p(float f7, float f8) {
        this.f1390a = f7;
        this.f1391b = f8;
    }

    /* renamed from: a */
    public static float m881a(C0406p c0406p, C0406p c0406p2) {
        return AbstractC2064e.m3245s(c0406p.f1390a, c0406p.f1391b, c0406p2.f1390a, c0406p2.f1391b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0406p) {
            C0406p c0406p = (C0406p) obj;
            if (this.f1390a == c0406p.f1390a && this.f1391b == c0406p.f1391b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1391b) + (Float.floatToIntBits(this.f1390a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1390a);
        sb.append(',');
        return AbstractC0094y0.m186m(sb, this.f1391b, ')');
    }
}
