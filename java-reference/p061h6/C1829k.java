package p061h6;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.k */
/* loaded from: classes.dex */
public final class C1829k extends CancellationException {

    /* renamed from: e */
    public final /* synthetic */ int f10892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1829k(String str, int i7) {
        super(str);
        this.f10892e = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f10892e) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                setStackTrace(new StackTraceElement[0]);
                return this;
        }
    }
}
