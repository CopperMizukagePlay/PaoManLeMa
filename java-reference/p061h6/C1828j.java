package p061h6;

import p032d6.AbstractC0525d0;
import p047f6.EnumC1546a;
import p053g5.C1694m;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.j */
/* loaded from: classes.dex */
public final class C1828j extends AbstractC1824f {

    /* renamed from: i */
    public final AbstractC2590j f10891i;

    /* JADX WARN: Multi-variable type inference failed */
    public C1828j(InterfaceC3282f interfaceC3282f, InterfaceC1702d interfaceC1702d, InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        super(interfaceC1702d, interfaceC2318h, i7, enumC1546a);
        this.f10891i = (AbstractC2590j) interfaceC3282f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m5.j, t5.f] */
    @Override // p061h6.AbstractC1824f
    /* renamed from: a */
    public final AbstractC1824f mo3095a(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        return new C1828j(this.f10891i, this.f10880h, interfaceC2318h, i7, enumC1546a);
    }

    @Override // p061h6.AbstractC1824f
    /* renamed from: c */
    public final Object mo3097c(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        Object m1130h = AbstractC0525d0.m1130h(new C1826h(this, interfaceC1704e, null), interfaceC2313c);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }
}
