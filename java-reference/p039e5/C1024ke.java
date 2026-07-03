package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ke */
/* loaded from: classes.dex */
public final class C1024ke {

    /* renamed from: a */
    public final String f5267a;

    /* renamed from: b */
    public final String f5268b;

    public C1024ke(String str, String str2) {
        AbstractC3367j.m5100e(str, "title");
        AbstractC3367j.m5100e(str2, "body");
        this.f5267a = str;
        this.f5268b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024ke)) {
            return false;
        }
        C1024ke c1024ke = (C1024ke) obj;
        if (AbstractC3367j.m5096a(this.f5267a, c1024ke.f5267a) && AbstractC3367j.m5096a(this.f5268b, c1024ke.f5268b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5268b.hashCode() + (this.f5267a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalSection(title=" + this.f5267a + ", body=" + this.f5268b + ")";
    }
}
