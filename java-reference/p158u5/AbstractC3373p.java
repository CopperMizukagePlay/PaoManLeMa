package p158u5;

import p001a0.AbstractC0094y0;
import p005a6.InterfaceC0110a;
import p005a6.InterfaceC0114e;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.p */
/* loaded from: classes.dex */
public abstract class AbstractC3373p extends AbstractC3360c implements InterfaceC0114e {

    /* renamed from: k */
    public final boolean f16445k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3373p(int i7, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, r7);
        boolean z7;
        if ((i7 & 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f16445k = false;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3373p) {
                AbstractC3373p abstractC3373p = (AbstractC3373p) obj;
                if (m5091g().equals(abstractC3373p.m5091g()) && this.f16434h.equals(abstractC3373p.f16434h) && this.f16435i.equals(abstractC3373p.f16435i) && AbstractC3367j.m5096a(this.f16432f, abstractC3373p.f16432f)) {
                    return true;
                }
                return false;
            }
            if (obj instanceof InterfaceC0114e) {
                return obj.equals(m5107h());
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final InterfaceC0110a m5107h() {
        if (this.f16445k) {
            return this;
        }
        InterfaceC0110a interfaceC0110a = this.f16431e;
        if (interfaceC0110a == null) {
            InterfaceC0110a mo3159e = mo3159e();
            this.f16431e = mo3159e;
            return mo3159e;
        }
        return interfaceC0110a;
    }

    public final int hashCode() {
        return this.f16435i.hashCode() + AbstractC0094y0.m175b(m5091g().hashCode() * 31, 31, this.f16434h);
    }

    public final String toString() {
        InterfaceC0110a m5107h = m5107h();
        if (m5107h != this) {
            return m5107h.toString();
        }
        return AbstractC2487d.m4046j(new StringBuilder("property "), this.f16434h, " (Kotlin reflection is not available)");
    }
}
