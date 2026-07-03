package p128q6;

import java.io.IOException;
import p067i4.C2071d;
import p099m6.C2598d0;
import p099m6.C2623x;
import p099m6.InterfaceC2620u;
import p136r6.C3070g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.a */
/* loaded from: classes.dex */
public final class C2998a implements InterfaceC2620u {

    /* renamed from: a */
    public static final C2998a f15465a = new Object();

    @Override // p099m6.InterfaceC2620u
    /* renamed from: a */
    public final C2598d0 mo4178a(C3070g c3070g) {
        C3006i c3006i = c3070g.f15663a;
        synchronized (c3006i) {
            try {
                if (c3006i.f15508s) {
                    if (!c3006i.f15507r) {
                        if (c3006i.f15506q) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2071d c2071d = c3006i.f15502m;
        AbstractC3367j.m5097b(c2071d);
        C2623x c2623x = c3006i.f15494e;
        try {
            C3002e c3002e = new C3002e(c3006i, c3006i.f15498i, c2071d, c2071d.m3322a(c3070g.f15668f, c3070g.f15669g, c3070g.f15670h, c2623x.f14197D, c2623x.f14205j, !AbstractC3367j.m5096a(c3070g.f15667e.f14019b, "GET")).m4696j(c2623x, c3070g));
            c3006i.f15505p = c3002e;
            c3006i.f15510u = c3002e;
            synchronized (c3006i) {
                c3006i.f15506q = true;
                c3006i.f15507r = true;
            }
            if (!c3006i.f15509t) {
                return C3070g.m4745a(c3070g, 0, c3002e, null, 61).m4746b(c3070g.f15667e);
            }
            throw new IOException("Canceled");
        } catch (IOException e7) {
            c2071d.m3324c(e7);
            throw new C3010m(e7);
        } catch (C3010m e8) {
            c2071d.m3324c(e8.f15533f);
            throw e8;
        }
    }
}
