package p077k;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.f */
/* loaded from: classes.dex */
public final class C2189f extends C2214r0 implements Map {

    /* renamed from: h */
    public C2179a f12649h;

    /* renamed from: i */
    public C2183c f12650i;

    /* renamed from: j */
    public C2187e f12651j;

    @Override // java.util.Map
    public final Set entrySet() {
        C2179a c2179a = this.f12649h;
        if (c2179a == null) {
            C2179a c2179a2 = new C2179a(this);
            this.f12649h = c2179a2;
            return c2179a2;
        }
        return c2179a;
    }

    /* renamed from: i */
    public final boolean m3583i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m3584j(Collection collection) {
        int i7 = this.f12735g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i7 != this.f12735g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2183c c2183c = this.f12650i;
        if (c2183c == null) {
            C2183c c2183c2 = new C2183c(this);
            this.f12650i = c2183c2;
            return c2183c2;
        }
        return c2183c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f12735g;
        int i7 = this.f12735g;
        int[] iArr = this.f12733e;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12733e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12734f, size * 2);
            AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
            this.f12734f = copyOf2;
        }
        if (this.f12735g == i7) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        C2187e c2187e = this.f12651j;
        if (c2187e == null) {
            C2187e c2187e2 = new C2187e(this);
            this.f12651j = c2187e2;
            return c2187e2;
        }
        return c2187e;
    }
}
