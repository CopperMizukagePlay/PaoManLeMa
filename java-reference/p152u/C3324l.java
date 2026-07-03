package p152u;

import java.util.List;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.l */
/* loaded from: classes.dex */
public final class C3324l extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3324l f16309g;

    /* renamed from: h */
    public static final C3324l f16310h;

    /* renamed from: f */
    public final /* synthetic */ int f16311f;

    static {
        int i7 = 1;
        f16309g = new C3324l(i7, 0);
        f16310h = new C3324l(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3324l(int i7, int i8) {
        super(i7);
        this.f16311f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f16311f) {
            case 0:
                return C1694m.f10482a;
            case 1:
                List list = (List) obj;
                return new C3330r(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
