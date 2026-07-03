package p053g5;

import java.io.Serializable;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.i */
/* loaded from: classes.dex */
public final class C1690i implements Serializable {

    /* renamed from: e */
    public final Object f10474e;

    /* renamed from: a */
    public static final Throwable m2747a(Object obj) {
        if (obj instanceof C1689h) {
            return ((C1689h) obj).f10473e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1690i) {
            if (!AbstractC3367j.m5096a(this.f10474e, ((C1690i) obj).f10474e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10474e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10474e;
        if (obj instanceof C1689h) {
            return ((C1689h) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
