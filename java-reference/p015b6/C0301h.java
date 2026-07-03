package p015b6;

import java.util.Iterator;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.h */
/* loaded from: classes.dex */
public final class C0301h implements InterfaceC0305l {

    /* renamed from: a */
    public final InterfaceC0305l f1086a;

    /* renamed from: b */
    public final boolean f1087b;

    /* renamed from: c */
    public final InterfaceC3279c f1088c;

    public C0301h(InterfaceC0305l interfaceC0305l, boolean z7, InterfaceC3279c interfaceC3279c) {
        this.f1086a = interfaceC0305l;
        this.f1087b = z7;
        this.f1088c = interfaceC3279c;
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        return new C0300g(this);
    }
}
