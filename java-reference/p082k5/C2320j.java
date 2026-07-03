package p082k5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p053g5.C1689h;
import p090l5.EnumC2465a;
import p098m5.InterfaceC2584d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k5.j */
/* loaded from: classes.dex */
public final class C2320j implements InterfaceC2313c, InterfaceC2584d {

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f13274f = AtomicReferenceFieldUpdater.newUpdater(C2320j.class, Object.class, "result");

    /* renamed from: e */
    public final InterfaceC2313c f13275e;
    private volatile Object result;

    public C2320j(InterfaceC2313c interfaceC2313c, EnumC2465a enumC2465a) {
        this.f13275e = interfaceC2313c;
        this.result = enumC2465a;
    }

    /* renamed from: a */
    public final Object m3691a() {
        Object obj = this.result;
        EnumC2465a enumC2465a = EnumC2465a.f13751f;
        if (obj == enumC2465a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13274f;
            EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2465a, enumC2465a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC2465a) {
                    obj = this.result;
                }
            }
            return EnumC2465a.f13750e;
        }
        if (obj == EnumC2465a.f13752g) {
            return EnumC2465a.f13750e;
        }
        if (!(obj instanceof C1689h)) {
            return obj;
        }
        throw ((C1689h) obj).f10473e;
    }

    @Override // p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f13275e;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f13275e.mo662j();
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC2465a enumC2465a = EnumC2465a.f13751f;
            if (obj2 == enumC2465a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13274f;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC2465a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC2465a) {
                        break;
                    }
                }
                return;
            }
            EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
            if (obj2 == enumC2465a2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13274f;
                EnumC2465a enumC2465a3 = EnumC2465a.f13752g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC2465a2, enumC2465a3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC2465a2) {
                        break;
                    }
                }
                this.f13275e.mo663n(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f13275e;
    }
}
