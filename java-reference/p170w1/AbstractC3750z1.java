package p170w1;

import p018c0.C0334d;
import p018c0.C0350t;
import p060h5.AbstractC1793a0;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p098m5.AbstractC2583c;
import p145t0.C3177h;
import p150t5.InterfaceC3281e;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3524n1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.z1 */
/* loaded from: classes.dex */
public abstract class AbstractC3750z1 {

    /* renamed from: a */
    public static final C2394o2 f17820a = new AbstractC2397p1(C3741w1.f17798g);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5758a(C0350t c0350t, C0334d c0334d, AbstractC2583c abstractC2583c) {
        C3744x1 c3744x1;
        int i7;
        if (abstractC2583c instanceof C3744x1) {
            C3744x1 c3744x12 = (C3744x1) abstractC2583c;
            int i8 = c3744x12.f17808i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3744x12.f17808i = i8 - Integer.MIN_VALUE;
                c3744x1 = c3744x12;
                Object obj = c3744x1.f17807h;
                i7 = c3744x1.f17808i;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                    throw new RuntimeException();
                }
                AbstractC1793a0.m2972L(obj);
                if (c0350t.f17992e.f18005r) {
                    InterfaceC3524n1 m5383w = AbstractC3498f.m5383w(c0350t);
                    C3177h c3177h = (C3177h) AbstractC3498f.m5382v(c0350t).f16868E;
                    c3177h.getClass();
                    if (AbstractC2418w.m3981y(c3177h, f17820a) == null) {
                        c3744x1.f17808i = 1;
                        m5759b(m5383w, c0334d, c3744x1);
                        return;
                    }
                    throw new ClassCastException();
                }
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
        }
        c3744x1 = new AbstractC2583c(abstractC2583c);
        Object obj2 = c3744x1.f17807h;
        i7 = c3744x1.f17808i;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5759b(InterfaceC3524n1 interfaceC3524n1, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C3747y1 c3747y1;
        int i7;
        if (abstractC2583c instanceof C3747y1) {
            C3747y1 c3747y12 = (C3747y1) abstractC2583c;
            int i8 = c3747y12.f17815i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3747y12.f17815i = i8 - Integer.MIN_VALUE;
                c3747y1 = c3747y12;
                Object obj = c3747y1.f17814h;
                i7 = c3747y1.f17815i;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                        throw new RuntimeException();
                    }
                    AbstractC1793a0.m2972L(obj);
                    throw new RuntimeException();
                }
                AbstractC1793a0.m2972L(obj);
                c3747y1.f17815i = 1;
                ((C3728t) interfaceC3524n1).m5736K(interfaceC3281e, c3747y1);
                return;
            }
        }
        c3747y1 = new AbstractC2583c(abstractC2583c);
        Object obj2 = c3747y1.f17814h;
        i7 = c3747y1.f17815i;
        if (i7 == 0) {
        }
    }
}
