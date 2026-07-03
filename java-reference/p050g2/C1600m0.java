package p050g2;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.m0 */
/* loaded from: classes.dex */
public final class C1600m0 {

    /* renamed from: a */
    public final C1588g0 f10294a;

    /* renamed from: b */
    public final C1588g0 f10295b;

    /* renamed from: c */
    public final C1588g0 f10296c;

    /* renamed from: d */
    public final C1588g0 f10297d;

    public C1600m0(C1588g0 c1588g0, C1588g0 c1588g02, C1588g0 c1588g03, C1588g0 c1588g04) {
        this.f10294a = c1588g0;
        this.f10295b = c1588g02;
        this.f10296c = c1588g03;
        this.f10297d = c1588g04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1600m0)) {
            return false;
        }
        C1600m0 c1600m0 = (C1600m0) obj;
        if (AbstractC3367j.m5096a(this.f10294a, c1600m0.f10294a) && AbstractC3367j.m5096a(this.f10295b, c1600m0.f10295b) && AbstractC3367j.m5096a(this.f10296c, c1600m0.f10296c) && AbstractC3367j.m5096a(this.f10297d, c1600m0.f10297d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        C1588g0 c1588g0 = this.f10294a;
        if (c1588g0 != null) {
            i7 = c1588g0.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        C1588g0 c1588g02 = this.f10295b;
        if (c1588g02 != null) {
            i8 = c1588g02.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        C1588g0 c1588g03 = this.f10296c;
        if (c1588g03 != null) {
            i9 = c1588g03.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i12 + i9) * 31;
        C1588g0 c1588g04 = this.f10297d;
        if (c1588g04 != null) {
            i10 = c1588g04.hashCode();
        }
        return i13 + i10;
    }
}
