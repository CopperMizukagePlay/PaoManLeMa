package p143s6;

import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.C0132o;
import p006a7.InterfaceC0127j;
import p006a7.InterfaceC0142y;
import p128q6.C3011n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s6.b */
/* loaded from: classes.dex */
public final class C3113b implements InterfaceC0142y {

    /* renamed from: e */
    public final C0132o f15734e;

    /* renamed from: f */
    public boolean f15735f;

    /* renamed from: g */
    public final /* synthetic */ C3011n f15736g;

    public C3113b(C3011n c3011n) {
        this.f15736g = c3011n;
        this.f15734e = new C0132o(((InterfaceC0127j) c3011n.f15538e).mo231a());
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: a */
    public final C0120c0 mo231a() {
        return this.f15734e;
    }

    @Override // p006a7.InterfaceC0142y, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f15735f) {
            return;
        }
        this.f15735f = true;
        ((InterfaceC0127j) this.f15736g.f15538e).mo242E("0\r\n\r\n");
        C0132o c0132o = this.f15734e;
        C0120c0 c0120c0 = c0132o.f536e;
        c0132o.f536e = C0120c0.f496d;
        c0120c0.mo226a();
        c0120c0.mo227b();
        this.f15736g.f15534a = 3;
    }

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    public final synchronized void flush() {
        if (this.f15735f) {
            return;
        }
        ((InterfaceC0127j) this.f15736g.f15538e).flush();
    }

    @Override // p006a7.InterfaceC0142y
    /* renamed from: j */
    public final void mo232j(long j6, C0126i c0126i) {
        InterfaceC0127j interfaceC0127j = (InterfaceC0127j) this.f15736g.f15538e;
        if (!this.f15735f) {
            if (j6 == 0) {
                return;
            }
            interfaceC0127j.mo255g(j6);
            interfaceC0127j.mo242E("\r\n");
            interfaceC0127j.mo232j(j6, c0126i);
            interfaceC0127j.mo242E("\r\n");
            return;
        }
        throw new IllegalStateException("closed");
    }
}
