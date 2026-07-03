package p158u5;

import p001a0.AbstractC0094y0;
import p005a6.InterfaceC0110a;
import p053g5.InterfaceC1684c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.h */
/* loaded from: classes.dex */
public abstract class AbstractC3365h extends AbstractC3360c implements InterfaceC3364g, InterfaceC0110a, InterfaceC1684c {

    /* renamed from: k */
    public final int f16440k;

    /* renamed from: l */
    public final int f16441l;

    public AbstractC3365h(int i7, Class cls, String str, String str2, int i8) {
        this(i7, C3359b.f16430e, cls, str, str2, i8, 0);
    }

    @Override // p158u5.InterfaceC3364g
    /* renamed from: b */
    public final int mo4120b() {
        return this.f16440k;
    }

    @Override // p158u5.AbstractC3360c
    /* renamed from: e */
    public final InterfaceC0110a mo3159e() {
        AbstractC3380w.f16452a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3365h) {
                AbstractC3365h abstractC3365h = (AbstractC3365h) obj;
                if (this.f16434h.equals(abstractC3365h.f16434h) && this.f16435i.equals(abstractC3365h.f16435i) && this.f16441l == abstractC3365h.f16441l && this.f16440k == abstractC3365h.f16440k && AbstractC3367j.m5096a(this.f16432f, abstractC3365h.f16432f) && m5091g().equals(abstractC3365h.m5091g())) {
                    return true;
                }
                return false;
            }
            if (obj instanceof AbstractC3365h) {
                InterfaceC0110a interfaceC0110a = this.f16431e;
                if (interfaceC0110a == null) {
                    mo3159e();
                    this.f16431e = this;
                    interfaceC0110a = this;
                }
                return obj.equals(interfaceC0110a);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        m5091g();
        return this.f16435i.hashCode() + AbstractC0094y0.m175b(m5091g().hashCode() * 31, 31, this.f16434h);
    }

    public final String toString() {
        InterfaceC0110a interfaceC0110a = this.f16431e;
        if (interfaceC0110a == null) {
            mo3159e();
            this.f16431e = this;
            interfaceC0110a = this;
        }
        if (interfaceC0110a != this) {
            return interfaceC0110a.toString();
        }
        String str = this.f16434h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AbstractC0094y0.m185l("function ", str, " (Kotlin reflection is not available)");
    }

    public AbstractC3365h(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f16440k = i7;
        this.f16441l = 0;
    }
}
