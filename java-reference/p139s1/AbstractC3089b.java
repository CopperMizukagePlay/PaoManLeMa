package p139s1;

import java.util.concurrent.CancellationException;
import p145t0.AbstractC3178i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s1.b */
/* loaded from: classes.dex */
public abstract class AbstractC3089b extends CancellationException {

    /* renamed from: e */
    public final /* synthetic */ int f15685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3089b(String str, int i7) {
        super(str);
        this.f15685e = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f15685e) {
            case 0:
                setStackTrace(AbstractC3090c.f15686a);
                return this;
            default:
                setStackTrace(AbstractC3178i.f15890a);
                return this;
        }
    }
}
