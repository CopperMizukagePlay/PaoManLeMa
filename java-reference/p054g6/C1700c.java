package p054g6;

import p034e0.C0600d0;
import p053g5.C1694m;
import p061h6.AbstractC1821c;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.c */
/* loaded from: classes.dex */
public final class C1700c implements InterfaceC1702d {

    /* renamed from: e */
    public final InterfaceC1702d f10500e;

    public C1700c(InterfaceC1702d interfaceC1702d) {
        this.f10500e = interfaceC1702d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u5.v] */
    @Override // p054g6.InterfaceC1702d
    /* renamed from: f */
    public final Object mo35f(InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        ?? obj = new Object();
        obj.f16451e = AbstractC1821c.f10872b;
        Object mo35f = this.f10500e.mo35f(new C0600d0(this, (C3379v) obj, interfaceC1704e), interfaceC2313c);
        if (mo35f == EnumC2465a.f13750e) {
            return mo35f;
        }
        return C1694m.f10482a;
    }
}
