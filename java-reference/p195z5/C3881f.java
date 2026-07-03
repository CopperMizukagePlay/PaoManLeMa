package p195z5;

import java.util.Iterator;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z5.f */
/* loaded from: classes.dex */
public final class C3881f implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final long f18175e;

    /* renamed from: f */
    public final long f18176f;

    /* renamed from: g */
    public final long f18177g;

    public C3881f(long j6, long j7) {
        this(j6, j7, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3881f) {
            long j6 = this.f18175e;
            long j7 = this.f18176f;
            if (j6 > j7) {
                C3881f c3881f = (C3881f) obj;
                if (c3881f.f18175e > c3881f.f18176f) {
                    return true;
                }
            }
            C3881f c3881f2 = (C3881f) obj;
            if (j6 == c3881f2.f18175e && j7 == c3881f2.f18176f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f18175e;
        long j7 = this.f18176f;
        if (j6 > j7) {
            return -1;
        }
        return (int) ((31 * (j6 ^ (j6 >>> 32))) + ((j7 >>> 32) ^ j7));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3880e(this.f18175e, this.f18176f, this.f18177g);
    }

    public final String toString() {
        return this.f18175e + ".." + this.f18176f;
    }

    public C3881f(long j6, long j7, boolean z7) {
        this.f18175e = j6;
        if (j6 < j7) {
            long j8 = j7 % 1;
            long j9 = j6 % 1;
            long j10 = ((j8 < 0 ? j8 + 1 : j8) - (j9 < 0 ? j9 + 1 : j9)) % 1;
            j7 -= j10 < 0 ? j10 + 1 : j10;
        }
        this.f18176f = j7;
        this.f18177g = 1L;
    }
}
