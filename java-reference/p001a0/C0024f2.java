package p001a0;

import android.content.res.Configuration;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p027d1.C0464b;
import p053g5.C1694m;
import p085l0.C2336a0;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.f2 */
/* loaded from: classes.dex */
public final class C0024f2 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f120f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0024f2(InterfaceC2425y0 interfaceC2425y0, int i7) {
        super(1);
        this.f120f = i7;
        this.f121g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f120f;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f121g;
        switch (i7) {
            case 0:
                ((InterfaceC3279c) interfaceC2425y0.getValue()).mo23f(new C0464b(((C0464b) obj).f1623a));
                return c1694m;
            case 1:
                return (Float) ((InterfaceC3279c) interfaceC2425y0.getValue()).mo23f(Float.valueOf(((Number) obj).floatValue()));
            default:
                Configuration configuration = new Configuration((Configuration) obj);
                C2336a0 c2336a0 = AndroidCompositionLocals_androidKt.f785a;
                interfaceC2425y0.setValue(configuration);
                return c1694m;
        }
    }
}
