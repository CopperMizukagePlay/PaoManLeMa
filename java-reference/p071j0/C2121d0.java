package p071j0;

import java.util.Iterator;
import java.util.Map;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.d0 */
/* loaded from: classes.dex */
public final class C2121d0 {

    /* renamed from: a */
    public final Map f12415a;

    public C2121d0(Map map) {
        this.f12415a = map;
    }

    /* renamed from: a */
    public final Object m3472a(float f7) {
        Object next;
        Iterator it = this.f12415a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f7 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f7 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: b */
    public final Object m3473b(float f7, boolean z7) {
        Object next;
        float f8;
        float f9;
        Iterator it = this.f12415a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z7) {
                    f8 = floatValue - f7;
                } else {
                    f8 = f7 - floatValue;
                }
                if (f8 < 0.0f) {
                    f8 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z7) {
                        f9 = floatValue2 - f7;
                    } else {
                        f9 = f7 - floatValue2;
                    }
                    if (f9 < 0.0f) {
                        f9 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f8, f9) > 0) {
                        next = next2;
                        f8 = f9;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: c */
    public final float m3474c(Object obj) {
        Float f7 = (Float) this.f12415a.get(obj);
        if (f7 != null) {
            return f7.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2121d0)) {
            return false;
        }
        return AbstractC3367j.m5096a(this.f12415a, ((C2121d0) obj).f12415a);
    }

    public final int hashCode() {
        return this.f12415a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f12415a + ')';
    }
}
