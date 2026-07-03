package p057h1;

import p035e1.C0677s;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.a */
/* loaded from: classes.dex */
public final class C1751a extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C1751a f10660g;

    /* renamed from: h */
    public static final C1751a f10661h;

    /* renamed from: f */
    public final /* synthetic */ int f10662f;

    static {
        int i7 = 1;
        f10660g = new C1751a(i7, 0);
        f10661h = new C1751a(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1751a(int i7, int i8) {
        super(i7);
        this.f10662f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f10662f) {
            case 0:
                return C1694m.f10482a;
            default:
                InterfaceC1570d.m2535D((InterfaceC1570d) obj, C0677s.f2208f, 0L, 0L, 0.0f, 126);
                return C1694m.f10482a;
        }
    }
}
