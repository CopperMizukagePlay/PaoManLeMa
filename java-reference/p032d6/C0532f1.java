package p032d6;

import p082k5.InterfaceC2313c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.f1 */
/* loaded from: classes.dex */
public final class C0532f1 extends C0548l {

    /* renamed from: m */
    public final C0541i1 f1874m;

    public C0532f1(InterfaceC2313c interfaceC2313c, C0541i1 c0541i1) {
        super(1, interfaceC2313c);
        this.f1874m = c0541i1;
    }

    @Override // p032d6.C0548l
    /* renamed from: B */
    public final String mo1160B() {
        return "AwaitContinuation";
    }

    @Override // p032d6.C0548l
    /* renamed from: s */
    public final Throwable mo1161s(C0541i1 c0541i1) {
        Throwable m1165c;
        C0541i1 c0541i12 = this.f1874m;
        c0541i12.getClass();
        Object obj = C0541i1.f1886e.get(c0541i12);
        if ((obj instanceof C0538h1) && (m1165c = ((C0538h1) obj).m1165c()) != null) {
            return m1165c;
        }
        if (obj instanceof C0569s) {
            return ((C0569s) obj).f1923a;
        }
        return c0541i1.mo1118w();
    }
}
