package p032d6;

import java.util.concurrent.CancellationException;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.c1 */
/* loaded from: classes.dex */
public final class C0523c1 extends CancellationException {

    /* renamed from: e */
    public final transient C0541i1 f1853e;

    public C0523c1(String str, Throwable th, C0541i1 c0541i1) {
        super(str);
        this.f1853e = c0541i1;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0523c1) {
                C0523c1 c0523c1 = (C0523c1) obj;
                if (!AbstractC3367j.m5096a(c0523c1.getMessage(), getMessage()) || !AbstractC3367j.m5096a(c0523c1.f1853e, this.f1853e) || !AbstractC3367j.m5096a(c0523c1.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i7;
        String message = getMessage();
        AbstractC3367j.m5097b(message);
        int hashCode = (this.f1853e.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i7 = cause.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1853e;
    }
}
