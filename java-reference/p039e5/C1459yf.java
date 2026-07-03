package p039e5;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yf */
/* loaded from: classes.dex */
public final /* synthetic */ class C1459yf implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f9407e;

    /* renamed from: f */
    public final /* synthetic */ C3469p f9408f;

    public /* synthetic */ C1459yf(C3469p c3469p, int i7) {
        this.f9407e = i7;
        this.f9408f = c3469p;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f9407e) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                C3469p c3469p = this.f9408f;
                if (c3469p.contains(num)) {
                    c3469p.remove(num);
                } else {
                    c3469p.add(num);
                }
                return C1694m.f10482a;
            case 1:
                C1006jr c1006jr = (C1006jr) obj;
                AbstractC3367j.m5100e(c1006jr, "it");
                this.f9408f.remove(c1006jr);
                break;
            case 2:
                C1006jr c1006jr2 = (C1006jr) obj;
                AbstractC3367j.m5100e(c1006jr2, "it");
                this.f9408f.remove(c1006jr2);
                break;
            default:
                Integer num2 = (Integer) obj;
                num2.intValue();
                C3469p c3469p2 = this.f9408f;
                if (c3469p2.contains(num2)) {
                    c3469p2.remove(num2);
                } else {
                    c3469p2.add(num2);
                }
                return C1694m.f10482a;
        }
        return C1694m.f10482a;
    }
}
