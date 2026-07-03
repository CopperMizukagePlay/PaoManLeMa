package p001a0;

import p022c4.C0406p;
import p087l2.InterfaceC2453q;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.s2 */
/* loaded from: classes.dex */
public final class C0076s2 implements InterfaceC2453q {

    /* renamed from: a */
    public final /* synthetic */ int f373a;

    /* renamed from: b */
    public int f374b;

    /* renamed from: c */
    public int f375c;

    public /* synthetic */ C0076s2() {
        this.f373a = 4;
    }

    @Override // p087l2.InterfaceC2453q
    /* renamed from: a */
    public int mo167a(int i7) {
        if (i7 >= 0 && i7 <= this.f375c) {
            AbstractC0027g1.m75u(i7, this.f374b, i7);
        }
        return i7;
    }

    @Override // p087l2.InterfaceC2453q
    /* renamed from: b */
    public int mo168b(int i7) {
        if (i7 >= 0 && i7 <= this.f374b) {
            AbstractC0027g1.m74t(i7, this.f375c, i7);
        }
        return i7;
    }

    /* renamed from: c */
    public C0406p m169c() {
        return new C0406p(this.f374b, this.f375c);
    }

    public String toString() {
        switch (this.f373a) {
            case 1:
                StringBuilder sb = new StringBuilder("<");
                sb.append(this.f374b);
                sb.append(' ');
                return AbstractC2487d.m4045i(sb, this.f375c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0076s2(int i7, int i8, int i9) {
        this.f373a = i9;
        this.f374b = i7;
        this.f375c = i8;
    }
}
