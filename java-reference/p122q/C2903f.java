package p122q;

import android.content.Context;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.InterfaceC2385m1;
import p117p1.C2868s;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C2903f extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C2903f f15133g;

    /* renamed from: h */
    public static final C2903f f15134h;

    /* renamed from: i */
    public static final C2903f f15135i;

    /* renamed from: j */
    public static final C2903f f15136j;

    /* renamed from: f */
    public final /* synthetic */ int f15137f;

    static {
        int i7 = 1;
        f15133g = new C2903f(i7, 0);
        f15134h = new C2903f(i7, 1);
        f15135i = new C2903f(i7, 2);
        f15136j = new C2903f(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2903f(int i7, int i8) {
        super(i7);
        this.f15137f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        switch (this.f15137f) {
            case 0:
                InterfaceC2385m1 interfaceC2385m1 = (InterfaceC2385m1) obj;
                C2394o2 c2394o2 = AndroidCompositionLocals_androidKt.f786b;
                interfaceC2385m1.getClass();
                if (!((Context) AbstractC2418w.m3981y(interfaceC2385m1, c2394o2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    InterfaceC2900e.f15123a.getClass();
                    return C2897d.f15112c;
                }
                return AbstractC2909h.f15161b;
            case 1:
                return Boolean.TRUE;
            case 2:
                if (((C2868s) obj).f15014i == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(!z7);
            default:
                ((Number) obj).floatValue();
                return C1694m.f10482a;
        }
    }
}
