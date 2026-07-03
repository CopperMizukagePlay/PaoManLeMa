package p053g5;

import java.io.Serializable;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.k */
/* loaded from: classes.dex */
public final class C1692k implements Serializable {

    /* renamed from: e */
    public final Object f10478e;

    /* renamed from: f */
    public final Object f10479f;

    /* renamed from: g */
    public final Object f10480g;

    public C1692k(Object obj, Object obj2, Object obj3) {
        this.f10478e = obj;
        this.f10479f = obj2;
        this.f10480g = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692k)) {
            return false;
        }
        C1692k c1692k = (C1692k) obj;
        if (AbstractC3367j.m5096a(this.f10478e, c1692k.f10478e) && AbstractC3367j.m5096a(this.f10479f, c1692k.f10479f) && AbstractC3367j.m5096a(this.f10480g, c1692k.f10480g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        Object obj = this.f10478e;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f10479f;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Object obj3 = this.f10480g;
        if (obj3 != null) {
            i7 = obj3.hashCode();
        }
        return i9 + i7;
    }

    public final String toString() {
        return "(" + this.f10478e + ", " + this.f10479f + ", " + this.f10480g + ')';
    }
}
