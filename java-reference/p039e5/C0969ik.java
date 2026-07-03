package p039e5;

import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ik */
/* loaded from: classes.dex */
public final /* synthetic */ class C0969ik extends AbstractC3365h implements InterfaceC3279c {

    /* renamed from: m */
    public static final C0969ik f4907m = new AbstractC3365h(1, AbstractC1092mk.class, "pingDefaultTargetRank", "pingDefaultTargetRank(Lcom/paoman/lema/NetworkTarget;)I", 1);

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C1248rl c1248rl = (C1248rl) obj;
        AbstractC3367j.m5100e(c1248rl, "p0");
        float f7 = AbstractC1092mk.f5952h;
        int ordinal = c1248rl.f7393d.ordinal();
        int i7 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i7 = 3;
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new RuntimeException();
                        }
                    }
                }
                i7 = 0;
            } else {
                i7 = 2;
            }
        }
        return Integer.valueOf(i7);
    }
}
