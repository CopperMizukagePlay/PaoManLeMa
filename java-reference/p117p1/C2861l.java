package p117p1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.l */
/* loaded from: classes.dex */
public final class C2861l extends CancellationException {
    public C2861l(long j6) {
        super("Timed out waiting for " + j6 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC2866q.f15004b);
        return this;
    }
}
