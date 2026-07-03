package p170w1;

import android.content.Context;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.InterfaceC2385m1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.n */
/* loaded from: classes.dex */
public final class C3704n extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3704n f17611g;

    /* renamed from: h */
    public static final C3704n f17612h;

    /* renamed from: i */
    public static final C3704n f17613i;

    /* renamed from: j */
    public static final C3704n f17614j;

    /* renamed from: k */
    public static final C3704n f17615k;

    /* renamed from: f */
    public final /* synthetic */ int f17616f;

    static {
        int i7 = 1;
        f17611g = new C3704n(i7, 0);
        f17612h = new C3704n(i7, 1);
        f17613i = new C3704n(i7, 2);
        f17614j = new C3704n(i7, 3);
        f17615k = new C3704n(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3704n(int i7, int i8) {
        super(i7);
        this.f17616f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f17616f) {
            case 0:
                return C1694m.f10482a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                InterfaceC2385m1 interfaceC2385m1 = (InterfaceC2385m1) obj;
                C2336a0 c2336a0 = AndroidCompositionLocals_androidKt.f785a;
                interfaceC2385m1.getClass();
                AbstractC2418w.m3981y(interfaceC2385m1, c2336a0);
                return ((Context) AbstractC2418w.m3981y(interfaceC2385m1, AndroidCompositionLocals_androidKt.f786b)).getResources();
            default:
                return Boolean.valueOf(AbstractC3681h0.m5686m(obj));
        }
    }
}
