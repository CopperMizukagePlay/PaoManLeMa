package p019c1;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.n */
/* loaded from: classes.dex */
public final class C0370n extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C0370n f1246g;

    /* renamed from: h */
    public static final C0370n f1247h;

    /* renamed from: i */
    public static final C0370n f1248i;

    /* renamed from: f */
    public final /* synthetic */ int f1249f;

    static {
        int i7 = 1;
        f1246g = new C0370n(i7, 0);
        f1247h = new C0370n(i7, 1);
        f1248i = new C0370n(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0370n(int i7, int i8) {
        super(i7);
        this.f1249f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f1249f) {
            case 0:
                return C1694m.f10482a;
            case 1:
                return C1694m.f10482a;
            case 2:
                return Boolean.valueOf(((C0377u) obj).m849O0(7));
            default:
                return Boolean.valueOf(((C0377u) obj).m849O0(7));
        }
    }
}
