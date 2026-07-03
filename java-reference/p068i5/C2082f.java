package p068i5;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3596c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.f */
/* loaded from: classes.dex */
public final class C2082f implements Map.Entry, InterfaceC3596c {

    /* renamed from: e */
    public final C2084h f12313e;

    /* renamed from: f */
    public final int f12314f;

    /* renamed from: g */
    public final int f12315g;

    public C2082f(C2084h c2084h, int i7) {
        AbstractC3367j.m5100e(c2084h, "map");
        this.f12313e = c2084h;
        this.f12314f = i7;
        this.f12315g = c2084h.f12328l;
    }

    /* renamed from: a */
    public final void m3414a() {
        if (this.f12313e.f12328l == this.f12315g) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC3367j.m5096a(entry.getKey(), getKey()) && AbstractC3367j.m5096a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m3414a();
        return this.f12313e.f12321e[this.f12314f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m3414a();
        Object[] objArr = this.f12313e.f12322f;
        AbstractC3367j.m5097b(objArr);
        return objArr[this.f12314f];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i7;
        Object key = getKey();
        int i8 = 0;
        if (key != null) {
            i7 = key.hashCode();
        } else {
            i7 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i8 = value.hashCode();
        }
        return i7 ^ i8;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m3414a();
        C2084h c2084h = this.f12313e;
        c2084h.m3420c();
        Object[] objArr = c2084h.f12322f;
        if (objArr == null) {
            int length = c2084h.f12321e.length;
            if (length >= 0) {
                objArr = new Object[length];
                c2084h.f12322f = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        int i7 = this.f12314f;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
