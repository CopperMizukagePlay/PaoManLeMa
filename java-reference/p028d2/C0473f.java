package p028d2;

import p158u5.AbstractC3367j;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.f */
/* loaded from: classes.dex */
public final class C0473f {

    /* renamed from: c */
    public static final C0473f f1649c = new C0473f(0.0f, new C3876a(0.0f, 0.0f));

    /* renamed from: a */
    public final float f1650a;

    /* renamed from: b */
    public final C3876a f1651b;

    public C0473f(float f7, C3876a c3876a) {
        this.f1650a = f7;
        this.f1651b = c3876a;
        if (!Float.isNaN(f7)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    /* renamed from: a */
    public final C3876a m1031a() {
        return this.f1651b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0473f) {
            C0473f c0473f = (C0473f) obj;
            if (this.f1650a == c0473f.f1650a && AbstractC3367j.m5096a(this.f1651b, c0473f.f1651b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1651b.hashCode() + (Float.hashCode(this.f1650a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f1650a + ", range=" + this.f1651b + ", steps=0)";
    }
}
