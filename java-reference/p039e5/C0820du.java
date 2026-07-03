package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.du */
/* loaded from: classes.dex */
public final class C0820du {

    /* renamed from: a */
    public final int f3577a;

    /* renamed from: b */
    public final String f3578b;

    /* renamed from: c */
    public final String f3579c;

    /* renamed from: d */
    public final int f3580d;

    public C0820du(int i7, int i8, String str, String str2) {
        AbstractC3367j.m5100e(str, "label");
        AbstractC3367j.m5100e(str2, "shortLabel");
        this.f3577a = i7;
        this.f3578b = str;
        this.f3579c = str2;
        this.f3580d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0820du)) {
            return false;
        }
        C0820du c0820du = (C0820du) obj;
        if (this.f3577a == c0820du.f3577a && AbstractC3367j.m5096a(this.f3578b, c0820du.f3578b) && AbstractC3367j.m5096a(this.f3579c, c0820du.f3579c) && this.f3580d == c0820du.f3580d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3580d) + AbstractC0094y0.m175b(AbstractC0094y0.m175b(Integer.hashCode(this.f3577a) * 31, 31, this.f3578b), 31, this.f3579c);
    }

    public final String toString() {
        return "UsbGeneration(mbps=" + this.f3577a + ", label=" + this.f3578b + ", shortLabel=" + this.f3579c + ", bcdUsb=" + this.f3580d + ")";
    }
}
