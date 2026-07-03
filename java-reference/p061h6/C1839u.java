package p061h6;

import p054g6.C1718s;
import p054g6.InterfaceC1697a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.u */
/* loaded from: classes.dex */
public final class C1839u extends C1718s implements InterfaceC1697a0 {
    @Override // p054g6.InterfaceC1697a0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f10550l;
            AbstractC3367j.m5097b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f10551m + ((int) ((m2762o() + this.f10553o) - this.f10551m))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    /* renamed from: w */
    public final void m3101w(int i7) {
        synchronized (this) {
            Object[] objArr = this.f10550l;
            AbstractC3367j.m5097b(objArr);
            m2764q(Integer.valueOf(((Number) objArr[((int) ((this.f10551m + ((int) ((m2762o() + this.f10553o) - this.f10551m))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
