package p034e0;

import p065i2.AbstractC2064e;
import p140s2.C3100j;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p171w2.InterfaceC3774x;
import p174w5.AbstractC3784a;
import p177x0.InterfaceC3797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.l */
/* loaded from: classes.dex */
public final class C0615l implements InterfaceC3774x {

    /* renamed from: a */
    public final InterfaceC3797e f2020a;

    /* renamed from: b */
    public final InterfaceC0617m f2021b;

    /* renamed from: c */
    public long f2022c = 0;

    public C0615l(InterfaceC3797e interfaceC3797e, InterfaceC0617m interfaceC0617m) {
        this.f2020a = interfaceC3797e;
        this.f2021b = interfaceC0617m;
    }

    @Override // p171w2.InterfaceC3774x
    /* renamed from: a */
    public final long mo1252a(C3101k c3101k, long j6, EnumC3103m enumC3103m, long j7) {
        long mo125a = this.f2021b.mo125a();
        if (!AbstractC3784a.m5815x(mo125a)) {
            mo125a = this.f2022c;
        }
        this.f2022c = mo125a;
        return C3100j.m4785c(C3100j.m4785c((c3101k.f15698a << 32) | (c3101k.f15699b & 4294967295L), AbstractC2064e.m3225F(mo125a)), this.f2020a.mo5825a(j7, 0L, enumC3103m));
    }
}
