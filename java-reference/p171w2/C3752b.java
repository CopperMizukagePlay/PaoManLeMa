package p171w2;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0477j;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.b */
/* loaded from: classes.dex */
public final class C3752b extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3752b f17823g;

    /* renamed from: h */
    public static final C3752b f17824h;

    /* renamed from: i */
    public static final C3752b f17825i;

    /* renamed from: j */
    public static final C3752b f17826j;

    /* renamed from: k */
    public static final C3752b f17827k;

    /* renamed from: l */
    public static final C3752b f17828l;

    /* renamed from: f */
    public final /* synthetic */ int f17829f;

    static {
        int i7 = 1;
        f17823g = new C3752b(i7, 0);
        f17824h = new C3752b(i7, 1);
        f17825i = new C3752b(i7, 2);
        f17826j = new C3752b(i7, 3);
        f17827k = new C3752b(i7, 4);
        f17828l = new C3752b(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3752b(int i7, int i8) {
        super(i7);
        this.f17829f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f17829f;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
                ((C0477j) obj).m1036d(AbstractC0487t.f1762w, c1694m);
                return c1694m;
            case 1:
                ((Number) obj).longValue();
                return c1694m;
            case 2:
                return c1694m;
            case 3:
                InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
                ((C0477j) obj).m1036d(AbstractC0487t.f1761v, c1694m);
                return c1694m;
            case 4:
                return c1694m;
            default:
                C3771u c3771u = (C3771u) obj;
                if (c3771u.isAttachedToWindow()) {
                    c3771u.m5774m();
                }
                return c1694m;
        }
    }
}
