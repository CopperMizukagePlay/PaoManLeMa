package p061h6;

import p047f6.EnumC1546a;
import p053g5.C1694m;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.g */
/* loaded from: classes.dex */
public final class C1825g extends AbstractC1824f {
    @Override // p061h6.AbstractC1824f
    /* renamed from: a */
    public final AbstractC1824f mo3095a(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        return new AbstractC1824f(this.f10880h, interfaceC2318h, i7, enumC1546a);
    }

    @Override // p061h6.AbstractC1824f
    /* renamed from: b */
    public final InterfaceC1702d mo3096b() {
        return this.f10880h;
    }

    @Override // p061h6.AbstractC1824f
    /* renamed from: c */
    public final Object mo3097c(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        Object mo35f = this.f10880h.mo35f(interfaceC1704e, interfaceC2313c);
        if (mo35f == EnumC2465a.f13750e) {
            return mo35f;
        }
        return C1694m.f10482a;
    }
}
