package p039e5;

import java.util.ArrayList;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vb */
/* loaded from: classes.dex */
public final class C1362vb {

    /* renamed from: a */
    public final ArrayList f8152a;

    /* renamed from: b */
    public final int f8153b;

    public C1362vb(int i7, ArrayList arrayList) {
        this.f8152a = arrayList;
        this.f8153b = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1362vb) {
                C1362vb c1362vb = (C1362vb) obj;
                if (!this.f8152a.equals(c1362vb.f8152a) || this.f8153b != c1362vb.f8153b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8153b) + (this.f8152a.hashCode() * 31);
    }

    public final String toString() {
        return "ImportedConfig(profiles=" + this.f8152a + ", selectedProfileId=" + this.f8153b + ")";
    }
}
