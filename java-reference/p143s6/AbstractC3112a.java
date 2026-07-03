package p143s6;

import java.io.IOException;
import p006a7.C0120c0;
import p006a7.C0126i;
import p006a7.C0132o;
import p006a7.InterfaceC0116a0;
import p006a7.InterfaceC0128k;
import p128q6.C3009l;
import p128q6.C3011n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s6.a */
/* loaded from: classes.dex */
public abstract class AbstractC3112a implements InterfaceC0116a0 {

    /* renamed from: e */
    public final C0132o f15731e;

    /* renamed from: f */
    public boolean f15732f;

    /* renamed from: g */
    public final /* synthetic */ C3011n f15733g;

    public AbstractC3112a(C3011n c3011n) {
        this.f15733g = c3011n;
        this.f15731e = new C0132o(((InterfaceC0128k) c3011n.f15537d).mo215a());
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: C */
    public long mo214C(long j6, C0126i c0126i) {
        C3011n c3011n = this.f15733g;
        AbstractC3367j.m5100e(c0126i, "sink");
        try {
            return ((InterfaceC0128k) c3011n.f15537d).mo214C(j6, c0126i);
        } catch (IOException e7) {
            ((C3009l) c3011n.f15536c).m4697k();
            m4816b();
            throw e7;
        }
    }

    @Override // p006a7.InterfaceC0116a0
    /* renamed from: a */
    public final C0120c0 mo215a() {
        return this.f15731e;
    }

    /* renamed from: b */
    public final void m4816b() {
        C3011n c3011n = this.f15733g;
        int i7 = c3011n.f15534a;
        if (i7 == 6) {
            return;
        }
        if (i7 == 5) {
            C0132o c0132o = this.f15731e;
            C0120c0 c0120c0 = c0132o.f536e;
            c0132o.f536e = C0120c0.f496d;
            c0120c0.mo226a();
            c0120c0.mo227b();
            c3011n.f15534a = 6;
            return;
        }
        throw new IllegalStateException("state: " + c3011n.f15534a);
    }
}
