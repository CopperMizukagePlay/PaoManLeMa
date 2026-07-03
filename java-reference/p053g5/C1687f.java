package p053g5;

import java.io.Serializable;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.f */
/* loaded from: classes.dex */
public final class C1687f implements Serializable {

    /* renamed from: e */
    public final Object f10471e;

    /* renamed from: f */
    public final Object f10472f;

    public C1687f(Object obj, Object obj2) {
        this.f10471e = obj;
        this.f10472f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687f)) {
            return false;
        }
        C1687f c1687f = (C1687f) obj;
        if (AbstractC3367j.m5096a(this.f10471e, c1687f.f10471e) && AbstractC3367j.m5096a(this.f10472f, c1687f.f10472f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f10471e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f10472f;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "(" + this.f10471e + ", " + this.f10472f + ')';
    }
}
