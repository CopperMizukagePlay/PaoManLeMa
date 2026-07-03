package androidx.compose.foundation;

import p010b1.C0264b;
import p035e1.C0671o0;
import p035e1.InterfaceC0667m0;
import p107o.C2764o;
import p140s2.C3096f;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f579a;

    /* renamed from: b */
    public final C0671o0 f580b;

    /* renamed from: c */
    public final InterfaceC0667m0 f581c;

    public BorderModifierNodeElement(float f7, C0671o0 c0671o0, InterfaceC0667m0 interfaceC0667m0) {
        this.f579a = f7;
        this.f580b = c0671o0;
        this.f581c = interfaceC0667m0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BorderModifierNodeElement) {
                BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
                if (!C3096f.m4776a(this.f579a, borderModifierNodeElement.f579a) || !this.f580b.equals(borderModifierNodeElement.f580b) || !AbstractC3367j.m5096a(this.f581c, borderModifierNodeElement.f581c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C2764o(this.f579a, this.f580b, this.f581c);
    }

    public final int hashCode() {
        return this.f581c.hashCode() + ((this.f580b.hashCode() + (Float.hashCode(this.f579a) * 31)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2764o c2764o = (C2764o) abstractC3809q;
        float f7 = c2764o.f14731v;
        C0264b c0264b = c2764o.f14734y;
        float f8 = this.f579a;
        if (!C3096f.m4776a(f7, f8)) {
            c2764o.f14731v = f8;
            c0264b.m552K0();
        }
        C0671o0 c0671o0 = c2764o.f14732w;
        C0671o0 c0671o02 = this.f580b;
        if (!AbstractC3367j.m5096a(c0671o0, c0671o02)) {
            c2764o.f14732w = c0671o02;
            c0264b.m552K0();
        }
        InterfaceC0667m0 interfaceC0667m0 = c2764o.f14733x;
        InterfaceC0667m0 interfaceC0667m02 = this.f581c;
        if (!AbstractC3367j.m5096a(interfaceC0667m0, interfaceC0667m02)) {
            c2764o.f14733x = interfaceC0667m02;
            c0264b.m552K0();
        }
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C3096f.m4777b(this.f579a)) + ", brush=" + this.f580b + ", shape=" + this.f581c + ')';
    }
}
