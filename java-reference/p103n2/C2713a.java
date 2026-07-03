package p103n2;

import java.util.Locale;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n2.a */
/* loaded from: classes.dex */
public final class C2713a {

    /* renamed from: a */
    public final Locale f14561a;

    public C2713a(Locale locale) {
        this.f14561a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2713a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC3367j.m5096a(this.f14561a.toLanguageTag(), ((C2713a) obj).f14561a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f14561a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f14561a.toLanguageTag();
    }
}
