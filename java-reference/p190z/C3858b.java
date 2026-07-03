package p190z;

import p140s2.C3096f;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z.b */
/* loaded from: classes.dex */
public final class C3858b implements InterfaceC3857a {

    /* renamed from: a */
    public final float f18090a;

    public C3858b(float f7) {
        this.f18090a = f7;
    }

    @Override // p190z.InterfaceC3857a
    /* renamed from: a */
    public final float mo5871a(long j6, InterfaceC3093c interfaceC3093c) {
        return interfaceC3093c.mo4526y(this.f18090a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3858b) || !C3096f.m4776a(this.f18090a, ((C3858b) obj).f18090a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18090a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f18090a + ".dp)";
    }
}
