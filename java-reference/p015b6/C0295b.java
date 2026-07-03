package p015b6;

import java.util.HashSet;
import java.util.Iterator;
import p060h5.AbstractC1794b;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.b */
/* loaded from: classes.dex */
public final class C0295b extends AbstractC1794b {

    /* renamed from: g */
    public final Iterator f1072g;

    /* renamed from: h */
    public final InterfaceC3279c f1073h;

    /* renamed from: i */
    public final HashSet f1074i;

    public C0295b(Iterator it, InterfaceC3279c interfaceC3279c) {
        AbstractC3367j.m5100e(it, "source");
        this.f1072g = it;
        this.f1073h = interfaceC3279c;
        this.f1074i = new HashSet();
    }

    @Override // p060h5.AbstractC1794b
    /* renamed from: a */
    public final void mo655a() {
        Object next;
        do {
            Iterator it = this.f1072g;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f10847e = 2;
                return;
            }
        } while (!this.f1074i.add(this.f1073h.mo23f(next)));
        this.f10848f = next;
        this.f10847e = 1;
    }
}
