package p020c2;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c2.b */
/* loaded from: classes.dex */
public final class C0382b extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C0382b f1290g;

    /* renamed from: h */
    public static final C0382b f1291h;

    /* renamed from: i */
    public static final C0382b f1292i;

    /* renamed from: f */
    public final /* synthetic */ int f1293f;

    static {
        int i7 = 1;
        f1290g = new C0382b(i7, 0);
        f1291h = new C0382b(i7, 1);
        f1292i = new C0382b(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0382b(int i7, int i8) {
        super(i7);
        this.f1293f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f1293f) {
            case 0:
                ((Number) obj).longValue();
                return C1694m.f10482a;
            case 1:
                return Integer.valueOf(((C0389i) obj).f1312b);
            default:
                return Integer.valueOf(((C0389i) obj).f1313c.m4788b());
        }
    }
}
