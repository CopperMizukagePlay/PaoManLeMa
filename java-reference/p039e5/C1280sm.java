package p039e5;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sm */
/* loaded from: classes.dex */
public final class C1280sm {

    /* renamed from: a */
    public final ArrayList f7623a;

    /* renamed from: b */
    public final LinkedHashMap f7624b;

    /* renamed from: c */
    public final boolean f7625c;

    public C1280sm(ArrayList arrayList, LinkedHashMap linkedHashMap, boolean z7) {
        this.f7623a = arrayList;
        this.f7624b = linkedHashMap;
        this.f7625c = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1280sm) {
                C1280sm c1280sm = (C1280sm) obj;
                if (!this.f7623a.equals(c1280sm.f7623a) || !this.f7624b.equals(c1280sm.f7624b) || this.f7625c != c1280sm.f7625c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7625c) + ((this.f7624b.hashCode() + (this.f7623a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ProfileIdNormalization(profiles=" + this.f7623a + ", idMap=" + this.f7624b + ", changed=" + this.f7625c + ")";
    }
}
