package p169w0;

import java.util.List;
import p024c6.C0438e;
import p068i5.C2079c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w0.d */
/* loaded from: classes.dex */
public final class C3647d extends RuntimeException {

    /* renamed from: e */
    public final List f17424e;

    public C3647d(List list) {
        this.f17424e = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C2079c m5802f = AbstractC3784a.m5802f();
        List list = this.f17424e;
        AbstractC3367j.m5100e(list, "<this>");
        C0438e c0438e = new C0438e(list);
        if (c0438e.mo299a() <= 0) {
            C2079c m5798b = AbstractC3784a.m5798b(m5802f);
            AbstractC3367j.m5100e(m5798b, "<this>");
            C0438e c0438e2 = new C0438e(m5798b);
            int mo299a = c0438e2.mo299a();
            for (int i7 = 0; i7 < mo299a; i7++) {
                sb.append("\tat " + ((String) c0438e2.get(i7)));
                sb.append('\n');
            }
            String sb2 = sb.toString();
            AbstractC3367j.m5099d(sb2, "toString(...)");
            return sb2;
        }
        ((C3644a) c0438e.get(0)).getClass();
        throw null;
    }
}
