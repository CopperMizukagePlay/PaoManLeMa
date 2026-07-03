package p015b6;

import java.util.Iterator;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.d */
/* loaded from: classes.dex */
public final class C0297d implements InterfaceC0305l, InterfaceC0298e {

    /* renamed from: a */
    public final InterfaceC0305l f1078a;

    /* renamed from: b */
    public final int f1079b;

    public C0297d(InterfaceC0305l interfaceC0305l, int i7) {
        AbstractC3367j.m5100e(interfaceC0305l, "sequence");
        this.f1078a = interfaceC0305l;
        this.f1079b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // p015b6.InterfaceC0298e
    /* renamed from: a */
    public final InterfaceC0305l mo656a(int i7) {
        int i8 = this.f1079b + i7;
        if (i8 < 0) {
            return new C0297d(this, i7);
        }
        return new C0297d(this.f1078a, i8);
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        return new C0296c(this);
    }
}
