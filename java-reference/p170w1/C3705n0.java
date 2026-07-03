package p170w1;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p018c0.C0334d;
import p018c0.C0354x;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2318h;
import p087l2.C2460x;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.C2649h1;
import p107o.C2722a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.n0 */
/* loaded from: classes.dex */
public final class C3705n0 implements InterfaceC0516a0 {

    /* renamed from: e */
    public final View f17617e;

    /* renamed from: f */
    public final C2460x f17618f;

    /* renamed from: g */
    public final InterfaceC0516a0 f17619g;

    /* renamed from: h */
    public final AtomicReference f17620h = new AtomicReference(null);

    public C3705n0(View view, C2460x c2460x, InterfaceC0516a0 interfaceC0516a0) {
        this.f17617e = view;
        this.f17618f = c2460x;
        this.f17619g = interfaceC0516a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5707a(C0354x c0354x, AbstractC2583c abstractC2583c) {
        C3697l0 c3697l0;
        int i7;
        if (abstractC2583c instanceof C3697l0) {
            c3697l0 = (C3697l0) abstractC2583c;
            int i8 = c3697l0.f17591j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3697l0.f17591j = i8 - Integer.MIN_VALUE;
                Object obj = c3697l0.f17589h;
                i7 = c3697l0.f17591j;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2649h1 c2649h1 = new C2649h1(19, c0354x, this);
                    C2722a c2722a = new C2722a(this, null, 9);
                    c3697l0.f17591j = 1;
                    if (AbstractC0525d0.m1130h(new C0334d(c2649h1, this.f17620h, c2722a, null), c3697l0) == EnumC2465a.f13750e) {
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
        c3697l0 = new C3697l0(this, abstractC2583c);
        Object obj2 = c3697l0.f17589h;
        i7 = c3697l0.f17591j;
        if (i7 == 0) {
        }
        throw new RuntimeException();
    }

    @Override // p032d6.InterfaceC0516a0
    /* renamed from: i */
    public final InterfaceC2318h mo1107i() {
        return this.f17619g.mo1107i();
    }
}
