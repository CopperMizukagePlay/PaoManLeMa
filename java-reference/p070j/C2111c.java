package p070j;

import androidx.lifecycle.C0215u;
import androidx.lifecycle.InterfaceC0211s;
import java.util.Map;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j.c */
/* loaded from: classes.dex */
public final class C2111c implements Map.Entry {

    /* renamed from: e */
    public final Object f12395e;

    /* renamed from: f */
    public final C0215u f12396f;

    /* renamed from: g */
    public C2111c f12397g;

    /* renamed from: h */
    public C2111c f12398h;

    public C2111c(InterfaceC0211s interfaceC0211s, C0215u c0215u) {
        this.f12395e = interfaceC0211s;
        this.f12396f = c0215u;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2111c) {
                C2111c c2111c = (C2111c) obj;
                if (this.f12395e.equals(c2111c.f12395e) && this.f12396f.equals(c2111c.f12396f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12395e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12396f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12395e.hashCode() ^ this.f12396f.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12395e + "=" + this.f12396f;
    }
}
