package p092m;

import p100n.InterfaceC2627a0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p177x0.C3802j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.k */
/* loaded from: classes.dex */
public final class C2495k {

    /* renamed from: a */
    public final C3802j f13808a;

    /* renamed from: b */
    public final AbstractC3368k f13809b;

    /* renamed from: c */
    public final InterfaceC2627a0 f13810c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2495k(C3802j c3802j, InterfaceC3279c interfaceC3279c, InterfaceC2627a0 interfaceC2627a0) {
        this.f13808a = c3802j;
        this.f13809b = (AbstractC3368k) interfaceC3279c;
        this.f13810c = interfaceC2627a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2495k) {
            C2495k c2495k = (C2495k) obj;
            if (this.f13808a.equals(c2495k.f13808a) && this.f13809b.equals(c2495k.f13809b) && this.f13810c.equals(c2495k.f13810c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f13810c.hashCode() + ((this.f13809b.hashCode() + (this.f13808a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f13808a + ", size=" + this.f13809b + ", animationSpec=" + this.f13810c + ", clip=true)";
    }
}
