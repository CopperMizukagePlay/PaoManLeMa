package p032d6;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.d */
/* loaded from: classes.dex */
public final class C0524d implements InterfaceC0539i {

    /* renamed from: a */
    public final C0521c[] f1854a;

    public C0524d(C0521c[] c0521cArr) {
        this.f1854a = c0521cArr;
    }

    @Override // p032d6.InterfaceC0539i
    /* renamed from: a */
    public final void mo1120a(Throwable th) {
        m1121b();
    }

    /* renamed from: b */
    public final void m1121b() {
        for (C0521c c0521c : this.f1854a) {
            InterfaceC0552m0 interfaceC0552m0 = c0521c.f1851j;
            if (interfaceC0552m0 != null) {
                interfaceC0552m0.mo1155a();
            } else {
                AbstractC3367j.m5105j("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f1854a + ']';
    }
}
