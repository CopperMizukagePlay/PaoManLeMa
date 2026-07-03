package p133r3;

import java.util.LinkedHashMap;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r3.b */
/* loaded from: classes.dex */
public abstract class AbstractC3047b {

    /* renamed from: a */
    public final LinkedHashMap f15622a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC3047b) {
            if (AbstractC3367j.m5096a(this.f15622a, ((AbstractC3047b) obj).f15622a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15622a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f15622a + ')';
    }
}
