package p099m6;

import java.util.ArrayList;
import java.util.Set;
import p060h5.AbstractC1805m;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.e */
/* loaded from: classes.dex */
public final class C2599e {

    /* renamed from: c */
    public static final C2599e f14069c = new C2599e(AbstractC1805m.m3038F0(new ArrayList()), null);

    /* renamed from: a */
    public final Set f14070a;

    /* renamed from: b */
    public final AbstractC2064e f14071b;

    public C2599e(Set set, AbstractC2064e abstractC2064e) {
        this.f14070a = set;
        this.f14071b = abstractC2064e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2599e) {
            C2599e c2599e = (C2599e) obj;
            if (AbstractC3367j.m5096a(c2599e.f14070a, this.f14070a) && AbstractC3367j.m5096a(c2599e.f14071b, this.f14071b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f14070a.hashCode() + 1517) * 41;
        AbstractC2064e abstractC2064e = this.f14071b;
        if (abstractC2064e != null) {
            i7 = abstractC2064e.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
