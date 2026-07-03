package p092m;

import p100n.C2634c1;
import p100n.InterfaceC2627a0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.n */
/* loaded from: classes.dex */
public final class C2498n extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13819f;

    /* renamed from: g */
    public final /* synthetic */ C2506v f13820g;

    /* renamed from: h */
    public final /* synthetic */ C2507w f13821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2498n(C2506v c2506v, C2507w c2507w, int i7) {
        super(1);
        this.f13819f = i7;
        this.f13820g = c2506v;
        this.f13821h = c2507w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r3.f13821h.f13852a.f13787a != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r3.f13820g.f13849a.f13787a != null) goto L18;
     */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        InterfaceC2627a0 interfaceC2627a0;
        InterfaceC2627a0 interfaceC2627a02;
        switch (this.f13819f) {
            case 0:
                C2634c1 c2634c1 = (C2634c1) obj;
                EnumC2496l enumC2496l = EnumC2496l.f13811e;
                EnumC2496l enumC2496l2 = EnumC2496l.f13812f;
                if (c2634c1.m4202a(enumC2496l, enumC2496l2)) {
                    C2508x c2508x = this.f13820g.f13849a.f13787a;
                    if (c2508x == null || (interfaceC2627a02 = c2508x.f13853a) == null) {
                        return AbstractC2501q.f13825a;
                    }
                    return interfaceC2627a02;
                }
                if (c2634c1.m4202a(enumC2496l2, EnumC2496l.f13813g)) {
                    C2508x c2508x2 = this.f13821h.f13852a.f13787a;
                    if (c2508x2 == null || (interfaceC2627a0 = c2508x2.f13853a) == null) {
                        return AbstractC2501q.f13825a;
                    }
                    return interfaceC2627a0;
                }
                return AbstractC2501q.f13825a;
            default:
                int ordinal = ((EnumC2496l) obj).ordinal();
                float f7 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new RuntimeException();
                        }
                        break;
                    }
                    f7 = 1.0f;
                }
                return Float.valueOf(f7);
        }
    }
}
