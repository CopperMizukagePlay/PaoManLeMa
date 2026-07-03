package p015b6;

import java.util.Iterator;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.i */
/* loaded from: classes.dex */
public final class C0302i implements InterfaceC0305l {

    /* renamed from: a */
    public final /* synthetic */ int f1089a;

    /* renamed from: b */
    public final InterfaceC0305l f1090b;

    /* renamed from: c */
    public final InterfaceC3279c f1091c;

    public C0302i(InterfaceC0305l interfaceC0305l, InterfaceC3279c interfaceC3279c, int i7) {
        this.f1089a = i7;
        switch (i7) {
            case 1:
                this.f1090b = interfaceC0305l;
                this.f1091c = interfaceC3279c;
                return;
            default:
                C0312s c0312s = C0312s.f1107m;
                this.f1090b = interfaceC0305l;
                this.f1091c = interfaceC3279c;
                return;
        }
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        switch (this.f1089a) {
            case 0:
                return new C0300g(this);
            default:
                return new C0313t(this);
        }
    }
}
