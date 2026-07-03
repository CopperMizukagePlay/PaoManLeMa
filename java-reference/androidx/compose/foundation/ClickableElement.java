package androidx.compose.foundation;

import p028d2.C0474g;
import p092m.AbstractC2487d;
import p107o.AbstractC2734e;
import p107o.C2775s;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ClickableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3081j f582a;

    /* renamed from: b */
    public final InterfaceC2780u0 f583b;

    /* renamed from: c */
    public final boolean f584c;

    /* renamed from: d */
    public final String f585d;

    /* renamed from: e */
    public final C0474g f586e;

    /* renamed from: f */
    public final InterfaceC3277a f587f;

    public ClickableElement(C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, boolean z7, String str, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        this.f582a = c3081j;
        this.f583b = interfaceC2780u0;
        this.f584c = z7;
        this.f585d = str;
        this.f586e = c0474g;
        this.f587f = interfaceC3277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (AbstractC3367j.m5096a(this.f582a, clickableElement.f582a) && AbstractC3367j.m5096a(this.f583b, clickableElement.f583b) && this.f584c == clickableElement.f584c && AbstractC3367j.m5096a(this.f585d, clickableElement.f585d) && AbstractC3367j.m5096a(this.f586e, clickableElement.f586e) && this.f587f == clickableElement.f587f) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new AbstractC2734e(this.f582a, this.f583b, this.f584c, this.f585d, this.f586e, this.f587f);
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        C3081j c3081j = this.f582a;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        InterfaceC2780u0 interfaceC2780u0 = this.f583b;
        if (interfaceC2780u0 != null) {
            i8 = interfaceC2780u0.hashCode();
        } else {
            i8 = 0;
        }
        int m4040d = AbstractC2487d.m4040d((i11 + i8) * 31, 31, this.f584c);
        String str = this.f585d;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (m4040d + i9) * 31;
        C0474g c0474g = this.f586e;
        if (c0474g != null) {
            i10 = Integer.hashCode(c0474g.f1652a);
        }
        return this.f587f.hashCode() + ((i12 + i10) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C2775s) abstractC3809q).m4400R0(this.f582a, this.f583b, this.f584c, this.f585d, this.f586e, this.f587f);
    }
}
