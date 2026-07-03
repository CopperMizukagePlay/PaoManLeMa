package p080k2;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.a */
/* loaded from: classes.dex */
public final class C2290a implements InterfaceC2304o {

    /* renamed from: a */
    public final int f13221a;

    public C2290a(int i7) {
        this.f13221a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2290a) && this.f13221a == ((C2290a) obj).f13221a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13221a);
    }

    public final String toString() {
        return AbstractC2487d.m4045i(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f13221a, ')');
    }
}
