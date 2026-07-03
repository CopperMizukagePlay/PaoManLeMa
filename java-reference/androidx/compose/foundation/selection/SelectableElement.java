package androidx.compose.foundation.selection;

import p028d2.C0474g;
import p092m.AbstractC2487d;
import p107o.AbstractC2734e;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p182y.C3829b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class SelectableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final boolean f692a;

    /* renamed from: b */
    public final C3081j f693b;

    /* renamed from: c */
    public final InterfaceC2780u0 f694c;

    /* renamed from: d */
    public final boolean f695d;

    /* renamed from: e */
    public final C0474g f696e;

    /* renamed from: f */
    public final InterfaceC3277a f697f;

    public SelectableElement(boolean z7, C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, boolean z8, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        this.f692a = z7;
        this.f693b = c3081j;
        this.f694c = interfaceC2780u0;
        this.f695d = z8;
        this.f696e = c0474g;
        this.f697f = interfaceC3277a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && SelectableElement.class == obj.getClass()) {
                SelectableElement selectableElement = (SelectableElement) obj;
                if (this.f692a != selectableElement.f692a || !AbstractC3367j.m5096a(this.f693b, selectableElement.f693b) || !AbstractC3367j.m5096a(this.f694c, selectableElement.f694c) || this.f695d != selectableElement.f695d || !AbstractC3367j.m5096a(this.f696e, selectableElement.f696e) || this.f697f != selectableElement.f697f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.e, y.b, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC2734e = new AbstractC2734e(this.f693b, this.f694c, this.f695d, null, this.f696e, this.f697f);
        abstractC2734e.f18038M = this.f692a;
        return abstractC2734e;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int hashCode = Boolean.hashCode(this.f692a) * 31;
        int i9 = 0;
        C3081j c3081j = this.f693b;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (hashCode + i7) * 31;
        InterfaceC2780u0 interfaceC2780u0 = this.f694c;
        if (interfaceC2780u0 != null) {
            i8 = interfaceC2780u0.hashCode();
        } else {
            i8 = 0;
        }
        int m4040d = AbstractC2487d.m4040d((i10 + i8) * 31, 31, this.f695d);
        C0474g c0474g = this.f696e;
        if (c0474g != null) {
            i9 = Integer.hashCode(c0474g.f1652a);
        }
        return this.f697f.hashCode() + ((m4040d + i9) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3829b c3829b = (C3829b) abstractC3809q;
        boolean z7 = c3829b.f18038M;
        boolean z8 = this.f692a;
        if (z7 != z8) {
            c3829b.f18038M = z8;
            AbstractC3498f.m5375o(c3829b);
        }
        c3829b.m4400R0(this.f693b, this.f694c, this.f695d, null, this.f696e, this.f697f);
    }
}
