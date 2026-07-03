package p107o;

import p035e1.C0644b;
import p035e1.C0654g;
import p035e1.C0660j;
import p049g1.C1568b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.k */
/* loaded from: classes.dex */
public final class C2752k {

    /* renamed from: a */
    public C0654g f14693a = null;

    /* renamed from: b */
    public C0644b f14694b = null;

    /* renamed from: c */
    public C1568b f14695c = null;

    /* renamed from: d */
    public C0660j f14696d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2752k) {
                C2752k c2752k = (C2752k) obj;
                if (!AbstractC3367j.m5096a(this.f14693a, c2752k.f14693a) || !AbstractC3367j.m5096a(this.f14694b, c2752k.f14694b) || !AbstractC3367j.m5096a(this.f14695c, c2752k.f14695c) || !AbstractC3367j.m5096a(this.f14696d, c2752k.f14696d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        C0654g c0654g = this.f14693a;
        int i7 = 0;
        if (c0654g == null) {
            hashCode = 0;
        } else {
            hashCode = c0654g.hashCode();
        }
        int i8 = hashCode * 31;
        C0644b c0644b = this.f14694b;
        if (c0644b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0644b.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        C1568b c1568b = this.f14695c;
        if (c1568b == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c1568b.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        C0660j c0660j = this.f14696d;
        if (c0660j != null) {
            i7 = c0660j.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f14693a + ", canvas=" + this.f14694b + ", canvasDrawScope=" + this.f14695c + ", borderPath=" + this.f14696d + ')';
    }
}
