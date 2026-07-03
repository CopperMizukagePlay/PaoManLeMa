package p008b;

import java.util.function.IntConsumer;
import p006a7.C0129l;
import p041f.C1510b;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0239j implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f931e = 0;

    /* renamed from: f */
    public final /* synthetic */ int f932f;

    /* renamed from: g */
    public final /* synthetic */ Object f933g;

    public /* synthetic */ RunnableC0239j(C0243l c0243l, int i7, C0129l c0129l) {
        this.f933g = c0243l;
        this.f932f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0230e0 c0230e0;
        switch (this.f931e) {
            case 0:
                C0243l c0243l = (C0243l) this.f933g;
                Boolean bool = Boolean.TRUE;
                String str = (String) c0243l.f939a.get(Integer.valueOf(this.f932f));
                if (str != null) {
                    C1510b c1510b = (C1510b) c0243l.f943e.get(str);
                    if (c1510b != null) {
                        c0230e0 = c1510b.f9996a;
                    } else {
                        c0230e0 = null;
                    }
                    if (c0230e0 == null) {
                        c0243l.f945g.remove(str);
                        c0243l.f944f.put(str, bool);
                        return;
                    } else {
                        C0230e0 c0230e02 = c1510b.f9996a;
                        if (c0243l.f942d.remove(str)) {
                            ((InterfaceC3279c) ((InterfaceC2425y0) c0230e02.f913a).getValue()).mo23f(bool);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                ((IntConsumer) this.f933g).accept(this.f932f);
                return;
        }
    }

    public /* synthetic */ RunnableC0239j(IntConsumer intConsumer, int i7) {
        this.f933g = intConsumer;
        this.f932f = i7;
    }
}
