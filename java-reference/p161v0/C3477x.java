package p161v0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.x */
/* loaded from: classes.dex */
public final class C3477x implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final C3472s f16769e;

    /* renamed from: f */
    public final Iterator f16770f;

    /* renamed from: g */
    public int f16771g;

    /* renamed from: h */
    public Map.Entry f16772h;

    /* renamed from: i */
    public Map.Entry f16773i;

    /* renamed from: j */
    public final /* synthetic */ int f16774j;

    public C3477x(C3472s c3472s, Iterator it, int i7) {
        this.f16774j = i7;
        this.f16769e = c3472s;
        this.f16770f = it;
        this.f16771g = c3472s.m5272e().f16736d;
        m5282a();
    }

    /* renamed from: a */
    public final void m5282a() {
        Map.Entry entry;
        this.f16772h = this.f16773i;
        Iterator it = this.f16770f;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.f16773i = entry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16773i != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16774j) {
            case 0:
                m5282a();
                if (this.f16772h != null) {
                    return new C3476w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f16773i;
                if (entry != null) {
                    m5282a();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = this.f16773i;
                if (entry2 != null) {
                    m5282a();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3472s c3472s = this.f16769e;
        if (c3472s.m5272e().f16736d == this.f16771g) {
            Map.Entry entry = this.f16772h;
            if (entry != null) {
                c3472s.remove(entry.getKey());
                this.f16772h = null;
                this.f16771g = c3472s.m5272e().f16736d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
