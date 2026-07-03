package p018c0;

import p053g5.C1694m;
import p087l2.C2446j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C0329a extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C0329a f1140g;

    /* renamed from: h */
    public static final C0329a f1141h;

    /* renamed from: i */
    public static final C0329a f1142i;

    /* renamed from: f */
    public final /* synthetic */ int f1143f;

    static {
        int i7 = 1;
        f1140g = new C0329a(i7, 0);
        f1141h = new C0329a(i7, 1);
        f1142i = new C0329a(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0329a(int i7, int i8) {
        super(i7);
        this.f1143f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final /* synthetic */ Object mo23f(Object obj) {
        switch (this.f1143f) {
            case 0:
                ((Number) obj).longValue();
                return C1694m.f10482a;
            case 1:
                return C1694m.f10482a;
            default:
                int i7 = ((C2446j) obj).f13697a;
                return C1694m.f10482a;
        }
    }
}
