package p107o;

import android.view.View;
import android.widget.Magnifier;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.j1 */
/* loaded from: classes.dex */
public final class C2751j1 implements InterfaceC2745h1 {

    /* renamed from: b */
    public static final C2751j1 f14690b = new C2751j1(0);

    /* renamed from: c */
    public static final C2751j1 f14691c = new C2751j1(1);

    /* renamed from: a */
    public final /* synthetic */ int f14692a;

    public /* synthetic */ C2751j1(int i7) {
        this.f14692a = i7;
    }

    @Override // p107o.InterfaceC2745h1
    /* renamed from: a */
    public final boolean mo4416a() {
        switch (this.f14692a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p107o.InterfaceC2745h1
    /* renamed from: b */
    public final InterfaceC2742g1 mo4417b(View view, InterfaceC3093c interfaceC3093c) {
        switch (this.f14692a) {
            case 0:
                return new C2748i1(new Magnifier(view));
            default:
                return new C2748i1(new Magnifier(view));
        }
    }
}
