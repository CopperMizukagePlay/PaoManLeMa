package p006a7;

import p060h5.AbstractC1804l;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.v */
/* loaded from: classes.dex */
public final class C0139v {

    /* renamed from: a */
    public final byte[] f555a;

    /* renamed from: b */
    public int f556b;

    /* renamed from: c */
    public int f557c;

    /* renamed from: d */
    public boolean f558d;

    /* renamed from: e */
    public final boolean f559e;

    /* renamed from: f */
    public C0139v f560f;

    /* renamed from: g */
    public C0139v f561g;

    public C0139v() {
        this.f555a = new byte[8192];
        this.f559e = true;
        this.f558d = false;
    }

    /* renamed from: a */
    public final C0139v m304a() {
        C0139v c0139v = this.f560f;
        if (c0139v == this) {
            c0139v = null;
        }
        C0139v c0139v2 = this.f561g;
        AbstractC3367j.m5097b(c0139v2);
        c0139v2.f560f = this.f560f;
        C0139v c0139v3 = this.f560f;
        AbstractC3367j.m5097b(c0139v3);
        c0139v3.f561g = this.f561g;
        this.f560f = null;
        this.f561g = null;
        return c0139v;
    }

    /* renamed from: b */
    public final void m305b(C0139v c0139v) {
        AbstractC3367j.m5100e(c0139v, "segment");
        c0139v.f561g = this;
        c0139v.f560f = this.f560f;
        C0139v c0139v2 = this.f560f;
        AbstractC3367j.m5097b(c0139v2);
        c0139v2.f561g = c0139v;
        this.f560f = c0139v;
    }

    /* renamed from: c */
    public final C0139v m306c() {
        this.f558d = true;
        return new C0139v(this.f555a, this.f556b, this.f557c, true, false);
    }

    /* renamed from: d */
    public final void m307d(C0139v c0139v, int i7) {
        AbstractC3367j.m5100e(c0139v, "sink");
        if (c0139v.f559e) {
            int i8 = c0139v.f557c;
            int i9 = i8 + i7;
            if (i9 > 8192) {
                if (!c0139v.f558d) {
                    int i10 = c0139v.f556b;
                    if (i9 - i10 <= 8192) {
                        byte[] bArr = c0139v.f555a;
                        AbstractC1804l.m3018K(bArr, bArr, 0, i10, i8, 2);
                        c0139v.f557c -= c0139v.f556b;
                        c0139v.f556b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = c0139v.f555a;
            int i11 = c0139v.f557c;
            int i12 = this.f556b;
            AbstractC1804l.m3013F(i11, i12, i12 + i7, this.f555a, bArr2);
            c0139v.f557c += i7;
            this.f556b += i7;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public C0139v(byte[] bArr, int i7, int i8, boolean z7, boolean z8) {
        AbstractC3367j.m5100e(bArr, "data");
        this.f555a = bArr;
        this.f556b = i7;
        this.f557c = i8;
        this.f558d = z7;
        this.f559e = z8;
    }
}
