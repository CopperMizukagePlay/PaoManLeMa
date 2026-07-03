package p123q0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p068i5.C2086j;
import p108o0.InterfaceC2793c;
import p138s0.C3087b;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3597d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.d */
/* loaded from: classes.dex */
public class C2969d extends AbstractMap implements InterfaceC2793c, Map, InterfaceC3597d {

    /* renamed from: e */
    public C2967b f15377e;

    /* renamed from: f */
    public C3087b f15378f = new Object();

    /* renamed from: g */
    public C2976k f15379g;

    /* renamed from: h */
    public Object f15380h;

    /* renamed from: i */
    public int f15381i;

    /* renamed from: j */
    public int f15382j;

    /* JADX WARN: Type inference failed for: r0v0, types: [s0.b, java.lang.Object] */
    public C2969d(C2967b c2967b) {
        this.f15377e = c2967b;
        this.f15379g = c2967b.f15372e;
        this.f15382j = c2967b.f15373f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s0.b, java.lang.Object] */
    @Override // p108o0.InterfaceC2793c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2967b build() {
        C2976k c2976k = this.f15379g;
        C2967b c2967b = this.f15377e;
        if (c2976k != c2967b.f15372e) {
            this.f15378f = new Object();
            c2967b = new C2967b(this.f15379g, this.f15382j);
        }
        this.f15377e = c2967b;
        return c2967b;
    }

    /* renamed from: b */
    public final void m4612b(int i7) {
        this.f15382j = i7;
        this.f15381i++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f15379g = C2976k.f15392e;
        m4612b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i7;
        C2976k c2976k = this.f15379g;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return c2976k.m4618d(i7, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C2971f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i7;
        C2976k c2976k = this.f15379g;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return c2976k.m4621g(i7, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C2971f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i7;
        this.f15380h = null;
        C2976k c2976k = this.f15379g;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        this.f15379g = c2976k.m4625l(i7, obj, obj2, 0, this);
        return this.f15380h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [s0.a, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C2967b c2967b;
        C2969d c2969d;
        C2967b c2967b2 = null;
        if (map instanceof C2967b) {
            c2967b = (C2967b) map;
        } else {
            c2967b = null;
        }
        if (c2967b == null) {
            if (map instanceof C2969d) {
                c2969d = (C2969d) map;
            } else {
                c2969d = null;
            }
            if (c2969d != null) {
                c2967b2 = c2969d.build();
            }
        } else {
            c2967b2 = c2967b;
        }
        if (c2967b2 != null) {
            ?? obj = new Object();
            obj.f15683a = 0;
            int i7 = this.f15382j;
            C2976k c2976k = this.f15379g;
            C2976k c2976k2 = c2967b2.f15372e;
            AbstractC3367j.m5098c(c2976k2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f15379g = c2976k.m4626m(c2976k2, 0, obj, this);
            int i8 = (c2967b2.f15373f + i7) - obj.f15683a;
            if (i7 != i8) {
                m4612b(i8);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i7 = this.f15382j;
        C2976k m4628o = this.f15379g.m4628o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (m4628o == null) {
            m4628o = C2976k.f15392e;
        }
        this.f15379g = m4628o;
        return i7 != this.f15382j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15382j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C2086j(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f15380h = null;
        C2976k m4627n = this.f15379g.m4627n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (m4627n == null) {
            m4627n = C2976k.f15392e;
        }
        this.f15379g = m4627n;
        return this.f15380h;
    }
}
