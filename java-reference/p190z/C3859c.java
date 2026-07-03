package p190z;

import p027d1.C0467e;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z.c */
/* loaded from: classes.dex */
public final class C3859c implements InterfaceC3857a {

    /* renamed from: a */
    public final float f18091a;

    public C3859c(float f7) {
        this.f18091a = f7;
        if (f7 >= 0.0f && f7 <= 100.0f) {
        } else {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p190z.InterfaceC3857a
    /* renamed from: a */
    public final float mo5871a(long j6, InterfaceC3093c interfaceC3093c) {
        return (this.f18091a / 100.0f) * C0467e.m1025c(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3859c) && Float.compare(this.f18091a, ((C3859c) obj).f18091a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18091a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f18091a + "%)";
    }
}
