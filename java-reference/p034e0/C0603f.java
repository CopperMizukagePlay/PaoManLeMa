package p034e0;

import p001a0.EnumC0088w0;
import p028d2.C0477j;
import p028d2.C0490w;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.f */
/* loaded from: classes.dex */
public final class C0603f extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC0617m f1987f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1988g;

    /* renamed from: h */
    public final /* synthetic */ boolean f1989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603f(InterfaceC0617m interfaceC0617m, boolean z7, boolean z8) {
        super(1);
        this.f1987f = interfaceC0617m;
        this.f1988g = z7;
        this.f1989h = z8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        EnumC0088w0 enumC0088w0;
        int i7;
        C0477j c0477j = (C0477j) obj;
        long mo125a = this.f1987f.mo125a();
        C0490w c0490w = AbstractC0641z.f2122c;
        if (this.f1988g) {
            enumC0088w0 = EnumC0088w0.f406f;
        } else {
            enumC0088w0 = EnumC0088w0.f407g;
        }
        if (this.f1989h) {
            i7 = 1;
        } else {
            i7 = 3;
        }
        c0477j.m1036d(c0490w, new C0640y(enumC0088w0, mo125a, i7, AbstractC3784a.m5815x(mo125a)));
        return C1694m.f10482a;
    }
}
