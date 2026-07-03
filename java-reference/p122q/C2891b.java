package p122q;

import java.util.concurrent.CancellationException;
import p032d6.InterfaceC0542j;
import p053g5.C1694m;
import p101n0.C2705e;
import p160v.C3426o;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.b */
/* loaded from: classes.dex */
public final class C2891b {

    /* renamed from: a */
    public final C2705e f15099a;

    public C2891b(int i7) {
        switch (i7) {
            case 1:
                this.f15099a = new C2705e(new C3426o[16]);
                return;
            default:
                this.f15099a = new C2705e(new C2912i[16]);
                return;
        }
    }

    /* renamed from: a */
    public void m4568a(CancellationException cancellationException) {
        C2705e c2705e = this.f15099a;
        int i7 = c2705e.f14519g;
        InterfaceC0542j[] interfaceC0542jArr = new InterfaceC0542j[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            interfaceC0542jArr[i8] = ((C2912i) c2705e.f14517e[i8]).f15175b;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            interfaceC0542jArr[i9].mo1199p(cancellationException);
        }
        if (c2705e.f14519g != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    /* renamed from: b */
    public void m4569b() {
        C2705e c2705e = this.f15099a;
        int i7 = 0;
        int i8 = new C3877b(0, c2705e.f14519g - 1, 1).f18164f;
        if (i8 >= 0) {
            while (true) {
                ((C2912i) c2705e.f14517e[i7]).f15175b.mo663n(C1694m.f10482a);
                if (i7 == i8) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        c2705e.m4305g();
    }
}
