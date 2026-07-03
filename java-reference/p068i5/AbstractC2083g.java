package p068i5;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p006a7.C0129l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.g */
/* loaded from: classes.dex */
public abstract class AbstractC2083g {

    /* renamed from: e */
    public int f12316e;

    /* renamed from: f */
    public int f12317f;

    /* renamed from: g */
    public int f12318g;

    /* renamed from: h */
    public Object f12319h;

    public AbstractC2083g() {
        if (C0129l.f526c == null) {
            C0129l.f526c = new C0129l(26);
        }
    }

    /* renamed from: a */
    public int m3415a(int i7) {
        if (i7 < this.f12318g) {
            return ((ByteBuffer) this.f12319h).getShort(this.f12317f + i7);
        }
        return 0;
    }

    /* renamed from: b */
    public void m3416b() {
        if (((C2084h) this.f12319h).f12328l == this.f12318g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public void m3417c() {
        while (true) {
            int i7 = this.f12316e;
            C2084h c2084h = (C2084h) this.f12319h;
            if (i7 < c2084h.f12326j && c2084h.f12323g[i7] < 0) {
                this.f12316e = i7 + 1;
            } else {
                return;
            }
        }
    }

    public boolean hasNext() {
        if (this.f12316e < ((C2084h) this.f12319h).f12326j) {
            return true;
        }
        return false;
    }

    public void remove() {
        C2084h c2084h = (C2084h) this.f12319h;
        m3416b();
        if (this.f12317f != -1) {
            c2084h.m3420c();
            c2084h.m3429l(this.f12317f);
            this.f12317f = -1;
            this.f12318g = c2084h.f12328l;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
