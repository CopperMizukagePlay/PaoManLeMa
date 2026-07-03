package p071j0;

import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import p150t5.InterfaceC3279c;
import p186y3.C3850a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2114a implements InterfaceC0209r {

    /* renamed from: e */
    public final /* synthetic */ int f12402e;

    /* renamed from: f */
    public final /* synthetic */ Object f12403f;

    public /* synthetic */ C2114a(int i7, Object obj) {
        this.f12402e = i7;
        this.f12403f = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        switch (this.f12402e) {
            case 0:
                ((InterfaceC3279c) this.f12403f).mo23f(enumC0201n);
                return;
            default:
                C3850a c3850a = (C3850a) this.f12403f;
                if (enumC0201n == EnumC0201n.ON_START) {
                    c3850a.f18084h = true;
                    return;
                } else {
                    if (enumC0201n == EnumC0201n.ON_STOP) {
                        c3850a.f18084h = false;
                        return;
                    }
                    return;
                }
        }
    }
}
