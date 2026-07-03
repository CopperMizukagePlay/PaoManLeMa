package p054g6;

import p047f6.EnumC1546a;
import p061h6.AbstractC1824f;
import p061h6.InterfaceC1831m;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.p */
/* loaded from: classes.dex */
public final class C1715p implements InterfaceC1697a0, InterfaceC1702d, InterfaceC1831m {

    /* renamed from: e */
    public final /* synthetic */ C1701c0 f10535e;

    public C1715p(C1701c0 c1701c0) {
        this.f10535e = c1701c0;
    }

    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    public final Object mo35f(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        this.f10535e.mo35f(interfaceC1704e, interfaceC2313c);
        return EnumC2465a.f13750e;
    }

    @Override // p054g6.InterfaceC1697a0
    public final Object getValue() {
        return this.f10535e.getValue();
    }

    @Override // p061h6.InterfaceC1831m
    /* renamed from: m */
    public final InterfaceC1702d mo2753m(InterfaceC2318h interfaceC2318h, int i7, EnumC1546a enumC1546a) {
        if ((((i7 >= 0 && i7 < 2) || i7 == -2) && enumC1546a == EnumC1546a.f10129f) || ((i7 == 0 || i7 == -3) && enumC1546a == EnumC1546a.f10128e)) {
            return this;
        }
        return new AbstractC1824f(this, interfaceC2318h, i7, enumC1546a);
    }
}
