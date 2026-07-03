package androidx.compose.foundation.selection;

import p028d2.C0474g;
import p043f2.EnumC1533a;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p107o.AbstractC2734e;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p182y.C3831d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class TriStateToggleableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final EnumC1533a f703a;

    /* renamed from: b */
    public final C3081j f704b;

    /* renamed from: c */
    public final InterfaceC2780u0 f705c;

    /* renamed from: d */
    public final boolean f706d;

    /* renamed from: e */
    public final C0474g f707e;

    /* renamed from: f */
    public final InterfaceC3277a f708f;

    public TriStateToggleableElement(EnumC1533a enumC1533a, C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, boolean z7, C0474g c0474g, InterfaceC3277a interfaceC3277a) {
        this.f703a = enumC1533a;
        this.f704b = c3081j;
        this.f705c = interfaceC2780u0;
        this.f706d = z7;
        this.f707e = c0474g;
        this.f708f = interfaceC3277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        if (this.f703a == triStateToggleableElement.f703a && AbstractC3367j.m5096a(this.f704b, triStateToggleableElement.f704b) && AbstractC3367j.m5096a(this.f705c, triStateToggleableElement.f705c) && this.f706d == triStateToggleableElement.f706d && AbstractC3367j.m5096a(this.f707e, triStateToggleableElement.f707e) && this.f708f == triStateToggleableElement.f708f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.e, x0.q, y.d] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC2734e = new AbstractC2734e(this.f704b, this.f705c, this.f706d, null, this.f707e, this.f708f);
        abstractC2734e.f18042M = this.f703a;
        return abstractC2734e;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f703a.hashCode() * 31;
        int i8 = 0;
        C3081j c3081j = this.f704b;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = (hashCode + i7) * 31;
        InterfaceC2780u0 interfaceC2780u0 = this.f705c;
        if (interfaceC2780u0 != null) {
            i8 = interfaceC2780u0.hashCode();
        }
        return this.f708f.hashCode() + AbstractC2647h.m4255a(this.f707e.f1652a, AbstractC2487d.m4040d((i9 + i8) * 31, 31, this.f706d), 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3831d c3831d = (C3831d) abstractC3809q;
        EnumC1533a enumC1533a = c3831d.f18042M;
        EnumC1533a enumC1533a2 = this.f703a;
        if (enumC1533a != enumC1533a2) {
            c3831d.f18042M = enumC1533a2;
            AbstractC3498f.m5375o(c3831d);
        }
        c3831d.m4400R0(this.f704b, this.f705c, this.f706d, null, this.f707e, this.f708f);
    }
}
