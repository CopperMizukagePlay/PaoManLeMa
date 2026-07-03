package p101n0;

import java.util.List;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.f */
/* loaded from: classes.dex */
public abstract class AbstractC2706f {
    /* renamed from: a */
    public static final void m4312a(int i7, List list) {
        int size = list.size();
        if (i7 >= 0 && i7 < size) {
            return;
        }
        m4314c(i7, size);
    }

    /* renamed from: b */
    public static final void m4313b(List list, int i7, int i8) {
        if (i7 > i8) {
            m4317f(i7, i8);
        }
        if (i7 < 0) {
            m4315d(i7);
        }
        if (i8 > list.size()) {
            m4316e(i8, list.size());
        }
    }

    /* renamed from: c */
    private static final void m4314c(int i7, int i8) {
        throw new IndexOutOfBoundsException(AbstractC0094y0.m183j(i7, i8, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* renamed from: d */
    private static final void m4315d(int i7) {
        throw new IndexOutOfBoundsException(AbstractC0094y0.m184k(i7, "fromIndex (", ") is less than 0."));
    }

    /* renamed from: e */
    private static final void m4316e(int i7, int i8) {
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is more than than the list size (" + i8 + ')');
    }

    /* renamed from: f */
    private static final void m4317f(int i7, int i8) {
        throw new IllegalArgumentException(AbstractC0094y0.m183j(i7, i8, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
