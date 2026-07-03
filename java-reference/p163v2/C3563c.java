package p163v2;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.c */
/* loaded from: classes.dex */
public final class C3563c extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3563c f17114g;

    /* renamed from: h */
    public static final C3563c f17115h;

    /* renamed from: i */
    public static final C3563c f17116i;

    /* renamed from: j */
    public static final C3563c f17117j;

    /* renamed from: f */
    public final /* synthetic */ int f17118f;

    static {
        int i7 = 1;
        f17114g = new C3563c(i7, 0);
        f17115h = new C3563c(i7, 1);
        f17116i = new C3563c(i7, 2);
        f17117j = new C3563c(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3563c(int i7, int i8) {
        super(i7);
        this.f17118f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17118f) {
            case 0:
                AbstractC3569i abstractC3569i = (AbstractC3569i) obj;
                abstractC3569i.getHandler().post(new RunnableC3561a(1, abstractC3569i.f17153u));
                return C1694m.f10482a;
            case 1:
                return C1694m.f10482a;
            case 2:
                return C1694m.f10482a;
            default:
                return C1694m.f10482a;
        }
    }
}
