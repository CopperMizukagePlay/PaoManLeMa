package p054g6;

import p032d6.C0548l;
import p061h6.AbstractC1820b;
import p061h6.AbstractC1822d;
import p082k5.InterfaceC2313c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.u */
/* loaded from: classes.dex */
public final class C1720u extends AbstractC1822d {

    /* renamed from: a */
    public long f10558a;

    /* renamed from: b */
    public C0548l f10559b;

    @Override // p061h6.AbstractC1822d
    /* renamed from: a */
    public final boolean mo2754a(AbstractC1820b abstractC1820b) {
        C1718s c1718s = (C1718s) abstractC1820b;
        if (this.f10558a >= 0) {
            return false;
        }
        long j6 = c1718s.f10551m;
        if (j6 < c1718s.f10552n) {
            c1718s.f10552n = j6;
        }
        this.f10558a = j6;
        return true;
    }

    @Override // p061h6.AbstractC1822d
    /* renamed from: b */
    public final InterfaceC2313c[] mo2755b(AbstractC1820b abstractC1820b) {
        long j6 = this.f10558a;
        this.f10558a = -1L;
        this.f10559b = null;
        return ((C1718s) abstractC1820b).m2769v(j6);
    }
}
