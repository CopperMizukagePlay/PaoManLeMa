package p061h6;

import java.util.concurrent.CancellationException;
import p034e0.C0600d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.a */
/* loaded from: classes.dex */
public final class C1819a extends CancellationException {

    /* renamed from: e */
    public final transient Object f10866e;

    public C1819a(C0600d0 c0600d0) {
        super("Flow was aborted, no more elements needed");
        this.f10866e = c0600d0;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
