package p196z6;

import java.io.IOException;
import p092m.AbstractC2487d;
import p121p6.AbstractC2882a;
import p128q6.C3006i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.e */
/* loaded from: classes.dex */
public final class C3886e extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f18187e = 1;

    /* renamed from: f */
    public final /* synthetic */ C3887f f18188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3886e(String str, C3887f c3887f) {
        super(str, true);
        this.f18188f = c3887f;
    }

    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        switch (this.f18187e) {
            case 0:
                C3887f c3887f = this.f18188f;
                try {
                } catch (IOException e7) {
                    c3887f.m5902c(e7, null);
                }
                if (c3887f.m5907h()) {
                    return 0L;
                }
                return -1L;
            default:
                C3006i c3006i = this.f18188f.f18196g;
                AbstractC3367j.m5097b(c3006i);
                c3006i.m4680d();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3886e(C3887f c3887f) {
        super(AbstractC2487d.m4046j(new StringBuilder(), c3887f.f18201l, " writer"), true);
        this.f18188f = c3887f;
    }
}
