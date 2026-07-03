package p077k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.t */
/* loaded from: classes.dex */
public final class C2217t implements Map, InterfaceC3594a {

    /* renamed from: e */
    public final C2194h0 f12742e;

    /* renamed from: f */
    public C2195i f12743f;

    /* renamed from: g */
    public C2195i f12744g;

    /* renamed from: h */
    public C2218t0 f12745h;

    public C2217t(C2194h0 c2194h0) {
        AbstractC3367j.m5100e(c2194h0, "parent");
        this.f12742e = c2194h0;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f12742e.m3588c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f12742e.m3589d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2195i c2195i = this.f12743f;
        if (c2195i != null) {
            return c2195i;
        }
        C2195i c2195i2 = new C2195i(this.f12742e, 0);
        this.f12743f = c2195i2;
        return c2195i2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2217t.class == obj.getClass()) {
            return AbstractC3367j.m5096a(this.f12742e, ((C2217t) obj).f12742e);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f12742e.m3592g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12742e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12742e.m3594i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2195i c2195i = this.f12744g;
        if (c2195i != null) {
            return c2195i;
        }
        C2195i c2195i2 = new C2195i(this.f12742e, 1);
        this.f12744g = c2195i2;
        return c2195i2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12742e.f12680e;
    }

    public final String toString() {
        return this.f12742e.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C2218t0 c2218t0 = this.f12745h;
        if (c2218t0 != null) {
            return c2218t0;
        }
        C2218t0 c2218t02 = new C2218t0(this.f12742e);
        this.f12745h = c2218t02;
        return c2218t02;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
