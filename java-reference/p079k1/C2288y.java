package p079k1;

import p001a0.C0019e1;
import p001a0.C0031h1;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p092m.AbstractC2487d;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.y */
/* loaded from: classes.dex */
public final class C2288y extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13207f;

    /* renamed from: g */
    public final /* synthetic */ C2289z f13208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2288y(C2289z c2289z, int i7) {
        super(1);
        this.f13207f = i7;
        this.f13208g = c2289z;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f13207f) {
            case 0:
                C2289z c2289z = this.f13208g;
                c2289z.f13211d = true;
                c2289z.f13213f.mo52a();
                return C1694m.f10482a;
            default:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                C2289z c2289z2 = this.f13208g;
                C2260b c2260b = c2289z2.f13209b;
                float f7 = c2289z2.f13218k;
                float f8 = c2289z2.f13219l;
                C0031h1 mo2524E = interfaceC1570d.mo2524E();
                long m109x = mo2524E.m109x();
                mo2524E.m106u().mo1341m();
                try {
                    ((C0019e1) mo2524E.f152f).m48t(f7, f8, 0L);
                    c2260b.mo3666a(interfaceC1570d);
                    AbstractC2487d.m4052p(mo2524E, m109x);
                    return C1694m.f10482a;
                } catch (Throwable th) {
                    AbstractC2487d.m4052p(mo2524E, m109x);
                    throw th;
                }
        }
    }
}
