package p032d6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.d1 */
/* loaded from: classes.dex */
public class C0526d1 extends C0541i1 {

    /* renamed from: g */
    public final boolean f1865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526d1(InterfaceC0520b1 interfaceC0520b1) {
        super(true);
        C0560p c0560p;
        C0560p c0560p2;
        boolean z7 = true;
        m1183U(interfaceC0520b1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0541i1.f1887f;
        InterfaceC0557o interfaceC0557o = (InterfaceC0557o) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0557o instanceof C0560p) {
            c0560p = (C0560p) interfaceC0557o;
        } else {
            c0560p = null;
        }
        if (c0560p != null) {
            C0541i1 m1158j = c0560p.m1158j();
            while (!m1158j.mo1149P()) {
                InterfaceC0557o interfaceC0557o2 = (InterfaceC0557o) atomicReferenceFieldUpdater.get(m1158j);
                if (interfaceC0557o2 instanceof C0560p) {
                    c0560p2 = (C0560p) interfaceC0557o2;
                } else {
                    c0560p2 = null;
                }
                if (c0560p2 != null) {
                    m1158j = c0560p2.m1158j();
                }
            }
            this.f1865g = z7;
        }
        z7 = false;
        this.f1865g = z7;
    }

    @Override // p032d6.C0541i1
    /* renamed from: P */
    public final boolean mo1149P() {
        return this.f1865g;
    }

    @Override // p032d6.C0541i1
    /* renamed from: Q */
    public final boolean mo1150Q() {
        return true;
    }
}
