package p077k;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.d */
/* loaded from: classes.dex */
public final class C2185d implements Iterator, Map.Entry {

    /* renamed from: e */
    public int f12630e;

    /* renamed from: f */
    public int f12631f = -1;

    /* renamed from: g */
    public boolean f12632g;

    /* renamed from: h */
    public final /* synthetic */ C2189f f12633h;

    public C2185d(C2189f c2189f) {
        this.f12633h = c2189f;
        this.f12630e = c2189f.f12735g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f12632g) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i7 = this.f12631f;
                C2189f c2189f = this.f12633h;
                if (AbstractC3367j.m5096a(key, c2189f.m3629e(i7)) && AbstractC3367j.m5096a(entry.getValue(), c2189f.m3632h(this.f12631f))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12632g) {
            return this.f12633h.m3629e(this.f12631f);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12632g) {
            return this.f12633h.m3632h(this.f12631f);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12631f < this.f12630e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f12632g) {
            int i7 = this.f12631f;
            C2189f c2189f = this.f12633h;
            Object m3629e = c2189f.m3629e(i7);
            Object m3632h = c2189f.m3632h(this.f12631f);
            int i8 = 0;
            if (m3629e == null) {
                hashCode = 0;
            } else {
                hashCode = m3629e.hashCode();
            }
            if (m3632h != null) {
                i8 = m3632h.hashCode();
            }
            return hashCode ^ i8;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f12631f++;
            this.f12632g = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12632g) {
            this.f12633h.m3630f(this.f12631f);
            this.f12631f--;
            this.f12630e--;
            this.f12632g = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12632g) {
            return this.f12633h.m3631g(this.f12631f, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
