package p024c6;

import java.util.Iterator;
import p015b6.InterfaceC0305l;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.c */
/* loaded from: classes.dex */
public final class C0436c implements InterfaceC0305l {

    /* renamed from: a */
    public final CharSequence f1487a;

    /* renamed from: b */
    public final int f1488b;

    /* renamed from: c */
    public final InterfaceC3281e f1489c;

    public C0436c(CharSequence charSequence, int i7, InterfaceC3281e interfaceC3281e) {
        AbstractC3367j.m5100e(charSequence, "input");
        this.f1487a = charSequence;
        this.f1488b = i7;
        this.f1489c = interfaceC3281e;
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        return new C0435b(this);
    }
}
