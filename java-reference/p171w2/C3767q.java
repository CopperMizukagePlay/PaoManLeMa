package p171w2;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.q */
/* loaded from: classes.dex */
public final class C3767q {

    /* renamed from: a */
    public final boolean f17866a;

    /* renamed from: b */
    public final boolean f17867b;

    /* renamed from: c */
    public final EnumC3776z f17868c;

    /* renamed from: d */
    public final boolean f17869d;

    /* renamed from: e */
    public final boolean f17870e;

    /* renamed from: f */
    public final String f17871f;

    public C3767q(boolean z7, boolean z8, boolean z9, boolean z10, int i7) {
        this.f17866a = z7;
        this.f17867b = z8;
        this.f17868c = EnumC3776z.f17910e;
        this.f17869d = z9;
        this.f17870e = z10;
        this.f17871f = "";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3767q) {
                C3767q c3767q = (C3767q) obj;
                if (this.f17866a != c3767q.f17866a || this.f17867b != c3767q.f17867b || this.f17868c != c3767q.f17868c || this.f17869d != c3767q.f17869d || this.f17870e != c3767q.f17870e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17870e) + AbstractC2487d.m4040d((this.f17868c.hashCode() + AbstractC2487d.m4040d(Boolean.hashCode(this.f17866a) * 31, 31, this.f17867b)) * 31, 31, this.f17869d);
    }

    public /* synthetic */ C3767q(int i7) {
        this((i7 & 1) != 0, (i7 & 2) != 0, (i7 & 4) != 0);
    }

    public C3767q(boolean z7, boolean z8, boolean z9) {
        this(z7, z8, z9, true, 32);
    }
}
