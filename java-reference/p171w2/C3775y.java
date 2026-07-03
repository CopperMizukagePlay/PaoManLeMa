package p171w2;

import p085l0.C2336a0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.y */
/* loaded from: classes.dex */
public final class C3775y {

    /* renamed from: a */
    public final int f17905a;

    /* renamed from: b */
    public final boolean f17906b;

    /* renamed from: c */
    public final boolean f17907c;

    /* renamed from: d */
    public final boolean f17908d;

    /* renamed from: e */
    public final boolean f17909e;

    public C3775y(int i7, boolean z7) {
        this.f17905a = i7;
        this.f17906b = z7;
        this.f17907c = true;
        this.f17908d = true;
        this.f17909e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3775y) {
            C3775y c3775y = (C3775y) obj;
            if (this.f17905a == c3775y.f17905a && this.f17906b == c3775y.f17906b && this.f17907c == c3775y.f17907c && this.f17908d == c3775y.f17908d && this.f17909e == c3775y.f17909e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC2487d.m4040d(this.f17905a * 31, 31, this.f17906b), 31, this.f17907c), 31, this.f17908d), 31, this.f17909e);
    }

    public C3775y(int i7) {
        this((i7 & 1) == 0, EnumC3776z.f17910e, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3775y(boolean z7, EnumC3776z enumC3776z, boolean z8) {
        this(z8 ? r2 : r2 | 512, enumC3776z == EnumC3776z.f17910e);
        C2336a0 c2336a0 = AbstractC3760j.f17852a;
        int i7 = !z7 ? 262152 : 262144;
        i7 = enumC3776z == EnumC3776z.f17911f ? i7 | 8192 : i7;
    }
}
