package p054g6;

import p032d6.C0548l;
import p032d6.InterfaceC0552m0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.q */
/* loaded from: classes.dex */
public final class C1716q implements InterfaceC0552m0 {

    /* renamed from: e */
    public final C1718s f10536e;

    /* renamed from: f */
    public final long f10537f;

    /* renamed from: g */
    public final Object f10538g;

    /* renamed from: h */
    public final C0548l f10539h;

    public C1716q(C1718s c1718s, long j6, Object obj, C0548l c0548l) {
        this.f10536e = c1718s;
        this.f10537f = j6;
        this.f10538g = obj;
        this.f10539h = c0548l;
    }

    @Override // p032d6.InterfaceC0552m0
    /* renamed from: a */
    public final void mo1155a() {
        C1718s c1718s = this.f10536e;
        synchronized (c1718s) {
            if (this.f10537f < c1718s.m2762o()) {
                return;
            }
            Object[] objArr = c1718s.f10550l;
            AbstractC3367j.m5097b(objArr);
            long j6 = this.f10537f;
            if (objArr[((int) j6) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC1719t.m2772c(objArr, j6, AbstractC1719t.f10555a);
            c1718s.m2758i();
        }
    }
}
