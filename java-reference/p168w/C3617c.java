package p168w;

import java.util.List;
import p053g5.C1694m;
import p099m6.C2615p;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C3617c extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3617c f17271g;

    /* renamed from: h */
    public static final C3617c f17272h;

    /* renamed from: f */
    public final /* synthetic */ int f17273f;

    static {
        int i7 = 1;
        f17271g = new C3617c(i7, 0);
        f17272h = new C3617c(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3617c(int i7, int i8) {
        super(i7);
        this.f17273f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17273f) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C3619d(intValue, ((Float) obj3).floatValue(), new C2615p(1, list));
            default:
                return C1694m.f10482a;
        }
    }
}
